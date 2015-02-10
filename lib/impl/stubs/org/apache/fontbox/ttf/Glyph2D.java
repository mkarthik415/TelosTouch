/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  This class provides a glyph to GeneralPath conversion.
 *  
 *  This class is based on code from Apache Batik a subproject of Apache XMLGraphics.
 *  see http://xmlgraphics.apache.org/batik/ for further details.
 */
public class Glyph2D {

	/**
	 *  Constructor.
	 *  
	 *  @param gd the glyph description
	 *  @param lsb leftSideBearing
	 *  @param advance advanceWidth
	 */
	public Glyph2D(GlyphDescription gd, short lsb, int advance) {
	}

	/**
	 *  Returns the advanceWidth value.
	 *  
	 *  @return the advanceWidth
	 */
	public int getAdvanceWidth() {
	}

	/**
	 *  Returns the leftSideBearing value.
	 *  
	 *  @return the leftSideBearing
	 */
	public short getLeftSideBearing() {
	}

	/**
	 *  Returns the path describing the glyph.
	 *  
	 *  @return the GeneralPath of the glyph
	 */
	public ca.weblite.pisces.Path getPath() {
	}
}
