/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  
 *  @author Villu Ruusmann
 *  @version $Revision: 1.0 $
 */
public class DataOutput {

	/**
	 *  Constructor.
	 */
	public DataOutput() {
	}

	/**
	 *  Constructor with a given encoding.
	 *  @param encoding the encoding to be used for writing
	 */
	public DataOutput(String encoding) {
	}

	/**
	 *  Returns the written data buffer as byte array.
	 *  @return the data buffer as byte array
	 */
	public byte[] getBytes() {
	}

	/**
	 *  Write an int value to the buffer.
	 *  @param value the given value
	 */
	public void write(int value) {
	}

	/**
	 *  Write a byte array to the buffer.
	 *  @param buffer the given byte array
	 */
	public void write(byte[] buffer) {
	}

	/**
	 *  Write a part of a byte array to the buffer.
	 *  @param buffer the given byte buffer
	 *  @param offset the offset where to start 
	 *  @param length the amount of bytes to be written from the array
	 */
	public void write(byte[] buffer, int offset, int length) {
	}

	/**
	 *  Write the given string to the buffer using the given encoding.
	 *  @param string the given string
	 *  @throws IOException If an error occurs during writing the data to the buffer
	 */
	public void print(String string) {
	}

	/**
	 *  Write the given string to the buffer using the given encoding.
	 *  A newline is added after the given string
	 *  @param string the given string
	 *  @throws IOException If an error occurs during writing the data to the buffer
	 */
	public void println(String string) {
	}

	/**
	 *  Add a newline to the given string.
	 */
	public void println() {
	}
}
