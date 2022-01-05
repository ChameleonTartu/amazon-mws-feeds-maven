
package com.amazonaws.mws.feeds.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Schedule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "reportType",
    "schedule",
    "scheduleDate",
    "mwsAuthToken"
})
@XmlRootElement(name = "ManageReportScheduleRequest")
public class ManageReportScheduleRequest {

    @XmlElement(name = "Marketplace")
    protected String marketplace;
    @XmlElement(name = "Merchant", required = true)
    protected String merchant;
    @XmlElement(name = "ReportType", required = true)
    protected String reportType;
    @XmlElement(name = "Schedule", required = true)
    protected String schedule;
    @XmlElement(name = "ScheduleDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduleDate;
    @XmlElement(name = "MWSAuthToken")
    protected String mwsAuthToken;

    /**
     * Default constructor
     */
    public ManageReportScheduleRequest() {
        super();
    }

    /**
     * Value constructor
     *
     * @param marketplace a {@link java.lang.String} object.
     * @param merchant a {@link java.lang.String} object.
     * @param reportType a {@link java.lang.String} object.
     * @param schedule a {@link java.lang.String} object.
     * @param scheduleDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public ManageReportScheduleRequest(final String marketplace, final String merchant, final String reportType, final String schedule, final XMLGregorianCalendar scheduleDate) {
       this(marketplace, merchant, reportType, schedule, scheduleDate, null);
    }
    
    /**
     * <p>Constructor for ManageReportScheduleRequest.</p>
     *
     * @param marketplace a {@link java.lang.String} object.
     * @param merchant a {@link java.lang.String} object.
     * @param reportType a {@link java.lang.String} object.
     * @param schedule a {@link java.lang.String} object.
     * @param scheduleDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param mwsAuthToken a {@link java.lang.String} object.
     */
    public ManageReportScheduleRequest(final String marketplace, 
            final String merchant, 
            final String reportType,
            final String schedule, 
            final XMLGregorianCalendar scheduleDate, 
            final String mwsAuthToken) {
        this.marketplace = marketplace;
        this.merchant = merchant;
        this.reportType = reportType;
        this.schedule = schedule;
        this.scheduleDate = scheduleDate;
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
     * Gets the value of the reportType property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * <p>isSetReportType.</p>
     *
     * @return a boolean.
     */
    public boolean isSetReportType() {
        return (this.reportType!= null);
    }

    /**
     * Gets the value of the schedule property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setSchedule(String value) {
        this.schedule = value;
    }

    /**
     * <p>isSetSchedule.</p>
     *
     * @return a boolean.
     */
    public boolean isSetSchedule() {
        return (this.schedule!= null);
    }

    /**
     * Gets the value of the scheduleDate property.
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar}
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

    /**
     * <p>isSetScheduleDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetScheduleDate() {
        return (this.scheduleDate!= null);
    }

    /**
     * Sets the value of the Marketplace property.
     *
     * @deprecated  See {@link #setMarketplace(String)}
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ManageReportScheduleRequest} object.
     */
    public ManageReportScheduleRequest withMarketplace(String value) {
        setMarketplace(value);
        return this;
    }

    /**
     * Sets the value of the Merchant property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ManageReportScheduleRequest} object.
     */
    public ManageReportScheduleRequest withMerchant(String value) {
        setMerchant(value);
        return this;
    }
    
    /**
     * Sets the value of the MWSAuthToken property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ManageReportScheduleRequest} object.
     */
    public ManageReportScheduleRequest withMWSAuthToken(String value) {
        setMWSAuthToken(value);
        return this;
    }

    /**
     * Sets the value of the ReportType property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ManageReportScheduleRequest} object.
     */
    public ManageReportScheduleRequest withReportType(String value) {
        setReportType(value);
        return this;
    }

    /**
     * Sets the value of the Schedule property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ManageReportScheduleRequest} object.
     */
    public ManageReportScheduleRequest withSchedule(String value) {
        setSchedule(value);
        return this;
    }

    /**
     * Sets the value of the ScheduleDate property.
     *
     * @param value a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ManageReportScheduleRequest} object.
     */
    public ManageReportScheduleRequest withScheduleDate(XMLGregorianCalendar value) {
        setScheduleDate(value);
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
        if (isSetReportType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportType"));
            json.append(" : ");
            json.append(quoteJSON(getReportType()));
            first = false;
        }
        if (isSetSchedule()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("Schedule"));
            json.append(" : ");
            json.append(quoteJSON(getSchedule()));
            first = false;
        }
        if (isSetScheduleDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ScheduleDate"));
            json.append(" : ");
            json.append(quoteJSON(getScheduleDate() + ""));
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
