/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  Represents a Type 2 CharString by converting it into an equivalent Type 1 CharString.
 *  
 *  @author Villu Ruusmann
 *  @author John Hewson
 */
public class Type2CharString extends Type1CharString {

	/**
	 *  Constructor.
	 *  @param font Parent CFF font
	 *  @param sequence Type 2 char string sequence
	 *  @param defaultWidthX default width
	 *  @param nomWidthX nominal width width
	 */
	public Type2CharString(CFFFont font, java.util.List sequence, int defaultWidthX, int nomWidthX) {
	}

	/**
	 *  Returns the advance width of the glyph.
	 *  @return the width
	 */
	public int getWidth() {
	}

	/**
	 *  Returns the Type 2 char string sequence.
	 *  @return the Type 2 sequence
	 */
	public java.util.List getType2Sequence() {
	}
}
