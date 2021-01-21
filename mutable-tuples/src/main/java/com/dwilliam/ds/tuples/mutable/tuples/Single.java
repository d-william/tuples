package com.dwilliam.ds.tuples.mutable.tuples;

import com.dwilliam.ds.tuples.Tuple;
import com.dwilliam.ds.tuples.mutable.intf.tuples.*;
import com.dwilliam.ds.tuples.intf.tuples.*;

import java.util.*;

/**
 * A mutable 1-tuple.
 *
 * @param <T1> the type of the element of the array
 */
public class Single<T1> extends Tuple implements IMutableSingle<T1> {

    /**
     * The element of the array.
     */
    public T1 _1;

    /**
     * Constructs a mutable single.
     *
     * @param _1 the first element
     */
    public Single(T1 _1) {
        this._1 = _1;
    }

    /**
     * Copy Constructor.
     *
     * @param single the single to copy
     */
    public Single(ISingle<T1> single) {
        this(Objects.requireNonNull(single)._1());
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
    public Single<T1> clone() {
        return new Single<>(this);
    }

    @Override
    public <T2> Pair<T1, T2> append(ISingle<T2> single) {
        return new Pair<>(_1, single._1());
    }

    @Override
    public <T2, T3> Triple<T1, T2, T3> append(IPair<T2, T3> pair) {
        return new Triple<>(_1, pair._1(), pair._2());
    }

    @Override
    public <T2, T3, T4> Quad<T1, T2, T3, T4> append(ITriple<T2, T3, T4> triple) {
        return new Quad<>(_1, triple._1(), triple._2(), triple._3());
    }

    @Override
    public <T2, T3, T4, T5> Quint<T1, T2, T3, T4, T5> append(IQuad<T2, T3, T4, T5> quad) {
        return new Quint<>(_1, quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    public <T2, T3, T4, T5, T6> Sextuple<T1, T2, T3, T4, T5, T6> append(IQuint<T2, T3, T4, T5, T6> quint) {
        return new Sextuple<>(_1, quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    public <T2, T3, T4, T5, T6, T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(ISextuple<T2, T3, T4, T5, T6, T7> sextuple) {
        return new Septuple<>(_1, sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    public <T2, T3, T4, T5, T6, T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(ISeptuple<T2, T3, T4, T5, T6, T7, T8> septuple) {
        return new Octa<>(_1, septuple._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    @Override
    public <T2, T3, T4, T5, T6, T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IOcta<T2, T3, T4, T5, T6, T7, T8, T9> octa) {
        return new Nonuple<>(_1, octa._1(), octa._2(), octa._3(), octa._4(), octa._5(), octa._6(), octa._7(), octa._8());
    }

    @Override
    public <T2, T3, T4, T5, T6, T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(INonuple<T2, T3, T4, T5, T6, T7, T8, T9, T10> nonuple) {
        return new Decuple<>(_1, nonuple._1(), nonuple._2(), nonuple._3(), nonuple._4(), nonuple._5(), nonuple._6(), nonuple._7(), nonuple._8(), nonuple._9());
    }

    @Override
    public <T2> Pair<T1, T2> append(T2 _2) {
        return new Pair<>(_1, _2);
    }

    @Override
    public <T2, T3> Triple<T1, T2, T3> append(T2 _2, T3 _3) {
        return new Triple<>(_1, _2, _3);
    }

    @Override
    public <T2, T3, T4> Quad<T1, T2, T3, T4> append(T2 _2, T3 _3, T4 _4) {
        return new Quad<>(_1, _2, _3, _4);
    }

    @Override
    public <T2, T3, T4, T5> Quint<T1, T2, T3, T4, T5> append(T2 _2, T3 _3, T4 _4, T5 _5) {
        return new Quint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public <T2, T3, T4, T5, T6> Sextuple<T1, T2, T3, T4, T5, T6> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        return new Sextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public <T2, T3, T4, T5, T6, T7> Septuple<T1, T2, T3, T4, T5, T6, T7> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        return new Septuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T2, T3, T4, T5, T6, T7, T8> Octa<T1, T2, T3, T4, T5, T6, T7, T8> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return new Octa<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T2, T3, T4, T5, T6, T7, T8, T9> Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new Nonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T2, T3, T4, T5, T6, T7, T8, T9, T10> Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new Decuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    /**
     * Returns a mutable single.
     *
     * @param _1 the first element
     * @param <T1> the class of the first element
     * @return a {@code Single}
     */
    public static <T1> Single<T1> of(T1 _1) {
        return new Single<>(_1);
    }

    /**
     * Create single from iterable.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param iterable the iterable by which the single will be filled
     * @param <T> the class of the objects in the iterable
     * @return a {@code Single}
     */
    public static <T> Single<T> from(Iterable<T> iterable) {
        Iterator<T> iterator = Objects.requireNonNull(iterable).iterator();
        T _1 = iterator.hasNext() ? iterator.next() : null;
        return new Single<>(_1);
    }

    /**
     * Create single from array.
     * The excess elements are ignored.
     * The missing elements are filled by {@code null} values.
     *
     * @param array the array by which the single will be filled
     * @param <T> the class of the objects in the array
     * @return a {@code Single}
     */
    public static <T> Single<T> from(T[] array) {
        return from(Arrays.asList(array));
    }

}
