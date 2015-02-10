package ca.weblite.codename1.lang;


/**
 *  The wrapper for the primitive type {@code double}.
 *  
 *  @see java.lang.Number
 *  @since 1.0
 */
public final class Double extends Number implements Comparable {

	/**
	 *  Constant for the maximum {@code double} value, (2 - 2<sup>-52</sup>) *
	 *  2<sup>1023</sup>.
	 */
	public static final double MAX_VALUE = 1.7976931348623157E308;

	/**
	 *  Constant for the minimum {@code double} value, 2<sup>-1074</sup>.
	 */
	public static final double MIN_VALUE = 4.9E-324;

	/**
	 *  <p>
	 *  Constant for the smallest positive normal value of <code>double</code>.
	 *  </p>
	 *  
	 *  @since 1.6
	 */
	public static final double MIN_NORMAL = 2.2250738585072014E-308;

	/**
	 *  Constant for the Not-a-Number (NaN) value of the {@code double} type.
	 */
	public static final double NaN = 0d/0d;

	/**
	 *  Constant for the Positive Infinity value of the {@code double} type.
	 */
	public static final double POSITIVE_INFINITY = 1d/0d;

	/**
	 *  <p>
	 *  Maximum exponent that a finite double variable may have.
	 *  </p>
	 *  @since 1.6
	 */
	public static final int MAX_EXPONENT = 1023;

	/**
	 *  <p>
	 *  Minimum exponent that a finite double variable may have.
	 *  </p>
	 *  @since 1.6
	 */
	public static final int MIN_EXPONENT = -1022;

	/**
	 *  Constant for the Negative Infinity value of the {@code double} type.
	 */
	public static final double NEGATIVE_INFINITY = -1d/0d;

	/**
	 *  Constant for the number of bits needed to represent a {@code double} in
	 *  two's complement form.
	 * 
	 *  @since 1.5
	 */
	public static final int SIZE = 64;

	/**
	 *  Constructs a new {@code Double} with the specified primitive double
	 *  value.
	 *  
	 *  @param value
	 *             the primitive double value to store in the new instance.
	 */
	public Double(double value) {
	}

	/**
	 *  Constructs a new {@code Double} from the specified string.
	 *  
	 *  @param string
	 *             the string representation of a double value.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be decoded into a double value.
	 *  @see #parseDouble(String)
	 */
	public Double(String string) {
	}

	/**
	 *  Compares this object to the specified double object to determine their
	 *  relative order. There are two special cases:
	 *  <ul>
	 *  <li>{@code Double.NaN} is equal to {@code Double.NaN} and it is greater
	 *  than any other double value, including {@code Double.POSITIVE_INFINITY};</li>
	 *  <li>+0.0d is greater than -0.0d</li>
	 *  </ul>
	 *  
	 *  @param object
	 *             the double object to compare this object to.
	 *  @return a negative value if the value of this double is less than the
	 *          value of {@code object}; 0 if the value of this double and the
	 *          value of {@code object} are equal; a positive value if the value
	 *          of this double is greater than the value of {@code object}.
	 *  @throws NullPointerException
	 *              if {@code object} is {@code null}.
	 *  @see java.lang.Comparable
	 *  @since 1.2
	 */
	public int compareTo(Double object) {
	}

	@java.lang.Override
	public byte byteValue() {
	}

	/**
	 *  Gets the primitive value of this double.
	 *  
	 *  @return this object's primitive value.
	 */
	@java.lang.Override
	public double doubleValue() {
	}

	/**
	 *  Compares this object with the specified object and indicates if they are
	 *  equal. In order to be equal, {@code object} must be an instance of
	 *  {@code Double} and the bit pattern of its double value is the same as
	 *  this object's.
	 *  
	 *  @param object
	 *             the object to compare this double with.
	 *  @return {@code true} if the specified object is equal to this
	 *          {@code Double}; {@code false} otherwise.
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

	/**
	 *  Indicates whether this object represents an infinite value.
	 *  
	 *  @return {@code true} if the value of this double is positive or negative
	 *          infinity; {@code false} otherwise.
	 */
	public boolean isInfinite() {
	}

	/**
	 *  Indicates whether the specified double represents an infinite value.
	 *  
	 *  @param d
	 *             the double to check.
	 *  @return {@code true} if the value of {@code d} is positive or negative
	 *          infinity; {@code false} otherwise.
	 */
	public static boolean isInfinite(double d) {
	}

	/**
	 *  Indicates whether this object is a <em>Not-a-Number (NaN)</em> value.
	 *  
	 *  @return {@code true} if this double is <em>Not-a-Number</em>;
	 *          {@code false} if it is a (potentially infinite) double number.
	 */
	public boolean isNaN() {
	}

	/**
	 *  Indicates whether the specified double is a <em>Not-a-Number (NaN)</em>
	 *  value.
	 *  
	 *  @param d
	 *             the double value to check.
	 *  @return {@code true} if {@code d} is <em>Not-a-Number</em>;
	 *          {@code false} if it is a (potentially infinite) double number.
	 */
	public static boolean isNaN(double d) {
	}

	/**
	 *  Converts the specified IEEE 754 floating-point double precision bit
	 *  pattern to a Java double value.
	 *  
	 *  @param bits
	 *             the IEEE 754 floating-point double precision representation of
	 *             a double value.
	 *  @return the double value converted from {@code bits}.
	 *  @see #doubleToLongBits(double)
	 *  @see #doubleToRawLongBits(double)
	 */
	@java.lang.Override
	public long longValue() {
	}

	/**
	 *  Parses the specified string as a double value.
	 *  
	 *  @param string
	 *             the string representation of a double value.
	 *  @return the primitive double value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a double value.
	 */
	public static double parseDouble(String string) {
	}

	@java.lang.Override
	public short shortValue() {
	}

	@java.lang.Override
	public String toString() {
	}

	/**
	 *  Returns a string containing a concise, human-readable description of the
	 *  specified double value.
	 *  
	 *  @param d
	 *              the double to convert to a string.
	 *  @return a printable representation of {@code d}.
	 */
	public static String toString(double d) {
	}

	/**
	 *  Parses the specified string as a double value.
	 *  
	 *  @param string
	 *             the string representation of a double value.
	 *  @return a {@code Double} instance containing the double value represented
	 *          by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a double value.
	 *  @see #parseDouble(String)
	 */
	public static Double valueOf(String string) {
	}

	/**
	 *  Compares the two specified double values. There are two special cases:
	 *  <ul>
	 *  <li>{@code Double.NaN} is equal to {@code Double.NaN} and it is greater
	 *  than any other double value, including {@code Double.POSITIVE_INFINITY};</li>
	 *  <li>+0.0d is greater than -0.0d</li>
	 *  </ul>
	 *  
	 *  @param double1
	 *             the first value to compare.
	 *  @param double2
	 *             the second value to compare.
	 *  @return a negative value if {@code double1} is less than {@code double2};
	 *          0 if {@code double1} and {@code double2} are equal; a positive
	 *          value if {@code double1} is greater than {@code double2}.
	 */
	public static int compare(double double1, double double2) {
	}

	/**
	 *  Returns a {@code Double} instance for the specified double value.
	 *  
	 *  @param d
	 *             the double value to store in the instance.
	 *  @return a {@code Double} instance containing {@code d}.
	 *  @since 1.5
	 */
	public static Double valueOf(double d) {
	}

	/**
	 *  Converts the specified double into its hexadecimal string representation.
	 * 
	 *  @param d
	 *             the double to convert.
	 *  @return the hexadecimal string representation of {@code d}.
	 *  @since 1.5
	 */
	public static String toHexString(double d) {
	}
}
