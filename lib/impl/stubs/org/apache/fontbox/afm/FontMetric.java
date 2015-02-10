/**
 * 
 * This package holds classes used to parse AFM(Adobe Font Metrics) files.
 * <br/>
 * More information about AFM files can be found at
 * <a href="http://partners.adobe.com/asn/developer/type/">http://partners.adobe.com/asn/developer/type/</a>
 */
package org.apache.fontbox.afm;


/**
 *  This is the outermost AFM type.  This can be created by the afmparser with a valid
 *  AFM document.
 * 
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.3 $
 */
public class FontMetric {

	/**
	 *  Constructor.
	 */
	public FontMetric() {
	}

	/**
	 *  This will get the width of a character.
	 * 
	 *  @param name The character to get the width for.
	 * 
	 *  @return The width of the character.
	 * 
	 *  @throws IOException If this AFM file does not handle the character.
	 */
	public float getCharacterWidth(String name) {
	}

	/**
	 *  This will get the width of a character.
	 * 
	 *  @param name The character to get the width for.
	 * 
	 *  @return The width of the character.
	 * 
	 *  @throws IOException If this AFM file does not handle the character.
	 */
	public float getCharacterHeight(String name) {
	}

	/**
	 *  This will get the average width of a character.
	 * 
	 *  @return The width of the character.
	 * 
	 *  @throws IOException If this AFM file does not handle the character.
	 */
	public float getAverageCharacterWidth() {
	}

	/**
	 *  This will add a new comment.
	 * 
	 *  @param comment The comment to add to this metric.
	 */
	public void addComment(String comment) {
	}

	/**
	 *  This will get all comments.
	 * 
	 *  @return The list of all comments.
	 */
	public java.util.List getComments() {
	}

	/**
	 *  This will get the version of the AFM document.
	 * 
	 *  @return The version of the document.
	 */
	public float getAFMVersion() {
	}

	/**
	 *  This will get the metricSets attribute.
	 * 
	 *  @return The value of the metric sets.
	 */
	public int getMetricSets() {
	}

	/**
	 *  This will set the version of the AFM document.
	 * 
	 *  @param afmVersionValue The version of the document.
	 */
	public void setAFMVersion(float afmVersionValue) {
	}

	/**
	 *  This will set the metricSets attribute.  This value must be 0,1, or 2.
	 * 
	 *  @param metricSetsValue The new metric sets attribute.
	 */
	public void setMetricSets(int metricSetsValue) {
	}

	/**
	 *  Getter for property fontName.
	 * 
	 *  @return Value of property fontName.
	 */
	public String getFontName() {
	}

	/**
	 *  Setter for property fontName.
	 * 
	 *  @param name New value of property fontName.
	 */
	public void setFontName(String name) {
	}

	/**
	 *  Getter for property fullName.
	 * 
	 *  @return Value of property fullName.
	 */
	public String getFullName() {
	}

	/**
	 *  Setter for property fullName.
	 * 
	 *  @param fullNameValue New value of property fullName.
	 */
	public void setFullName(String fullNameValue) {
	}

	/**
	 *  Getter for property familyName.
	 * 
	 *  @return Value of property familyName.
	 */
	public String getFamilyName() {
	}

	/**
	 *  Setter for property familyName.
	 * 
	 *  @param familyNameValue New value of property familyName.
	 */
	public void setFamilyName(String familyNameValue) {
	}

	/**
	 *  Getter for property weight.
	 * 
	 *  @return Value of property weight.
	 */
	public String getWeight() {
	}

	/**
	 *  Setter for property weight.
	 * 
	 *  @param weightValue New value of property weight.
	 */
	public void setWeight(String weightValue) {
	}

	/**
	 *  Getter for property fontBBox.
	 * 
	 *  @return Value of property fontBBox.
	 */
	public org.apache.fontbox.util.BoundingBox getFontBBox() {
	}

	/**
	 *  Setter for property fontBBox.
	 * 
	 *  @param bBox New value of property fontBBox.
	 */
	public void setFontBBox(org.apache.fontbox.util.BoundingBox bBox) {
	}

	/**
	 *  Getter for property notice.
	 * 
	 *  @return Value of property notice.
	 */
	public String getNotice() {
	}

	/**
	 *  Setter for property notice.
	 * 
	 *  @param noticeValue New value of property notice.
	 */
	public void setNotice(String noticeValue) {
	}

	/**
	 *  Getter for property encodingScheme.
	 * 
	 *  @return Value of property encodingScheme.
	 */
	public String getEncodingScheme() {
	}

	/**
	 *  Setter for property encodingScheme.
	 * 
	 *  @param encodingSchemeValue New value of property encodingScheme.
	 */
	public void setEncodingScheme(String encodingSchemeValue) {
	}

	/**
	 *  Getter for property mappingScheme.
	 * 
	 *  @return Value of property mappingScheme.
	 */
	public int getMappingScheme() {
	}

	/**
	 *  Setter for property mappingScheme.
	 * 
	 *  @param mappingSchemeValue New value of property mappingScheme.
	 */
	public void setMappingScheme(int mappingSchemeValue) {
	}

	/**
	 *  Getter for property escChar.
	 * 
	 *  @return Value of property escChar.
	 */
	public int getEscChar() {
	}

	/**
	 *  Setter for property escChar.
	 * 
	 *  @param escCharValue New value of property escChar.
	 */
	public void setEscChar(int escCharValue) {
	}

	/**
	 *  Getter for property characterSet.
	 * 
	 *  @return Value of property characterSet.
	 */
	public String getCharacterSet() {
	}

	/**
	 *  Setter for property characterSet.
	 * 
	 *  @param characterSetValue New value of property characterSet.
	 */
	public void setCharacterSet(String characterSetValue) {
	}

	/**
	 *  Getter for property characters.
	 * 
	 *  @return Value of property characters.
	 */
	public int getCharacters() {
	}

	/**
	 *  Setter for property characters.
	 * 
	 *  @param charactersValue New value of property characters.
	 */
	public void setCharacters(int charactersValue) {
	}

	/**
	 *  Getter for property isBaseFont.
	 * 
	 *  @return Value of property isBaseFont.
	 */
	public boolean isBaseFont() {
	}

	/**
	 *  Setter for property isBaseFont.
	 * 
	 *  @param isBaseFontValue New value of property isBaseFont.
	 */
	public void setIsBaseFont(boolean isBaseFontValue) {
	}

	/**
	 *  Getter for property vVector.
	 * 
	 *  @return Value of property vVector.
	 */
	public float[] getVVector() {
	}

	/**
	 *  Setter for property vVector.
	 * 
	 *  @param vVectorValue New value of property vVector.
	 */
	public void setVVector(float[] vVectorValue) {
	}

	/**
	 *  Getter for property isFixedV.
	 * 
	 *  @return Value of property isFixedV.
	 */
	public boolean isFixedV() {
	}

	/**
	 *  Setter for property isFixedV.
	 * 
	 *  @param isFixedVValue New value of property isFixedV.
	 */
	public void setIsFixedV(boolean isFixedVValue) {
	}

	/**
	 *  Getter for property capHeight.
	 * 
	 *  @return Value of property capHeight.
	 */
	public float getCapHeight() {
	}

	/**
	 *  Setter for property capHeight.
	 * 
	 *  @param capHeightValue New value of property capHeight.
	 */
	public void setCapHeight(float capHeightValue) {
	}

	/**
	 *  Getter for property xHeight.
	 * 
	 *  @return Value of property xHeight.
	 */
	public float getXHeight() {
	}

	/**
	 *  Setter for property xHeight.
	 * 
	 *  @param xHeightValue New value of property xHeight.
	 */
	public void setXHeight(float xHeightValue) {
	}

	/**
	 *  Getter for property ascender.
	 * 
	 *  @return Value of property ascender.
	 */
	public float getAscender() {
	}

	/**
	 *  Setter for property ascender.
	 * 
	 *  @param ascenderValue New value of property ascender.
	 */
	public void setAscender(float ascenderValue) {
	}

	/**
	 *  Getter for property descender.
	 * 
	 *  @return Value of property descender.
	 */
	public float getDescender() {
	}

	/**
	 *  Setter for property descender.
	 * 
	 *  @param descenderValue New value of property descender.
	 */
	public void setDescender(float descenderValue) {
	}

	/**
	 *  Getter for property fontVersion.
	 * 
	 *  @return Value of property fontVersion.
	 */
	public String getFontVersion() {
	}

	/**
	 *  Setter for property fontVersion.
	 * 
	 *  @param fontVersionValue New value of property fontVersion.
	 */
	public void setFontVersion(String fontVersionValue) {
	}

	/**
	 *  Getter for property underlinePosition.
	 * 
	 *  @return Value of property underlinePosition.
	 */
	public float getUnderlinePosition() {
	}

	/**
	 *  Setter for property underlinePosition.
	 * 
	 *  @param underlinePositionValue New value of property underlinePosition.
	 */
	public void setUnderlinePosition(float underlinePositionValue) {
	}

	/**
	 *  Getter for property underlineThickness.
	 * 
	 *  @return Value of property underlineThickness.
	 */
	public float getUnderlineThickness() {
	}

	/**
	 *  Setter for property underlineThickness.
	 * 
	 *  @param underlineThicknessValue New value of property underlineThickness.
	 */
	public void setUnderlineThickness(float underlineThicknessValue) {
	}

	/**
	 *  Getter for property italicAngle.
	 * 
	 *  @return Value of property italicAngle.
	 */
	public float getItalicAngle() {
	}

	/**
	 *  Setter for property italicAngle.
	 * 
	 *  @param italicAngleValue New value of property italicAngle.
	 */
	public void setItalicAngle(float italicAngleValue) {
	}

	/**
	 *  Getter for property charWidth.
	 * 
	 *  @return Value of property charWidth.
	 */
	public float[] getCharWidth() {
	}

	/**
	 *  Setter for property charWidth.
	 * 
	 *  @param charWidthValue New value of property charWidth.
	 */
	public void setCharWidth(float[] charWidthValue) {
	}

	/**
	 *  Getter for property isFixedPitch.
	 * 
	 *  @return Value of property isFixedPitch.
	 */
	public boolean isFixedPitch() {
	}

	/**
	 *  Setter for property isFixedPitch.
	 * 
	 *  @param isFixedPitchValue New value of property isFixedPitch.
	 */
	public void setFixedPitch(boolean isFixedPitchValue) {
	}

	/**
	 * Getter for property charMetrics.
	 *  @return Value of property charMetrics.
	 */
	public java.util.List getCharMetrics() {
	}

	/**
	 * Setter for property charMetrics.
	 *  @param charMetricsValue New value of property charMetrics.
	 */
	public void setCharMetrics(java.util.List charMetricsValue) {
	}

	/**
	 *  This will add another character metric.
	 * 
	 *  @param metric The character metric to add.
	 */
	public void addCharMetric(CharMetric metric) {
	}

	/**
	 * Getter for property trackKern.
	 *  @return Value of property trackKern.
	 */
	public java.util.List getTrackKern() {
	}

	/**
	 * Setter for property trackKern.
	 *  @param trackKernValue New value of property trackKern.
	 */
	public void setTrackKern(java.util.List trackKernValue) {
	}

	/**
	 *  This will add another track kern.
	 * 
	 *  @param kern The track kerning data.
	 */
	public void addTrackKern(TrackKern kern) {
	}

	/**
	 * Getter for property composites.
	 *  @return Value of property composites.
	 */
	public java.util.List getComposites() {
	}

	/**
	 * Setter for property composites.
	 *  @param compositesList New value of property composites.
	 */
	public void setComposites(java.util.List compositesList) {
	}

	/**
	 *  This will add a single composite part to the picture.
	 * 
	 *  @param composite The composite info to add.
	 */
	public void addComposite(Composite composite) {
	}

	/**
	 * Getter for property kernPairs.
	 *  @return Value of property kernPairs.
	 */
	public java.util.List getKernPairs() {
	}

	/**
	 *  This will add a kern pair.
	 * 
	 *  @param kernPair The kern pair to add.
	 */
	public void addKernPair(KernPair kernPair) {
	}

	/**
	 * Setter for property kernPairs.
	 *  @param kernPairsList New value of property kernPairs.
	 */
	public void setKernPairs(java.util.List kernPairsList) {
	}

	/**
	 * Getter for property kernPairs0.
	 *  @return Value of property kernPairs0.
	 */
	public java.util.List getKernPairs0() {
	}

	/**
	 *  This will add a kern pair.
	 * 
	 *  @param kernPair The kern pair to add.
	 */
	public void addKernPair0(KernPair kernPair) {
	}

	/**
	 * Setter for property kernPairs0.
	 *  @param kernPairs0List New value of property kernPairs0.
	 */
	public void setKernPairs0(java.util.List kernPairs0List) {
	}

	/**
	 * Getter for property kernPairs1.
	 *  @return Value of property kernPairs1.
	 */
	public java.util.List getKernPairs1() {
	}

	/**
	 *  This will add a kern pair.
	 * 
	 *  @param kernPair The kern pair to add.
	 */
	public void addKernPair1(KernPair kernPair) {
	}

	/**
	 * Setter for property kernPairs1.
	 *  @param kernPairs1List New value of property kernPairs1.
	 */
	public void setKernPairs1(java.util.List kernPairs1List) {
	}

	/**
	 * Getter for property standardHorizontalWidth.
	 *  @return Value of property standardHorizontalWidth.
	 */
	public float getStandardHorizontalWidth() {
	}

	/**
	 * Setter for property standardHorizontalWidth.
	 *  @param standardHorizontalWidthValue New value of property standardHorizontalWidth.
	 */
	public void setStandardHorizontalWidth(float standardHorizontalWidthValue) {
	}

	/**
	 * Getter for property standardVerticalWidth.
	 *  @return Value of property standardVerticalWidth.
	 */
	public float getStandardVerticalWidth() {
	}

	/**
	 * Setter for property standardVerticalWidth.
	 *  @param standardVerticalWidthValue New value of property standardVerticalWidth.
	 */
	public void setStandardVerticalWidth(float standardVerticalWidthValue) {
	}
}
