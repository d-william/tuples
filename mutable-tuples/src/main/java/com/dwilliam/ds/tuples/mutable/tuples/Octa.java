package com.dwilliam.ds.tuples.mutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.IOcta;
import com.dwilliam.ds.tuples.Tuple;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.mutable.intf.tuples.IMutableOcta;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * A mutable 8-tuple.
 *
 * @param <T1> the type of the first element of the array
 * @param <T2> the type of the second element of the array
 * @param <T3> the type of the third element of the array
 * @param <T4> the type of the fourth element of the array
 * @param <T5> the type of the fifth element of the array
 * @param <T6> the type of the sixth element of the array
 * @param <T7> the type of the seventh element of the array
 * @param <T8> the type of the eighth element of the array
 */
public class Octa<T1, T2, T3, T4, T5, T6, T7, T8> extends Tuple implements IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> {

    /**
     * The first element of the array.
     */
    public T1 _1;

    /**
     * The second element of the array.
     */
    public T2 _2;

    /**
     * The third element of the array.
     */
    public T3 _3;

    /**
     * The fourth element of the array.
     */
    public T4 _4;

    /**
     * The fifth element of the array.
     */
    public T5 _5;

    /**
     * The sixth element of the array.
     */
    public T6 _6;

    /**
     * The seventh element of the array.
     */
    public T7 _7;

    /**
     * The eighth element of the array.
     */
    public T8 _8;

    /**
     * Constructs a mutable octa.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     * @param _7 the seventh element
     * @param _8 the eighth element
     */
    public Octa(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
        this._7 = _7;
        this._8 = _8;
    }

    /**
     * Copy Constructor.
     *
     * @param octa the octa to copy
     */
    public Octa(IOcta<T1, T2, T3, T4, T5, T6, T7, T8> octa) {
        this(Objects.requireNonNull(octa)._1(), octa._2(), octa._3(), octa._4(), octa._5(), octa._6(), octa._7(), octa._8());
    }

    @Override
    public T1 _1() {
        return this._1;
    }

    @Override
    public void _1(T1 _1) {
        this._1 = _1;
    }

    @Override
    public void first(T1 first) {
        this._1 = first;
    }

    @Override
    public T2 _2() {
        return this._2;
    }

    @Override
    public void _2(T2 _2) {
        this._2 = _2;
    }

    @Override
    public void second(T2 second) {
        this._2 = second;
    }

    @Override
    public T3 _3() {
        return this._3;
    }

    @Override
    public void _3(T3 _3) {
        this._3 = _3;
    }

    @Override
    public void third(T3 third) {
        this._3 = third;
    }

    @Override
    public T4 _4() {
        return this._4;
    }

    @Override
    public void _4(T4 _4) {
        this._4 = _4;
    }

    @Override
    public void fourth(T4 fourth) {
        this._4 = fourth;
    }

    @Override
    public T5 _5() {
        return this._5;
    }

    @Override
    public void _5(T5 _5) {
        this._5 = _5;
    }

    @Override
    public void fifth(T5 fifth) {
        this._5 = fifth;
    }

    @Override
    public T6 _6() {
        return this._6;
    }

    @Override
    public void _6(T6 _6) {
        this._6 = _6;
    }

    @Override
    public void sixth(T6 sixth) {
        this._6 = sixth;
    }

    @Override
    public T7 _7() {
        return this._7;
    }

    @Override
    public void _7(T7 _7) {
        this._7 = _7;
    }

    @Override
    public void seventh(T7 seventh) {
        this._7 = seventh;
    }

    @Override
    public T8 _8() {
        return this._8;
    }

    @Override
    public void _8(T8 _8) {
        this._8 = _8;
    }

    @Override
    public void eighth(T8 eighth) {
        this._8 = eighth;
    }

    @Override
    public Octa<T1, T2, T3, T4, T5, T6, T7, T8> clone() {
        return new Octa<>(this);
    }

    @Override
    public <T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISingle<T9> single) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, single._1());
    }

    @Override
    public <T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IPair<T9, T10> pair) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, pair._1(), pair._2());
    }

    @Override
    public <T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T9 _9) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T9 _9, T10 _10) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Returns a mutable octa.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     * @param _7 the seventh element
     * @param _8 the eighth element
     * @param <T1> the class of the first element
     * @param <T2> the class of the second element
     * @param <T3> the class of the third element
     * @param <T4> the class of the fourth element
     * @param <T5> the class of the fifth element
     * @param <T6> the class of the sixth element
     * @param <T7> the class of the seventh element
     * @param <T8> the class of the eighth element
     * @return a {@code MutableOcta}
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    /**
     * Create octa from iterable.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param iterable the iterable by which the octa will be filled
     * @param <T> the class of the objects in the iterable
     * @return a {@code MutableOcta}
     */
    public static <T> Octa<T, T, T, T, T, T, T, T> from(Iterable<T> iterable) {
        Iterator<T> iterator = Objects.requireNonNull(iterable).iterator();
        T _1 = iterator.hasNext() ? iterator.next() : null;
        T _2 = iterator.hasNext() ? iterator.next() : null;
        T _3 = iterator.hasNext() ? iterator.next() : null;
        T _4 = iterator.hasNext() ? iterator.next() : null;
        T _5 = iterator.hasNext() ? iterator.next() : null;
        T _6 = iterator.hasNext() ? iterator.next() : null;
        T _7 = iterator.hasNext() ? iterator.next() : null;
        T _8 = iterator.hasNext() ? iterator.next() : null;
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    /**
     * Create octa from array.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param array the array by which the octa will be filled
     * @param <T> the class of the objects in the array
     * @return a {@code MutableOcta}
     */
    public static <T> Octa<T, T, T, T, T, T, T, T> from(T[] array) {
        return from(Arrays.asList(array));
    }

}
