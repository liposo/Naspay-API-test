package felipe.TestSpringDemo.pojos;

import java.util.HashMap;
import java.util.Map;

public class Card {

	private String cardholder;
	private String cardNumber;
	private Integer expiryMonth;
	private Integer expiryYear;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public String getCardholder() {
		return cardholder;
	}
	
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public Integer getExpiryMonth() {
		return expiryMonth;
	}
	
	public void setExpiryMonth(Integer expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	
	public Integer getExpiryYear() {
		return expiryYear;
	}
	
	public void setExpiryYear(Integer expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
