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
public class IndexToLocationTable extends TTFTable {

	/**
	 *  A tag that identifies this table type.
	 */
	public static final String TAG = "loca";

	public IndexToLocationTable() {
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
	 *  @return Returns the offsets.
	 */
	public long[] getOffsets() {
	}

	/**
	 *  @param offsetsValue The offsets to set.
	 */
	public void setOffsets(long[] offsetsValue) {
	}
}
