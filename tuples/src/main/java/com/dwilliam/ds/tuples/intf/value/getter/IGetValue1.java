package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T1> the type of the first element of the element
 */
public interface IGetValue1<T1> {

    /**
     * Gets the first element of the element.
     *
     * @return the first element of the element.
     */
    T1 _1();

    /**
     * Gets the first element of the element.
     *
     * @return the first element of the element.
     */
    default T1 first() {
        return _1();
    }

    /**
     * Performs the given action on the first element.
     *
     * @param action The action to be performed on the first element
     * @throws NullPointerException if the specified action is null
     */
    default void consume1(Consumer<? super T1> action) {
        Objects.requireNonNull(action).accept(_1());
    }

    /**
     * Returns this tuple, additionally performing the given action on the first element.
     *
     * @param action The action to be performed on the first element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue1<T1> peek1(Consumer<? super T1> action) {
        Objects.requireNonNull(action).accept(_1());
        return this;
    }

    /**
     * Returns whether the first element match the provided predicate.
     *
     * @param predicate The predicate to apply to the first element
     * @return {@code true} if the first element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match1(Predicate<? super T1> predicate) {
        return Objects.requireNonNull(predicate).test(_1());
    }

    // TODO T map1(Function<T1, T2> mapper) {} + javadoc + default ? + others (IGetValue2, ...)

}
