package felipe.TestDemo;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.ResponseToken;
import pojo.Transaction;

public class Client {
	
	private ResponseToken token;
	
	public static final String URL_TOKEN = "https://demo.naspay.net/auth/token";
	public static final String URL_API = "https://demo.naspay.net/api/v1";
	public static final String URL_TRANSACTION = URL_API + "/transactions/{id}";
	
	
	public Client(String terminalKey, String terminalSecret) {
		try {
			CredentialsProvider provider = new BasicCredentialsProvider();
			UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(terminalKey, terminalSecret);
			provider.setCredentials(AuthScope.ANY, credentials);
			HttpClient httpClient = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
			
			HttpResponse response = httpClient.execute(new HttpGet(URL_TOKEN));
			
			int statusCode = response.getStatusLine().getStatusCode();
			
			if (statusCode == HttpStatus.SC_OK) {
				String resJson = EntityUtils.toString(response.getEntity());
				ObjectMapper mapper = new ObjectMapper();
				this.token = mapper.readValue(resJson, ResponseToken.class);

			}	
		}
		catch(Exception e) {
//			e.printStackTrace();
		}

	}
	
		
	public String getTransactionStatus(String id) {
		
		int statusCode = 0;
		
		try {
			
			if (token == null) throw new Exception("Token is null!");
			
			HttpClient httpClient = HttpClientBuilder.create().build();
			
			HttpGet request = new HttpGet(URL_TRANSACTION.replace("{id}", id));
			request.setHeader("Authorization", "Bearer "+token.getAccessToken());
			
			HttpResponse response = httpClient.execute(request);
			
			statusCode = response.getStatusLine().getStatusCode();
			
			if (statusCode == HttpStatus.SC_OK) {
				String responseJson = EntityUtils.toString(response.getEntity());
				ObjectMapper mapper = new ObjectMapper();
				Transaction transaction = mapper.readValue(responseJson, Transaction.class);
				
				return transaction.getState();
			} else {
				switch (statusCode) {
				case 400: return "Invalid input";
	            case 401: return "Bearer token is missing or invalid";
	            case 404: return "Transaction not found";
	            default: return "Unknown error";
				}
			}
		}
		catch(Exception e) {
//			e.printStackTrace();
		}
		return "";
	}
	
}
