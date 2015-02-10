/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A table in a true type font.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  
 */
public class PostScriptTable extends TTFTable {

	/**
	 *  A tag that identifies this table type.
	 */
	public static final String TAG = "post";

	public PostScriptTable() {
	}

	/**
	 *  This will read the required data from the stream.
	 *  
	 *  @param ttf The font that is being read.
	 *  @param data The stream to read the data from.
	 *  @throws IOException If there is an error reading the data.
	 */
	public void initData(TrueTypeFont ttf, TTFDataStream data) {
	}

	/**
	 *  @return Returns the formatType.
	 */
	public float getFormatType() {
	}

	/**
	 *  @param formatTypeValue The formatType to set.
	 */
	public void setFormatType(float formatTypeValue) {
	}

	/**
	 *  @return Returns the isFixedPitch.
	 */
	public long getIsFixedPitch() {
	}

	/**
	 *  @param isFixedPitchValue The isFixedPitch to set.
	 */
	public void setIsFixedPitch(long isFixedPitchValue) {
	}

	/**
	 *  @return Returns the italicAngle.
	 */
	public float getItalicAngle() {
	}

	/**
	 *  @param italicAngleValue The italicAngle to set.
	 */
	public void setItalicAngle(float italicAngleValue) {
	}

	/**
	 *  @return Returns the maxMemType1.
	 */
	public long getMaxMemType1() {
	}

	/**
	 *  @param maxMemType1Value The maxMemType1 to set.
	 */
	public void setMaxMemType1(long maxMemType1Value) {
	}

	/**
	 *  @return Returns the maxMemType42.
	 */
	public long getMaxMemType42() {
	}

	/**
	 *  @param maxMemType42Value The maxMemType42 to set.
	 */
	public void setMaxMemType42(long maxMemType42Value) {
	}

	/**
	 *  @return Returns the mimMemType1.
	 */
	public long getMimMemType1() {
	}

	/**
	 *  @param mimMemType1Value The mimMemType1 to set.
	 */
	public void setMimMemType1(long mimMemType1Value) {
	}

	/**
	 *  @return Returns the minMemType42.
	 */
	public long getMinMemType42() {
	}

	/**
	 *  @param minMemType42Value The minMemType42 to set.
	 */
	public void setMinMemType42(long minMemType42Value) {
	}

	/**
	 *  @return Returns the underlinePosition.
	 */
	public short getUnderlinePosition() {
	}

	/**
	 *  @param underlinePositionValue The underlinePosition to set.
	 */
	public void setUnderlinePosition(short underlinePositionValue) {
	}

	/**
	 *  @return Returns the underlineThickness.
	 */
	public short getUnderlineThickness() {
	}

	/**
	 *  @param underlineThicknessValue The underlineThickness to set.
	 */
	public void setUnderlineThickness(short underlineThicknessValue) {
	}

	/**
	 *  @return Returns the glyphNames.
	 */
	public String[] getGlyphNames() {
	}

	/**
	 *  @param glyphNamesValue The glyphNames to set.
	 */
	public void setGlyphNames(String[] glyphNamesValue) {
	}
}
