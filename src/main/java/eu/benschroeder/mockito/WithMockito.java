package eu.benschroeder.mockito;

import org.mockito.CheckReturnValue;
import org.mockito.InOrder;
import org.mockito.Incubating;
import org.mockito.MockSettings;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;
import org.mockito.MockingDetails;
import org.mockito.Mockito;
import org.mockito.MockitoFramework;
import org.mockito.session.MockitoSessionBuilder;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.LenientStubber;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.verification.VerificationAfterDelay;
import org.mockito.verification.VerificationMode;
import org.mockito.verification.VerificationWithTimeout;

import java.util.function.Function;

/**
 * {@link Mockito} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 * and https://github.com/szpak/mockito-java8
 *
 * @author Benjamin Schröder
 */
public interface WithMockito extends WithArgumentMatchers {

    /**
     * @see Mockito#mock(Class)
     */
    @CheckReturnValue
    default <T> T mock(final Class<T> classToMock) {
        return Mockito.mock(classToMock);
    }

    /**
     * @see Mockito#mock(Class, String)
     */
    @CheckReturnValue
    default <T> T mock(final Class<T> classToMock, final String name) {
        return Mockito.mock(classToMock, name);
    }

    /**
     * @see Mockito#mockingDetails(Object)
     */
    @CheckReturnValue
    default MockingDetails mockingDetails(final Object toInspect) {
        return Mockito.mockingDetails(toInspect);
    }

    /**
     * @see Mockito#mock(Class, Answer)
     */
    @CheckReturnValue
    default <T> T mock(final Class<T> classToMock, final Answer defaultAnswer) {
        return Mockito.mock(classToMock, defaultAnswer);
    }

    /**
     * @see Mockito#mock(Class, MockSettings)
     */
    @CheckReturnValue
    default <T> T mock(final Class<T> classToMock, final MockSettings mockSettings) {
        return Mockito.mock(classToMock, mockSettings);
    }

    /**
     * @see Mockito#spy(T)
     */
    @CheckReturnValue
    default <T> T spy(final T object) {
        return Mockito.spy(object);
    }

    /**
     * @see Mockito#spy(Class)
     */
    @Incubating
    @CheckReturnValue
    default <T> T spy(final Class<T> classToSpy) {
        return Mockito.spy(classToSpy);
    }

    /**
     * @see Mockito#mockStatic(Class)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedStatic<T> mockStatic(final Class<T> classToMock) {
        return Mockito.mockStatic(classToMock);
    }

    /**
     * @see Mockito#mockStatic(Class, Answer)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedStatic<T> mockStatic(final Class<T> classToMock, final Answer defaultAnswer) {
        return Mockito.mockStatic(classToMock, defaultAnswer);
    }

    /**
     * @see Mockito#mockStatic(Class, String)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedStatic<T> mockStatic(final Class<T> classToMock, final String name) {
        return Mockito.mockStatic(classToMock, name);
    }

    /**
     * @see Mockito#mockStatic(Class, MockSettings)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedStatic<T> mockStatic(final Class<T> classToMock, final MockSettings mockSettings) {
        return Mockito.mockStatic(classToMock, mockSettings);
    }

    /**
     * @see Mockito#mockConstructionWithAnswer(Class, Answer, Answer[])
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedConstruction<T> mockConstructionWithAnswer(final Class<T> classToMock, final Answer defaultAnswer, final Answer... additionalAnswers) {
        return Mockito.mockConstructionWithAnswer(classToMock, defaultAnswer, additionalAnswers);
    }

    /**
     * @see Mockito#mockConstruction(Class)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedConstruction<T> mockConstruction(final Class<T> classToMock) {
        return Mockito.mockConstruction(classToMock);
    }

    /**
     * @see Mockito#mockConstruction(Class, MockedConstruction.MockInitializer)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedConstruction<T> mockConstruction(final Class<T> classToMock, final MockedConstruction.MockInitializer<T> mockInitializer) {
        return Mockito.mockConstruction(classToMock, mockInitializer);
    }

    /**
     * @see Mockito#mockConstruction(Class, MockSettings)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedConstruction<T> mockConstruction(final Class<T> classToMock, final MockSettings mockSettings) {
        return Mockito.mockConstruction(classToMock, mockSettings);
    }

    /**
     * @see Mockito#mockConstruction(Class, Function)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedConstruction<T> mockConstruction(final Class<T> classToMock, final Function<MockedConstruction.Context, MockSettings> mockSettingsFactory) {
        return Mockito.mockConstruction(classToMock, mockSettingsFactory);
    }

    /**
     * @see Mockito#mockConstruction(Class, MockSettings, MockedConstruction.MockInitializer)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedConstruction<T> mockConstruction(final Class<T> classToMock, final MockSettings mockSettings, final MockedConstruction.MockInitializer<T> mockInitializer) {
        return Mockito.mockConstruction(classToMock, mockSettings, mockInitializer);
    }

    /**
     * @see Mockito#mockConstruction(Class, Function, MockedConstruction.MockInitializer)
     */
    @Incubating
    @CheckReturnValue
    default <T> MockedConstruction<T> mockConstruction(final Class<T> classToMock, final Function<MockedConstruction.Context, MockSettings> mockSettingsFactory, final MockedConstruction.MockInitializer<T> mockInitializer) {
        return Mockito.mockConstruction(classToMock, mockSettingsFactory, mockInitializer);
    }

    /**
     * @see Mockito#when(T)
     */
    @CheckReturnValue
    default <T> OngoingStubbing<T> when(final T methodCall) {
        return Mockito.when(methodCall);
    }

    /**
     * @see Mockito#verify(T)
     */
    @CheckReturnValue
    default <T> T verify(final T mock) {
        return Mockito.verify(mock);
    }

    /**
     * @see Mockito#verify(T, VerificationMode)
     */
    @CheckReturnValue
    default <T> T verify(final T mock, final VerificationMode mode) {
        return Mockito.verify(mock, mode);
    }

    /**
     * @see Mockito#reset(T...)
     */
    default <T> void reset(final T... mocks) {
        Mockito.reset(mocks);
    }

    /**
     * @see Mockito#clearInvocations(T...)
     */
    default <T> void clearInvocations(final T... mocks) {
        Mockito.clearInvocations(mocks);
    }

    /**
     * @see Mockito#verifyNoMoreInteractions(Object...)
     */
    default void verifyNoMoreInteractions(final Object... mocks) {
        Mockito.verifyNoMoreInteractions(mocks);
    }

    /**
     * @see Mockito#verifyZeroInteractions(Object...)
     * @deprecated Since 3.0.1. Please migrate your code to {@link #verifyNoInteractions(Object...)}
     */
    @Deprecated
    default void verifyZeroInteractions(final Object... mocks) {
        Mockito.verifyNoMoreInteractions(mocks);
    }

    /**
     * @see Mockito#verifyNoInteractions(Object...)
     */
    default void verifyNoInteractions(final Object... mocks) {
        Mockito.verifyNoInteractions(mocks);
    }

    /**
     * @see Mockito#doThrow(Throwable...)
     */
    @CheckReturnValue
    default Stubber doThrow(final Throwable... toBeThrown) {
        return Mockito.doThrow(toBeThrown);
    }

    /**
     * @see Mockito#doThrow(Class)
     */
    @CheckReturnValue
    default Stubber doThrow(final Class<? extends Throwable> toBeThrown) {
        return Mockito.doThrow(toBeThrown);
    }

    /**
     * @see Mockito#doThrow(Class, Class[])
     */
    // Additional method helps users of JDK7+ to hide heap pollution / unchecked generics array creation
    @SuppressWarnings({"unchecked", "varargs"})
    @CheckReturnValue
    default Stubber doThrow(final Class<? extends Throwable> toBeThrown, final Class<? extends Throwable>... toBeThrownNext) {
        return Mockito.doThrow(toBeThrown, toBeThrownNext);
    }

    /**
     * @see Mockito#doCallRealMethod()
     */
    @CheckReturnValue
    default Stubber doCallRealMethod() {
        return Mockito.doCallRealMethod();
    }

    /**
     * @see Mockito#doAnswer(Answer)
     */
    @CheckReturnValue
    default Stubber doAnswer(final Answer answer) {
        return Mockito.doAnswer(answer);
    }

    /**
     * @see Mockito#doNothing()
     */
    @CheckReturnValue
    default Stubber doNothing() {
        return Mockito.doNothing();
    }

    /**
     * @see Mockito#doReturn(Object)
     */
    @CheckReturnValue
    default Stubber doReturn(final Object toBeReturned) {
        return Mockito.doReturn(toBeReturned);
    }

    /**
     * @see Mockito#doReturn(Object, Object...)
     */
    @SuppressWarnings({"unchecked", "varargs"})
    @CheckReturnValue
    default Stubber doReturn(final Object toBeReturned, final Object... toBeReturnedNext) {
        return Mockito.doReturn(toBeReturned, toBeReturnedNext);
    }

    /**
     * @see Mockito#inOrder(Object...)
     */
    @CheckReturnValue
    default InOrder inOrder(final Object... mocks) {
        return Mockito.inOrder(mocks);
    }

    /**
     * @see Mockito#ignoreStubs(Object...)
     */
    default Object[] ignoreStubs(final Object... mocks) {
        return Mockito.ignoreStubs(mocks);
    }

    /**
     * @see Mockito#times(int)
     */
    @CheckReturnValue
    default VerificationMode times(final int wantedNumberOfInvocations) {
        return Mockito.times(wantedNumberOfInvocations);
    }

    /**
     * @see Mockito#never()
     */
    @CheckReturnValue
    default VerificationMode never() {
        return Mockito.never();
    }

    /**
     * @see Mockito#atLeastOnce()
     */
    @CheckReturnValue
    default VerificationMode atLeastOnce() {
        return Mockito.atLeastOnce();
    }

    /**
     * @see Mockito#atLeast(int)
     */
    @CheckReturnValue
    default VerificationMode atLeast(final int minNumberOfInvocations) {
        return Mockito.atLeast(minNumberOfInvocations);
    }

    /**
     * @see Mockito#atMostOnce()
     */
    @CheckReturnValue
    default VerificationMode atMostOnce() {
        return Mockito.atMostOnce();
    }

    /**
     * @see Mockito#atMost(int)
     */
    @CheckReturnValue
    default VerificationMode atMost(final int maxNumberOfInvocations) {
        return Mockito.atMost(maxNumberOfInvocations);
    }

    /**
     * @see Mockito#calls(int)
     */
    @CheckReturnValue
    default VerificationMode calls(final int wantedNumberOfInvocations) {
        return Mockito.calls(wantedNumberOfInvocations);
    }

    /**
     * @see Mockito#only()
     */
    @CheckReturnValue
    default VerificationMode only() {
        return Mockito.only();
    }

    /**
     * @see Mockito#timeout(long)
     */
    @CheckReturnValue
    default VerificationWithTimeout timeout(final long millis) {
        return Mockito.timeout(millis);
    }

    /**
     * @see Mockito#after(long)
     */
    @CheckReturnValue
    default VerificationAfterDelay after(final long millis) {
        return Mockito.after(millis);
    }

    /**
     * @see Mockito#validateMockitoUsage()
     */
    default void validateMockitoUsage() {
        Mockito.validateMockitoUsage();
    }

    /**
     * @see Mockito#withSettings()
     */
    @CheckReturnValue
    default MockSettings withSettings() {
        return Mockito.withSettings();
    }

    /**
     * @see Mockito#description(String)
     */
    @CheckReturnValue
    default VerificationMode description(final String description) {
        return Mockito.description(description);
    }

    /**
     * @see Mockito#framework()
     */
    @Incubating
    @CheckReturnValue
    default MockitoFramework framework() {
        return Mockito.framework();
    }

    /**
     * @see Mockito#mockitoSession()
     */
    @Incubating
    @CheckReturnValue
    default MockitoSessionBuilder mockitoSession() {
        return Mockito.mockitoSession();
    }

    /**
     * @see Mockito#lenient()
     */
    @Incubating
    default LenientStubber lenient() {
        return Mockito.lenient();
    }

}
