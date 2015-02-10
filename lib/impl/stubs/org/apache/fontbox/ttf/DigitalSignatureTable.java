/**
 * 
 * This package contains classes to parse a TTF file.
 */
package org.apache.fontbox.ttf;


/**
 *  A table in a true type font.
 *  
 *  @author Ben Litchfield (ben@benlitchfield.com)
 *  @version $Revision: 1.1 $
 */
public class DigitalSignatureTable extends TTFTable {

	/**
	 *  Tag to identify this table.
	 */
	public static final String TAG = "DSIG";

	public DigitalSignatureTable() {
	}
}
