package ca.weblite.codename1.lang;


/**
 *  The wrapper for the primitive type {@code byte}.
 * 
 *  @since 1.1
 */
public final class Byte extends Number implements Comparable {

	/**
	 *  The maximum {@code Byte} value, 2<sup>7</sup>-1.
	 */
	public static final byte MAX_VALUE = 127;

	/**
	 *  The minimum {@code Byte} value, -2<sup>7</sup>.
	 */
	public static final byte MIN_VALUE = -128;

	/**
	 *  The number of bits needed to represent a {@code Byte} value in two's
	 *  complement form.
	 *  
	 *  @since 1.5
	 */
	public static final int SIZE = 8;

	/**
	 *  Constructs a new {@code Byte} with the specified primitive byte value.
	 *  
	 *  @param value
	 *             the primitive byte value to store in the new instance.
	 */
	public Byte(byte value) {
	}

	/**
	 *  Constructs a new {@code Byte} from the specified string.
	 *  
	 *  @param string
	 *             the string representation of a single byte value.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be decoded into a byte value.
	 *  @see #parseByte(String)
	 */
	public Byte(String string) {
	}

	/**
	 *  Gets the primitive value of this byte.
	 *  
	 *  @return this object's primitive value.
	 */
	@java.lang.Override
	public byte byteValue() {
	}

	/**
	 *  Compares this object to the specified byte object to determine their
	 *  relative order.
	 *  
	 *  @param object
	 *             the byte object to compare this object to.
	 *  @return a negative value if the value of this byte is less than the value
	 *          of {@code object}; 0 if the value of this byte and the value of
	 *          {@code object} are equal; a positive value if the value of this
	 *          byte is greater than the value of {@code object}.
	 *  @see java.lang.Comparable
	 *  @since 1.2
	 */
	public int compareTo(Byte object) {
	}

	/**
	 *  Parses the specified string and returns a {@code Byte} instance if the
	 *  string can be decoded into a single byte value. The string may be an
	 *  optional minus sign "-" followed by a hexadecimal ("0x..." or "#..."),
	 *  octal ("0..."), or decimal ("...") representation of a byte.
	 *  
	 *  @param string
	 *             a string representation of a single byte value.
	 *  @return a {@code Byte} containing the value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be parsed as a byte value.
	 */
	public static Byte decode(String string) {
	}

	@java.lang.Override
	public double doubleValue() {
	}

	/**
	 *  Compares this object with the specified object and indicates if they are
	 *  equal. In order to be equal, {@code object} must be an instance of
	 *  {@code Byte} and have the same byte value as this object.
	 *  
	 *  @param object
	 *             the object to compare this byte with.
	 *  @return {@code true} if the specified object is equal to this
	 *          {@code Byte}; {@code false} otherwise.
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
	 *  Parses the specified string as a signed decimal byte value. The ASCII
	 *  character - ('-') is recognized as the minus sign.
	 *  
	 *  @param string
	 *             the string representation of a single byte value.
	 *  @return the primitive byte value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a byte value.
	 */
	public static byte parseByte(String string) {
	}

	/**
	 *  Parses the specified string as a signed byte value using the specified
	 *  radix. The ASCII character - ('-') is recognized as the minus sign.
	 *  
	 *  @param string
	 *             the string representation of a single byte value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return the primitive byte value represented by {@code string} using
	 *          {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as a byte value.
	 */
	public static byte parseByte(String string, int radix) {
	}

	@java.lang.Override
	public short shortValue() {
	}

	@java.lang.Override
	public String toString() {
	}

	/**
	 *  Returns a string containing a concise, human-readable description of the
	 *  specified byte value.
	 *  
	 *  @param value
	 *             the byte to convert to a string.
	 *  @return a printable representation of {@code value}.
	 */
	public static String toString(byte value) {
	}

	/**
	 *  Parses the specified string as a signed decimal byte value.
	 *  
	 *  @param string
	 *             the string representation of a single byte value.
	 *  @return a {@code Byte} instance containing the byte value represented by
	 *          {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a byte value.
	 *  @see #parseByte(String)
	 */
	public static Byte valueOf(String string) {
	}

	/**
	 *  Parses the specified string as a signed byte value using the specified
	 *  radix.
	 *  
	 *  @param string
	 *             the string representation of a single byte value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return a {@code Byte} instance containing the byte value represented by
	 *          {@code string} using {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as a byte value.
	 *  @see #parseByte(String, int)
	 */
	public static Byte valueOf(String string, int radix) {
	}

	/**
	 *  Returns a {@code Byte} instance for the specified byte value.
	 *  <p>
	 *  If it is not necessary to get a new {@code Byte} instance, it is
	 *  recommended to use this method instead of the constructor, since it
	 *  maintains a cache of instances which may result in better performance.
	 *  
	 *  @param b
	 *             the byte value to store in the instance.
	 *  @return a {@code Byte} instance containing {@code b}.
	 *  @since 1.5
	 */
	public static Byte valueOf(byte b) {
	}
}
