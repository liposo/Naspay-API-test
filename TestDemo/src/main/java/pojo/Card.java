
package pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cardholder",
    "cardNumber",
    "expiryMonth",
    "expiryYear"
})
public class Card {

    @JsonProperty("cardholder")
    private String cardholder;
    @JsonProperty("cardNumber")
    private String cardNumber;
    @JsonProperty("expiryMonth")
    private Integer expiryMonth;
    @JsonProperty("expiryYear")
    private Integer expiryYear;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cardholder")
    public String getCardholder() {
        return cardholder;
    }

    @JsonProperty("cardholder")
    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    @JsonProperty("cardNumber")
    public String getCardNumber() {
        return cardNumber;
    }

    @JsonProperty("cardNumber")
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @JsonProperty("expiryMonth")
    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    @JsonProperty("expiryMonth")
    public void setExpiryMonth(Integer expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    @JsonProperty("expiryYear")
    public Integer getExpiryYear() {
        return expiryYear;
    }

    @JsonProperty("expiryYear")
    public void setExpiryYear(Integer expiryYear) {
        this.expiryYear = expiryYear;
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
