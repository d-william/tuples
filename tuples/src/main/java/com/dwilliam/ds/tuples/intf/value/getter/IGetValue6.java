package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T6> the type of the sixth element of the element
 */
public interface IGetValue6<T6> {

    /**
     * Gets the sixth element of the element.
     *
     * @return the sixth element of the element.
     */
    T6 _6();

    /**
     * Gets the sixth element of the element.
     *
     * @return the sixth element of the element.
     */
    default T6 sixth() {
        return _6();
    }

    /**
     * Performs the given action on the sixth element.
     *
     * @param action The action to be performed on the sixth element
     * @throws NullPointerException if the specified action is null
     */
    default void consume6(Consumer<? super T6> action) {
        Objects.requireNonNull(action).accept(_6());
    }

    /**
     * Returns this tuple, additionally performing the given action on the sixth element.
     *
     * @param action The action to be performed on the sixth element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue6<T6> peek6(Consumer<? super T6> action) {
        Objects.requireNonNull(action).accept(_6());
        return this;
    }

    /**
     * Returns whether the sixth element match the provided predicate.
     *
     * @param predicate The predicate to apply to the sixth element
     * @return {@code true} if the sixth element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match6(Predicate<? super T6> predicate) {
        return Objects.requireNonNull(predicate).test(_6());
    }

}
