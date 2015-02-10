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
public class TTFTable {

	public TTFTable() {
	}

	/**
	 *  @return Returns the checkSum.
	 */
	public long getCheckSum() {
	}

	/**
	 *  @param checkSumValue The checkSum to set.
	 */
	public void setCheckSum(long checkSumValue) {
	}

	/**
	 *  @return Returns the length.
	 */
	public long getLength() {
	}

	/**
	 *  @param lengthValue The length to set.
	 */
	public void setLength(long lengthValue) {
	}

	/**
	 *  @return Returns the offset.
	 */
	public long getOffset() {
	}

	/**
	 *  @param offsetValue The offset to set.
	 */
	public void setOffset(long offsetValue) {
	}

	/**
	 *  @return Returns the tag.
	 */
	public String getTag() {
	}

	/**
	 *  @param tagValue The tag to set.
	 */
	public void setTag(String tagValue) {
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
