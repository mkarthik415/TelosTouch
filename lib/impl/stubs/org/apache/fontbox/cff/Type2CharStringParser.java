/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class represents a converter for a mapping into a Type2-sequence.
 *  @author Villu Ruusmann
 *  @version $Revision: 1.0 $
 */
public class Type2CharStringParser {

	public Type2CharStringParser() {
	}

	/**
	 *  The given byte array will be parsed and converted to a Type2 sequence.
	 *  @param bytes the given mapping as byte array
	 *  @param globalSubrIndex index containing all global subroutines
	 *  @param localSubrIndex index containing all local subroutines
	 *  
	 *  @return the Type2 sequence
	 *  @throws IOException if an error occurs during reading
	 */
	public java.util.List parse(byte[] bytes, IndexData globalSubrIndex, IndexData localSubrIndex) {
	}
}
