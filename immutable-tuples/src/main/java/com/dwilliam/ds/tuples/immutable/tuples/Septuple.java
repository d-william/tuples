package com.dwilliam.ds.tuples.immutable.tuples;

import com.dwilliam.ds.tuples.Tuple;
import com.dwilliam.ds.tuples.immutable.intf.tuples.IImmutableSeptuple;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.ISeptuple;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.intf.tuples.ITriple;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * A immutable 7-tuple.
 *
 * @param <T1> the type of the first element of the septuple
 * @param <T2> the type of the second element of the septuple
 * @param <T3> the type of the third element of the septuple
 * @param <T4> the type of the fourth element of the septuple
 * @param <T5> the type of the fifth element of the septuple
 * @param <T6> the type of the sixth element of the septuple
 * @param <T7> the type of the seventh element of the septuple
 */
public class Septuple<T1, T2, T3, T4, T5, T6, T7> extends Tuple implements IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> {

    /**
     * The first element of the septuple.
     */
    final public T1 _1;

    /**
     * The second element of the septuple.
     */
    final public T2 _2;

    /**
     * The third element of the septuple.
     */
    final public T3 _3;

    /**
     * The fourth element of the septuple.
     */
    final public T4 _4;

    /**
     * The fifth element of the septuple.
     */
    final public T5 _5;

    /**
     * The sixth element of the septuple.
     */
    final public T6 _6;

    /**
     * The seventh element of the septuple.
     */
    final public T7 _7;

    /**
     * Constructs a immutable septuple.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     * @param _7 the seventh element
     */
    public Septuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
        this._7 = _7;
    }

    /**
     * Copy Constructor.
     *
     * @param septuple the septuple to copy
     */
    public Septuple(ISeptuple<T1, T2, T3, T4, T5, T6, T7> septuple) {
        this(Objects.requireNonNull(septuple)._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    @Override
    public T1 _1() {
        return this._1;
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> _1(T1 _1) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> first(T1 first) {
        return new Septuple<>(first, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public T2 _2() {
        return this._2;
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> _2(T2 _2) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> second(T2 second) {
        return new Septuple<>(_1, second, _3, _4, _5, _6, _7);
    }

    @Override
    public T3 _3() {
        return this._3;
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> _3(T3 _3) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> third(T3 third) {
        return new Septuple<>(_1, _2, third, _4, _5, _6, _7);
    }

    @Override
    public T4 _4() {
        return this._4;
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> _4(T4 _4) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> fourth(T4 fourth) {
        return new Septuple<>(_1, _2, _3, fourth, _5, _6, _7);
    }

    @Override
    public T5 _5() {
        return this._5;
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> _5(T5 _5) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> fifth(T5 fifth) {
        return new Septuple<>(_1, _2, _3, _4, fifth, _6, _7);
    }

    @Override
    public T6 _6() {
        return this._6;
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> _6(T6 _6) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> sixth(T6 sixth) {
        return new Septuple<>(_1, _2, _3, _4, _5, sixth, _7);
    }

    @Override
    public T7 _7() {
        return this._7;
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> _7(T7 _7) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> seventh(T7 seventh) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, seventh);
    }

    @Override
    public Septuple<T1, T2, T3, T4, T5, T6, T7> clone() {
        return new Septuple<>(this);
    }

    @Override
    public <T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(ISingle<T8> single) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, single._1());
    }

    @Override
    public <T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IPair<T8, T9> pair) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, pair._1(), pair._2());
    }

    @Override
    public <T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ITriple<T8, T9, T10> triple) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, triple._1(), triple._2(), triple._3());
    }

    @Override
    public <T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(T8 _8) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T8 _8, T9 _9) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T8 _8, T9 _9, T10 _10) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Returns a immutable septuple.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     * @param _7 the seventh element
     * @param <T1> the class of the first element
     * @param <T2> the class of the second element
     * @param <T3> the class of the third element
     * @param <T4> the class of the fourth element
     * @param <T5> the class of the fifth element
     * @param <T6> the class of the sixth element
     * @param <T7> the class of the seventh element
     * @return a {@code ImmutableSextuple}
     */
    public static <T1, T2, T3, T4, T5, T6, T7> Septuple<T1, T2, T3, T4, T5, T6, T7> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    /**
     * Create septuple from iterable.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param iterable the iterable by which the septuple will be filled
     * @param <T> the class of the objects in the iterable
     * @return a {@code ImmutableSextuple}
     */
    public static <T> Septuple<T, T, T, T, T, T, T> from(Iterable<T> iterable) {
        Iterator<T> iterator = Objects.requireNonNull(iterable).iterator();
        T _1 = iterator.hasNext() ? iterator.next() : null;
        T _2 = iterator.hasNext() ? iterator.next() : null;
        T _3 = iterator.hasNext() ? iterator.next() : null;
        T _4 = iterator.hasNext() ? iterator.next() : null;
        T _5 = iterator.hasNext() ? iterator.next() : null;
        T _6 = iterator.hasNext() ? iterator.next() : null;
        T _7 = iterator.hasNext() ? iterator.next() : null;
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    /**
     * Create septuple from array.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param array the array by which the septuple will be filled
     * @param <T> the class of the objects in the array
     * @return a {@code ImmutableSextuple}
     */
    public static <T> Septuple<T, T, T, T, T, T, T> from(T[] array) {
        return from(Arrays.asList(array));
    }

}
