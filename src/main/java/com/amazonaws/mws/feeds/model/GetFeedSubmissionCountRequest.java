
package com.amazonaws.mws.feeds.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Marketplace" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Merchant" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeedTypeList" type="{http://mws.amazonaws.com/doc/2009-01-01/}TypeList" minOccurs="0"/&gt;
 *         &lt;element name="FeedProcessingStatusList" type="{http://mws.amazonaws.com/doc/2009-01-01/}StatusList" minOccurs="0"/&gt;
 *         &lt;element name="SubmittedFromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SubmittedToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * Generated by AWS Code Generator
 * <p/>
 * Wed Feb 18 13:28:59 PST 2009
 *
 * @author dmytro
 * @version $Id: $Id
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marketplace",
    "merchant",
    "feedTypeList",
    "feedProcessingStatusList",
    "submittedFromDate",
    "submittedToDate",
    "mwsAuthToken"
})
@XmlRootElement(name = "GetFeedSubmissionCountRequest")
public class GetFeedSubmissionCountRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "FeedTypeList")
    protected TypeList feedTypeList;
    @XmlElement(name = "FeedProcessingStatusList")
    protected StatusList feedProcessingStatusList;
    @XmlElement(name = "SubmittedFromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedFromDate;
    @XmlElement(name = "SubmittedToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedToDate;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;

    /**
     * Default constructor
     */
    public GetFeedSubmissionCountRequest() {
        super();
    }

    /**
     * Value constructor
     *
     * @param marketplace a {@link java.lang.String} object.
     * @param merchant a {@link java.lang.String} object.
     * @param feedTypeList a {@link com.amazonaws.mws.feeds.model.TypeList} object.
     * @param feedProcessingStatusList a {@link com.amazonaws.mws.feeds.model.StatusList} object.
     * @param submittedFromDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param submittedToDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public GetFeedSubmissionCountRequest(final String marketplace, final String merchant, final TypeList feedTypeList, final StatusList feedProcessingStatusList, final XMLGregorianCalendar submittedFromDate, final XMLGregorianCalendar submittedToDate) {
        this(marketplace, merchant, feedTypeList, feedProcessingStatusList, submittedFromDate, submittedToDate, null);
    }
    
    /**
     * <p>Constructor for GetFeedSubmissionCountRequest.</p>
     *
     * @param marketplace a {@link java.lang.String} object.
     * @param merchant a {@link java.lang.String} object.
     * @param feedTypeList a {@link com.amazonaws.mws.feeds.model.TypeList} object.
     * @param feedProcessingStatusList a {@link com.amazonaws.mws.feeds.model.StatusList} object.
     * @param submittedFromDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param submittedToDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param mwsAuthToken a {@link java.lang.String} object.
     */
    public GetFeedSubmissionCountRequest(final String marketplace, 
            final String merchant, 
            final TypeList feedTypeList,
            final StatusList feedProcessingStatusList,
            final XMLGregorianCalendar submittedFromDate,
            final XMLGregorianCalendar submittedToDate, 
            final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.feedTypeList = feedTypeList;
        this.feedProcessingStatusList = feedProcessingStatusList;
        this.submittedFromDate = submittedFromDate;
        this.submittedToDate = submittedToDate;
        this.mwsAuthToken = mwsAuthToken;
    }

    /**
     * Gets the value of the marketplace property.
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @return a {@link java.lang.String} object.
     */
    public String getMarketplace() {
        return marketplace;
    }

    /**
     * Sets the value of the marketplace property.
     *
     * @deprecated Not used anymore.  MWS ignores this parameter, but it is left
     * in here for backwards compatibility.
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setMarketplace(String value) {
        this.marketplace = value;
    }

    /**
     * <p>isSetMarketplace.</p>
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @return a boolean.
     */
    public boolean isSetMarketplace() {
        return (this.marketplace!= null);
    }

    /**
     * Gets the value of the merchant property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     * <p>isSetMerchant.</p>
     *
     * @return a boolean.
     */
    public boolean isSetMerchant() {
        return (this.merchant!= null);
    }

    /**
     * Gets the value of the feedTypeList property.
     *
     * @return a {@link com.amazonaws.mws.feeds.model.TypeList} object.
     */
    public TypeList getFeedTypeList() {
        return feedTypeList;
    }

    /**
     * Sets the value of the feedTypeList property.
     *
     * @param value
     *     allowed object is
     *     {@link com.amazonaws.mws.feeds.model.TypeList}
     */
    public void setFeedTypeList(TypeList value) {
        this.feedTypeList = value;
    }

    /**
     * <p>isSetFeedTypeList.</p>
     *
     * @return a boolean.
     */
    public boolean isSetFeedTypeList() {
        return (this.feedTypeList!= null);
    }

    /**
     * Gets the value of the feedProcessingStatusList property.
     *
     * @return a {@link com.amazonaws.mws.feeds.model.StatusList} object.
     */
    public StatusList getFeedProcessingStatusList() {
        return feedProcessingStatusList;
    }

    /**
     * Sets the value of the feedProcessingStatusList property.
     *
     * @param value
     *     allowed object is
     *     {@link com.amazonaws.mws.feeds.model.StatusList}
     */
    public void setFeedProcessingStatusList(StatusList value) {
        this.feedProcessingStatusList = value;
    }

    /**
     * <p>isSetFeedProcessingStatusList.</p>
     *
     * @return a boolean.
     */
    public boolean isSetFeedProcessingStatusList() {
        return (this.feedProcessingStatusList!= null);
    }

    /**
     * Gets the value of the submittedFromDate property.
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getSubmittedFromDate() {
        return submittedFromDate;
    }

    /**
     * Sets the value of the submittedFromDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar}
     */
    public void setSubmittedFromDate(XMLGregorianCalendar value) {
        this.submittedFromDate = value;
    }

    /**
     * <p>isSetSubmittedFromDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetSubmittedFromDate() {
        return (this.submittedFromDate!= null);
    }

    /**
     * Gets the value of the submittedToDate property.
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getSubmittedToDate() {
        return submittedToDate;
    }

    /**
     * Sets the value of the submittedToDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar}
     */
    public void setSubmittedToDate(XMLGregorianCalendar value) {
        this.submittedToDate = value;
    }

    /**
     * <p>isSetSubmittedToDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetSubmittedToDate() {
        return (this.submittedToDate!= null);
    }
    
    /**
     * Gets the value of the mwsAuthToken property.
     *
     * possible object is
     *     {@link java.lang.String}
     *
     * @return a {@link java.lang.String} object.
     */
    public String getMWSAuthToken() {
    	return mwsAuthToken;
    }
    
    /**
     * Sets the value of the mwsAuthToken property
     *
     * @param authTokenValue
     * 		allowed object is
     * 		{@link java.lang.String}
     */
    public void setMWSAuthToken(String authTokenValue) {
    	this.mwsAuthToken = authTokenValue;
    }

    /**
     * <p>isSetMWSAuthToken.</p>
     *
     * @return a boolean.
     */
    public boolean isSetMWSAuthToken() {
    	return (this.mwsAuthToken!=null);
    }

    /**
     * Sets the value of the Marketplace property.
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetFeedSubmissionCountRequest} object.
     */
    public GetFeedSubmissionCountRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }

    /**
     * Sets the value of the Merchant property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetFeedSubmissionCountRequest} object.
     */
    public GetFeedSubmissionCountRequest withMerchant(String value) {
        setMerchant(value);
        return this;
    }
    
    /**
     * Sets the value of the MWSAuthToken property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetFeedSubmissionCountRequest} object.
     */
    public GetFeedSubmissionCountRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the FeedTypeList property.
     *
     * @param value a {@link com.amazonaws.mws.feeds.model.TypeList} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetFeedSubmissionCountRequest} object.
     */
    public GetFeedSubmissionCountRequest withFeedTypeList(TypeList value) {
        setFeedTypeList(value);
        return this;
    }

    /**
     * Sets the value of the FeedProcessingStatusList property.
     *
     * @param value a {@link com.amazonaws.mws.feeds.model.StatusList} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetFeedSubmissionCountRequest} object.
     */
    public GetFeedSubmissionCountRequest withFeedProcessingStatusList(StatusList value) {
        setFeedProcessingStatusList(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedFromDate property.
     *
     * @param value a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetFeedSubmissionCountRequest} object.
     */
    public GetFeedSubmissionCountRequest withSubmittedFromDate(XMLGregorianCalendar value) {
        setSubmittedFromDate(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedToDate property.
     *
     * @param value a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetFeedSubmissionCountRequest} object.
     */
    public GetFeedSubmissionCountRequest withSubmittedToDate(XMLGregorianCalendar value) {
        setSubmittedToDate(value);
        return this;
    }
    


    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetMarketplace()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Marketplace"));
            json.append(" : ");
            json.append(quoteJSON(getMarketplace()));
            first = false;
        }
        if (isSetMerchant()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Merchant"));
            json.append(" : ");
            json.append(quoteJSON(getMerchant()));
            first = false;
        }
        if (isSetFeedTypeList()) {
            if (!first) json.append(", ");
            json.append("\"FeedTypeList\" : {");
            TypeList feedTypeList = getFeedTypeList();


            json.append(feedTypeList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetFeedProcessingStatusList()) {
            if (!first) json.append(", ");
            json.append("\"FeedProcessingStatusList\" : {");
            StatusList feedProcessingStatusList = getFeedProcessingStatusList();


            json.append(feedProcessingStatusList.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetSubmittedFromDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedFromDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedFromDate() + ""));
            first = false;
        }
        if (isSetSubmittedToDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedToDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedToDate() + ""));
            first = false;
        }
        if (isSetMWSAuthToken()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("MWSAuthToken"));
            json.append(" : ");
            json.append(quoteJSON(getMWSAuthToken()));
            first = false;
        }
        return json.toString();
    }

    /**
     *
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c <  ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                sb.append(c);
            }
        }
        }
        sb.append("\"");
        return sb.toString();
    }


}
