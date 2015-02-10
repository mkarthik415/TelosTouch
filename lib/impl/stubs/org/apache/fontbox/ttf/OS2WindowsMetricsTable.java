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
public class OS2WindowsMetricsTable extends TTFTable {

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_THIN = 100;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_ULTRA_LIGHT = 200;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_LIGHT = 300;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_NORMAL = 400;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_MEDIUM = 500;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_SEMI_BOLD = 600;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_BOLD = 700;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_EXTRA_BOLD = 800;

	/**
	 *  Weight class constant.
	 */
	public static final int WEIGHT_CLASS_BLACK = 900;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_ULTRA_CONDENSED = 1;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_EXTRA_CONDENSED = 2;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_CONDENSED = 3;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_SEMI_CONDENSED = 4;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_MEDIUM = 5;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_SEMI_EXPANDED = 6;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_EXPANDED = 7;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_EXTRA_EXPANDED = 8;

	/**
	 *  Width class constant.
	 */
	public static final int WIDTH_CLASS_ULTRA_EXPANDED = 9;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_NO_CLASSIFICATION = 0;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_OLDSTYLE_SERIFS = 1;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_TRANSITIONAL_SERIFS = 2;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_MODERN_SERIFS = 3;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_CLAREDON_SERIFS = 4;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_SLAB_SERIFS = 5;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_FREEFORM_SERIFS = 7;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_SANS_SERIF = 8;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_ORNAMENTALS = 9;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_SCRIPTS = 10;

	/**
	 *  Family class constant.
	 */
	public static final int FAMILY_CLASS_SYMBOLIC = 12;

	/**
	 *  A tag that identifies this table type.
	 */
	public static final String TAG = "OS/2";

	public OS2WindowsMetricsTable() {
	}

	/**
	 *  @return Returns the achVendId.
	 */
	public String getAchVendId() {
	}

	/**
	 *  @param achVendIdValue The achVendId to set.
	 */
	public void setAchVendId(String achVendIdValue) {
	}

	/**
	 *  @return Returns the averageCharWidth.
	 */
	public short getAverageCharWidth() {
	}

	/**
	 *  @param averageCharWidthValue The averageCharWidth to set.
	 */
	public void setAverageCharWidth(short averageCharWidthValue) {
	}

	/**
	 *  @return Returns the codePageRange1.
	 */
	public long getCodePageRange1() {
	}

	/**
	 *  @param codePageRange1Value The codePageRange1 to set.
	 */
	public void setCodePageRange1(long codePageRange1Value) {
	}

	/**
	 *  @return Returns the codePageRange2.
	 */
	public long getCodePageRange2() {
	}

	/**
	 *  @param codePageRange2Value The codePageRange2 to set.
	 */
	public void setCodePageRange2(long codePageRange2Value) {
	}

	/**
	 *  @return Returns the familyClass.
	 */
	public int getFamilyClass() {
	}

	/**
	 *  @param familyClassValue The familyClass to set.
	 */
	public void setFamilyClass(int familyClassValue) {
	}

	/**
	 *  @return Returns the familySubClass.
	 */
	public int getFamilySubClass() {
	}

	/**
	 *  @param familySubClassValue The familySubClass to set.
	 */
	public void setFamilySubClass(int familySubClassValue) {
	}

	/**
	 *  @return Returns the firstCharIndex.
	 */
	public int getFirstCharIndex() {
	}

	/**
	 *  @param firstCharIndexValue The firstCharIndex to set.
	 */
	public void setFirstCharIndex(int firstCharIndexValue) {
	}

	/**
	 *  @return Returns the fsSelection.
	 */
	public int getFsSelection() {
	}

	/**
	 *  @param fsSelectionValue The fsSelection to set.
	 */
	public void setFsSelection(int fsSelectionValue) {
	}

	/**
	 *  @return Returns the fsType.
	 */
	public short getFsType() {
	}

	/**
	 *  @param fsTypeValue The fsType to set.
	 */
	public void setFsType(short fsTypeValue) {
	}

	/**
	 *  @return Returns the lastCharIndex.
	 */
	public int getLastCharIndex() {
	}

	/**
	 *  @param lastCharIndexValue The lastCharIndex to set.
	 */
	public void setLastCharIndex(int lastCharIndexValue) {
	}

	/**
	 *  @return Returns the panose.
	 */
	public byte[] getPanose() {
	}

	/**
	 *  @param panoseValue The panose to set.
	 */
	public void setPanose(byte[] panoseValue) {
	}

	/**
	 *  @return Returns the strikeoutPosition.
	 */
	public short getStrikeoutPosition() {
	}

	/**
	 *  @param strikeoutPositionValue The strikeoutPosition to set.
	 */
	public void setStrikeoutPosition(short strikeoutPositionValue) {
	}

	/**
	 *  @return Returns the strikeoutSize.
	 */
	public short getStrikeoutSize() {
	}

	/**
	 *  @param strikeoutSizeValue The strikeoutSize to set.
	 */
	public void setStrikeoutSize(short strikeoutSizeValue) {
	}

	/**
	 *  @return Returns the subscriptXOffset.
	 */
	public short getSubscriptXOffset() {
	}

	/**
	 *  @param subscriptXOffsetValue The subscriptXOffset to set.
	 */
	public void setSubscriptXOffset(short subscriptXOffsetValue) {
	}

	/**
	 *  @return Returns the subscriptXSize.
	 */
	public short getSubscriptXSize() {
	}

	/**
	 *  @param subscriptXSizeValue The subscriptXSize to set.
	 */
	public void setSubscriptXSize(short subscriptXSizeValue) {
	}

	/**
	 *  @return Returns the subscriptYOffset.
	 */
	public short getSubscriptYOffset() {
	}

	/**
	 *  @param subscriptYOffsetValue The subscriptYOffset to set.
	 */
	public void setSubscriptYOffset(short subscriptYOffsetValue) {
	}

	/**
	 *  @return Returns the subscriptYSize.
	 */
	public short getSubscriptYSize() {
	}

	/**
	 *  @param subscriptYSizeValue The subscriptYSize to set.
	 */
	public void setSubscriptYSize(short subscriptYSizeValue) {
	}

	/**
	 *  @return Returns the superscriptXOffset.
	 */
	public short getSuperscriptXOffset() {
	}

	/**
	 *  @param superscriptXOffsetValue The superscriptXOffset to set.
	 */
	public void setSuperscriptXOffset(short superscriptXOffsetValue) {
	}

	/**
	 *  @return Returns the superscriptXSize.
	 */
	public short getSuperscriptXSize() {
	}

	/**
	 *  @param superscriptXSizeValue The superscriptXSize to set.
	 */
	public void setSuperscriptXSize(short superscriptXSizeValue) {
	}

	/**
	 *  @return Returns the superscriptYOffset.
	 */
	public short getSuperscriptYOffset() {
	}

	/**
	 *  @param superscriptYOffsetValue The superscriptYOffset to set.
	 */
	public void setSuperscriptYOffset(short superscriptYOffsetValue) {
	}

	/**
	 *  @return Returns the superscriptYSize.
	 */
	public short getSuperscriptYSize() {
	}

	/**
	 *  @param superscriptYSizeValue The superscriptYSize to set.
	 */
	public void setSuperscriptYSize(short superscriptYSizeValue) {
	}

	/**
	 *  @return Returns the typeLineGap.
	 */
	public int getTypeLineGap() {
	}

	/**
	 *  @param typeLineGapValue The typeLineGap to set.
	 */
	public void setTypeLineGap(int typeLineGapValue) {
	}

	/**
	 *  @return Returns the typoAscender.
	 */
	public int getTypoAscender() {
	}

	/**
	 *  @param typoAscenderValue The typoAscender to set.
	 */
	public void setTypoAscender(int typoAscenderValue) {
	}

	/**
	 *  @return Returns the typoDescender.
	 */
	public int getTypoDescender() {
	}

	/**
	 *  @param typoDescenderValue The typoDescender to set.
	 */
	public void setTypoDescender(int typoDescenderValue) {
	}

	/**
	 *  @return Returns the unicodeRange1.
	 */
	public long getUnicodeRange1() {
	}

	/**
	 *  @param unicodeRange1Value The unicodeRange1 to set.
	 */
	public void setUnicodeRange1(long unicodeRange1Value) {
	}

	/**
	 *  @return Returns the unicodeRange2.
	 */
	public long getUnicodeRange2() {
	}

	/**
	 *  @param unicodeRange2Value The unicodeRange2 to set.
	 */
	public void setUnicodeRange2(long unicodeRange2Value) {
	}

	/**
	 *  @return Returns the unicodeRange3.
	 */
	public long getUnicodeRange3() {
	}

	/**
	 *  @param unicodeRange3Value The unicodeRange3 to set.
	 */
	public void setUnicodeRange3(long unicodeRange3Value) {
	}

	/**
	 *  @return Returns the unicodeRange4.
	 */
	public long getUnicodeRange4() {
	}

	/**
	 *  @param unicodeRange4Value The unicodeRange4 to set.
	 */
	public void setUnicodeRange4(long unicodeRange4Value) {
	}

	/**
	 *  @return Returns the version.
	 */
	public int getVersion() {
	}

	/**
	 *  @param versionValue The version to set.
	 */
	public void setVersion(int versionValue) {
	}

	/**
	 *  @return Returns the weightClass.
	 */
	public int getWeightClass() {
	}

	/**
	 *  @param weightClassValue The weightClass to set.
	 */
	public void setWeightClass(int weightClassValue) {
	}

	/**
	 *  @return Returns the widthClass.
	 */
	public int getWidthClass() {
	}

	/**
	 *  @param widthClassValue The widthClass to set.
	 */
	public void setWidthClass(int widthClassValue) {
	}

	/**
	 *  @return Returns the winAscent.
	 */
	public int getWinAscent() {
	}

	/**
	 *  @param winAscentValue The winAscent to set.
	 */
	public void setWinAscent(int winAscentValue) {
	}

	/**
	 *  @return Returns the winDescent.
	 */
	public int getWinDescent() {
	}

	/**
	 *  @param winDescentValue The winDescent to set.
	 */
	public void setWinDescent(int winDescentValue) {
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
}
