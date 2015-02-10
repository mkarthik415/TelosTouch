/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A table in a true type font.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  
 */
public class GlyphTable extends TTFTable {

	/**
	 *  Tag to identify this table.
	 */
	public static final String TAG = "glyf";

	public GlyphTable() {
	}

	/**
	 *  This will read the required data from the stream.
	 *  
	 *  @param ttf The font that is being read.
	 *  @param data The stream to read the data from.
	 *  @throws IOException If there is an error reading the data.
	 */
	public void initData(TrueTypeFont ttf, TTFDataStream data) {
	}

	/**
	 *  @return Returns the glyphs.
	 */
	public GlyphData[] getGlyphs() {
	}

	/**
	 *  @param glyphsValue The glyphs to set.
	 */
	public void setGlyphs(GlyphData[] glyphsValue) {
	}
}
