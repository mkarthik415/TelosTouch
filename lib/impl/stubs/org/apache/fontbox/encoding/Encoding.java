/**
 * 
 * This package contains the implementations for all of the encodings that are used in PDF documents.
 */
package org.apache.fontbox.encoding;


/**
 *  This is an interface to a text encoder.
 * 
 *  @author Ben Litchfield
 *  
 */
public abstract class Encoding {

	/**
	 *  The number of standard mac glyph names.
	 */
	public static final int NUMBER_OF_MAC_GLYPHS = 258;

	/**
	 *  The 258 standard mac glyph names a used in 'post' format 1 and 2.
	 */
	public static final String[] MAC_GLYPH_NAMES;

	/**
	 *  The indices of the standard mac glyph names.
	 */
	public static java.util.Map MAC_GLYPH_NAMES_INDICES;

	/**
	 *  This is a mapping from a character code to a character name.
	 */
	protected java.util.Map codeToName;

	/**
	 *  This is a mapping from a character name to a character code.
	 */
	protected java.util.Map nameToCode;

	public Encoding() {
	}

	/**
	 *  This will add a character encoding.
	 * 
	 *  @param code The character code that matches the character.
	 *  @param name The name of the character.
	 */
	protected void addCharacterEncoding(int code, String name) {
	}

	/**
	 *  This will get the character code for the name.
	 * 
	 *  @param name The name of the character.
	 * 
	 *  @return The code for the character.
	 * 
	 *  @throws IOException If there is no character code for the name.
	 */
	public int getCode(String name) {
	}

	/**
	 *  This will take a character code and get the name from the code.
	 * 
	 *  @param code The character code.
	 * 
	 *  @return The name of the character.
	 */
	public String getName(int code) {
	}

	/**
	 *  This will take a character code and get the name from the code.
	 * 
	 *  @param c The character.
	 * 
	 *  @return The name of the character.
	 * 
	 *  @throws IOException If there is no name for the character.
	 */
	public String getNameFromCharacter(char c) {
	}

	/**
	 *  This will get the character from the code.
	 * 
	 *  @param code The character code.
	 * 
	 *  @return The printable character for the code.
	 * 
	 *  @throws IOException If there is not name for the character.
	 */
	public String getCharacter(int code) {
	}

	/**
	 *  This will get the character from the name.
	 * 
	 *  @param name The name of the character.
	 * 
	 *  @return The printable character for the code.
	 */
	public static String getCharacter(String name) {
	}
}
