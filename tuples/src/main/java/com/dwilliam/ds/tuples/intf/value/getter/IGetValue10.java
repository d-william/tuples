package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T10> the type of the tenth element of the element
 */
public interface IGetValue10<T10> {

    /**
     * Gets the tenth element of the element.
     *
     * @return the tenth element of the element.
     */
    T10 _10();

    /**
     * Gets the tenth element of the element.
     *
     * @return the tenth element of the element.
     */
    default T10 tenth() {
        return _10();
    }

    /**
     * Performs the given action on the tenth element.
     *
     * @param action The action to be performed on the tenth element
     * @throws NullPointerException if the specified action is null
     */
    default void consume10(Consumer<? super T10> action) {
        Objects.requireNonNull(action).accept(_10());
    }

    /**
     * Returns this tuple, additionally performing the given action on the tenth element.
     *
     * @param action The action to be performed on the tenth element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue10<T10> peek10(Consumer<? super T10> action) {
        Objects.requireNonNull(action).accept(_10());
        return this;
    }

    /**
     * Returns whether the tenth element match the provided predicate.
     *
     * @param predicate The predicate to apply to the tenth element
     * @return {@code true} if the tenth element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match10(Predicate<? super T10> predicate) {
        return Objects.requireNonNull(predicate).test(_10());
    }

}
