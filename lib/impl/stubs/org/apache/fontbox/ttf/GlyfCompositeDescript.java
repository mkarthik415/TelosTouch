/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  Glyph description for composite glyphs. Composite glyphs are made up of one or more simple glyphs, usually with some
 *  sort of transformation applied to each.
 *  
 *  This class is based on code from Apache Batik a subproject of Apache XMLGraphics. see
 *  http://xmlgraphics.apache.org/batik/ for further details.
 */
public class GlyfCompositeDescript extends GlyfDescript {

	/**
	 *  Constructor.
	 *  
	 *  @param bais the stream to be read
	 *  @param glyphTable the Glyphtable containing all glyphs
	 *  @throws IOException is thrown if something went wrong
	 */
	public GlyfCompositeDescript(TTFDataStream bais, GlyphTable glyphTable) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public void resolve() {
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

	/**
	 *  {@inheritDoc}
	 */
	public int getContourCount() {
	}

	/**
	 *  {@inheritDoc}
	 */
	public int getComponentCount() {
	}
}
