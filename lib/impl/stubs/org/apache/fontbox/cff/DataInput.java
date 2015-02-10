/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class contains some functionality to read a byte buffer.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class DataInput {

	/**
	 *  Constructor.
	 *  @param buffer the buffer to be read
	 */
	public DataInput(byte[] buffer) {
	}

	/**
	 *  Determines if there are any bytes left to read or not. 
	 *  @return true if there are any bytes left to read
	 */
	public boolean hasRemaining() {
	}

	/**
	 *  Returns the current position.
	 *  @return current position
	 */
	public int getPosition() {
	}

	/**
	 *  Sets the current position to the given value.
	 *  @param position the given position
	 */
	public void setPosition(int position) {
	}

	/**
	 * 
	 *  Returns the buffer as an ISO-8859-1 string.
	 *  @return the buffer as string
	 *  @throws IOException if an error occurs during reading
	 */
	public String getString() {
	}

	/**
	 *  Read one single byte from the buffer.
	 *  @return the byte
	 *  @throws IOException if an error occurs during reading
	 */
	public byte readByte() {
	}

	/**
	 *  Read one single unsigned byte from the buffer.
	 *  @return the unsigned byte as int
	 *  @throws IOException if an error occurs during reading
	 */
	public int readUnsignedByte() {
	}

	/**
	 *  Read one single short value from the buffer.
	 *  @return the short value
	 *  @throws IOException if an error occurs during reading
	 */
	public short readShort() {
	}

	/**
	 *  Read one single unsigned short (2 bytes) value from the buffer.
	 *  @return the unsigned short value as int
	 *  @throws IOException if an error occurs during reading
	 */
	public int readUnsignedShort() {
	}

	/**
	 *  Read one single int (4 bytes) from the buffer.
	 *  @return the int value
	 *  @throws IOException if an error occurs during reading
	 */
	public int readInt() {
	}

	/**
	 *  Read a number of single byte values from the buffer.
	 *  @param length the number of bytes to be read
	 *  @return an array with containing the bytes from the buffer 
	 *  @throws IOException if an error occurs during reading
	 */
	public byte[] readBytes(int length) {
	}
}
