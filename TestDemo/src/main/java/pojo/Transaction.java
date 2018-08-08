
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "links",
    "paymentMethod",
    "amount",
    "currency",
    "merchantTransactionId",
    "description",
    "shippingAddress",
    "type",
    "state",
    "id",
    "created",
    "updated",
    "intent",
    "customer",
    "card",
    "billingAddress",
    "customerAccessToken",
    "resultCode"
})
public class Transaction {

    @JsonProperty("links")
    private List<Link> links = null;
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("merchantTransactionId")
    private String merchantTransactionId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("shippingAddress")
    private ShippingAddress shippingAddress;
    @JsonProperty("type")
    private String type;
    @JsonProperty("state")
    private String state;
    @JsonProperty("id")
    private String id;
    @JsonProperty("created")
    private String created;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("customer")
    private Customer customer;
    @JsonProperty("card")
    private Card card;
    @JsonProperty("billingAddress")
    private BillingAddress billingAddress;
    @JsonProperty("customerAccessToken")
    private String customerAccessToken;
    @JsonProperty("resultCode")
    private String resultCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    @JsonProperty("paymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("merchantTransactionId")
    public String getMerchantTransactionId() {
        return merchantTransactionId;
    }

    @JsonProperty("merchantTransactionId")
    public void setMerchantTransactionId(String merchantTransactionId) {
        this.merchantTransactionId = merchantTransactionId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("shippingAddress")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("shippingAddress")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("card")
    public Card getCard() {
        return card;
    }

    @JsonProperty("card")
    public void setCard(Card card) {
        this.card = card;
    }

    @JsonProperty("billingAddress")
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billingAddress")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("customerAccessToken")
    public String getCustomerAccessToken() {
        return customerAccessToken;
    }

    @JsonProperty("customerAccessToken")
    public void setCustomerAccessToken(String customerAccessToken) {
        this.customerAccessToken = customerAccessToken;
    }

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("resultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
