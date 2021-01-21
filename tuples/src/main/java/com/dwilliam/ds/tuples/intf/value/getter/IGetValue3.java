package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T3> the type of the third element of the element
 */
public interface IGetValue3<T3> {

    /**
     * Gets the third element of the element.
     *
     * @return the third element of the element.
     */
    T3 _3();

    /**
     * Gets the third element of the element.
     *
     * @return the third element of the element.
     */
    default T3 third() {
        return _3();
    }

    /**
     * Performs the given action on the third element.
     *
     * @param action The action to be performed on the third element
     * @throws NullPointerException if the specified action is null
     */
    default void consume3(Consumer<? super T3> action) {
        Objects.requireNonNull(action).accept(_3());
    }

    /**
     * Returns this tuple, additionally performing the given action on the third element.
     *
     * @param action The action to be performed on the third element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue3<T3> peek3(Consumer<? super T3> action) {
        Objects.requireNonNull(action).accept(_3());
        return this;
    }

    /**
     * Returns whether the third element match the provided predicate.
     *
     * @param predicate The predicate to apply to the third element
     * @return {@code true} if the third element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match3(Predicate<? super T3> predicate) {
        return Objects.requireNonNull(predicate).test(_3());
    }

}
