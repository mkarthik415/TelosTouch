/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  Class holding the IndexData of a CFF font. 
 */
public class IndexData {

	/**
	 *  Constructor.
	 *  
	 *  @param count number of index values
	 */
	public IndexData(int count) {
	}

	public byte[] getBytes(int index) {
	}

	@java.lang.Override
	public String toString() {
	}

	/**
	 *  Returns the count value.
	 *  @return the count value
	 */
	public int getCount() {
	}

	/**
	 *  Sets the offset value to the given value.
	 *  @param index the index of the offset value
	 *  @param value the given offset value
	 */
	public void setOffset(int index, int value) {
	}

	/**
	 *  Returns the offset at the given index.
	 *  @param index the index
	 *  @return the offset value at the given index
	 */
	public int getOffset(int index) {
	}

	/**
	 *  Initializes the data array with the given size.
	 *  @param dataSize the size of the data array
	 */
	public void initData(int dataSize) {
	}

	/**
	 *  Sets the data value to the given value.
	 *  @param index the index of the data value
	 *  @param value the given data value
	 */
	public void setData(int index, int value) {
	}
}
