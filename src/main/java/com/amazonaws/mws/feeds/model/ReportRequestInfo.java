
package com.amazonaws.mws.feeds.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportRequestInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportRequestInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ReportType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubmittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReportProcessingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GeneratedReportId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartedProcessingDate" type={http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CompletedDate" type="{http:/www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "ReportRequestInfo", propOrder = {
    "reportRequestId",
    "reportType",
    "startDate",
    "endDate",
    "scheduled",
    "submittedDate",
    "reportProcessingStatus",
    "generatedReportId",
    "startedProcessingDate",
    "completedDate"
})
public class ReportRequestInfo {

    @XmlElement(name = "ReportRequestId", required = true)
    protected String reportRequestId;
    @XmlElement(name = "ReportType", required = true)
    protected String reportType;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Scheduled", required = true )
    protected boolean scheduled;
    @XmlElement(name = "SubmittedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedDate;
    @XmlElement(name = "ReportProcessingStatus", required = true)
    protected String reportProcessingStatus;
    @XmlElement(name = "GeneratedReportId")
    protected String generatedReportId;
    @XmlElement(name = "StartedProcessingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startedProcessingDate;
    @XmlElement(name = "CompletedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completedDate;

    /**
     * Default constructor
     */
    public ReportRequestInfo() {
        super();
    }

    /**
     * Value constructor
     *
     * @param reportRequestId a {@link java.lang.String} object.
     * @param reportType a {@link java.lang.String} object.
     * @param startDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param endDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param scheduled a boolean.
     * @param submittedDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param reportProcessingStatus a {@link java.lang.String} object.
     * @param generatedReportId a {@link java.lang.String} object.
     * @param startedProcessingDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @param completedDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public ReportRequestInfo(final String reportRequestId, 
    		final String reportType, 
    		final XMLGregorianCalendar startDate, 
    		final XMLGregorianCalendar endDate, 
    		final boolean scheduled,
    		final XMLGregorianCalendar submittedDate, 
    		final String reportProcessingStatus,
    		final String generatedReportId,
    		final XMLGregorianCalendar startedProcessingDate,
    		final XMLGregorianCalendar completedDate) {
        this.reportRequestId = reportRequestId;
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.scheduled = scheduled;
        this.submittedDate = submittedDate;
        this.reportProcessingStatus = reportProcessingStatus;
        this.generatedReportId = generatedReportId;
        this.startedProcessingDate = startedProcessingDate;
        this.completedDate = completedDate;
    }

    /**
     * Gets the value of the reportRequestId property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReportRequestId() {
        return reportRequestId;
    }

    /**
     * Sets the value of the reportRequestId property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setReportRequestId(String value) {
        this.reportRequestId = value;
    }

    /**
     * <p>isSetReportRequestId.</p>
     *
     * @return a boolean.
     */
    public boolean isSetReportRequestId() {
        return (this.reportRequestId!= null);
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
     * Gets the value of the startDate property.
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar}
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * <p>isSetStartDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetStartDate() {
        return (this.startDate!= null);
    }

    /**
     * Gets the value of the endDate property.
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar}
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * <p>isSetEndDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetEndDate() {
        return (this.endDate!= null);
    }
    
    /**
     * <p>isScheduled.</p>
     *
     * @return a boolean.
     */
    public boolean isScheduled() {
    	return scheduled;
    }
    
    /**
     * <p>isSetScheduled.</p>
     *
     * @return a boolean.
     */
    public boolean isSetScheduled() {
    	return true;
    }
    
    /**
     * <p>Setter for the field <code>scheduled</code>.</p>
     *
     * @param scheduled a boolean.
     */
    public void setScheduled(boolean scheduled) {
    	this.scheduled = scheduled;
    }
    
    /**
     * <p>withScheduled.</p>
     *
     * @param scheduled a boolean.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withScheduled(boolean scheduled) {
    	setScheduled(scheduled);
    	return this;
    }
    
    /**
     * <p>Getter for the field <code>generatedReportId</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getGeneratedReportId() {
    	return generatedReportId;
    }
    
    /**
     * <p>Setter for the field <code>generatedReportId</code>.</p>
     *
     * @param generatedReportId a {@link java.lang.String} object.
     */
    public void setGeneratedReportId(String generatedReportId) {
    	this.generatedReportId = generatedReportId;
    }
    
    /**
     * <p>isSetGeneratedReportId.</p>
     *
     * @return a boolean.
     */
    public boolean isSetGeneratedReportId() {
    	return generatedReportId!=null;
    }
    
    /**
     * <p>withGeneratedReportId.</p>
     *
     * @param generatedReportId a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withGeneratedReportId(String generatedReportId) {
    	setGeneratedReportId(generatedReportId);
    	return this;
    }
    
    /**
     * <p>Getter for the field <code>startedProcessingDate</code>.</p>
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getStartedProcessingDate() {
    	return startedProcessingDate;
    }
    
    /**
     * <p>Setter for the field <code>startedProcessingDate</code>.</p>
     *
     * @param startedProcessingDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public void setStartedProcessingDate(XMLGregorianCalendar startedProcessingDate) {
    	this.startedProcessingDate = startedProcessingDate;
    }
    
    /**
     * <p>isSetStartedProcessingDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetStartedProcessingDate() {
    	return startedProcessingDate!=null;
    }
    
    /**
     * <p>withStartedProcessingDate.</p>
     *
     * @param startedProcessingDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withStartedProcessingDate(XMLGregorianCalendar startedProcessingDate) {
    	setStartedProcessingDate(startedProcessingDate);
    	return this;
    }
    
    /**
     * <p>Getter for the field <code>completedDate</code>.</p>
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getCompletedDate() {
    	return completedDate;
    }
    
    /**
     * <p>Setter for the field <code>completedDate</code>.</p>
     *
     * @param completedDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public void setCompletedDate(XMLGregorianCalendar completedDate) {
    	this.completedDate = completedDate;
    }
    
    /**
     * <p>isSetCompletedDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetCompletedDate() {
    	return completedDate!=null;
    }
    
    /**
     * <p>withCompletedDate.</p>
     *
     * @param completedDate a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withCompletedDate(XMLGregorianCalendar completedDate) {
    	setCompletedDate(completedDate);
    	return this;
    }

    /**
     * Gets the value of the submittedDate property.
     *
     * @return a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     */
    public XMLGregorianCalendar getSubmittedDate() {
        return submittedDate;
    }

    /**
     * Sets the value of the submittedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar}
     */
    public void setSubmittedDate(XMLGregorianCalendar value) {
        this.submittedDate = value;
    }

    /**
     * <p>isSetSubmittedDate.</p>
     *
     * @return a boolean.
     */
    public boolean isSetSubmittedDate() {
        return (this.submittedDate!= null);
    }

    /**
     * Gets the value of the reportProcessingStatus property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getReportProcessingStatus() {
        return reportProcessingStatus;
    }

    /**
     * Sets the value of the reportProcessingStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setReportProcessingStatus(String value) {
        this.reportProcessingStatus = value;
    }

    /**
     * <p>isSetReportProcessingStatus.</p>
     *
     * @return a boolean.
     */
    public boolean isSetReportProcessingStatus() {
        return (this.reportProcessingStatus!= null);
    }

    /**
     * Sets the value of the ReportRequestId property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withReportRequestId(String value) {
        setReportRequestId(value);
        return this;
    }

    /**
     * Sets the value of the ReportType property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withReportType(String value) {
        setReportType(value);
        return this;
    }

    /**
     * Sets the value of the StartDate property.
     *
     * @param value a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withStartDate(XMLGregorianCalendar value) {
        setStartDate(value);
        return this;
    }

    /**
     * Sets the value of the EndDate property.
     *
     * @param value a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withEndDate(XMLGregorianCalendar value) {
        setEndDate(value);
        return this;
    }

    /**
     * Sets the value of the SubmittedDate property.
     *
     * @param value a {@link javax.xml.datatype.XMLGregorianCalendar} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withSubmittedDate(XMLGregorianCalendar value) {
        setSubmittedDate(value);
        return this;
    }

    /**
     * Sets the value of the ReportProcessingStatus property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     */
    public ReportRequestInfo withReportProcessingStatus(String value) {
        setReportProcessingStatus(value);
        return this;
    }
    

    /**
     *
     * XML fragment representation of this object
     *
     * @return XML fragment for this object. Name for outer
     * tag expected to be set by calling method. This fragment
     * returns inner properties representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetReportRequestId()) {
            xml.append("<ReportRequestId>");
            xml.append(escapeXML(getReportRequestId()));
            xml.append("</ReportRequestId>");
        }
        if (isSetReportType()) {
            xml.append("<ReportType>");
            xml.append(escapeXML(getReportType()));
            xml.append("</ReportType>");
        }
        if (isSetStartDate()) {
            xml.append("<StartDate>");
            xml.append(getStartDate() + "");
            xml.append("</StartDate>");
        }
        if (isSetEndDate()) {
            xml.append("<EndDate>");
            xml.append(getEndDate() + "");
            xml.append("</EndDate>");
        }
        if (isSetScheduled()) {
        	xml.append("<Scheduled>");
        	xml.append(isScheduled()+"");
        	xml.append("</Scheduled>");
        }
        if (isSetSubmittedDate()) {
            xml.append("<SubmittedDate>");
            xml.append(getSubmittedDate() + "");
            xml.append("</SubmittedDate>");
        }
        if (isSetReportProcessingStatus()) {
            xml.append("<ReportProcessingStatus>");
            xml.append(escapeXML(getReportProcessingStatus()));
            xml.append("</ReportProcessingStatus>");
        }
        if (isSetGeneratedReportId()) {
        	xml.append("<GeneratedReportId>");
        	xml.append(escapeXML(getGeneratedReportId()));
        	xml.append("</GeneratedReportId>");
        }
        if (isSetStartedProcessingDate()) {
        	xml.append("<StartedProcessingDate>");
        	xml.append(getStartedProcessingDate()+"");
        	xml.append("</StartedProcessingDate>");
        }
        if (isSetCompletedDate()) {
        	xml.append("<CompletedDate>");
        	xml.append(getCompletedDate()+"");
        	xml.append("</CompletedDate>");
        }
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
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
        if (isSetReportRequestId()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportRequestId"));
            json.append(" : ");
            json.append(quoteJSON(getReportRequestId()));
            first = false;
        }
        if (isSetReportType()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportType"));
            json.append(" : ");
            json.append(quoteJSON(getReportType()));
            first = false;
        }
        if (isSetStartDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("StartDate"));
            json.append(" : ");
            json.append(quoteJSON(getStartDate() + ""));
            first = false;
        }
        if (isSetEndDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("EndDate"));
            json.append(" : ");
            json.append(quoteJSON(getEndDate() + ""));
            first = false;
        }
        if (isSetScheduled()) {
        	if (!first) json.append(", ");
        	json.append(quoteJSON("Scheduled"));
        	json.append(" : ");
        	json.append(quoteJSON(isScheduled()+""));
        	first = false;
        }
        if (isSetSubmittedDate()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("SubmittedDate"));
            json.append(" : ");
            json.append(quoteJSON(getSubmittedDate() + ""));
            first = false;
        }
        if (isSetReportProcessingStatus()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("ReportProcessingStatus"));
            json.append(" : ");
            json.append(quoteJSON(getReportProcessingStatus()));
            first = false;
        }
        if (isSetGeneratedReportId()) {
        	if (!first) json.append(", ");
        	json.append(quoteJSON("GeneratedReportId"));
        	json.append(" : ");
        	json.append(quoteJSON(getGeneratedReportId()));
        	first = false;
        }
        if (isSetStartedProcessingDate()) {
        	if (!first) json.append(", ");
        	json.append(quoteJSON("StartedProcessingDate"));
        	json.append(" : ");
        	json.append(quoteJSON(getStartedProcessingDate()+""));
        	first = false;
        }
        if (isSetCompletedDate()) {
        	if (!first) json.append(", ");
        	json.append(quoteJSON("CompletedDate"));
        	json.append(" : ");
        	json.append(quoteJSON(getCompletedDate()+""));
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
