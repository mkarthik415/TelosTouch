/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A true type font file parser.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.2 $
 */
public class TTFParser extends AbstractTTFParser {

	public TTFParser() {
	}

	public TTFParser(boolean isEmbedded) {
	}

	/**
	 *  {@inheritDoc}
	 */
	protected void parseTables(TrueTypeFont font, TTFDataStream raf) {
	}
}
