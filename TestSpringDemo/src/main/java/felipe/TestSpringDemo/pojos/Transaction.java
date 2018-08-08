package felipe.TestSpringDemo.pojos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transaction {

	private List<Link> links = null;
	private String paymentMethod;
	private Double amount;
	private String currency;
	private String merchantTransactionId;
	private String description;
	private ShippingAddress shippingAddress;
	private String type;
	private String state;
	private String id;
	private String created;
	private String updated;
	private String intent;
	private Customer customer;
	private Card card;
	private BillingAddress billingAddress;
	private String customerAccessToken;
	private String resultCode;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public List<Link> getLinks() {
		return links;
	}
	
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public String getMerchantTransactionId() {
		return merchantTransactionId;
	}
	
	public void setMerchantTransactionId(String merchantTransactionId) {
		this.merchantTransactionId = merchantTransactionId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCreated() {
		return created;
	}
	
	public void setCreated(String created) {
		this.created = created;
	}
	
	public String getUpdated() {
		return updated;
	}
	
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	
	public String getIntent() {
		return intent;
	}
	
	public void setIntent(String intent) {
		this.intent = intent;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Card getCard() {
		return card;
	}
	
	public void setCard(Card card) {
		this.card = card;
	}
	
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	public String getCustomerAccessToken() {
		return customerAccessToken;
	}
	
	public void setCustomerAccessToken(String customerAccessToken) {
		this.customerAccessToken = customerAccessToken;
	}
	
	public String getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
