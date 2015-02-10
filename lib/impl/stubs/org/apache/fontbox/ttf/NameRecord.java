/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A name record in the name table.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.1 $
 */
public class NameRecord {

	/**
	 *  A constant for the platform.
	 */
	public static final int PLATFORM_APPLE_UNICODE = 0;

	/**
	 *  A constant for the platform.
	 */
	public static final int PLATFORM_MACINTOSH = 1;

	/**
	 *  A constant for the platform.
	 */
	public static final int PLATFORM_ISO = 2;

	/**
	 *  A constant for the platform.
	 */
	public static final int PLATFORM_WINDOWS = 3;

	/**
	 *  Platform specific encoding.
	 */
	public static final int PLATFORM_ENCODING_WINDOWS_UNDEFINED = 0;

	/**
	 *  Platform specific encoding.
	 */
	public static final int PLATFORM_ENCODING_WINDOWS_UNICODE = 1;

	/**
	 *  A name id.
	 */
	public static final int NAME_COPYRIGHT = 0;

	/**
	 *  A name id.
	 */
	public static final int NAME_FONT_FAMILY_NAME = 1;

	/**
	 *  A name id.
	 */
	public static final int NAME_FONT_SUB_FAMILY_NAME = 2;

	/**
	 *  A name id.
	 */
	public static final int NAME_UNIQUE_FONT_ID = 3;

	/**
	 *  A name id.
	 */
	public static final int NAME_FULL_FONT_NAME = 4;

	/**
	 *  A name id.
	 */
	public static final int NAME_VERSION = 5;

	/**
	 *  A name id.
	 */
	public static final int NAME_POSTSCRIPT_NAME = 6;

	/**
	 *  A name id.
	 */
	public static final int NAME_TRADEMARK = 7;

	public NameRecord() {
	}

	/**
	 *  @return Returns the stringLength.
	 */
	public int getStringLength() {
	}

	/**
	 *  @param stringLengthValue The stringLength to set.
	 */
	public void setStringLength(int stringLengthValue) {
	}

	/**
	 *  @return Returns the stringOffset.
	 */
	public int getStringOffset() {
	}

	/**
	 *  @param stringOffsetValue The stringOffset to set.
	 */
	public void setStringOffset(int stringOffsetValue) {
	}

	/**
	 *  @return Returns the languageId.
	 */
	public int getLanguageId() {
	}

	/**
	 *  @param languageIdValue The languageId to set.
	 */
	public void setLanguageId(int languageIdValue) {
	}

	/**
	 *  @return Returns the nameId.
	 */
	public int getNameId() {
	}

	/**
	 *  @param nameIdValue The nameId to set.
	 */
	public void setNameId(int nameIdValue) {
	}

	/**
	 *  @return Returns the platformEncodingId.
	 */
	public int getPlatformEncodingId() {
	}

	/**
	 *  @param platformEncodingIdValue The platformEncodingId to set.
	 */
	public void setPlatformEncodingId(int platformEncodingIdValue) {
	}

	/**
	 *  @return Returns the platformId.
	 */
	public int getPlatformId() {
	}

	/**
	 *  @param platformIdValue The platformId to set.
	 */
	public void setPlatformId(int platformIdValue) {
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
	 *  Return a string representation of this class.
	 *  
	 *  @return A string for this class.
	 */
	public String toString() {
	}

	/**
	 *  @return Returns the string.
	 */
	public String getString() {
	}

	/**
	 *  @param stringValue The string to set.
	 */
	public void setString(String stringValue) {
	}
}
