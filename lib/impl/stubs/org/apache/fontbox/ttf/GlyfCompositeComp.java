/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  This class is based on code from Apache Batik a subproject of Apache XMLGraphics. see
 *  http://xmlgraphics.apache.org/batik/ for further details.
 */
public class GlyfCompositeComp {

	/**
	 *  If set, the arguments are words; otherwise, they are bytes.
	 */
	protected static final short ARG_1_AND_2_ARE_WORDS = 1;

	/**
	 *  If set, the arguments are xy values; otherwise they are points.
	 */
	protected static final short ARGS_ARE_XY_VALUES = 2;

	/**
	 *  If set, xy values are rounded to those of the closest grid lines.
	 */
	protected static final short ROUND_XY_TO_GRID = 4;

	/**
	 *  If set, there is a simple scale; otherwise, scale = 1.0.
	 */
	protected static final short WE_HAVE_A_SCALE = 8;

	/**
	 *  Indicates at least one more glyph after this one.
	 */
	protected static final short MORE_COMPONENTS = 32;

	/**
	 *  The x direction will use a different scale from the y direction.
	 */
	protected static final short WE_HAVE_AN_X_AND_Y_SCALE = 64;

	/**
	 *  There is a 2 by2 transformation that will be used to scale the component.
	 */
	protected static final short WE_HAVE_A_TWO_BY_TWO = 128;

	/**
	 *  Following the last component are instructions for the composite character.
	 */
	protected static final short WE_HAVE_INSTRUCTIONS = 256;

	/**
	 *  If set, this forces the aw and lsb (and rsb) for the composite to be equal to those from this original glyph.
	 */
	protected static final short USE_MY_METRICS = 512;

	/**
	 *  Constructor.
	 *  
	 *  @param bais the stream to be read
	 *  @throws IOException is thrown if something went wrong
	 */
	protected GlyfCompositeComp(TTFDataStream bais) {
	}

	/**
	 *  Sets the first index.
	 *  
	 *  @param idx the first index
	 */
	public void setFirstIndex(int idx) {
	}

	/**
	 *  Returns the first index.
	 *  
	 *  @return the first index.
	 */
	public int getFirstIndex() {
	}

	/**
	 *  Sets the index for the first contour.
	 *  
	 *  @param idx the index of the first contour
	 */
	public void setFirstContour(int idx) {
	}

	/**
	 *  Returns the index of the first contour.
	 *  
	 *  @return the index of the first contour.
	 */
	public int getFirstContour() {
	}

	/**
	 *  Returns argument 1.
	 *  
	 *  @return argument 1.
	 */
	public short getArgument1() {
	}

	/**
	 *  Returns argument 2.
	 *  
	 *  @return argument 2.
	 */
	public short getArgument2() {
	}

	/**
	 *  Returns the flags of the glyph.
	 *  
	 *  @return the flags.
	 */
	public short getFlags() {
	}

	/**
	 *  Returns the index of the first contour.
	 *  
	 *  @return index of the first contour.
	 */
	public int getGlyphIndex() {
	}

	/**
	 *  Returns the scale-01 value.
	 *  
	 *  @return the scale-01 value.
	 */
	public double getScale01() {
	}

	/**
	 *  Returns the scale-10 value.
	 *  
	 *  @return the scale-10 value.
	 */
	public double getScale10() {
	}

	/**
	 *  Returns the x-scaling value.
	 *  
	 *  @return the x-scaling value.
	 */
	public double getXScale() {
	}

	/**
	 *  Returns the y-scaling value.
	 *  
	 *  @return the y-scaling value.
	 */
	public double getYScale() {
	}

	/**
	 *  Returns the x-translation value.
	 *  
	 *  @return the x-translation value.
	 */
	public int getXTranslate() {
	}

	/**
	 *  Returns the y-translation value.
	 *  
	 *  @return the y-translation value.
	 */
	public int getYTranslate() {
	}

	/**
	 *  Transforms an x-coordinate of a point for this component.
	 *  
	 *  @param x The x-coordinate of the point to transform
	 *  @param y The y-coordinate of the point to transform
	 *  @return The transformed x-coordinate
	 */
	public int scaleX(int x, int y) {
	}

	/**
	 *  Transforms a y-coordinate of a point for this component.
	 *  
	 *  @param x The x-coordinate of the point to transform
	 *  @param y The y-coordinate of the point to transform
	 *  @return The transformed y-coordinate
	 */
	public int scaleY(int x, int y) {
	}
}
