/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class contains some helper methods handling Type1-Fonts.
 * 
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class Type1FontUtil {

	/**
	 *  Converts a byte-array into a string with the corresponding hex value. 
	 *  @param bytes the byte array
	 *  @return the string with the hex value
	 */
	public static String hexEncode(byte[] bytes) {
	}

	/**
	 *  Converts a string representing a hex value into a byte array.
	 *  @param string the string representing the hex value
	 *  @return the hex value as byte array
	 */
	public static byte[] hexDecode(String string) {
	}

	/**
	 *  Encrypt eexec.
	 *  @param buffer the given data
	 *  @return the encrypted data
	 */
	public static byte[] eexecEncrypt(byte[] buffer) {
	}

	/**
	 *  Encrypt charstring.
	 *  @param buffer the given data
	 *  @param n blocksize?
	 *  @return the encrypted data
	 */
	public static byte[] charstringEncrypt(byte[] buffer, int n) {
	}

	/**
	 *  Decrypt eexec.
	 *  @param buffer the given encrypted data
	 *  @return the decrypted data
	 */
	public static byte[] eexecDecrypt(byte[] buffer) {
	}

	/**
	 *  Decrypt charstring.
	 *  @param buffer the given encrypted data
	 *  @param n blocksize?
	 *  @return the decrypted data
	 */
	public static byte[] charstringDecrypt(byte[] buffer, int n) {
	}
}
