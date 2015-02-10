package ca.weblite.codename1.lang;


/**
 *  The wrapper for the primitive type {@code long}.
 *  <p>
 *  As with the specification, this implementation relies on code laid out in <a
 *  href="http://www.hackersdelight.org/">Henry S. Warren, Jr.'s Hacker's
 *  Delight, (Addison Wesley, 2002)</a> as well as <a
 *  href="http://aggregate.org/MAGIC/">The Aggregate's Magic Algorithms</a>.
 * 
 *  @see java.lang.Number
 *  @since 1.0
 */
public final class Long extends Number implements Comparable {

	/**
	 *  Constant for the maximum {@code long} value, 2<sup>63</sup>-1.
	 */
	public static final long MAX_VALUE = 9223372036854775807L;

	/**
	 *  Constant for the minimum {@code long} value, -2<sup>63</sup>.
	 */
	public static final long MIN_VALUE = -9223372036854775808L;

	/**
	 *  Constant for the number of bits needed to represent a {@code long} in
	 *  two's complement form.
	 * 
	 *  @since 1.5
	 */
	public static final int SIZE = 64;

	/**
	 *  Constructs a new {@code Long} with the specified primitive long value.
	 *  
	 *  @param value
	 *             the primitive long value to store in the new instance.
	 */
	public Long(long value) {
	}

	/**
	 *  Constructs a new {@code Long} from the specified string.
	 *  
	 *  @param string
	 *             the string representation of a long value.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be decoded into a long value.
	 *  @see #parseLong(String)
	 */
	public Long(String string) {
	}

	@java.lang.Override
	public byte byteValue() {
	}

	/**
	 *  Compares this object to the specified long object to determine their
	 *  relative order.
	 *  
	 *  @param object
	 *             the long object to compare this object to.
	 *  @return a negative value if the value of this long is less than the value
	 *          of {@code object}; 0 if the value of this long and the value of
	 *          {@code object} are equal; a positive value if the value of this
	 *          long is greater than the value of {@code object}.
	 *  @see java.lang.Comparable
	 *  @since 1.2
	 */
	public int compareTo(Long object) {
	}

	/**
	 *  Parses the specified string and returns a {@code Long} instance if the
	 *  string can be decoded into a long value. The string may be an optional
	 *  minus sign "-" followed by a hexadecimal ("0x..." or "#..."), octal
	 *  ("0..."), or decimal ("...") representation of a long.
	 *  
	 *  @param string
	 *             a string representation of a long value.
	 *  @return a {@code Long} containing the value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be parsed as a long value.
	 */
	public static Long decode(String string) {
	}

	@java.lang.Override
	public double doubleValue() {
	}

	/**
	 *  Compares this instance with the specified object and indicates if they
	 *  are equal. In order to be equal, {@code o} must be an instance of
	 *  {@code Long} and have the same long value as this object.
	 *  
	 *  @param o
	 *             the object to compare this long with.
	 *  @return {@code true} if the specified object is equal to this
	 *          {@code Long}; {@code false} otherwise.
	 */
	@java.lang.Override
	public boolean equals(Object o) {
	}

	@java.lang.Override
	public float floatValue() {
	}

	/**
	 *  Returns the {@code Long} value of the system property identified by
	 *  {@code string}. Returns {@code null} if {@code string} is {@code null}
	 *  or empty, if the property can not be found or if its value can not be
	 *  parsed as a long.
	 *  
	 *  @param string
	 *             the name of the requested system property.
	 *  @return the requested property's value as a {@code Long} or {@code null}.
	 */
	public static Long getLong(String string) {
	}

	/**
	 *  Returns the {@code Long} value of the system property identified by
	 *  {@code string}. Returns the specified default value if {@code string} is
	 *  {@code null} or empty, if the property can not be found or if its value
	 *  can not be parsed as a long.
	 *  
	 *  @param string
	 *             the name of the requested system property.
	 *  @param defaultValue
	 *             the default value that is returned if there is no long system
	 *             property with the requested name.
	 *  @return the requested property's value as a {@code Long} or the default
	 *          value.
	 */
	public static Long getLong(String string, long defaultValue) {
	}

	/**
	 *  Returns the {@code Long} value of the system property identified by
	 *  {@code string}. Returns the specified default value if {@code string} is
	 *  {@code null} or empty, if the property can not be found or if its value
	 *  can not be parsed as a long.
	 *  
	 *  @param string
	 *             the name of the requested system property.
	 *  @param defaultValue
	 *             the default value that is returned if there is no long system
	 *             property with the requested name.
	 *  @return the requested property's value as a {@code Long} or the default
	 *          value.
	 */
	public static Long getLong(String string, Long defaultValue) {
	}

	@java.lang.Override
	public int hashCode() {
	}

	@java.lang.Override
	public int intValue() {
	}

	/**
	 *  Gets the primitive value of this long.
	 *  
	 *  @return this object's primitive value.
	 */
	@java.lang.Override
	public long longValue() {
	}

	/**
	 *  Parses the specified string as a signed decimal long value. The ASCII
	 *  character - ('-') is recognized as the minus sign.
	 *  
	 *  @param string
	 *             the string representation of a long value.
	 *  @return the primitive long value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a long value.
	 */
	public static long parseLong(String string) {
	}

	/**
	 *  Parses the specified string as a signed long value using the specified
	 *  radix. The ASCII character - ('-') is recognized as the minus sign.
	 *  
	 *  @param string
	 *             the string representation of a long value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return the primitive long value represented by {@code string} using
	 *          {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as a long value.
	 */
	public static long parseLong(String string, int radix) {
	}

	@java.lang.Override
	public short shortValue() {
	}

	/**
	 *  Converts the specified long value into its binary string representation.
	 *  The returned string is a concatenation of '0' and '1' characters.
	 *  
	 *  @param l
	 *             the long value to convert.
	 *  @return the binary string representation of {@code l}.
	 */
	public static String toBinaryString(long l) {
	}

	/**
	 *  Converts the specified long value into its hexadecimal string
	 *  representation. The returned string is a concatenation of characters from
	 *  '0' to '9' and 'a' to 'f'.
	 *  
	 *  @param l
	 *             the long value to convert.
	 *  @return the hexadecimal string representation of {@code l}.
	 */
	public static String toHexString(long l) {
	}

	/**
	 *  Converts the specified long value into its octal string representation.
	 *  The returned string is a concatenation of characters from '0' to '7'.
	 *  
	 *  @param l
	 *             the long value to convert.
	 *  @return the octal string representation of {@code l}.
	 */
	public static String toOctalString(long l) {
	}

	@java.lang.Override
	public String toString() {
	}

	/**
	 *  Converts the specified long value into its decimal string representation.
	 *  The returned string is a concatenation of a minus sign if the number is
	 *  negative and characters from '0' to '9'.
	 *  
	 *  @param l
	 *             the long to convert.
	 *  @return the decimal string representation of {@code l}.
	 */
	public static String toString(long l) {
	}

	/**
	 *  Converts the specified long value into a string representation based on
	 *  the specified radix. The returned string is a concatenation of a minus
	 *  sign if the number is negative and characters from '0' to '9' and 'a' to
	 *  'z', depending on the radix. If {@code radix} is not in the interval
	 *  defined by {@code Character.MIN_RADIX} and {@code Character.MAX_RADIX}
	 *  then 10 is used as the base for the conversion.
	 *  
	 *  @param l
	 *             the long to convert.
	 *  @param radix
	 *             the base to use for the conversion.
	 *  @return the string representation of {@code l}.
	 */
	public static String toString(long l, int radix) {
	}

	/**
	 *  Parses the specified string as a signed decimal long value.
	 *  
	 *  @param string
	 *             the string representation of a long value.
	 *  @return a {@code Long} instance containing the long value represented by
	 *          {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a long value.
	 *  @see #parseLong(String)
	 */
	public static Long valueOf(String string) {
	}

	/**
	 *  Parses the specified string as a signed long value using the specified
	 *  radix.
	 *  
	 *  @param string
	 *             the string representation of a long value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return a {@code Long} instance containing the long value represented by
	 *          {@code string} using {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as a long value.
	 *  @see #parseLong(String, int)
	 */
	public static Long valueOf(String string, int radix) {
	}

	/**
	 *  Determines the highest (leftmost) bit of the specified long value that is
	 *  1 and returns the bit mask value for that bit. This is also referred to
	 *  as the Most Significant 1 Bit. Returns zero if the specified long is
	 *  zero.
	 *  
	 *  @param lng
	 *             the long to examine.
	 *  @return the bit mask indicating the highest 1 bit in {@code lng}.
	 *  @since 1.5
	 */
	public static long highestOneBit(long lng) {
	}

	/**
	 *  Determines the lowest (rightmost) bit of the specified long value that is
	 *  1 and returns the bit mask value for that bit. This is also referred to
	 *  as the Least Significant 1 Bit. Returns zero if the specified long is
	 *  zero.
	 *  
	 *  @param lng
	 *             the long to examine.
	 *  @return the bit mask indicating the lowest 1 bit in {@code lng}.
	 *  @since 1.5
	 */
	public static long lowestOneBit(long lng) {
	}

	/**
	 *  Determines the number of leading zeros in the specified long value prior
	 *  to the {@link #highestOneBit(long) highest one bit}.
	 * 
	 *  @param lng
	 *             the long to examine.
	 *  @return the number of leading zeros in {@code lng}.
	 *  @since 1.5
	 */
	public static int numberOfLeadingZeros(long lng) {
	}

	/**
	 *  Determines the number of trailing zeros in the specified long value after
	 *  the {@link #lowestOneBit(long) lowest one bit}.
	 * 
	 *  @param lng
	 *             the long to examine.
	 *  @return the number of trailing zeros in {@code lng}.
	 *  @since 1.5
	 */
	public static int numberOfTrailingZeros(long lng) {
	}

	/**
	 *  Counts the number of 1 bits in the specified long value; this is also
	 *  referred to as population count.
	 * 
	 *  @param lng
	 *             the long to examine.
	 *  @return the number of 1 bits in {@code lng}.
	 *  @since 1.5
	 */
	public static int bitCount(long lng) {
	}

	/**
	 *  Rotates the bits of the specified long value to the left by the specified
	 *  number of bits.
	 * 
	 *  @param lng
	 *             the long value to rotate left.
	 *  @param distance
	 *             the number of bits to rotate.
	 *  @return the rotated value.
	 *  @since 1.5
	 */
	public static long rotateLeft(long lng, int distance) {
	}

	/**
	 *  <p>
	 *  Rotates the bits of the specified long value to the right by the
	 *  specified number of bits.
	 * 
	 *  @param lng
	 *             the long value to rotate right.
	 *  @param distance
	 *             the number of bits to rotate.
	 *  @return the rotated value.
	 *  @since 1.5
	 */
	public static long rotateRight(long lng, int distance) {
	}

	/**
	 *  Reverses the order of the bytes of the specified long value.
	 *  
	 *  @param lng
	 *             the long value for which to reverse the byte order.
	 *  @return the reversed value.
	 *  @since 1.5
	 */
	public static long reverseBytes(long lng) {
	}

	/**
	 *  Reverses the order of the bits of the specified long value.
	 *  
	 *  @param lng
	 *             the long value for which to reverse the bit order.
	 *  @return the reversed value.
	 *  @since 1.5
	 */
	public static long reverse(long lng) {
	}

	/**
	 *  Returns the value of the {@code signum} function for the specified long
	 *  value.
	 *  
	 *  @param lng
	 *             the long value to check.
	 *  @return -1 if {@code lng} is negative, 1 if {@code lng} is positive, 0 if
	 *          {@code lng} is zero.
	 *  @since 1.5
	 */
	public static int signum(long lng) {
	}

	/**
	 *  Returns a {@code Long} instance for the specified long value.
	 *  <p>
	 *  If it is not necessary to get a new {@code Long} instance, it is
	 *  recommended to use this method instead of the constructor, since it
	 *  maintains a cache of instances which may result in better performance.
	 * 
	 *  @param lng
	 *             the long value to store in the instance.
	 *  @return a {@code Long} instance containing {@code lng}.
	 *  @since 1.5
	 */
	public static Long valueOf(long lng) {
	}
}
