package com.dwilliam.ds.tuples.immutable.tuples;

import com.dwilliam.ds.tuples.Tuple;
import com.dwilliam.ds.tuples.immutable.intf.tuples.*;
import com.dwilliam.ds.tuples.intf.tuples.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * A immutable 6-tuple.
 *
 * @param <T1> the type of the first element of the sextuple
 * @param <T2> the type of the second element of the sextuple
 * @param <T3> the type of the third element of the sextuple
 * @param <T4> the type of the fourth element of the sextuple
 * @param <T5> the type of the fifth element of the sextuple
 * @param <T6> the type of the sixth element of the sextuple
 */
public class Sextuple<T1, T2, T3, T4, T5, T6> extends Tuple implements IImmutableSextuple<T1, T2, T3, T4, T5, T6> {

    /**
     * The first element of the sextuple.
     */
    final public T1 _1;

    /**
     * The second element of the sextuple.
     */
    final public T2 _2;

    /**
     * The third element of the sextuple.
     */
    final public T3 _3;

    /**
     * The fourth element of the sextuple.
     */
    final public T4 _4;

    /**
     * The fifth element of the sextuple.
     */
    final public T5 _5;

    /**
     * The sixth element of the sextuple.
     */
    final public T6 _6;

    /**
     * Constructs a immutable sextuple.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     */
    public Sextuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
    }

    /**
     * Copy Constructor.
     *
     * @param sextuple the sextuple to copy
     */
    public Sextuple(ISextuple<T1, T2, T3, T4, T5, T6> sextuple) {
        this(Objects.requireNonNull(sextuple)._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    public T1 _1() {
        return this._1;
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> _1(T1 _1) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> first(T1 first) {
        return new Sextuple<>(first, _2, _3, _4, _5, _6);
    }

    @Override
    public T2 _2() {
        return this._2;
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> _2(T2 _2) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> second(T2 second) {
        return new Sextuple<>(_1, second, _3, _4, _5, _6);
    }

    @Override
    public T3 _3() {
        return this._3;
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> _3(T3 _3) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> third(T3 third) {
        return new Sextuple<>(_1, _2, third, _4, _5, _6);
    }

    @Override
    public T4 _4() {
        return this._4;
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> _4(T4 _4) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> fourth(T4 fourth) {
        return new Sextuple<>(_1, _2, _3, fourth, _5, _6);
    }

    @Override
    public T5 _5() {
        return this._5;
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> _5(T5 _5) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> fifth(T5 fifth) {
        return new Sextuple<>(_1, _2, _3, _4, fifth, _6);
    }

    @Override
    public T6 _6() {
        return this._6;
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> _6(T6 _6) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> sixth(T6 sixth) {
        return new Sextuple<>(_1, _2, _3, _4, _5, sixth);
    }

    @Override
    public Sextuple<T1, T2, T3, T4, T5, T6> clone() {
        return new Sextuple<>(this);
    }

    @Override
    public <T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(ISingle<T7> single) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, single._1());
    }

    @Override
    public <T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(IPair<T7, T8> pair) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, pair._1(), pair._2());
    }

    @Override
    public <T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ITriple<T7, T8, T9> triple) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, triple._1(), triple._2(), triple._3());
    }

    @Override
    public <T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IQuad<T7, T8, T9, T10> quad) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    public <T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(T7 _7) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(T7 _7, T8 _8) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T7 _7, T8 _8, T9 _9) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T7 _7, T8 _8, T9 _9, T10 _10) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Returns a immutable sextuple.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     * @param <T1> the class of the first element
     * @param <T2> the class of the second element
     * @param <T3> the class of the third element
     * @param <T4> the class of the fourth element
     * @param <T5> the class of the fifth element
     * @param <T6> the class of the sixth element
     * @return a {@code ImmutableSextuple}
     */
    public static <T1, T2, T3, T4, T5, T6> Sextuple<T1, T2, T3, T4, T5, T6> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    /**
     * Create sextuple from iterable.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param iterable the iterable by which the sextuple will be filled
     * @param <T> the class of the objects in the iterable
     * @return a {@code ImmutableSextuple}
     */
    public static <T> Sextuple<T, T, T, T, T, T> from(Iterable<T> iterable) {
        Iterator<T> iterator = Objects.requireNonNull(iterable).iterator();
        T _1 = iterator.hasNext() ? iterator.next() : null;
        T _2 = iterator.hasNext() ? iterator.next() : null;
        T _3 = iterator.hasNext() ? iterator.next() : null;
        T _4 = iterator.hasNext() ? iterator.next() : null;
        T _5 = iterator.hasNext() ? iterator.next() : null;
        T _6 = iterator.hasNext() ? iterator.next() : null;
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    /**
     * Create sextuple from array.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param array the array by which the sextuple will be filled
     * @param <T> the class of the objects in the array
     * @return a {@code ImmutableSextuple}
     */
    public static <T> Sextuple<T, T, T, T, T, T> from(T[] array) {
        return from(Arrays.asList(array));
    }

}
