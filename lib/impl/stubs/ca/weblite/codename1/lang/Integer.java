package ca.weblite.codename1.lang;


/**
 *  The wrapper for the primitive type {@code int}.
 *  <p>
 *  As with the specification, this implementation relies on code laid out in <a
 *  href="http://www.hackersdelight.org/">Henry S. Warren, Jr.'s Hacker's
 *  Delight, (Addison Wesley, 2002)</a> as well as <a
 *  href="http://aggregate.org/MAGIC/">The Aggregate's Magic Algorithms</a>.
 * 
 *  @see java.lang.Number
 *  @since 1.1
 */
public final class Integer extends Number implements Comparable {

	/**
	 *  Constant for the maximum {@code int} value, 2<sup>31</sup>-1.
	 */
	public static final int MAX_VALUE = 2147483647;

	/**
	 *  Constant for the minimum {@code int} value, -2<sup>31</sup>.
	 */
	public static final int MIN_VALUE = -2147483648;

	/**
	 *  Constant for the number of bits needed to represent an {@code int} in
	 *  two's complement form.
	 * 
	 *  @since 1.5
	 */
	public static final int SIZE = 32;

	/**
	 *  Constructs a new {@code Integer} with the specified primitive integer
	 *  value.
	 *  
	 *  @param value
	 *             the primitive integer value to store in the new instance.
	 */
	public Integer(int value) {
	}

	/**
	 *  Constructs a new {@code Integer} from the specified string.
	 *  
	 *  @param string
	 *             the string representation of an integer value.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be decoded into an integer value.
	 *  @see #parseInt(String)
	 */
	public Integer(String string) {
	}

	@java.lang.Override
	public byte byteValue() {
	}

	/**
	 *  Compares this object to the specified integer object to determine their
	 *  relative order.
	 *  
	 *  @param object
	 *             the integer object to compare this object to.
	 *  @return a negative value if the value of this integer is less than the
	 *          value of {@code object}; 0 if the value of this integer and the
	 *          value of {@code object} are equal; a positive value if the value
	 *          of this integer is greater than the value of {@code object}.
	 *  @see java.lang.Comparable
	 *  @since 1.2
	 */
	public int compareTo(Integer object) {
	}

	/**
	 *  Parses the specified string and returns a {@code Integer} instance if the
	 *  string can be decoded into an integer value. The string may be an
	 *  optional minus sign "-" followed by a hexadecimal ("0x..." or "#..."),
	 *  octal ("0..."), or decimal ("...") representation of an integer.
	 *  
	 *  @param string
	 *             a string representation of an integer value.
	 *  @return an {@code Integer} containing the value represented by
	 *          {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be parsed as an integer value.
	 */
	public static Integer decode(String string) {
	}

	@java.lang.Override
	public double doubleValue() {
	}

	/**
	 *  Compares this instance with the specified object and indicates if they
	 *  are equal. In order to be equal, {@code o} must be an instance of
	 *  {@code Integer} and have the same integer value as this object.
	 *  
	 *  @param o
	 *             the object to compare this integer with.
	 *  @return {@code true} if the specified object is equal to this
	 *          {@code Integer}; {@code false} otherwise.
	 */
	@java.lang.Override
	public boolean equals(Object o) {
	}

	@java.lang.Override
	public float floatValue() {
	}

	/**
	 *  Returns the {@code Integer} value of the system property identified by
	 *  {@code string}. Returns {@code null} if {@code string} is {@code null}
	 *  or empty, if the property can not be found or if its value can not be
	 *  parsed as an integer.
	 *  
	 *  @param string
	 *             the name of the requested system property.
	 *  @return the requested property's value as an {@code Integer} or
	 *          {@code null}.
	 */
	public static Integer getInteger(String string) {
	}

	/**
	 *  Returns the {@code Integer} value of the system property identified by
	 *  {@code string}. Returns the specified default value if {@code string} is
	 *  {@code null} or empty, if the property can not be found or if its value
	 *  can not be parsed as an integer.
	 *  
	 *  @param string
	 *             the name of the requested system property.
	 *  @param defaultValue
	 *             the default value that is returned if there is no integer
	 *             system property with the requested name.
	 *  @return the requested property's value as an {@code Integer} or the
	 *          default value.
	 */
	public static Integer getInteger(String string, int defaultValue) {
	}

	/**
	 *  Returns the {@code Integer} value of the system property identified by
	 *  {@code string}. Returns the specified default value if {@code string} is
	 *  {@code null} or empty, if the property can not be found or if its value
	 *  can not be parsed as an integer.
	 *  
	 *  @param string
	 *             the name of the requested system property.
	 *  @param defaultValue
	 *             the default value that is returned if there is no integer
	 *             system property with the requested name.
	 *  @return the requested property's value as an {@code Integer} or the
	 *          default value.
	 */
	public static Integer getInteger(String string, Integer defaultValue) {
	}

	@java.lang.Override
	public int hashCode() {
	}

	/**
	 *  Gets the primitive value of this int.
	 *  
	 *  @return this object's primitive value.
	 */
	@java.lang.Override
	public int intValue() {
	}

	@java.lang.Override
	public long longValue() {
	}

	/**
	 *  Parses the specified string as a signed decimal integer value. The ASCII
	 *  character - ('-') is recognized as the minus sign.
	 *  
	 *  @param string
	 *             the string representation of an integer value.
	 *  @return the primitive integer value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as an integer value.
	 */
	public static int parseInt(String string) {
	}

	/**
	 *  Parses the specified string as a signed integer value using the specified
	 *  radix. The ASCII character - ('-') is recognized as the minus sign.
	 *  
	 *  @param string
	 *             the string representation of an integer value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return the primitive integer value represented by {@code string} using
	 *          {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as an integer value.
	 */
	public static int parseInt(String string, int radix) {
	}

	@java.lang.Override
	public short shortValue() {
	}

	/**
	 *  Converts the specified integer into its binary string representation. The
	 *  returned string is a concatenation of '0' and '1' characters.
	 *  
	 *  @param i
	 *             the integer to convert.
	 *  @return the binary string representation of {@code i}.
	 */
	public static String toBinaryString(int i) {
	}

	/**
	 *  Converts the specified integer into its hexadecimal string
	 *  representation. The returned string is a concatenation of characters from
	 *  '0' to '9' and 'a' to 'f'.
	 *  
	 *  @param i
	 *             the integer to convert.
	 *  @return the hexadecimal string representation of {@code i}.
	 */
	public static String toHexString(int i) {
	}

	/**
	 *  Converts the specified integer into its octal string representation. The
	 *  returned string is a concatenation of characters from '0' to '7'.
	 *  
	 *  @param i
	 *             the integer to convert.
	 *  @return the octal string representation of {@code i}.
	 */
	public static String toOctalString(int i) {
	}

	@java.lang.Override
	public String toString() {
	}

	/**
	 *  Converts the specified integer into its decimal string representation.
	 *  The returned string is a concatenation of a minus sign if the number is
	 *  negative and characters from '0' to '9'.
	 *  
	 *  @param value
	 *             the integer to convert.
	 *  @return the decimal string representation of {@code value}.
	 */
	public static String toString(int value) {
	}

	/**
	 *  Converts the specified integer into a string representation based on the
	 *  specified radix. The returned string is a concatenation of a minus sign
	 *  if the number is negative and characters from '0' to '9' and 'a' to 'z',
	 *  depending on the radix. If {@code radix} is not in the interval defined
	 *  by {@code Character.MIN_RADIX} and {@code Character.MAX_RADIX} then 10 is
	 *  used as the base for the conversion.
	 *  
	 *  @param i
	 *             the integer to convert.
	 *  @param radix
	 *             the base to use for the conversion.
	 *  @return the string representation of {@code i}.
	 */
	public static String toString(int i, int radix) {
	}

	/**
	 *  Parses the specified string as a signed decimal integer value.
	 *  
	 *  @param string
	 *             the string representation of an integer value.
	 *  @return an {@code Integer} instance containing the integer value
	 *          represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as an integer value.
	 *  @see #parseInt(String)
	 */
	public static Integer valueOf(String string) {
	}

	/**
	 *  Parses the specified string as a signed integer value using the specified
	 *  radix.
	 *  
	 *  @param string
	 *             the string representation of an integer value.
	 *  @param radix
	 *             the radix to use when parsing.
	 *  @return an {@code Integer} instance containing the integer value
	 *          represented by {@code string} using {@code radix}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null} or has a length of zero,
	 *              {@code radix < Character.MIN_RADIX},
	 *              {@code radix > Character.MAX_RADIX}, or if {@code string}
	 *              can not be parsed as an integer value.
	 *  @see #parseInt(String, int)
	 */
	public static Integer valueOf(String string, int radix) {
	}

	/**
	 *  Determines the highest (leftmost) bit of the specified integer that is 1
	 *  and returns the bit mask value for that bit. This is also referred to as
	 *  the Most Significant 1 Bit. Returns zero if the specified integer is
	 *  zero.
	 *  
	 *  @param i
	 *             the integer to examine.
	 *  @return the bit mask indicating the highest 1 bit in {@code i}.
	 *  @since 1.5
	 */
	public static int highestOneBit(int i) {
	}

	/**
	 *  Determines the lowest (rightmost) bit of the specified integer that is 1
	 *  and returns the bit mask value for that bit. This is also referred
	 *  to as the Least Significant 1 Bit. Returns zero if the specified integer
	 *  is zero.
	 *  
	 *  @param i
	 *             the integer to examine.
	 *  @return the bit mask indicating the lowest 1 bit in {@code i}.
	 *  @since 1.5
	 */
	public static int lowestOneBit(int i) {
	}

	/**
	 *  Determines the number of leading zeros in the specified integer prior to
	 *  the {@link #highestOneBit(int) highest one bit}.
	 * 
	 *  @param i
	 *             the integer to examine.
	 *  @return the number of leading zeros in {@code i}.
	 *  @since 1.5
	 */
	public static int numberOfLeadingZeros(int i) {
	}

	/**
	 *  Determines the number of trailing zeros in the specified integer after
	 *  the {@link #lowestOneBit(int) lowest one bit}.
	 * 
	 *  @param i
	 *             the integer to examine.
	 *  @return the number of trailing zeros in {@code i}.
	 *  @since 1.5
	 */
	public static int numberOfTrailingZeros(int i) {
	}

	/**
	 *  Counts the number of 1 bits in the specified integer; this is also
	 *  referred to as population count.
	 * 
	 *  @param i
	 *             the integer to examine.
	 *  @return the number of 1 bits in {@code i}.
	 *  @since 1.5
	 */
	public static int bitCount(int i) {
	}

	/**
	 *  Rotates the bits of the specified integer to the left by the specified
	 *  number of bits.
	 * 
	 *  @param i
	 *             the integer value to rotate left.
	 *  @param distance
	 *             the number of bits to rotate.
	 *  @return the rotated value.
	 *  @since 1.5
	 */
	public static int rotateLeft(int i, int distance) {
	}

	/**
	 *  Rotates the bits of the specified integer to the right by the specified
	 *  number of bits.
	 * 
	 *  @param i
	 *             the integer value to rotate right.
	 *  @param distance
	 *             the number of bits to rotate.
	 *  @return the rotated value.
	 *  @since 1.5
	 */
	public static int rotateRight(int i, int distance) {
	}

	/**
	 *  Reverses the order of the bytes of the specified integer.
	 *  
	 *  @param i
	 *             the integer value for which to reverse the byte order.
	 *  @return the reversed value.
	 *  @since 1.5
	 */
	public static int reverseBytes(int i) {
	}

	/**
	 *  Reverses the order of the bits of the specified integer.
	 *  
	 *  @param i
	 *             the integer value for which to reverse the bit order.
	 *  @return the reversed value.
	 *  @since 1.5
	 */
	public static int reverse(int i) {
	}

	/**
	 *  Returns the value of the {@code signum} function for the specified
	 *  integer.
	 *  
	 *  @param i
	 *             the integer value to check.
	 *  @return -1 if {@code i} is negative, 1 if {@code i} is positive, 0 if
	 *          {@code i} is zero.
	 *  @since 1.5
	 */
	public static int signum(int i) {
	}

	/**
	 *  Returns a {@code Integer} instance for the specified integer value.
	 *  <p>
	 *  If it is not necessary to get a new {@code Integer} instance, it is
	 *  recommended to use this method instead of the constructor, since it
	 *  maintains a cache of instances which may result in better performance.
	 * 
	 *  @param i
	 *             the integer value to store in the instance.
	 *  @return a {@code Integer} instance containing {@code i}.
	 *  @since 1.5
	 */
	public static Integer valueOf(int i) {
	}
}
