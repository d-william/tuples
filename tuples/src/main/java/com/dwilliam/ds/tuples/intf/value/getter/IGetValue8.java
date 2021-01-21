package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T8> the type of the eighth element of the element
 */
public interface IGetValue8<T8> {

    /**
     * Gets the eighth element of the element.
     *
     * @return the eighth element of the element.
     */
    T8 _8();

    /**
     * Gets the eighth element of the element.
     *
     * @return the eighth element of the element.
     */
    default T8 eighth() {
        return _8();
    }

    /**
     * Performs the given action on the eighth element.
     *
     * @param action The action to be performed on the eighth element
     * @throws NullPointerException if the specified action is null
     */
    default void consume8(Consumer<? super T8> action) {
        Objects.requireNonNull(action).accept(_8());
    }

    /**
     * Returns this tuple, additionally performing the given action on the eighth element.
     *
     * @param action The action to be performed on the eighth element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue8<T8> peek8(Consumer<? super T8> action) {
        Objects.requireNonNull(action).accept(_8());
        return this;
    }

    /**
     * Returns whether the eighth element match the provided predicate.
     *
     * @param predicate The predicate to apply to the eighth element
     * @return {@code true} if the eighth element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match8(Predicate<? super T8> predicate) {
        return Objects.requireNonNull(predicate).test(_8());
    }

}
