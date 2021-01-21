package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T9> the type of the ninth element of the element
 */
public interface IGetValue9<T9> {

    /**
     * Gets the ninth element of the element.
     *
     * @return the ninth element of the element.
     */
    T9 _9();

    /**
     * Gets the ninth element of the element.
     *
     * @return the ninth element of the element.
     */
    default T9 ninth() {
        return _9();
    }

    /**
     * Performs the given action on the ninth element.
     *
     * @param action The action to be performed on the ninth element
     * @throws NullPointerException if the specified action is null
     */
    default void consume9(Consumer<? super T9> action) {
        Objects.requireNonNull(action).accept(_9());
    }

    /**
     * Returns this tuple, additionally performing the given action on the ninth element.
     *
     * @param action The action to be performed on the ninth element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue9<T9> peek9(Consumer<? super T9> action) {
        Objects.requireNonNull(action).accept(_9());
        return this;
    }

    /**
     * Returns whether the ninth element match the provided predicate.
     *
     * @param predicate The predicate to apply to the ninth element
     * @return {@code true} if the ninth element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match9(Predicate<? super T9> predicate) {
        return Objects.requireNonNull(predicate).test(_9());
    }

}
