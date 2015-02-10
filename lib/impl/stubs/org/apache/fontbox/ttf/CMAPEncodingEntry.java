/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  An encoding entry for a cmap.
 *  
 *  @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 *  
 */
public class CMAPEncodingEntry {

	public CMAPEncodingEntry() {
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
	 *  This will read the required data from the stream.
	 *  
	 *  @param ttf The font that is being read.
	 *  @param data The stream to read the data from.
	 *  @throws IOException If there is an error reading the data.
	 */
	public void initSubtable(TrueTypeFont ttf, TTFDataStream data) {
	}

	/**
	 *  Reads a format 8 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype8(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Reads a format 10 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype10(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Reads a format 12 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype12(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Reads a format 13 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype13(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Reads a format 14 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype14(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Reads a format 6 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype6(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Reads a format 4 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype4(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Read a format 2 subtable.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @param numGlyphs number of glyphs to be read
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype2(TrueTypeFont ttf, TTFDataStream data, int numGlyphs) {
	}

	/**
	 *  Initialize the CMapEntry when it is a subtype 0.
	 *  
	 *  @param ttf the TrueTypeFont instance holding the parsed data.
	 *  @param data the data stream of the to be parsed ttf font
	 *  @throws IOException If there is an error parsing the true type font.
	 */
	protected void processSubtype0(TrueTypeFont ttf, TTFDataStream data) {
	}

	/**
	 *  @return Returns the glyphIdToCharacterCode.
	 */
	public int[] getGlyphIdToCharacterCode() {
	}

	/**
	 *  @param glyphIdToCharacterCodeValue The glyphIdToCharacterCode to set.
	 */
	public void setGlyphIdToCharacterCode(int[] glyphIdToCharacterCodeValue) {
	}

	/**
	 *  @return Returns the platformEncodingId.
	 */
	public int getPlatformEncodingId() {
	}

	/**
	 *  @param platformEncodingIdValue The platformEncodingId to set.
	 */
	public void setPlatformEncodingId(int platformEncodingIdValue) {
	}

	/**
	 *  @return Returns the platformId.
	 */
	public int getPlatformId() {
	}

	/**
	 *  @param platformIdValue The platformId to set.
	 */
	public void setPlatformId(int platformIdValue) {
	}

	/**
	 *  Returns the GlyphId linked with the given character code.
	 *  
	 *  @param characterCode the given character code to be mapped
	 *  @return glyphId the corresponding glyph id for the given character code
	 */
	public int getGlyphId(int characterCode) {
	}
}
