/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  The CMAP table of a true type font.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  
 */
public class CMAPTable extends TTFTable {

	/**
	 *  A tag used to identify this table.
	 */
	public static final String TAG = "cmap";

	/**
	 *  A constant for the platform.
	 */
	public static final int PLATFORM_MISC = 0;

	/**
	 *  A constant for the platform.
	 */
	public static final int PLATFORM_MACINTOSH = 1;

	/**
	 *  A constant for the platform.
	 */
	public static final int PLATFORM_WINDOWS = 3;

	/**
	 *  An encoding constant.
	 */
	public static final int ENCODING_SYMBOL = 0;

	/**
	 *  An encoding constant.
	 */
	public static final int ENCODING_UNICODE = 1;

	/**
	 *  An encoding constant.
	 */
	public static final int ENCODING_SHIFT_JIS = 2;

	/**
	 *  An encoding constant.
	 */
	public static final int ENCODING_BIG5 = 3;

	/**
	 *  An encoding constant.
	 */
	public static final int ENCODING_PRC = 4;

	/**
	 *  An encoding constant.
	 */
	public static final int ENCODING_WANSUNG = 5;

	/**
	 *  An encoding constant.
	 */
	public static final int ENCODING_JOHAB = 6;

	public CMAPTable() {
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
	 *  @return Returns the cmaps.
	 */
	public CMAPEncodingEntry[] getCmaps() {
	}

	/**
	 *  @param cmapsValue The cmaps to set.
	 */
	public void setCmaps(CMAPEncodingEntry[] cmapsValue) {
	}
}
