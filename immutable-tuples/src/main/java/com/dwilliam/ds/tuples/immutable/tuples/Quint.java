package com.dwilliam.ds.tuples.immutable.tuples;

import com.dwilliam.ds.tuples.Tuple;
import com.dwilliam.ds.tuples.immutable.intf.tuples.*;
import com.dwilliam.ds.tuples.intf.tuples.*;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * A immutable 5-tuple.
 *
 * @param <T1> the type of the first element of the array
 * @param <T2> the type of the second element of the array
 * @param <T3> the type of the third element of the array
 * @param <T4> the type of the fourth element of the array
 * @param <T5> the type of the fifth element of the array
 */
public class Quint<T1, T2, T3, T4, T5> extends Tuple implements IImmutableQuint<T1, T2, T3, T4, T5> {

    /**
     * The first element of the array.
     */
    final public T1 _1;

    /**
     * The second element of the array.
     */
    final public T2 _2;

    /**
     * The third element of the array.
     */
    final public T3 _3;

    /**
     * The fourth element of the array.
     */
    final public T4 _4;

    /**
     * The fifth element of the array.
     */
    final public T5 _5;

    /**
     * Constructs a immutable quint.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     */
    public Quint(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
        this._4 = _4;
        this._5 = _5;
    }

    /**
     * Copy Constructor.
     *
     * @param quint the quint to copy
     */
    public Quint(IQuint<T1, T2, T3, T4, T5> quint) {
        this(Objects.requireNonNull(quint)._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    public T1 _1() {
        return this._1;
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> _1(T1 _1) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> first(T1 first) {
        return new Quint<>(first, _2, _3, _4, _5);
    }

    @Override
    public T2 _2() {
        return this._2;
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> _2(T2 _2) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> second(T2 second) {
        return new Quint<>(_1, second, _3, _4, _5);
    }

    @Override
    public T3 _3() {
        return this._3;
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> _3(T3 _3) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> third(T3 third) {
        return new Quint<>(_1, _2, third, _4, _5);
    }

    @Override
    public T4 _4() {
        return this._4;
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> _4(T4 _4) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> fourth(T4 fourth) {
        return new Quint<>(_1, _2, _3, fourth, _5);
    }

    @Override
    public T5 _5() {
        return this._5;
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> _5(T5 _5) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> fifth(T5 fifth) {
        return new Quint<>(_1, _2, _3, _4, fifth);
    }

    @Override
    public Quint<T1, T2, T3, T4, T5> clone() {
        return new Quint<>(this);
    }

    @Override
    public <T6> Sextuple<T1, T2, T3, T4, T5, T6> append(ISingle<T6> single) {
        return new Sextuple<>(_1, _2, _3, _4, _5, single._1());
    }

    @Override
    public <T6, T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(IPair<T6, T7> pair) {
        return new Septuple<>(_1, _2, _3, _4, _5, pair._1(), pair._2());
    }

    @Override
    public <T6, T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(ITriple<T6, T7, T8> triple) {
        return new Octa<>(_1, _2, _3, _4, _5, triple._1(), triple._2(), triple._3());
    }

    @Override
    public <T6, T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IQuad<T6, T7, T8, T9> quad) {
        return new Nonuple<>(_1, _2, _3, _4, _5, quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    public <T6, T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IQuint<T6, T7, T8, T9, T10> quint) {
        return new Decuple<>(_1, _2, _3, _4, _5, quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    public <T6> Sextuple<T1, T2, T3, T4, T5, T6> append(T6 _6) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public <T6, T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(T6 _6, T7 _7) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T6, T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(T6 _6, T7 _7, T8 _8) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T6, T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T6 _6, T7 _7, T8 _8, T9 _9) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T6, T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Returns a immutable quint.
     *
     * @param _1 the first element
     * @param _2 the second element
     * @param _3 the third element
     * @param _4 the fourth element
     * @param _5 the fifth element
     * @param <T1> the class of the first element
     * @param <T2> the class of the second element
     * @param <T3> the class of the third element
     * @param <T4> the class of the fourth element
     * @param <T5> the class of the fifth element
     * @return a {@code ImmutableQuint}
     */
    public static <T1, T2, T3, T4, T5> Quint<T1, T2, T3, T4, T5> of(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    /**
     * Create quint from iterable.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param iterable the iterable by which the quint will be filled
     * @param <T> the class of the objects in the iterable
     * @return a {@code ImmutableQuint}
     */
    public static <T> Quint<T, T, T, T, T> from(Iterable<T> iterable) {
        Iterator<T> iterator = Objects.requireNonNull(iterable).iterator();
        T _1 = iterator.hasNext() ? iterator.next() : null;
        T _2 = iterator.hasNext() ? iterator.next() : null;
        T _3 = iterator.hasNext() ? iterator.next() : null;
        T _4 = iterator.hasNext() ? iterator.next() : null;
        T _5 = iterator.hasNext() ? iterator.next() : null;
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    /**
     * Create quint from array.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param array the array by which the quint will be filled
     * @param <T> the class of the objects in the array
     * @return a {@code ImmutableQuint}
     */
    public static <T> Quint<T, T, T, T, T> from(T[] array) {
        return from(Arrays.asList(array));
    }
    
}
