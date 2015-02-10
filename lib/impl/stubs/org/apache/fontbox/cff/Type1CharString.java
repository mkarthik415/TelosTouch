/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class represents and renders a Type 1 CharString.
 * 
 *  @author Villu Ruusmann
 *  @author John Hewson
 */
public class Type1CharString {

	protected java.util.List type1Sequence;

	/**
	 *  Constructs a new Type1CharString object.
	 *  @param font Parent CFF font
	 *  @param sequence Type 1 char string sequence
	 */
	public Type1CharString(CFFFont font, java.util.List sequence) {
	}

	/**
	 *  Constructor for use in subclasses.
	 *  @param font Parent CFF font
	 */
	protected Type1CharString(CFFFont font) {
	}

	/**
	 *  Returns the bounds of the renderer path.
	 *  @return the bounds as Rectangle2D
	 */
	public ca.weblite.pisces.d.Rectangle2D getBounds() {
	}

	/**
	 *  Returns the advance width of the glyph.
	 *  @return the width
	 */
	public int getWidth() {
	}

	/**
	 *  Returns the path of the character.
	 *  @return the path
	 */
	public ca.weblite.pisces.Path getPath() {
	}

	/**
	 *  Returns the Type 1 char string sequence.
	 *  @return the Type 1 sequence
	 */
	public java.util.List getType1Sequence() {
	}
}
