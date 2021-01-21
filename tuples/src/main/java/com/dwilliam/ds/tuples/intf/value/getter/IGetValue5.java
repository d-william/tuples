package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T5> the type of the fifth element of the element
 */
public interface IGetValue5<T5> {

    /**
     * Gets the fifth element of the element.
     *
     * @return the fifth element of the element.
     */
    T5 _5();

    /**
     * Gets the fifth element of the element.
     *
     * @return the fifth element of the element.
     */
    default T5 fifth() {
        return _5();
    }

    /**
     * Performs the given action on the fifth element.
     *
     * @param action The action to be performed on the fifth element
     * @throws NullPointerException if the specified action is null
     */
    default void consume5(Consumer<? super T5> action) {
        Objects.requireNonNull(action).accept(_5());
    }

    /**
     * Returns this tuple, additionally performing the given action on the fifth element.
     *
     * @param action The action to be performed on the fifth element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue5<T5> peek5(Consumer<? super T5> action) {
        Objects.requireNonNull(action).accept(_5());
        return this;
    }

    /**
     * Returns whether the fifth element match the provided predicate.
     *
     * @param predicate The predicate to apply to the fifth element
     * @return {@code true} if the fifth element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match5(Predicate<? super T5> predicate) {
        return Objects.requireNonNull(predicate).test(_5());
    }

}
