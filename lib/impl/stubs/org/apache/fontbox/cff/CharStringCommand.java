/**
 * 
 * This package holds classes used to parse CFF/Type2-Fonts (aka Type1C-Fonts).
 */
package org.apache.fontbox.cff;


/**
 *  This class represents a CharStringCommand.
 *  
 *  @author Villu Ruusmann
 *  @version $Revision$
 */
public class CharStringCommand {

	/**
	 *  A map with the Type1 vocabulary.
	 */
	public static final java.util.Map TYPE1_VOCABULARY;

	/**
	 *  A map with the Type2 vocabulary.
	 */
	public static final java.util.Map TYPE2_VOCABULARY;

	/**
	 *  Constructor with one value.
	 *  
	 *  @param b0 value
	 */
	public CharStringCommand(int b0) {
	}

	/**
	 *  Constructor with two values.
	 *  
	 *  @param b0 value1
	 *  @param b1 value2
	 */
	public CharStringCommand(int b0, int b1) {
	}

	/**
	 *  Constructor with an array as values.
	 *  
	 *  @param values array of values
	 */
	public CharStringCommand(int[] values) {
	}

	/**
	 *  The key of the CharStringCommand.
	 *  @return the key
	 */
	public CharStringCommand.Key getKey() {
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
	 *  A static class to hold one or more int values as key. 
	 */
	public static class Key {


		/**
		 *  Constructor with one value.
		 *  
		 *  @param b0 value
		 */
		public CharStringCommand.Key(int b0) {
		}

		/**
		 *  Constructor with two values.
		 *  
		 *  @param b0 value1
		 *  @param b1 value2
		 */
		public CharStringCommand.Key(int b0, int b1) {
		}

		/**
		 *  Constructor with an array as values.
		 *  
		 *  @param values array of values
		 */
		public CharStringCommand.Key(int[] values) {
		}

		/**
		 *  Array the with the values.
		 *  
		 *  @return array with the values
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
