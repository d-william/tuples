package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T7> the type of the seventh element of the element
 */
public interface IGetValue7<T7> {

    /**
     * Gets the seventh element of the element.
     *
     * @return the seventh element of the element.
     */
    T7 _7();

    /**
     * Gets the seventh element of the element.
     *
     * @return the seventh element of the element.
     */
    default T7 seventh() {
        return _7();
    }

    /**
     * Performs the given action on the seventh element.
     *
     * @param action The action to be performed on the seventh element
     * @throws NullPointerException if the specified action is null
     */
    default void consume7(Consumer<? super T7> action) {
        Objects.requireNonNull(action).accept(_7());
    }

    /**
     * Returns this tuple, additionally performing the given action on the seventh element.
     *
     * @param action The action to be performed on the seventh element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue7<T7> peek7(Consumer<? super T7> action) {
        Objects.requireNonNull(action).accept(_7());
        return this;
    }

    /**
     * Returns whether the seventh element match the provided predicate.
     *
     * @param predicate The predicate to apply to the seventh element
     * @return {@code true} if the seventh element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match7(Predicate<? super T7> predicate) {
        return Objects.requireNonNull(predicate).test(_7());
    }

}
