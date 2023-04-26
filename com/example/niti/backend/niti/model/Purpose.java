
package com.example.niti.backend.niti.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Category",
    "code",
    "text",
    "refUri"
})
@Generated("jsonschema2pojo")
public class Purpose {

    @JsonProperty("Category")
    private Category category;
    @JsonProperty("code")
    private String code;
    @JsonProperty("text")
    private String text;
    @JsonProperty("refUri")
    private String refUri;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Purpose() {
    }

    /**
     * 
     * @param code
     * @param text
     * @param category
     * @param refUri
     */
    public Purpose(Category category, String code, String text, String refUri) {
        super();
        this.category = category;
        this.code = code;
        this.text = text;
        this.refUri = refUri;
    }

    @JsonProperty("Category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("refUri")
    public String getRefUri() {
        return refUri;
    }

    @JsonProperty("refUri")
    public void setRefUri(String refUri) {
        this.refUri = refUri;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Purpose.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("refUri");
        sb.append('=');
        sb.append(((this.refUri == null)?"<null>":this.refUri));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
