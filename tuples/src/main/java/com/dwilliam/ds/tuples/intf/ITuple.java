package com.dwilliam.ds.tuples.intf;

import java.util.*;
import java.util.stream.Stream;

public interface ITuple extends Iterable<Object>, Cloneable {

    /**
     * Returns an array containing elements of this tuple in order.
     * The elements are of type {@code Object}.
     *
     * Must not return a {@code null} value.
     *
     * @return the array containing elements of this tuple.
     */
    Object[] toArray();

    /**
     * Returns a list containing elements of this tuple in order.
     * The elements are of type {@code Object}.
     *
     * @return the list containing elements of this tuple.
     */
    default List<Object> toList() {
        return Arrays.asList(toArray());
    }

    /**
     * Returns an iterator over elements of this tuple.
     * The elements are of type {@code Object}.
     *
     * @return an {@code Iterator}.
     */
    @Override
    default Iterator<Object> iterator() {
        return toList().iterator();
    }

    /**
     * Createss a copy of this tuple.
     *
     * @return a clone of this instance.
     */
    ITuple clone();

    /**
     * Returns a list iterator over elements of this tuple.
     * The elements are of type {@code Object}.
     *
     * @return an {@code ListIterator}.
     */
    default ListIterator<Object> listIterator() {
        return toList().listIterator();
    }

    /**
     * Returns a list iterator over elements of this tuple, starting at the specified position
     * The elements are of type {@code Object}.
     *
     * @return an {@code ListIterator}.
     * @throws IndexOutOfBoundsException if the position is out of range
     *         ({@code position < 0 || position > size()})
     */
    default ListIterator<Object> listIterator(int position) {
        return toList().listIterator(position);
    }

    /**
     * Returns a sequential {@code Stream} with elements of this tuple as its source.
     *
     * @return a {@code Stream}
     */
    default Stream<Object> stream() {
        return toList().stream();
    }

    /**
     * Returns the number of elements in this tuple.
     *
     * @return the number of elements in this tuple
     */
    default int length() {
        return toArray().length;
    }

    /**
     * Returns the number of elements in this tuple.
     *
     * @return the number of elements in this tuple
     */
    default int size() {
        return toArray().length;
    }

    /**
     * Returns {@code true} if this tuple contains the specified element.
     * More formally, returns {@code true} if and only if this tuple
     * contains at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param o element whose presence in this tuple is to be tested
     * @return {@code true} if this tuple contains the specified element
     */
    default boolean contains(Object o) {
        return toList().contains(o);
    }

    /**
     * Returns {@code true} if this tuple contains all of the elements of the
     * specified collection.
     *
     * @param  c collection to be checked for containment in this tuple
     * @return {@code true} if this tuple contains all of the elements of the
     *         specified collection
     * @throws NullPointerException if the specified collection is null
     * @see #contains(Object)
     */
    default boolean containsAll(Collection<?> c) {
        return toList().containsAll(c);
    }

    /**
     * Returns {@code true} if this tuple contains all of the elements of the
     * specified array.
     *
     * @param  objects array to be checked for containment in this tuple
     * @return {@code true} if this tuple contains all of the elements of the
     *         specified array
     * @throws NullPointerException if the specified array is null
     * @see #contains(Object)
     */
    default boolean containsAll(Object ... objects) {
        return toList().containsAll(Arrays.asList(objects));
    }

    /**
     * Returns {@code true} if all elements of this tuple are equals between them.
     *
     * @return {@code true} iif all elements of this tuple are equals between them.
     */
    default boolean allEquals() {
        List<Object> values = toList();
        return values.isEmpty() || Collections.frequency(values, values.get(0)) == values.size();
    }

    /**
     * Returns the element at the specified position in this tuple.
     *
     * @param position position of the element to return
     * @return the element at the specified position in this tuple
     * @throws IndexOutOfBoundsException if the position is out of range
     *         ({@code position < 0 || position >= size()})
     */
    default Object get(int position) {
        return toArray()[position];
    }

    /**
     * Returns the position of the first occurrence of the specified element
     * in this tuple, or -1 if this tuple does not contain the element.
     * More formally, returns the lowest position {@code i} such that
     * {@code Objects.equals(o, get(i))},
     * or -1 if there is no such position.
     *
     * @param o element to search for
     * @return the position of the first occurrence of the specified element in
     *         this tuple, or -1 if this tuple does not contain the element
     */
    default int indexOf(Object o) {
        return toList().indexOf(o);
    }

    /**
     * Returns the position of the last occurrence of the specified element
     * in this tuple, or -1 if this tuple does not contain the element.
     * More formally, returns the highest position {@code i} such that
     * {@code Objects.equals(o, get(i))},
     * or -1 if there is no such position.
     *
     * @param o element to search for
     * @return the position of the last occurrence of the specified element in
     *         this tuple, or -1 if this tuple does not contain the element
     */
    default int lastIndexOf(Object o) {
        return toList().lastIndexOf(o);
    }

}
