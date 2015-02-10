/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A font, which is comprised of a subset of characters of a TrueType font.
 *  Based on code developed by Wolfgang Glas
 *  http://svn.clazzes.org/svn/sketch/trunk/pdf/pdf-entities/src/main/java/org/clazzes/sketch/pdf/entities/impl/TTFSubFont.java
 */
public class TTFSubFont {

	/**
	 *  Constructs a subfont based on the given font using the given suffix.
	 *  
	 *  @param baseFont the base font of the subfont
	 *  @param suffix suffix used for the naming
	 *  
	 */
	public TTFSubFont(TrueTypeFont baseFont, String suffix) {
	}

	/**
	 *  Add the given charcode to the subfpont.
	 *  
	 *  @param charCode the charCode to be added
	 *  
	 */
	public void addCharCode(int charCode) {
	}

	/**
	 *  Write the subfont to the given output stream.
	 *  
	 *  @param os the stream used for writing
	 *  @throws IOException if something went wrong.
	 */
	public void writeToStream(java.io.OutputStream os) {
	}
}
