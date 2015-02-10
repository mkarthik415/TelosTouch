/**
 * 
 * This package holds classes used to handle the encoding of CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff.encoding;


/**
 *  This is specialized CFFEncoding. It's used if the EncodingId of a font is set to 0.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class CFFStandardEncoding extends CFFEncoding {

	/**
	 *  Returns an instance of the CFFStandardEncoding class.
	 *  @return an instance of CFFStandardEncoding
	 */
	public static CFFStandardEncoding getInstance() {
	}
}
