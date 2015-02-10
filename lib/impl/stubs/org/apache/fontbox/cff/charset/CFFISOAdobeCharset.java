/**
 * 
 * This package holds classes used to handle the charsets of CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff.charset;


/**
 *  This is specialized CFFCharset. It's used if the CharsetId of a font is set to 0.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class CFFISOAdobeCharset extends CFFCharset {

	/**
	 *  Returns an instance of the CFFExpertSubsetCharset class.
	 *  @return an instance of CFFExpertSubsetCharset
	 */
	public static CFFISOAdobeCharset getInstance() {
	}
}
