/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  An interface into a data stream.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  
 */
public abstract class TTFDataStream {

	public TTFDataStream() {
	}

	/**
	 *  Read a 16.16 fixed value, where the first 16 bits are the decimal and the last 16 bits are the fraction.
	 *  
	 *  @return A 32 bit value.
	 *  @throws IOException If there is an error reading the data.
	 */
	public float read32Fixed() {
	}

	/**
	 *  Read a fixed length ascii string.
	 *  
	 *  @param length The length of the string to read.
	 *  @return A string of the desired length.
	 *  @throws IOException If there is an error reading the data.
	 */
	public String readString(int length) {
	}

	/**
	 *  Read a fixed length ascii string.
	 *  
	 *  @param length The length of the string to read in bytes.
	 *  @param charset The expected character set of the string.
	 *  @return A string of the desired length.
	 *  @throws IOException If there is an error reading the data.
	 */
	public String readString(int length, String charset) {
	}

	/**
	 *  Read an unsigned byte.
	 *  
	 *  @return An unsigned byte.
	 *  @throws IOException If there is an error reading the data.
	 */
	public abstract int read() {
	}

	/**
	 *  Read an unsigned byte.
	 *  
	 *  @return An unsigned byte.
	 *  @throws IOException If there is an error reading the data.
	 */
	public abstract long readLong() {
	}

	/**
	 *  Read a signed byte.
	 *  
	 *  @return A signed byte.
	 *  @throws IOException If there is an error reading the data.
	 */
	public int readSignedByte() {
	}

	/**
	 *  Read a unsigned byte. Similar to {@link #read()}, but throws an exception if EOF is unexpectedly reached.
	 *  
	 *  @return A unsigned byte.
	 *  @throws IOException If there is an error reading the data.
	 */
	public int readUnsignedByte() {
	}

	/**
	 *  Read an unsigned integer.
	 *  
	 *  @return An unsiged integer.
	 *  @throws IOException If there is an error reading the data.
	 */
	public long readUnsignedInt() {
	}

	/**
	 *  Read an unsigned short.
	 *  
	 *  @return An unsigned short.
	 *  @throws IOException If there is an error reading the data.
	 */
	public abstract int readUnsignedShort() {
	}

	/**
	 *  Read an unsigned byte array.
	 *  
	 *  @param length the length of the array to be read
	 *  @return An unsigned byte array.
	 *  @throws IOException If there is an error reading the data.
	 */
	public int[] readUnsignedByteArray(int length) {
	}

	/**
	 *  Read an unsigned short array.
	 *  
	 *  @param length The length of the array to read.
	 *  @return An unsigned short array.
	 *  @throws IOException If there is an error reading the data.
	 */
	public int[] readUnsignedShortArray(int length) {
	}

	/**
	 *  Read an signed short.
	 *  
	 *  @return An signed short.
	 *  @throws IOException If there is an error reading the data.
	 */
	public abstract short readSignedShort() {
	}

	/**
	 *  Read an eight byte international date.
	 *  
	 *  @return An signed short.
	 *  @throws IOException If there is an error reading the data.
	 */
	public long readInternationalDate() {
	}

	/**
	 *  Close the underlying resources.
	 *  
	 *  @throws IOException If there is an error closing the resources.
	 */
	public abstract void close() {
	}

	/**
	 *  Seek into the datasource.
	 *  
	 *  @param pos The position to seek to.
	 *  @throws IOException If there is an error seeking to that position.
	 */
	public abstract void seek(long pos) {
	}

	/**
	 *  Read a specific number of bytes from the stream.
	 *  
	 *  @param numberOfBytes The number of bytes to read.
	 *  @return The byte buffer.
	 *  @throws IOException If there is an error while reading.
	 */
	public byte[] read(int numberOfBytes) {
	}

	/**
	 *  @see java.io.InputStream#read(byte[], int, int )
	 *  
	 *  @param b The buffer to write to.
	 *  @param off The offset into the buffer.
	 *  @param len The length into the buffer.
	 *  
	 *  @return The number of bytes read, or -1 at the end of the stream
	 *  
	 *  @throws IOException If there is an error reading from the stream.
	 */
	public abstract int read(byte[] b, int off, int len) {
	}

	/**
	 *  Get the current position in the stream.
	 *  
	 *  @return The current position in the stream.
	 *  @throws IOException If an error occurs while reading the stream.
	 */
	public abstract long getCurrentPosition() {
	}

	/**
	 *  This will get the original data file that was used for this stream.
	 *  
	 *  @return The data that was read from.
	 *  @throws IOException If there is an issue reading the data.
	 */
	public abstract java.io.InputStream getOriginalData() {
	}
}
