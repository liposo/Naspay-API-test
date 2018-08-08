package felipe.TestSpringDemo;

import felipe.TestSpringDemo.pojos.Transaction;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class Client {

    private Auth auth;

    public Client(String baseUrl, String terminalKey, String terminalSecret) {
        this.auth = new Auth(terminalKey, terminalSecret);
        auth.authenticate(baseUrl);
    }

    public String getTransactionStatus(String baseUrl, String id) {
        String transactionStatus;

        if(this.auth.getToken().isValid()) {
            this.auth.authenticate(baseUrl);
        }

        ArrayList<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new HeaderRequestInterceptor("Authorization", "Bearer " + auth.getToken().getAccessToken()));
        interceptors.add(new HeaderRequestInterceptor("Accept", "application/json"));

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(interceptors);

        try {
            Transaction response = restTemplate.getForObject(baseUrl + "/api/v1/transactions/"+id, Transaction.class);

            transactionStatus = response.getState();

            return transactionStatus;
        } catch (HttpClientErrorException exception) {
            switch (exception.getStatusCode().value()) {
                case 400: return "Invalid input";
                case 401: return "Bearer token is missing or invalid";
                case 404: return "Transaction not found";
                default: return "Unknown error";
            }
        }
    }
}
