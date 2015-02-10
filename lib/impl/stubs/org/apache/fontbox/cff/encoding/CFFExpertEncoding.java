/**
 * 
 * This package holds classes used to handle the encoding of CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff.encoding;


/**
 *  This is specialized CFFEncoding. It's used if the EncodingId of a font is set to 1.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class CFFExpertEncoding extends CFFEncoding {

	/**
	 *  Returns an instance of the CFFExportEncoding class.
	 *  @return an instance of CFFExportEncoding
	 */
	public static CFFExpertEncoding getInstance() {
	}
}
