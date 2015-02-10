/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  An interface into a data stream.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.2 $
 */
public class MemoryTTFDataStream extends TTFDataStream {

	/**
	 *  Constructor from a stream. 
	 *  @param is The stream of read from.
	 *  @throws IOException If an error occurs while reading from the stream.
	 */
	public MemoryTTFDataStream(java.io.InputStream is) {
	}

	/**
	 *  Read an unsigned byte.
	 *  @return An unsigned byte.
	 *  @throws IOException If there is an error reading the data.
	 */
	public long readLong() {
	}

	/**
	 *  Read a signed integer.
	 *  
	 *  @return A signed integer.
	 *  @throws IOException If there is a problem reading the file.
	 */
	public int readSignedInt() {
	}

	/**
	 *  Read an unsigned byte.
	 *  @return An unsigned byte.
	 *  @throws IOException If there is an error reading the data.
	 */
	public int read() {
	}

	/**
	 *  Read an unsigned short.
	 *  
	 *  @return An unsigned short.
	 *  @throws IOException If there is an error reading the data.
	 */
	public int readUnsignedShort() {
	}

	/**
	 *  Read an signed short.
	 *  
	 *  @return An signed short.
	 *  @throws IOException If there is an error reading the data.
	 */
	public short readSignedShort() {
	}

	/**
	 *  Close the underlying resources.
	 *  
	 *  @throws IOException If there is an error closing the resources.
	 */
	public void close() {
	}

	/**
	 *  Seek into the datasource.
	 *  
	 *  @param pos The position to seek to.
	 *  @throws IOException If there is an error seeking to that position.
	 */
	public void seek(long pos) {
	}

	/**
	 *  @see java.io.InputStream#read( byte[], int, int )
	 *  
	 *  @param b The buffer to write to.
	 *  @param off The offset into the buffer.
	 *  @param len The length into the buffer.
	 *  
	 *  @return The number of bytes read, or -1 at the end of the stream
	 *  
	 *  @throws IOException If there is an error reading from the stream.
	 */
	public int read(byte[] b, int off, int len) {
	}

	/**
	 *  Get the current position in the stream.
	 *  @return The current position in the stream.
	 *  @throws IOException If an error occurs while reading the stream.
	 */
	public long getCurrentPosition() {
	}

	/**
	 *  {@inheritDoc}
	 */
	public java.io.InputStream getOriginalData() {
	}
}
