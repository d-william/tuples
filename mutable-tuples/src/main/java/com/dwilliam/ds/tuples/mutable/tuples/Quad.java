package com.dwilliam.ds.tuples.mutable.tuples;

import com.dwilliam.ds.tuples.Tuple;
import com.dwilliam.ds.tuples.mutable.intf.tuples.*;
import com.dwilliam.ds.tuples.intf.tuples.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * A mutable 4-tuple.
 *
 * @param <T1> the type of the first element of the array
 * @param <T2> the type of the second element of the array
 * @param <T3> the type of the third element of the array
 * @param <T4> the type of the fourth element of the array
 */
public class Quad<T1, T2, T3, T4> extends Tuple implements IMutableQuad<T1, T2, T3, T4> {

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
     * Constructs a mutable quad.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     */
    public Quad(T1 _1, T2 _2, T3 _3, T4 _4) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
    }

    /**
     * Copy Constructor.
     *
     * @param quad the quad to copy
     */
    public Quad(IQuad<T1, T2, T3, T4> quad) {
        this(Objects.requireNonNull(quad)._1(), quad._2(), quad._3(), quad._4());
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
    public Quad<T1, T2, T3, T4> clone() {
        return new Quad<>(this);
    }

    @Override
    public <T5> Quint<T1, T2, T3, T4, T5> append(ISingle<T5> single) {
        return new Quint<>(_1, _2, _3, _4, single._1());
    }

    @Override
    public <T5, T6> Sextuple<T1, T2, T3, T4, T5, T6> append(IPair<T5, T6> pair) {
        return new Sextuple<>(_1, _2, _3, _4, pair._1(), pair._2());
    }

    @Override
    public <T5, T6, T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(ITriple<T5, T6, T7> triple) {
        return new Septuple<>(_1, _2, _3, _4, triple._1(), triple._2(), triple._3());
    }

    @Override
    public <T5, T6, T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(IQuad<T5, T6, T7, T8> quad) {
        return new Octa<>(_1, _2, _3, _4, quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    public <T5, T6, T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IQuint<T5, T6, T7, T8, T9> quint) {
        return new Nonuple<>(_1, _2, _3, _4, quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    public <T5, T6, T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ISextuple<T5, T6, T7, T8, T9, T10> sextuple) {
        return new Decuple<>(_1, _2, _3, _4, sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    public <T5> Quint<T1, T2, T3, T4, T5> append(T5 _5) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public <T5, T6> Sextuple<T1, T2, T3, T4, T5, T6> append(T5 _5, T6 _6) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public <T5, T6, T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(T5 _5, T6 _6, T7 _7) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T5, T6, T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(T5 _5, T6 _6, T7 _7, T8 _8) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T5, T6, T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T5, T6, T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Returns a mutable quad.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param <T1> the class of the first element
     * @param <T2> the class of the second element
     * @param <T3> the class of the third element
     * @param <T4> the class of the fourth element
     * @return a {@code Quad}
     */
    public static <T1, T2, T3, T4> Quad<T1, T2, T3, T4> of(T1 _1, T2 _2, T3 _3, T4 _4) {
        return new Quad<>(_1, _2, _3, _4);
    }

    /**
     * Create quad from iterable.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param iterable the iterable by which the quad will be filled
     * @param <T> the class of the objects in the iterable
     * @return a {@code Quad}
     */
    public static <T> Quad<T, T, T, T> from(Iterable<T> iterable) {
        Iterator<T> iterator = Objects.requireNonNull(iterable).iterator();
        T _1 = iterator.hasNext() ? iterator.next() : null;
        T _2 = iterator.hasNext() ? iterator.next() : null;
        T _3 = iterator.hasNext() ? iterator.next() : null;
        T _4 = iterator.hasNext() ? iterator.next() : null;
        return new Quad<>(_1, _2, _3, _4);
    }

    /**
     * Create quad from array.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param array the array by which the quad will be filled
     * @param <T> the class of the objects in the array
     * @return a {@code Quad}
     */
    public static <T> Quad<T, T, T, T> from(T[] array) {
        return from(Arrays.asList(array));
    }

}
