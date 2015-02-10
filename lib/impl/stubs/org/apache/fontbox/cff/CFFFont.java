/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class represents a CFF/Type2 Font.
 *  
 *  @author Villu Ruusmann
 *  @author John Hewson
 */
public class CFFFont {

	public CFFFont() {
	}

	/**
	 *  The name of the font.
	 *  
	 *  @return the name of the font
	 */
	public String getName() {
	}

	/**
	 *  Sets the name of the font.
	 *  
	 *  @param name the name of the font
	 */
	public void setName(String name) {
	}

	/**
	 *  Returns the value for the given name from the dictionary.
	 *  
	 *  @param name the name of the value
	 *  @return the value of the name if available
	 */
	public Object getProperty(String name) {
	}

	/**
	 *  Adds the given key/value pair to the top dictionary.
	 *  
	 *  @param name the given key
	 *  @param value the given value
	 */
	public void addValueToTopDict(String name, Object value) {
	}

	/**
	 *  Returns the top dictionary.
	 *  
	 *  @return the dictionary
	 */
	public java.util.Map getTopDict() {
	}

	/**
	 *  Adds the given key/value pair to the private dictionary.
	 *  
	 *  @param name the given key
	 *  @param value the given value
	 */
	public void addValueToPrivateDict(String name, Object value) {
	}

	/**
	 *  Returns the private dictionary.
	 *  
	 *  @return the dictionary
	 */
	public java.util.Map getPrivateDict() {
	}

	/**
	 *  Get the mapping (code/SID/charname/bytes) for this font.
	 *  
	 *  @return mappings for codes < 256 and for codes > = 256
	 */
	public java.util.Collection getMappings() {
	}

	/**
	 *  Return the Width value of the given Glyph identifier.
	 *  
	 *  @param sid SID
	 *  @return -1 if the SID is missing from the Font.
	 *  @throws IOException if something went wrong
	 *  
	 */
	public int getWidth(int sid) {
	}

	/**
	 *  Returns the witdth of the .notdef character.
	 *  
	 *  @param defaultWidth default width
	 *  @param nominalWidth nominal width
	 *  @return the calculated width for the .notdef character
	 *  @throws IOException if something went wrong
	 */
	protected int getNotDefWidth(int defaultWidth, int nominalWidth) {
	}

	/**
	 *  Returns the CFFEncoding of the font.
	 *  
	 *  @return the encoding
	 */
	public encoding.CFFEncoding getEncoding() {
	}

	/**
	 *  Sets the CFFEncoding of the font.
	 *  
	 *  @param encoding the given CFFEncoding
	 */
	public void setEncoding(encoding.CFFEncoding encoding) {
	}

	/**
	 *  Returns the CFFCharset of the font.
	 *  
	 *  @return the charset
	 */
	public charset.CFFCharset getCharset() {
	}

	/**
	 *  Sets the CFFCharset of the font.
	 *  
	 *  @param charset the given CFFCharset
	 */
	public void setCharset(charset.CFFCharset charset) {
	}

	/**
	 *  Returns the character strings dictionary.
	 *  
	 *  @return the dictionary
	 */
	public java.util.Map getCharStringsDict() {
	}

	/**
	 *  Returns the Type 1 CharString for the character with the given name.
	 * 
	 *  @return Type 1 CharString
	 *  @throws IOException if something went wrong
	 */
	public Type1CharString getType1CharString(String name) {
	}

	/**
	 *  Returns the defaultWidthX for the given SID.
	 * 
	 *  @param sid SID
	 *  @return defaultWidthX
	 */
	protected int getDefaultWidthX(int sid) {
	}

	/**
	 *  Returns the nominalWidthX for the given SID.
	 * 
	 *  @param sid SID
	 *  @return defaultWidthX
	 */
	protected int getNominalWidthX(int sid) {
	}

	/**
	 *  {@inheritDoc}
	 */
	public String toString() {
	}

	/**
	 *  Sets the global subroutine index data.
	 *  
	 *  @param globalSubrIndexValue the IndexData object containing the global subroutines
	 */
	public void setGlobalSubrIndex(IndexData globalSubrIndexValue) {
	}

	/**
	 *  Returns the global subroutine index data.
	 *  
	 *  @return the dictionary
	 */
	public IndexData getGlobalSubrIndex() {
	}

	/**
	 *  Returns the local subroutine index data.
	 *  
	 *  @return the dictionary
	 */
	public IndexData getLocalSubrIndex() {
	}

	/**
	 *  Sets the local subroutine index data.
	 *  
	 *  @param localSubrIndexValue the IndexData object containing the local subroutines
	 */
	public void setLocalSubrIndex(IndexData localSubrIndexValue) {
	}

	/**
	 *  This class is used for the font mapping.
	 */
	public class Mapping {


		public CFFFont.Mapping() {
		}

		/**
		 *  Returns the Type 1 CharString for the character.
		 * 
		 *  @return the Type 1 CharString
		 *  @throws IOException if an error occurs during reading
		 */
		public Type1CharString getType1CharString() {
		}

		/**
		 *  Gets the value for the code.
		 *  
		 *  @return the code
		 */
		public int getCode() {
		}

		/**
		 *  Gets the value for the SID.
		 *  
		 *  @return the SID
		 */
		public int getSID() {
		}

		/**
		 *  Gets the value for the name.
		 *  
		 *  @return the name
		 */
		public String getName() {
		}

		/**
		 *  Gets the value for the bytes.
		 *  
		 *  @return the bytes
		 */
		public byte[] getBytes() {
		}
	}
}
