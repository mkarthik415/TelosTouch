/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class creates all needed AFM font metric data from a CFFFont ready to be read from a AFMPaser.
 *  
 *  @author Villu Ruusmann
 *  
 */
public class AFMFormatter {

	/**
	 *  Create font metric data for the given CFFFont.
	 *  @param font the CFFFont
	 *  @return the created font metric data
	 *  @throws IOException if an error occurs during reading
	 */
	public static byte[] format(CFFFont font) {
	}
}
