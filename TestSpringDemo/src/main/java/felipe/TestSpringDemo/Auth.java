package felipe.TestSpringDemo;

import felipe.TestSpringDemo.pojos.Token;

import java.time.LocalDateTime;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class Auth {
	
	private static final String auth_url = "/auth/token";
	
	private String terminalKey;
	private String terminalSecret;
	
	public Token token;
	
	public Auth(String key, String secret) {
		this.terminalKey = key;
		this.terminalSecret = secret;
	}
	
	public void authenticate(String api) {
		
		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();

        RestTemplate restTemplate = restTemplateBuilder.basicAuthorization(this.terminalKey, this.terminalSecret).build();
        
        try {
        	
        	Token token = restTemplate.getForObject(api+auth_url, Token.class);
        	      	
        	token.setCreatedAt(LocalDateTime.now());  
        	token.setExpireAt(LocalDateTime.now().plusHours(8));        	
        	token.setRevokeAt(LocalDateTime.now().plusMinutes(15));

        	this.token = new Token(token);
    		
        } catch(HttpClientErrorException e) {
        	System.out.println(e);
        	System.exit(0);
        }
	}
	
	public Token getToken() {
		return this.token;
	}
}
