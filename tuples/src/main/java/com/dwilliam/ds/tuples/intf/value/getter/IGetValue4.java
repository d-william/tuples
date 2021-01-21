package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T4> the type of the fourth element of the element
 */
public interface IGetValue4<T4> {

    /**
     * Gets the fourth element of the element.
     *
     * @return the fourth element of the element.
     */
    T4 _4();

    /**
     * Gets the fourth element of the element.
     *
     * @return the fourth element of the element.
     */
    default T4 fourth() {
        return _4();
    }

    /**
     * Performs the given action on the fourth element.
     *
     * @param action The action to be performed on the fourth element
     * @throws NullPointerException if the specified action is null
     */
    default void consume4(Consumer<? super T4> action) {
        Objects.requireNonNull(action).accept(_4());
    }

    /**
     * Returns this tuple, additionally performing the given action on the fourth element.
     *
     * @param action The action to be performed on the fourth element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue4<T4> peek4(Consumer<? super T4> action) {
        Objects.requireNonNull(action).accept(_4());
        return this;
    }

    /**
     * Returns whether the fourth element match the provided predicate.
     *
     * @param predicate The predicate to apply to the fourth element
     * @return {@code true} if the fourth element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match4(Predicate<? super T4> predicate) {
        return Objects.requireNonNull(predicate).test(_4());
    }

}
