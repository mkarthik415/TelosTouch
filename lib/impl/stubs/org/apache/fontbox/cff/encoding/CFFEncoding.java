/**
 * 
 * This package holds classes used to handle the encoding of CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff.encoding;


/**
 *  This is the superclass for all CFFFont encodings.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public abstract class CFFEncoding {

	public CFFEncoding() {
	}

	/**
	 *  Determines if the encoding is font specific or not.
	 *  @return if the encoding is font specific
	 */
	public boolean isFontSpecific() {
	}

	/**
	 *  Returns the code corresponding to the given SID.
	 *  @param sid the given SID
	 *  @return the corresponding code
	 */
	public int getCode(int sid) {
	}

	/**
	 *  Returns the SID corresponding to the given code.
	 *  @param code the given code
	 *  @return the corresponding SID
	 */
	public int getSID(int code) {
	}

	/**
	 *  Adds a new code/SID combination to the encoding.
	 *  @param code the given code
	 *  @param sid the given SID
	 */
	public void register(int code, int sid) {
	}

	/**
	 *  Add a single entry.
	 *  @param entry the entry to be added
	 */
	public void addEntry(CFFEncoding.Entry entry) {
	}

	/**
	 *  A list of all entries within this encoding.
	 *  @return a list of all entries
	 */
	public java.util.List getEntries() {
	}

	/**
	 *  This class represents a single code/SID mapping of the encoding.
	 */
	public static class Entry {


		/**
		 *  Create a new instance of Entry with the given values.
		 *  @param code the code
		 *  @param sid the SID
		 */
		protected CFFEncoding.Entry(int code, int sid) {
		}

		/**
		 *  The code of the entry.
		 *  @return the code
		 */
		public int getCode() {
		}

		/**
		 *  The SID of the entry.
		 *  @return the SID
		 */
		public int getSID() {
		}

		/**
		 *  {@inheritDoc}
		 */
		public String toString() {
		}
	}
}
