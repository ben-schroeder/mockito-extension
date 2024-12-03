package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

class WithArgumentMatchersTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withArgumentMatchersMethods = ReflectionUtils.getAllMethods(WithArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> argumentMatchersMethods = ReflectionUtils.getAllMethods(ArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withArgumentMatchersMethods.size()).isEqualTo(argumentMatchersMethods.size());

    }

    @Test
    @SuppressWarnings("unchecked")
    void testMethodsMatch() {

        final Set<Method> withArgumentMatchersMethods = ReflectionUtils.getAllMethods(WithArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));
        final Set<Method> argumentMatchersMethods = ReflectionUtils.getAllMethods(ArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        for (final Method argumentsMatcherMethod : argumentMatchersMethods) {
            final Optional<Method> withArgumentMatchersMethod = withArgumentMatchersMethods.stream()
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
