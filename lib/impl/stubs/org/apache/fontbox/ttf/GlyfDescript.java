/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  This class is based on code from Apache Batik a subproject of Apache XMLGraphics.
 *  see http://xmlgraphics.apache.org/batik/ for further details.
 *  
 */
public abstract class GlyfDescript implements GlyphDescription {

	/**
	 *  if set, the point is on the curve.
	 */
	public static final byte ON_CURVE = 1;

	/**
	 *  if set, the x-coordinate is 1 byte long.
	 */
	public static final byte X_SHORT_VECTOR = 2;

	/**
	 *  if set, the y-coordinate is 1 byte long.
	 */
	public static final byte Y_SHORT_VECTOR = 4;

	/**
	 *  if set, the next byte specifies the number of additional 
	 *  times this set of flags is to be repeated.
	 */
	public static final byte REPEAT = 8;

	/**
	 *  This flag as two meanings, depending on how the
	 *  x-short vector flags is set.
	 *  If the x-short vector is set, this bit describes the sign
	 *  of the value, with 1 equaling positive and 0 positive.
	 *  If the x-short vector is not set and this bit is also not
	 *  set, the current x-coordinate is a signed 16-bit delta vector.
	 */
	public static final byte X_DUAL = 16;

	/**
	 *  This flag as two meanings, depending on how the
	 *  y-short vector flags is set.
	 *  If the y-short vector is set, this bit describes the sign
	 *  of the value, with 1 equaling positive and 0 positive.
	 *  If the y-short vector is not set and this bit is also not
	 *  set, the current y-coordinate is a signed 16-bit delta vector.
	 */
	public static final byte Y_DUAL = 32;

	/**
	 *  Constructor.
	 *  
	 *  @param numberOfContours the number of contours
	 *  @param bais the stream to be read
	 *  @throws IOException is thrown if something went wrong
	 */
	protected GlyfDescript(short numberOfContours, TTFDataStream bais) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public void resolve() {
	}

	/**
	 *  {@inheritDoc}
	 */
	public int getContourCount() {
	}

	/**
	 *  Returns the hinting instructions.
	 *  @return an array containing the hinting instructions.
	 */
	public int[] getInstructions() {
	}

	/**
	 *  Read the hinting instructions.
	 *  @param bais the stream to be read
	 *  @param count the number of instructions to be read 
	 *  @throws IOException is thrown if something went wrong
	 */
	protected void readInstructions(TTFDataStream bais, int count) {
	}
}
