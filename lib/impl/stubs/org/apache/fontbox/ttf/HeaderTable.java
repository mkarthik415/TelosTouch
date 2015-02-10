/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A table in a true type font.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.1 $
 */
public class HeaderTable extends TTFTable {

	/**
	 *  Tag to identify this table.
	 */
	public static final String TAG = "head";

	public HeaderTable() {
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
	 *  @return Returns the checkSumAdjustment.
	 */
	public long getCheckSumAdjustment() {
	}

	/**
	 *  @param checkSumAdjustmentValue The checkSumAdjustment to set.
	 */
	public void setCheckSumAdjustment(long checkSumAdjustmentValue) {
	}

	/**
	 *  @return Returns the created.
	 */
	public long getCreated() {
	}

	/**
	 *  @param createdValue The created to set.
	 */
	public void setCreated(long createdValue) {
	}

	/**
	 *  @return Returns the flags.
	 */
	public int getFlags() {
	}

	/**
	 *  @param flagsValue The flags to set.
	 */
	public void setFlags(int flagsValue) {
	}

	/**
	 *  @return Returns the fontDirectionHint.
	 */
	public short getFontDirectionHint() {
	}

	/**
	 *  @param fontDirectionHintValue The fontDirectionHint to set.
	 */
	public void setFontDirectionHint(short fontDirectionHintValue) {
	}

	/**
	 *  @return Returns the fontRevision.
	 */
	public float getFontRevision() {
	}

	/**
	 *  @param fontRevisionValue The fontRevision to set.
	 */
	public void setFontRevision(float fontRevisionValue) {
	}

	/**
	 *  @return Returns the glyphDataFormat.
	 */
	public short getGlyphDataFormat() {
	}

	/**
	 *  @param glyphDataFormatValue The glyphDataFormat to set.
	 */
	public void setGlyphDataFormat(short glyphDataFormatValue) {
	}

	/**
	 *  @return Returns the indexToLocFormat.
	 */
	public short getIndexToLocFormat() {
	}

	/**
	 *  @param indexToLocFormatValue The indexToLocFormat to set.
	 */
	public void setIndexToLocFormat(short indexToLocFormatValue) {
	}

	/**
	 *  @return Returns the lowestRecPPEM.
	 */
	public int getLowestRecPPEM() {
	}

	/**
	 *  @param lowestRecPPEMValue The lowestRecPPEM to set.
	 */
	public void setLowestRecPPEM(int lowestRecPPEMValue) {
	}

	/**
	 *  @return Returns the macStyle.
	 */
	public int getMacStyle() {
	}

	/**
	 *  @param macStyleValue The macStyle to set.
	 */
	public void setMacStyle(int macStyleValue) {
	}

	/**
	 *  @return Returns the magicNumber.
	 */
	public long getMagicNumber() {
	}

	/**
	 *  @param magicNumberValue The magicNumber to set.
	 */
	public void setMagicNumber(long magicNumberValue) {
	}

	/**
	 *  @return Returns the modified.
	 */
	public long getModified() {
	}

	/**
	 *  @param modifiedValue The modified to set.
	 */
	public void setModified(long modifiedValue) {
	}

	/**
	 *  @return Returns the unitsPerEm.
	 */
	public int getUnitsPerEm() {
	}

	/**
	 *  @param unitsPerEmValue The unitsPerEm to set.
	 */
	public void setUnitsPerEm(int unitsPerEmValue) {
	}

	/**
	 *  @return Returns the version.
	 */
	public float getVersion() {
	}

	/**
	 *  @param versionValue The version to set.
	 */
	public void setVersion(float versionValue) {
	}

	/**
	 *  @return Returns the xMax.
	 */
	public short getXMax() {
	}

	/**
	 *  @param maxValue The xMax to set.
	 */
	public void setXMax(short maxValue) {
	}

	/**
	 *  @return Returns the xMin.
	 */
	public short getXMin() {
	}

	/**
	 *  @param minValue The xMin to set.
	 */
	public void setXMin(short minValue) {
	}

	/**
	 *  @return Returns the yMax.
	 */
	public short getYMax() {
	}

	/**
	 *  @param maxValue The yMax to set.
	 */
	public void setYMax(short maxValue) {
	}

	/**
	 *  @return Returns the yMin.
	 */
	public short getYMin() {
	}

	/**
	 *  @param minValue The yMin to set.
	 */
	public void setYMin(short minValue) {
	}
}
