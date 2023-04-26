
package com.example.niti.backend.niti.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consentStart",
    "consentExpiry",
    "Customer",
    "FIDataRange",
    "consentMode",
    "consentTypes",
    "fetchType",
    "Frequency",
    "DataFilter",
    "DataLife",
    "DataConsumer",
    "Purpose",
    "fiTypes"
})
@Generated("jsonschema2pojo")
public class Detail {

    @JsonProperty("consentStart")
    private String consentStart;
    @JsonProperty("consentExpiry")
    private String consentExpiry;
    @JsonProperty("Customer")
    private Customer customer;
    @JsonProperty("FIDataRange")
    private FIDataRange fIDataRange;
    @JsonProperty("consentMode")
    private String consentMode;
    @JsonProperty("consentTypes")
    private List<String> consentTypes;
    @JsonProperty("fetchType")
    private String fetchType;
    @JsonProperty("Frequency")
    private Frequency frequency;
    @JsonProperty("DataFilter")
    private List<DataFilter> dataFilter;
    @JsonProperty("DataLife")
    private DataLife dataLife;
    @JsonProperty("DataConsumer")
    private DataConsumer dataConsumer;
    @JsonProperty("Purpose")
    private Purpose purpose;
    @JsonProperty("fiTypes")
    private List<String> fiTypes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Detail() {
    }

    /**
     * 
     * @param dataConsumer
     * @param purpose
     * @param consentTypes
     * @param fIDataRange
     * @param fetchType
     * @param consentStart
     * @param frequency
     * @param dataFilter
     * @param consentMode
     * @param fiTypes
     * @param dataLife
     * @param consentExpiry
     * @param customer
     */
    public Detail(String consentStart, String consentExpiry, Customer customer, FIDataRange fIDataRange, String consentMode, List<String> consentTypes, String fetchType, Frequency frequency, List<DataFilter> dataFilter, DataLife dataLife, DataConsumer dataConsumer, Purpose purpose, List<String> fiTypes) {
        super();
        this.consentStart = consentStart;
        this.consentExpiry = consentExpiry;
        this.customer = customer;
        this.fIDataRange = fIDataRange;
        this.consentMode = consentMode;
        this.consentTypes = consentTypes;
        this.fetchType = fetchType;
        this.frequency = frequency;
        this.dataFilter = dataFilter;
        this.dataLife = dataLife;
        this.dataConsumer = dataConsumer;
        this.purpose = purpose;
        this.fiTypes = fiTypes;
    }

    @JsonProperty("consentStart")
    public String getConsentStart() {
        return consentStart;
    }

    @JsonProperty("consentStart")
    public void setConsentStart(String consentStart) {
        this.consentStart = consentStart;
    }

    @JsonProperty("consentExpiry")
    public String getConsentExpiry() {
        return consentExpiry;
    }

    @JsonProperty("consentExpiry")
    public void setConsentExpiry(String consentExpiry) {
        this.consentExpiry = consentExpiry;
    }

    @JsonProperty("Customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("Customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("FIDataRange")
    public FIDataRange getFIDataRange() {
        return fIDataRange;
    }

    @JsonProperty("FIDataRange")
    public void setFIDataRange(FIDataRange fIDataRange) {
        this.fIDataRange = fIDataRange;
    }

    @JsonProperty("consentMode")
    public String getConsentMode() {
        return consentMode;
    }

    @JsonProperty("consentMode")
    public void setConsentMode(String consentMode) {
        this.consentMode = consentMode;
    }

    @JsonProperty("consentTypes")
    public List<String> getConsentTypes() {
        return consentTypes;
    }

    @JsonProperty("consentTypes")
    public void setConsentTypes(List<String> consentTypes) {
        this.consentTypes = consentTypes;
    }

    @JsonProperty("fetchType")
    public String getFetchType() {
        return fetchType;
    }

    @JsonProperty("fetchType")
    public void setFetchType(String fetchType) {
        this.fetchType = fetchType;
    }

    @JsonProperty("Frequency")
    public Frequency getFrequency() {
        return frequency;
    }

    @JsonProperty("Frequency")
    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("DataFilter")
    public List<DataFilter> getDataFilter() {
        return dataFilter;
    }

    @JsonProperty("DataFilter")
    public void setDataFilter(List<DataFilter> dataFilter) {
        this.dataFilter = dataFilter;
    }

    @JsonProperty("DataLife")
    public DataLife getDataLife() {
        return dataLife;
    }

    @JsonProperty("DataLife")
    public void setDataLife(DataLife dataLife) {
        this.dataLife = dataLife;
    }

    @JsonProperty("DataConsumer")
    public DataConsumer getDataConsumer() {
        return dataConsumer;
    }

    @JsonProperty("DataConsumer")
    public void setDataConsumer(DataConsumer dataConsumer) {
        this.dataConsumer = dataConsumer;
    }

    @JsonProperty("Purpose")
    public Purpose getPurpose() {
        return purpose;
    }

    @JsonProperty("Purpose")
    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    @JsonProperty("fiTypes")
    public List<String> getFiTypes() {
        return fiTypes;
    }

    @JsonProperty("fiTypes")
    public void setFiTypes(List<String> fiTypes) {
        this.fiTypes = fiTypes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Detail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("consentStart");
        sb.append('=');
        sb.append(((this.consentStart == null)?"<null>":this.consentStart));
        sb.append(',');
        sb.append("consentExpiry");
        sb.append('=');
        sb.append(((this.consentExpiry == null)?"<null>":this.consentExpiry));
        sb.append(',');
        sb.append("customer");
        sb.append('=');
        sb.append(((this.customer == null)?"<null>":this.customer));
        sb.append(',');
        sb.append("fIDataRange");
        sb.append('=');
        sb.append(((this.fIDataRange == null)?"<null>":this.fIDataRange));
        sb.append(',');
        sb.append("consentMode");
        sb.append('=');
        sb.append(((this.consentMode == null)?"<null>":this.consentMode));
        sb.append(',');
        sb.append("consentTypes");
        sb.append('=');
        sb.append(((this.consentTypes == null)?"<null>":this.consentTypes));
        sb.append(',');
        sb.append("fetchType");
        sb.append('=');
        sb.append(((this.fetchType == null)?"<null>":this.fetchType));
        sb.append(',');
        sb.append("frequency");
        sb.append('=');
        sb.append(((this.frequency == null)?"<null>":this.frequency));
        sb.append(',');
        sb.append("dataFilter");
        sb.append('=');
        sb.append(((this.dataFilter == null)?"<null>":this.dataFilter));
        sb.append(',');
        sb.append("dataLife");
        sb.append('=');
        sb.append(((this.dataLife == null)?"<null>":this.dataLife));
        sb.append(',');
        sb.append("dataConsumer");
        sb.append('=');
        sb.append(((this.dataConsumer == null)?"<null>":this.dataConsumer));
        sb.append(',');
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("fiTypes");
        sb.append('=');
        sb.append(((this.fiTypes == null)?"<null>":this.fiTypes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
