//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.14 at 05:38:42 PM CEST 
//


package eu.transkribus.core.model.beans.pagecontent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     			Monospace (fixed-pitch, non-proportional) or
 *     			proportional font
 *     		
 * 
 * <p>Java class for TextStyleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextStyleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="fontFamily" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serif" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="monospace" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="kerning" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="textColour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2013-07-15}ColourSimpleType" />
 *       &lt;attribute name="bgColour" type="{http://schema.primaresearch.org/PAGE/gts/pagecontent/2013-07-15}ColourSimpleType" />
 *       &lt;attribute name="reverseVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="bold" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="italic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="underlined" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="subscript" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="superscript" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="strikethrough" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="smallCaps" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="letterSpaced" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextStyleType")
public class TextStyleType {

    @XmlAttribute(name = "fontFamily")
    protected String fontFamily;
    @XmlAttribute(name = "serif")
    protected Boolean serif;
    @XmlAttribute(name = "monospace")
    protected Boolean monospace;
    @XmlAttribute(name = "fontSize")
    protected Float fontSize;
    @XmlAttribute(name = "kerning")
    protected Integer kerning;
    @XmlAttribute(name = "textColour")
    protected ColourSimpleType textColour;
    @XmlAttribute(name = "bgColour")
    protected ColourSimpleType bgColour;
    @XmlAttribute(name = "reverseVideo")
    protected Boolean reverseVideo;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "italic")
    protected Boolean italic;
    @XmlAttribute(name = "underlined")
    protected Boolean underlined;
    @XmlAttribute(name = "subscript")
    protected Boolean subscript;
    @XmlAttribute(name = "superscript")
    protected Boolean superscript;
    @XmlAttribute(name = "strikethrough")
    protected Boolean strikethrough;
    @XmlAttribute(name = "smallCaps")
    protected Boolean smallCaps;
    @XmlAttribute(name = "letterSpaced")
    protected Boolean letterSpaced;

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the serif property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSerif() {
        return serif;
    }

    /**
     * Sets the value of the serif property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSerif(Boolean value) {
        this.serif = value;
    }

    /**
     * Gets the value of the monospace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonospace() {
        return monospace;
    }

    /**
     * Sets the value of the monospace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonospace(Boolean value) {
        this.monospace = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFontSize(Float value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the kerning property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKerning() {
        return kerning;
    }

    /**
     * Sets the value of the kerning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKerning(Integer value) {
        this.kerning = value;
    }

    /**
     * Gets the value of the textColour property.
     * 
     * @return
     *     possible object is
     *     {@link ColourSimpleType }
     *     
     */
    public ColourSimpleType getTextColour() {
        return textColour;
    }

    /**
     * Sets the value of the textColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourSimpleType }
     *     
     */
    public void setTextColour(ColourSimpleType value) {
        this.textColour = value;
    }

    /**
     * Gets the value of the bgColour property.
     * 
     * @return
     *     possible object is
     *     {@link ColourSimpleType }
     *     
     */
    public ColourSimpleType getBgColour() {
        return bgColour;
    }

    /**
     * Sets the value of the bgColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourSimpleType }
     *     
     */
    public void setBgColour(ColourSimpleType value) {
        this.bgColour = value;
    }

    /**
     * Gets the value of the reverseVideo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseVideo() {
        return reverseVideo;
    }

    /**
     * Sets the value of the reverseVideo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseVideo(Boolean value) {
        this.reverseVideo = value;
    }

    /**
     * Gets the value of the bold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBold() {
        return bold;
    }

    /**
     * Sets the value of the bold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Gets the value of the italic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItalic() {
        return italic;
    }

    /**
     * Sets the value of the italic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**
     * Gets the value of the underlined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderlined() {
        return underlined;
    }

    /**
     * Sets the value of the underlined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderlined(Boolean value) {
        this.underlined = value;
    }

    /**
     * Gets the value of the subscript property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscript() {
        return subscript;
    }

    /**
     * Sets the value of the subscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscript(Boolean value) {
        this.subscript = value;
    }

    /**
     * Gets the value of the superscript property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuperscript() {
        return superscript;
    }

    /**
     * Sets the value of the superscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuperscript(Boolean value) {
        this.superscript = value;
    }

    /**
     * Gets the value of the strikethrough property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrikethrough() {
        return strikethrough;
    }

    /**
     * Sets the value of the strikethrough property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrikethrough(Boolean value) {
        this.strikethrough = value;
    }

    /**
     * Gets the value of the smallCaps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmallCaps() {
        return smallCaps;
    }

    /**
     * Sets the value of the smallCaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallCaps(Boolean value) {
        this.smallCaps = value;
    }

    /**
     * Gets the value of the letterSpaced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterSpaced() {
        return letterSpaced;
    }

    /**
     * Sets the value of the letterSpaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterSpaced(Boolean value) {
        this.letterSpaced = value;
    }

}
