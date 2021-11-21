package eu.benschroeder.mockito;

import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Mockito {@link ArgumentMatchers} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 * and https://github.com/szpak/mockito-java8
 *
 * @author Benjamin Schröder
 */
public interface WithArgumentMatchers {

    /**
     * @see ArgumentMatchers#any()
     */
    default <T> T any() {
        return ArgumentMatchers.any();
    }

    /**
     * @see ArgumentMatchers#any(Class)
     */
    default <T> T any(final Class<T> type) {
        return ArgumentMatchers.any(type);
    }

    /**
     * @see ArgumentMatchers#isA(Class)
     */
    default <T> T isA(final Class<T> type) {
        return ArgumentMatchers.isA(type);
    }

    /**
     * @see ArgumentMatchers#anyBoolean()
     */
    default boolean anyBoolean() {
        return ArgumentMatchers.anyBoolean();
    }

    /**
     * @see ArgumentMatchers#anyByte()
     */
    default byte anyByte() {
        return ArgumentMatchers.anyByte();
    }

    /**
     * @see ArgumentMatchers#anyChar()
     */
    default char anyChar() {
        return ArgumentMatchers.anyChar();
    }

    /**
     * @see ArgumentMatchers#anyInt()
     */
    default int anyInt() {
        return ArgumentMatchers.anyInt();
    }

    /**
     * @see ArgumentMatchers#anyLong()
     */
    default long anyLong() {
        return ArgumentMatchers.anyLong();
    }

    /**
     * @see ArgumentMatchers#anyFloat()
     */
    default float anyFloat() {
        return ArgumentMatchers.anyFloat();
    }

    /**
     * @see ArgumentMatchers#anyDouble()
     */
    default double anyDouble() {
        return ArgumentMatchers.anyDouble();
    }

    /**
     * @see ArgumentMatchers#anyShort()
     */
    default short anyShort() {
        return ArgumentMatchers.anyShort();
    }

    /**
     * @see ArgumentMatchers#anyString()
     */
    default String anyString() {
        return ArgumentMatchers.anyString();
    }

    /**
     * @see ArgumentMatchers#anyList()
     */
    default <T> List<T> anyList() {
        return ArgumentMatchers.anyList();
    }

    /**
     * @see ArgumentMatchers#anySet()
     */
    default <T> Set<T> anySet() {
        return ArgumentMatchers.anySet();
    }

    /**
     * @see ArgumentMatchers#anyMap()
     */
    default <K, V> Map<K, V> anyMap() {
        return ArgumentMatchers.anyMap();
    }

    /**
     * @see ArgumentMatchers#anyCollection()
     */
    default <T> Collection<T> anyCollection() {
        return ArgumentMatchers.anyCollection();
    }

    /**
     * @see ArgumentMatchers#anyIterable()
     */
    default <T> Iterable<T> anyIterable() {
        return ArgumentMatchers.anyIterable();
    }

    /**
     * @see ArgumentMatchers#eq(boolean)
     */
    default boolean eq(final boolean value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(byte)
     */
    default byte eq(final byte value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(char)
     */
    default char eq(final char value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(double)
     */
    default double eq(final double value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(float)
     */
    default float eq(final float value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(int)
     */
    default int eq(final int value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(long)
     */
    default long eq(final long value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(short)
     */
    default short eq(final short value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#eq(T)
     */
    default <T> T eq(final T value) {
        return ArgumentMatchers.eq(value);
    }

    /**
     * @see ArgumentMatchers#refEq(Object, String...)
     */
    default <T> T refEq(final T value, final String... excludeFields) {
        return ArgumentMatchers.refEq(value, excludeFields);
    }

    /**
     * @see ArgumentMatchers#same(T)
     */
    default <T> T same(final T value) {
        return ArgumentMatchers.same(value);
    }

    /**
     * @see ArgumentMatchers#isNull()
     */
    default <T> T isNull() {
        return ArgumentMatchers.isNull();
    }

    /**
     * @see ArgumentMatchers#notNull()
     */
    default <T> T notNull() {
        return ArgumentMatchers.notNull();
    }

    /**
     * @see ArgumentMatchers#isNotNull()
     */
    default <T> T isNotNull() {
        return ArgumentMatchers.isNotNull();
    }

    /**
     * @see ArgumentMatchers#nullable(Class)
     */
    default <T> T nullable(final Class<T> clazz) {
        return ArgumentMatchers.nullable(clazz);
    }

    /**
     * @see ArgumentMatchers#contains(String)
     */
    default String contains(final String substring) {
        return ArgumentMatchers.contains(substring);
    }

    /**
     * @see ArgumentMatchers#matches(String)
     */
    default String matches(final String regex) {
        return ArgumentMatchers.matches(regex);
    }

    /**
     * @see ArgumentMatchers#matches(Pattern)
     */
    default String matches(final Pattern pattern) {
        return ArgumentMatchers.matches(pattern);
    }

    /**
     * @see ArgumentMatchers#endsWith(String)
     */
    default String endsWith(final String suffix) {
        return ArgumentMatchers.endsWith(suffix);
    }

    /**
     * @see ArgumentMatchers#startsWith(String)
     */
    default String startsWith(final String prefix) {
        return ArgumentMatchers.startsWith(prefix);
    }

    /**
     * @see ArgumentMatchers#argThat(ArgumentMatcher)
     */
    default <T> T argThat(final ArgumentMatcher<T> matcher) {
        return ArgumentMatchers.argThat(matcher);
    }

    /**
     * @see ArgumentMatchers#charThat(ArgumentMatcher)
     */
    default char charThat(final ArgumentMatcher<Character> matcher) {
        return ArgumentMatchers.charThat(matcher);
    }

    /**
     * @see ArgumentMatchers#booleanThat(ArgumentMatcher)
     */
    default boolean booleanThat(final ArgumentMatcher<Boolean> matcher) {
        return ArgumentMatchers.booleanThat(matcher);
    }

    /**
     * @see ArgumentMatchers#byteThat(ArgumentMatcher)
     */
    default byte byteThat(final ArgumentMatcher<Byte> matcher) {
        return ArgumentMatchers.byteThat(matcher);
    }

    /**
     * @see ArgumentMatchers#shortThat(ArgumentMatcher)
     */
    default short shortThat(final ArgumentMatcher<Short> matcher) {
        return ArgumentMatchers.shortThat(matcher);
    }

    /**
     * @see ArgumentMatchers#intThat(ArgumentMatcher)
     */
    default int intThat(final ArgumentMatcher<Integer> matcher) {
        return ArgumentMatchers.intThat(matcher);
    }

    /**
     * @see ArgumentMatchers#longThat(ArgumentMatcher)
     */
    default long longThat(final ArgumentMatcher<Long> matcher) {
        return ArgumentMatchers.longThat(matcher);
    }

    /**
     * @see ArgumentMatchers#floatThat(ArgumentMatcher)
     */
    default float floatThat(final ArgumentMatcher<Float> matcher) {
        return ArgumentMatchers.floatThat(matcher);
    }

    /**
     * @see ArgumentMatchers#doubleThat(ArgumentMatcher)
     */
    default double doubleThat(final ArgumentMatcher<Double> matcher) {
        return ArgumentMatchers.doubleThat(matcher);
    }

}
