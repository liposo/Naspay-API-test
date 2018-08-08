package felipe.TestSpringDemo.pojos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Token {
	
	@JsonProperty("access_token")
    private String accessToken;
	@JsonProperty("token_type")
    private String tokenType;   
    private LocalDateTime createdAt;
    private LocalDateTime revokeAt;
    private LocalDateTime expireAt;
    
    public Token() {
    	super();
    }
    
    public Token(Token token) {
    	this.accessToken = token.getAccessToken();
    	this.tokenType = token.getTokenType();
    	this.createdAt = token.getCreatedAt();
    	this.revokeAt = token.getRevokedAt();
    	this.expireAt = token.getExpireAtl();
    }

    public void setAccess_token(String access_token) {
        this.accessToken = access_token;
    }

    public void setToken_type(String token_type) {
        this.tokenType = token_type;
    }

    public void setCreatedAt(LocalDateTime creationTime) {
        this.createdAt = creationTime;
    }

    public String getAccessToken() { 	
    	this.revokeAt = LocalDateTime.now().plusMinutes(15);
        return this.accessToken;
    }
    
    public String getTokenType() {
        return this.tokenType;
    }
    
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }
    
    public void setExpireAt(LocalDateTime date) {
    	this.expireAt = date;
    }
    
    public LocalDateTime getExpireAtl() {
    	return this.expireAt;
    }
    
    public LocalDateTime getRevokedAt() {
    	return this.revokeAt;
    }
    
    public void setRevokeAt(LocalDateTime date) {
    	this.revokeAt = date;
    }
    
    public boolean isValid() {
    	if(!this.revokeAt.isBefore(LocalDateTime.now())) {
    		return false;
    	}
    	
    	if(!this.expireAt.isBefore(LocalDateTime.now())) {
    		return false;
    	} 
    	
    	return true;
    }
}