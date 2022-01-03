
package com.amazonaws.mws.feeds.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HasNext" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ReportRequestInfo" type="{http://mws.amazonaws.com/doc/2009-01-01/}ReportRequestInfo" maxOccurs="unbounded"/&gt;
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
    "nextToken",
    "hasNext",
    "reportRequestInfo"
})
@XmlRootElement(name = "GetReportRequestListResult")
public class GetReportRequestListResult {

    @XmlElement(name = "NextToken", required = true)
    protected String nextToken;
    @XmlElement(name = "HasNext")
    protected boolean hasNext;
    @XmlElement(name = "ReportRequestInfo", required = true)
    protected List<ReportRequestInfo> reportRequestInfo;

    /**
     * Default constructor
     */
    public GetReportRequestListResult() {
        super();
    }

    /**
     * Value constructor
     *
     * @param nextToken a {@link java.lang.String} object.
     * @param hasNext a boolean.
     * @param reportRequestInfo a {@link java.util.List} object.
     */
    public GetReportRequestListResult(final String nextToken, final boolean hasNext, final List<ReportRequestInfo> reportRequestInfo) {
        this.nextToken = nextToken;
        this.hasNext = hasNext;
        this.reportRequestInfo = reportRequestInfo;
    }

    /**
     * Gets the value of the nextToken property.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Sets the value of the nextToken property.
     *
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    public void setNextToken(String value) {
        this.nextToken = value;
    }

    /**
     * <p>isSetNextToken.</p>
     *
     * @return a boolean.
     */
    public boolean isSetNextToken() {
        return (this.nextToken!= null);
    }

    /**
     * Gets the value of the hasNext property.
     *
     * @return a boolean.
     */
    public boolean isHasNext() {
        return hasNext;
    }

    /**
     * Sets the value of the hasNext property.
     *
     * @param value a boolean.
     */
    public void setHasNext(boolean value) {
        this.hasNext = value;
    }

    /**
     * <p>isSetHasNext.</p>
     *
     * @return a boolean.
     */
    public boolean isSetHasNext() {
        return true;
    }

    /**
     * Gets the value of the reportRequestInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportRequestInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportRequestInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.amazonaws.mws.feeds.model.ReportRequestInfo}
     *
     * @return a {@link java.util.List} object.
     */
    public List<ReportRequestInfo> getReportRequestInfoList() {
        if (reportRequestInfo == null) {
            reportRequestInfo = new ArrayList<ReportRequestInfo>();
        }
        return this.reportRequestInfo;
    }

    /**
     * <p>isSetReportRequestInfoList.</p>
     *
     * @return a boolean.
     */
    public boolean isSetReportRequestInfoList() {
        return ((this.reportRequestInfo!= null)&&(!this.reportRequestInfo.isEmpty()));
    }

    /**
     * <p>unsetReportRequestInfoList.</p>
     */
    public void unsetReportRequestInfoList() {
        this.reportRequestInfo = null;
    }

    /**
     * Sets the value of the NextToken property.
     *
     * @param value a {@link java.lang.String} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetReportRequestListResult} object.
     */
    public GetReportRequestListResult withNextToken(String value) {
        setNextToken(value);
        return this;
    }

    /**
     * Sets the value of the HasNext property.
     *
     * @param value a boolean.
     * @return a {@link com.amazonaws.mws.feeds.model.GetReportRequestListResult} object.
     */
    public GetReportRequestListResult withHasNext(boolean value) {
        setHasNext(value);
        return this;
    }

    /**
     * Sets the value of the ReportRequestInfo property.
     *
     * @param values a {@link com.amazonaws.mws.feeds.model.ReportRequestInfo} object.
     * @return a {@link com.amazonaws.mws.feeds.model.GetReportRequestListResult} object.
     */
    public GetReportRequestListResult withReportRequestInfoList(ReportRequestInfo... values) {
        for (ReportRequestInfo value: values) {
            getReportRequestInfoList().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the reportRequestInfo property.
     *
     * @param reportRequestInfo
     *     allowed object is
     *     {@link com.amazonaws.mws.feeds.model.ReportRequestInfo}
     */
    public void setReportRequestInfoList(List<ReportRequestInfo> reportRequestInfo) {
        this.reportRequestInfo = reportRequestInfo;
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
        if (isSetNextToken()) {
            xml.append("<NextToken>");
            xml.append(escapeXML(getNextToken()));
            xml.append("</NextToken>");
        }
        if (isSetHasNext()) {
            xml.append("<HasNext>");
            xml.append(isHasNext() + "");
            xml.append("</HasNext>");
        }
        java.util.List<ReportRequestInfo> reportRequestInfoList = getReportRequestInfoList();
        for (ReportRequestInfo reportRequestInfo : reportRequestInfoList) {
            xml.append("<ReportRequestInfo>");
            xml.append(reportRequestInfo.toXMLFragment());
            xml.append("</ReportRequestInfo>");
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
        if (isSetNextToken()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("NextToken"));
            json.append(" : ");
            json.append(quoteJSON(getNextToken()));
            first = false;
        }
        if (isSetHasNext()) {
            if (!first) json.append(", ");
            json.append(quoteJSON("HasNext"));
            json.append(" : ");
            json.append(quoteJSON(isHasNext() + ""));
            first = false;
        }
        if (isSetReportRequestInfoList()) {
            if (!first) json.append(", ");
            json.append("\"ReportRequestInfo\" : [");
            java.util.List<ReportRequestInfo> reportRequestInfoList = getReportRequestInfoList();
            for (ReportRequestInfo reportRequestInfo : reportRequestInfoList) {
                if (reportRequestInfoList.indexOf(reportRequestInfo) > 0) json.append(", ");
                json.append("{");
                json.append("");
                json.append(reportRequestInfo.toJSONFragment());
                json.append("}");
                first = false;
            }
            json.append("]");
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
