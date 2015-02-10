package ca.weblite.codename1.lang;


/**
 *  The wrapper for the primitive type {@code float}.
 *  
 *  @see java.lang.Number
 *  @since 1.0
 */
public final class Float extends Number implements Comparable {

	/**
	 *  Constant for the maximum {@code float} value, (2 - 2<sup>-23</sup>) * 2<sup>127</sup>.
	 */
	public static final float MAX_VALUE = 3.4028234663852886E38f;

	/**
	 *  Constant for the minimum {@code float} value, 2<sup>-149</sup>.
	 */
	public static final float MIN_VALUE = 1.401298464324817E-45f;

	/**
	 *  <p>
	 *  Constant for the smallest positive normal value of <code>float</code>.
	 *  </p>
	 *  @since 1.6
	 */
	public static final float MIN_NORMAL = 1.1754943508222875E-38f;

	/**
	 *  Constant for the Not-a-Number (NaN) value of the {@code float} type.
	 */
	public static final float NaN = 0f/0f;

	/**
	 *  Constant for the Positive Infinity value of the {@code float} type.
	 */
	public static final float POSITIVE_INFINITY = 1f/0f;

	/**
	 *  Constant for the Negative Infinity value of the {@code float} type.
	 */
	public static final float NEGATIVE_INFINITY = -1f/0f;

	/**
	 *  <p>
	 *  Maximum exponent that a finite float variable may have.
	 *  </p>
	 *  @since 1.6
	 */
	public static final int MAX_EXPONENT = 127;

	/**
	 *  <p>
	 *  Minimum exponent that a finite float variable may have.
	 *  </p>
	 *  @since 1.6
	 */
	public static final int MIN_EXPONENT = -126;

	/**
	 *  Constant for the number of bits needed to represent a {@code float} in
	 *  two's complement form.
	 * 
	 *  @since 1.5
	 */
	public static final int SIZE = 32;

	/**
	 *  Constructs a new {@code Float} with the specified primitive float value.
	 *  
	 *  @param value
	 *             the primitive float value to store in the new instance.
	 */
	public Float(float value) {
	}

	/**
	 *  Constructs a new {@code Float} with the specified primitive double value.
	 *  
	 *  @param value
	 *             the primitive double value to store in the new instance.
	 */
	public Float(double value) {
	}

	/**
	 *  Constructs a new {@code Float} from the specified string.
	 *  
	 *  @param string
	 *             the string representation of a float value.
	 *  @throws NumberFormatException
	 *              if {@code string} can not be decoded into a float value.
	 *  @see #parseFloat(String)
	 */
	public Float(String string) {
	}

	/**
	 *  Compares this object to the specified float object to determine their
	 *  relative order. There are two special cases:
	 *  <ul>
	 *  <li>{@code Float.NaN} is equal to {@code Float.NaN} and it is greater
	 *  than any other float value, including {@code Float.POSITIVE_INFINITY};</li>
	 *  <li>+0.0f is greater than -0.0f</li>
	 *  </ul>
	 *  
	 *  @param object
	 *             the float object to compare this object to.
	 *  @return a negative value if the value of this float is less than the
	 *          value of {@code object}; 0 if the value of this float and the
	 *          value of {@code object} are equal; a positive value if the value
	 *          of this float is greater than the value of {@code object}.
	 *  @see java.lang.Comparable
	 *  @since 1.2
	 */
	public int compareTo(Float object) {
	}

	@java.lang.Override
	public byte byteValue() {
	}

	@java.lang.Override
	public double doubleValue() {
	}

	/**
	 *  Compares this instance with the specified object and indicates if they
	 *  are equal. In order to be equal, {@code object} must be an instance of
	 *  {@code Float} and have the same float value as this object.
	 *  
	 *  @param object
	 *             the object to compare this float with.
	 *  @return {@code true} if the specified object is equal to this
	 *          {@code Float}; {@code false} otherwise.
	 */
	@java.lang.Override
	public boolean equals(Object object) {
	}

	/**
	 *  Gets the primitive value of this float.
	 *  
	 *  @return this object's primitive value.
	 */
	@java.lang.Override
	public float floatValue() {
	}

	@java.lang.Override
	public int hashCode() {
	}

	/**
	 *  Converts the specified IEEE 754 floating-point single precision bit
	 *  pattern to a Java float value.
	 *  
	 *  @param bits
	 *             the IEEE 754 floating-point single precision representation of
	 *             a float value.
	 *  @return the float value converted from {@code bits}.
	 *  @see #floatToIntBits(float)
	 *  @see #floatToRawIntBits(float)
	 */
	@java.lang.Override
	public int intValue() {
	}

	/**
	 *  Indicates whether this object represents an infinite value.
	 *  
	 *  @return {@code true} if the value of this float is positive or negative
	 *          infinity; {@code false} otherwise.
	 */
	public boolean isInfinite() {
	}

	/**
	 *  Indicates whether the specified float represents an infinite value.
	 *  
	 *  @param f
	 *             the float to check.
	 *  @return {@code true} if the value of {@code f} is positive or negative
	 *          infinity; {@code false} otherwise.
	 */
	public static boolean isInfinite(float f) {
	}

	/**
	 *  Indicates whether this object is a <em>Not-a-Number (NaN)</em> value.
	 *  
	 *  @return {@code true} if this float is <em>Not-a-Number</em>;
	 *          {@code false} if it is a (potentially infinite) float number.
	 */
	public boolean isNaN() {
	}

	/**
	 *  Indicates whether the specified float is a <em>Not-a-Number (NaN)</em>
	 *  value.
	 *  
	 *  @param f
	 *             the float value to check.
	 *  @return {@code true} if {@code f} is <em>Not-a-Number</em>;
	 *          {@code false} if it is a (potentially infinite) float number.
	 */
	public static boolean isNaN(float f) {
	}

	@java.lang.Override
	public long longValue() {
	}

	/**
	 *  Parses the specified string as a float value.
	 *  
	 *  @param string
	 *             the string representation of a float value.
	 *  @return the primitive float value represented by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a float value.
	 *  @see #valueOf(String)
	 *  @since 1.2
	 */
	public static float parseFloat(String string) {
	}

	@java.lang.Override
	public short shortValue() {
	}

	@java.lang.Override
	public String toString() {
	}

	/**
	 *  Returns a string containing a concise, human-readable description of the
	 *  specified float value.
	 *  
	 *  @param f
	 *              the float to convert to a string.
	 *  @return a printable representation of {@code f}.
	 */
	public static String toString(float f) {
	}

	/**
	 *  Parses the specified string as a float value.
	 *  
	 *  @param string
	 *             the string representation of a float value.
	 *  @return a {@code Float} instance containing the float value represented
	 *          by {@code string}.
	 *  @throws NumberFormatException
	 *              if {@code string} is {@code null}, has a length of zero or
	 *              can not be parsed as a float value.
	 *  @see #parseFloat(String)
	 */
	public static Float valueOf(String string) {
	}

	/**
	 *  Compares the two specified float values. There are two special cases:
	 *  <ul>
	 *  <li>{@code Float.NaN} is equal to {@code Float.NaN} and it is greater
	 *  than any other float value, including {@code Float.POSITIVE_INFINITY};</li>
	 *  <li>+0.0f is greater than -0.0f</li>
	 *  </ul>
	 *  
	 *  @param float1
	 *             the first value to compare.
	 *  @param float2
	 *             the second value to compare.
	 *  @return a negative value if {@code float1} is less than {@code float2};
	 *          0 if {@code float1} and {@code float2} are equal; a positive
	 *          value if {@code float1} is greater than {@code float2}.
	 *  @since 1.4
	 */
	public static int compare(float float1, float float2) {
	}

	/**
	 *  Returns a {@code Float} instance for the specified float value.
	 *  
	 *  @param f
	 *             the float value to store in the instance.
	 *  @return a {@code Float} instance containing {@code f}.
	 *  @since 1.5
	 */
	public static Float valueOf(float f) {
	}

	/**
	 *  Converts the specified float into its hexadecimal string representation.
	 * 
	 *  @param f
	 *             the float to convert.
	 *  @return the hexadecimal string representation of {@code f}.
	 *  @since 1.5
	 */
	public static String toHexString(float f) {
	}
}
