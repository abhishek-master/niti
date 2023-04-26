
package com.example.niti.backend.niti.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Detail",
    "context",
    "redirectUrl"
})
@Generated("jsonschema2pojo")
public class Details {

    @JsonProperty("Detail")
    private Detail detail;
    @JsonProperty("context")
    private List<Context> context;
    @JsonProperty("redirectUrl")
    private String redirectUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Details() {
    }

    /**
     * 
     * @param redirectUrl
     * @param context
     * @param detail
     */
    public Details(Detail detail, List<Context> context, String redirectUrl) {
        super();
        this.detail = detail;
        this.context = context;
        this.redirectUrl = redirectUrl;
    }

    @JsonProperty("Detail")
    public Detail getDetail() {
        return detail;
    }

    @JsonProperty("Detail")
    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    @JsonProperty("context")
    public List<Context> getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(List<Context> context) {
        this.context = context;
    }

    @JsonProperty("redirectUrl")
    public String getRedirectUrl() {
        return redirectUrl;
    }

    @JsonProperty("redirectUrl")
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Details.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
        sb.append(',');
        sb.append("redirectUrl");
        sb.append('=');
        sb.append(((this.redirectUrl == null)?"<null>":this.redirectUrl));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
