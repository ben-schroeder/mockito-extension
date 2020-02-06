package eu.benschroeder.mockito;

import org.mockito.BDDMockito;
import org.mockito.stubbing.Answer;

/**
 * Mockito {@link BDDMockito} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 * and https://github.com/szpak/mockito-java8
 *
 * @author Benjamin Schröder
 */
public interface WithBDDMockito extends WithMockito {

    /**
     * @see BDDMockito#given(T)
     */
    default <T> BDDMockito.BDDMyOngoingStubbing<T> given(final T methodCall) {
        return BDDMockito.given(methodCall);
    }

    /**
     * @see BDDMockito#then(T)
     */
    default <T> BDDMockito.Then<T> then(final T mock) {
        return BDDMockito.then(mock);
    }

    /**
     * @see BDDMockito#willThrow(Throwable...)
     */
    default BDDMockito.BDDStubber willThrow(final Throwable... toBeThrown) {
        return BDDMockito.willThrow(toBeThrown);
    }

    /**
     * @see BDDMockito#willThrow(Class)
     */
    default BDDMockito.BDDStubber willThrow(final Class<? extends Throwable> toBeThrown) {
        return BDDMockito.willThrow(toBeThrown);
    }

    /**
     * @see BDDMockito#willThrow(Class, Class[])
     */
    default BDDMockito.BDDStubber willThrow(final Class<? extends Throwable> toBeThrown, final Class<? extends Throwable>... throwableTypes) {
        return BDDMockito.willThrow(toBeThrown, throwableTypes);
    }

    /**
     * @see BDDMockito#willAnswer(Answer)
     */
    default BDDMockito.BDDStubber willAnswer(final Answer<?> answer) {
        return BDDMockito.willAnswer(answer);
    }

    /**
     * @see BDDMockito#will(Answer)
     */
    default BDDMockito.BDDStubber will(final Answer<?> answer) {
        return BDDMockito.will(answer);
    }

    /**
     * @see BDDMockito#willDoNothing()
     */
    default BDDMockito.BDDStubber willDoNothing() {
        return BDDMockito.willDoNothing();
    }

    /**
     * @see BDDMockito#willReturn(Object)
     */
    default BDDMockito.BDDStubber willReturn(final Object toBeReturned) {
        return BDDMockito.willReturn(toBeReturned);
    }

    /**
     * @see BDDMockito#willReturn(Object, Object...)
     */
    @SuppressWarnings({"unchecked", "varargs"})
    default BDDMockito.BDDStubber willReturn(final Object toBeReturned, final Object... toBeReturnedNext) {
        return BDDMockito.willReturn(toBeReturned, toBeReturnedNext);
    }

    /**
     * @see BDDMockito#willCallRealMethod()
     */
    default BDDMockito.BDDStubber willCallRealMethod() {
        return BDDMockito.willCallRealMethod();
    }

}
