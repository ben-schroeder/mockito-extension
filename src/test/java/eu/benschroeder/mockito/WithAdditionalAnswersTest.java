package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.AdditionalAnswers;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

class WithAdditionalAnswersTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withAdditionalAnswersMethods = ReflectionUtils.getAllMethods(WithAdditionalAnswers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> additionalAnswersMethods = ReflectionUtils.getAllMethods(AdditionalAnswers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withAdditionalAnswersMethods.size()).isEqualTo(additionalAnswersMethods.size());

    }

    @Test
    @SuppressWarnings("unchecked")
    void testMethodsMatch() {

        final Set<Method> withAdditionalAnswersMethods = ReflectionUtils.getAllMethods(WithAdditionalAnswers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));
        final Set<Method> additionalAnswersMethods = ReflectionUtils.getAllMethods(AdditionalAnswers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        for (final Method argumentsMatcherMethod : additionalAnswersMethods) {
            final Optional<Method> withArgumentMatchersMethod = withAdditionalAnswersMethods.stream()
                    .filter(method -> Objects.equals(method.getName(), argumentsMatcherMethod.getName()))
                    .filter(method -> Objects.equals(method.getReturnType(), argumentsMatcherMethod.getReturnType()))
                    .filter(method -> Arrays.equals(method.getParameterTypes(), argumentsMatcherMethod.getParameterTypes()))
                    .findFirst();
            if (withArgumentMatchersMethod.isEmpty()) {
                fail("Missing: " + argumentsMatcherMethod.toString());
            }
        }

    }

}
