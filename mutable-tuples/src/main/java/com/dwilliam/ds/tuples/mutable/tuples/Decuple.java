package com.dwilliam.ds.tuples.mutable.tuples;

import com.dwilliam.ds.tuples.Tuple;
import com.dwilliam.ds.tuples.mutable.intf.tuples.IMutableDecuple;
import com.dwilliam.ds.tuples.intf.tuples.IDecuple;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * A mutable 10-tuple.
 *
 * @param <T1> the type of the first element of the array
 * @param <T2> the type of the second element of the array
 * @param <T3> the type of the third element of the array
 * @param <T4> the type of the fourth element of the array
 * @param <T5> the type of the fifth element of the array
 * @param <T6> the type of the sixth element of the array
 * @param <T7> the type of the seventh element of the array
 * @param <T8> the type of the eighth element of the array
 * @param <T9> the type of the ninth element of the array
 * @param <T10> the type of the tenth element of the array
 */
public class Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends Tuple implements IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {

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
     * The ninth element of the array.
     */
    public T9 _9;

    /**
     * The tenth element of the array.
     */
    public T10 _10;

    /**
     * Constructs a mutable decuple.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     * @param _7 the seventh element
     * @param _8 the eighth element
     * @param _9 the ninth element
     * @param _10 the tenth element
     */
    public Decuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
        this._6 = _6;
        this._7 = _7;
        this._8 = _8;
        this._9 = _9;
        this._10 = _10;
    }

    /**
     * Copy Constructor.
     *
     * @param decuple the decuple to copy
     */
    public Decuple(IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> decuple) {
        this(Objects.requireNonNull(decuple)._1(), decuple._2(), decuple._3(), decuple._4(), decuple._5(), decuple._6(), decuple._7(), decuple._8(), decuple._9(), decuple._10());
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
    public T9 _9() {
        return this._9;
    }

    @Override
    public void _9(T9 _9) {
        this._9 = _9;
    }

    @Override
    public void ninth(T9 ninth) {
        this._9 = ninth;
    }

    @Override
    public T10 _10() {
        return this._10;
    }

    @Override
    public void _10(T10 _10) {
        this._10 = _10;
    }

    @Override
    public void tenth(T10 tenth) {
        this._10 = tenth;
    }

    @Override
    public Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone() {
        return new Decuple<>(this);
    }

    /**
     * Returns a mutable decuple.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param _6 the sixth element
     * @param _7 the seventh element
     * @param _8 the eighth element
     * @param _9 the ninth element
     * @param _10 the tenth element
     * @param <T1> the class of the first element
     * @param <T2> the class of the second element
     * @param <T3> the class of the third element
     * @param <T4> the class of the fourth element
     * @param <T5> the class of the fifth element
     * @param <T6> the class of the sixth element
     * @param <T7> the class of the seventh element
     * @param <T8> the class of the eighth element
     * @param <T9> the class of the ninth element
     * @param <T10> the class of the tenth element
     * @return a {@code MutableDecuple}
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Create decuple from iterable.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param iterable the iterable by which the decuple will be filled
     * @param <T> the class of the objects in the iterable
     * @return a {@code MutableDecuple}
     */
    public static <T> Decuple<T, T, T, T, T, T, T, T, T, T> from(Iterable<T> iterable) {
        Iterator<T> iterator = Objects.requireNonNull(iterable).iterator();
        T _1 = iterator.hasNext() ? iterator.next() : null;
        T _2 = iterator.hasNext() ? iterator.next() : null;
        T _3 = iterator.hasNext() ? iterator.next() : null;
        T _4 = iterator.hasNext() ? iterator.next() : null;
        T _5 = iterator.hasNext() ? iterator.next() : null;
        T _6 = iterator.hasNext() ? iterator.next() : null;
        T _7 = iterator.hasNext() ? iterator.next() : null;
        T _8 = iterator.hasNext() ? iterator.next() : null;
        T _9 = iterator.hasNext() ? iterator.next() : null;
        T _10 = iterator.hasNext() ? iterator.next() : null;
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Create decuple from array.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param array the array by which the decuple will be filled
     * @param <T> the class of the objects in the array
     * @return a {@code MutableDecuple}
     */
    public static <T> Decuple<T, T, T, T, T, T, T, T, T, T> from(T[] array) {
        return from(Arrays.asList(array));
    }

}
