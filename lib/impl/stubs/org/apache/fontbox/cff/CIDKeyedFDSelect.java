/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


public abstract class CIDKeyedFDSelect {

	protected CFFFontROS owner;

	/**
	 *  Constructor.
	 *  @param _owner the owner of the FDSelect data.
	 */
	public CIDKeyedFDSelect(CFFFontROS _owner) {
	}

	/**
	 *  Returns the Font DICT index for the given glyph identifier
	 *   
	 *  @param glyph
	 *  @return -1 if the glyph isn't define, otherwise the FD index value
	 */
	public abstract int getFd(int glyph) {
	}
}
