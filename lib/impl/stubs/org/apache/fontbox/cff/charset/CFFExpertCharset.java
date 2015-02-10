/**
 * 
 * This package holds classes used to handle the charsets of CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff.charset;


/**
 *  This is specialized CFFCharset. It's used if the CharsetId of a font is set to 1.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class CFFExpertCharset extends CFFCharset {

	/**
	 *  Returns an instance of the CFFExpertCharset class.
	 *  @return an instance of CFFExpertCharset
	 */
	public static CFFExpertCharset getInstance() {
	}
}
