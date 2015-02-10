/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  Specifies access to glyph description classes, simple and composite.
 *  
 *  This class is based on code from Apache Batik a subproject of Apache XMLGraphics.
 *  see http://xmlgraphics.apache.org/batik/ for further details.
 *  
 */
public interface GlyphDescription {

	/**
	 * 
	 *  Returns the index of the ending point of the given contour.
	 *  
	 *  @param i the number of the contour
	 *  @return the index of the ending point of the given contour
	 */
	public int getEndPtOfContours(int i);

	/**
	 *  Returns the flags of the given point.
	 *  @param i the given point
	 *  @return the flags value for the given point
	 */
	public byte getFlags(int i);

	/**
	 *  Returns the x coordinate of the given point.
	 *  @param i the given point
	 *  @return the x coordinate value for the given point
	 */
	public short getXCoordinate(int i);

	/**
	 *  Returns the y coordinate of the given point.
	 *  @param i the given point
	 *  @return the y coordinate value for the given point
	 */
	public short getYCoordinate(int i);

	/**
	 *  Returns whether this point is a composite or not.
	 *  @return true if this point is a composite
	 */
	public boolean isComposite();

	/**
	 *  Returns the number of points.
	 *  @return the number of points
	 */
	public int getPointCount();

	/**
	 *  Returns the number of contours.
	 *  @return the number of contours
	 */
	public int getContourCount();

	/**
	 *  Resolve all parts of an composite glyph.
	 */
	public void resolve();
}
