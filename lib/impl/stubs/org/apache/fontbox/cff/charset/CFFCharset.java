/**
 * 
 * This package holds classes used to handle the charsets of CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff.charset;


/**
 *  This is the superclass for all CFFFont charsets.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public abstract class CFFCharset {

	public CFFCharset() {
	}

	/**
	 *  Determines if the charset is font specific or not.
	 *  @return if the charset is font specific
	 */
	public boolean isFontSpecific() {
	}

	/**
	 *  Returns the SID corresponding to the given name.
	 *  @param name the given SID
	 *  @return the corresponding SID
	 */
	public int getSID(String name) {
	}

	/**
	 *  Returns the name corresponding to the given SID.
	 *  @param sid the given SID
	 *  @return the corresponding name
	 */
	public String getName(int sid) {
	}

	/**
	 *  Adds a new SID/name combination to the charset.
	 *  @param sid the given SID
	 *  @param name the given name
	 */
	public void register(int sid, String name) {
	}

	/**
	 *  Add a single entry.
	 *  @param entry the entry to be added
	 */
	public void addEntry(CFFCharset.Entry entry) {
	}

	/**
	 *  A list of all entries within this charset.
	 *  @return a list of all entries
	 */
	public java.util.List getEntries() {
	}

	/**
	 *  This class represents a single SID/name mapping of the charset.
	 */
	public static class Entry {


		/**
		 *  Create a new instance of Entry with the given values.
		 *  @param sid the SID
		 *  @param name the Name
		 */
		protected CFFCharset.Entry(int sid, String name) {
		}

		/**
		 *  The SID of this entry.
		 *  @return the SID
		 */
		public int getSID() {
		}

		/**
		 *  The Name of this entry.
		 *  @return the name
		 */
		public String getName() {
		}

		/**
		 *  {@inheritDoc}
		 */
		public String toString() {
		}
	}
}
