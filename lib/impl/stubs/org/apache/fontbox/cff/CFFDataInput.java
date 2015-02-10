/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This is specialized DataInput. It's used to parse a CFFFont.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class CFFDataInput extends DataInput {

	/**
	 *  Constructor.
	 *  @param buffer the buffer to be read 
	 */
	public CFFDataInput(byte[] buffer) {
	}

	/**
	 *  Read one single Card8 value from the buffer. 
	 *  @return the card8 value
	 *  @throws IOException if an error occurs during reading
	 */
	public int readCard8() {
	}

	/**
	 *  Read one single Card16 value from the buffer.
	 *  @return the card16 value
	 *  @throws IOException if an error occurs during reading
	 */
	public int readCard16() {
	}

	/**
	 *  Read the offset from the buffer.
	 *  @param offSize the given offsize
	 *  @return the offset
	 *  @throws IOException if an error occurs during reading
	 */
	public int readOffset(int offSize) {
	}

	/**
	 *  Read the offsize from the buffer.
	 *  @return the offsize
	 *  @throws IOException if an error occurs during reading
	 */
	public int readOffSize() {
	}

	/**
	 *  Read a SID from the buffer.
	 *  @return the SID
	 *  @throws IOException if an error occurs during reading
	 */
	public int readSID() {
	}
}
