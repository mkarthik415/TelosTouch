package ca.weblite.codename1.lang;


/**
 *  The wrapper for the primitive type {@code short}.
 *  
 *  @see java.lang.Number
 *  @since 1.1
 */
public final class Short extends Number implements Comparable {

	/**
	 *  Constant for the maximum {@code short} value, 2<sup>15</sup>-1.
	 */
	public static final short MAX_VALUE = 32767;

	/**
	 *  Constant for the minimum {@code short} value, -2<sup>15</sup>.
	 */
	public static final short MIN_VALUE = -32768;

	/**
	 *  Constant for the number of bits needed to represent a {@code short} in
	 *  two's complement form.
	 * 
	 *  @since 1.5
	 */
	public static final int SIZE = 16;

	/**
	 *  Constructs a new {@code Short} from the specified string.
	 * 
	 *  @param string
	 *             the string representation of a short value.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be decoded into a short value.
	 *  @see #parseShort(String)
	 */
	public Short(String string) {
	}

	/**
	 *  Constructs a new {@code Short} with the specified primitive short value.
	 * 
	 *  @param value
	 *             the primitive short value to store in the new instance.
	 */
	public Short(short value) {
	}

	@java.lang.Override
	public byte byteValue() {
	}

	/**
	 *  Compares this object to the specified short object to determine their
	 *  relative order.
	 *  
	 *  @param object
	 *             the short object to compare this object to.
	 *  @return a negative value if the value of this short is less than the
	 *          value of {@code object}; 0 if the value of this short and the
	 *          value of {@code object} are equal; a positive value if the value
	 *          of this short is greater than the value of {@code object}.
	 *  @throws NullPointerException
	 *              if {@code object} is null.
	 *  @see java.lang.Comparable
	 *  @since 1.2
	 */
	public int compareTo(Short object) {
	}

	/**
	 *  Parses the specified string and returns a {@code Short} instance if the
	 *  string can be decoded into a short value. The string may be an optional
	 *  minus sign "-" followed by a hexadecimal ("0x..." or "#..."), octal
	 *  ("0..."), or decimal ("...") representation of a short.
	 * 
	 *  @param string
	 *             a string representation of a short value.
	 *  @return a {@code Short} containing the value represented by
	 *          {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be parsed as a short value.
	 */
	public static Short decode(String string) {
	}

	@java.lang.Override
	public double doubleValue() {
	}

	/**
	 *  Compares this instance with the specified object and indicates if they
	 *  are equal. In order to be equal, {@code object} must be an instance of
	 *  {@code Short} and have the same short value as this object.
	 * 
	 *  @param object
	 *             the object to compare this short with.
	 *  @return {@code true} if the specified object is equal to this
	 *          {@code Short}; {@code false} otherwise.
	 */
	@java.lang.Override
	public boolean equals(Object object) {
	}

	@java.lang.Override
	public float floatValue() {
	}

	@java.lang.Override
	public int hashCode() {
	}

	@java.lang.Override
	public int intValue() {
	}

	@java.lang.Override
	public long longValue() {
	}

	/**
	 *  Parses the specified string as a signed decimal short value. The ASCII
	 *  character - ('-') is recognized as the minus sign.
	 * 
	 *  @param string
	 *             the string representation of a short value.
	 *  @return the primitive short value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a short value.
	 */
	public static short parseShort(String string) {
	}

	/**
	 *  Parses the specified string as a signed short value using the specified
	 *  radix. The ASCII character - ('-') is recognized as the minus sign.
	 * 
	 *  @param string
	 *             the string representation of a short value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return the primitive short value represented by {@code string} using
	 *          {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as a short value.
	 */
	public static short parseShort(String string, int radix) {
	}

	/**
	 *  Gets the primitive value of this short.
	 * 
	 *  @return this object's primitive value.
	 */
	@java.lang.Override
	public short shortValue() {
	}

	@java.lang.Override
	public String toString() {
	}

	/**
	 *  Returns a string containing a concise, human-readable description of the
	 *  specified short value with radix 10.
	 * 
	 *  @param value
	 *              the short to convert to a string.
	 *  @return a printable representation of {@code value}.
	 */
	public static String toString(short value) {
	}

	/**
	 *  Parses the specified string as a signed decimal short value.
	 * 
	 *  @param string
	 *             the string representation of a short value.
	 *  @return a {@code Short} instance containing the short value represented
	 *          by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a short value.
	 *  @see #parseShort(String)
	 */
	public static Short valueOf(String string) {
	}

	/**
	 *  Parses the specified string as a signed short value using the specified
	 *  radix.
	 * 
	 *  @param string
	 *             the string representation of a short value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return a {@code Short} instance containing the short value represented
	 *          by {@code string} using {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as a short value.
	 *  @see #parseShort(String, int)
	 */
	public static Short valueOf(String string, int radix) {
	}

	/**
	 *  Reverses the bytes of the specified short.
	 *  
	 *  @param s
	 *             the short value for which to reverse bytes.
	 *  @return the reversed value.
	 *  @since 1.5
	 */
	public static short reverseBytes(short s) {
	}

	/**
	 *  Returns a {@code Short} instance for the specified short value.
	 *  <p>
	 *  If it is not necessary to get a new {@code Short} instance, it is
	 *  recommended to use this method instead of the constructor, since it
	 *  maintains a cache of instances which may result in better performance.
	 * 
	 *  @param s
	 *             the short value to store in the instance.
	 *  @return a {@code Short} instance containing {@code s}.
	 *  @since 1.5
	 */
	public static Short valueOf(short s) {
	}
}
