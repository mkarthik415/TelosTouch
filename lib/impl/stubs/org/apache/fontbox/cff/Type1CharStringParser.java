/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class represents a converter for a mapping into a Type1-sequence.
 *  @author Villu Ruusmann
 *  @version $Revision: 1.0 $
 */
public class Type1CharStringParser {

	public Type1CharStringParser() {
	}

	/**
	 *  The given byte array will be parsed and converted to a Type1 sequence.
	 *  @param bytes the given mapping as byte array
	 *  @param localSubrIndex index containing all local subroutines
	 *  
	 *  @return the Type1 sequence
	 *  @throws IOException if an error occurs during reading
	 */
	public java.util.List parse(byte[] bytes, IndexData localSubrIndex) {
	}
}
