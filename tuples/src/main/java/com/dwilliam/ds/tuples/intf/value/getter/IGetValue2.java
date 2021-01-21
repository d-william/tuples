package com.dwilliam.ds.tuples.intf.value.getter;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Marker interface for tuples.
 *
 * @param <T2> the type of the second element of the element
 */
public interface IGetValue2<T2> {

    /**
     * Gets the second element of the element.
     *
     * @return the second element of the element.
     */
    T2 _2();

    /**
     * Gets the second element of the element.
     *
     * @return the second element of the element.
     */
    default T2 second() {
        return _2();
    }

    /**
     * Performs the given action on the second element.
     *
     * @param action The action to be performed on the second element
     * @throws NullPointerException if the specified action is null
     */
    default void consume2(Consumer<? super T2> action) {
        Objects.requireNonNull(action).accept(_2());
    }

    /**
     * Returns this tuple, additionally performing the given action on the second element.
     *
     * @param action The action to be performed on the second element
     * @return this
     * @throws NullPointerException if the specified action is null
     */
    default IGetValue2<T2> peek2(Consumer<? super T2> action) {
        Objects.requireNonNull(action).accept(_2());
        return this;
    }

    /**
     * Returns whether the second element match the provided predicate.
     *
     * @param predicate The predicate to apply to the second element
     * @return {@code true} if the second element match the provided predicate, otherwise {@code false}
     * @throws NullPointerException if the specified predicate is null
     */
    default boolean match2(Predicate<? super T2> predicate) {
        return Objects.requireNonNull(predicate).test(_2());
    }

}
