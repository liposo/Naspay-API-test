package felipe.TestSpringDemo.pojos;

import java.util.HashMap;
import java.util.Map;

public class Customer {

	private String merchantCustomerId;
	private String phone;
	private String email;
	private String ip;
	private String userAgent;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public String getMerchantCustomerId() {
		return merchantCustomerId;
	}
	
	public void setMerchantCustomerId(String merchantCustomerId) {
		this.merchantCustomerId = merchantCustomerId;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getUserAgent() {
		return userAgent;
	}
	
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}