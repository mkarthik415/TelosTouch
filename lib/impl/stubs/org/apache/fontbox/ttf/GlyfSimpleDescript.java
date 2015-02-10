/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  This class is based on code from Apache Batik a subproject of Apache XMLGraphics. see
 *  http://xmlgraphics.apache.org/batik/ for further details.
 */
public class GlyfSimpleDescript extends GlyfDescript {

	/**
	 *  Constructor.
	 *  
	 *  @param numberOfContours number of contours
	 *  @param bais the stream to be read
	 *  @throws IOException is thrown if something went wrong
	 */
	public GlyfSimpleDescript(short numberOfContours, TTFDataStream bais) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public int getEndPtOfContours(int i) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public byte getFlags(int i) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public short getXCoordinate(int i) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public short getYCoordinate(int i) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public boolean isComposite() {
	}

	/**
	 *  {@inheritDoc}
	 */
	public int getPointCount() {
	}
}
