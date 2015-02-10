/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class represents a CFF operator.
 *  @author Villu Ruusmann
 *  @version $Revision: 1.0 $
 */
public class CFFOperator {

	/**
	 *  The key of the operator.
	 *  @return the key
	 */
	public CFFOperator.Key getKey() {
	}

	/**
	 *  The name of the operator.
	 *  @return the name
	 */
	public String getName() {
	}

	/**
	 *  {@inheritDoc}
	 */
	public String toString() {
	}

	/**
	 *  {@inheritDoc}
	 */
	public int hashCode() {
	}

	/**
	 *  {@inheritDoc}
	 */
	public boolean equals(Object object) {
	}

	/**
	 *  Returns the operator corresponding to the given key.
	 *  @param key the given key
	 *  @return the corresponding operator
	 */
	public static CFFOperator getOperator(CFFOperator.Key key) {
	}

	/**
	 *  Returns the operator corresponding to the given name.
	 *  @param key the given name
	 *  @return the corresponding operator
	 */
	public static CFFOperator getOperator(String name) {
	}

	/**
	 *  This class is a holder for a key value. It consists of one or two bytes.  
	 *  @author Villu Ruusmann
	 */
	public static class Key {


		/**
		 *  Constructor.
		 *  @param b0 the one byte value
		 */
		public CFFOperator.Key(int b0) {
		}

		/**
		 *  Constructor.
		 *  @param b0 the first byte of a two byte value
		 *  @param b1 the second byte of a two byte value
		 */
		public CFFOperator.Key(int b0, int b1) {
		}

		/**
		 *  Returns the value of the key.
		 *  @return the value
		 */
		public int[] getValue() {
		}

		/**
		 *  {@inheritDoc}
		 */
		public String toString() {
		}

		/**
		 *  {@inheritDoc}
		 */
		public int hashCode() {
		}

		/**
		 *  {@inheritDoc}
		 */
		public boolean equals(Object object) {
		}
	}
}
