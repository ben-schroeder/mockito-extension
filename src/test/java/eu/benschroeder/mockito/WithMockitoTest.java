package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

class WithMockitoTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withMockitoMethods = ReflectionUtils.getAllMethods(WithMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> mockitoMethods = ReflectionUtils.getAllMethods(Mockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withMockitoMethods.size()).isEqualTo(mockitoMethods.size());

    }

    @Test
    @SuppressWarnings("unchecked")
    void testMethodsMatch() {

        final Set<Method> mockitoMethods = ReflectionUtils.getAllMethods(Mockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));
        final Set<Method> withMockitoMethods = ReflectionUtils.getAllMethods(WithMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));
        final Set<Method> withArgumentMatchersMethods = ReflectionUtils.getAllMethods(WithArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        for (final Method mockitoMethod : mockitoMethods) {
            final Optional<Method> withMockitoMethod = withMockitoMethods.stream()
                    .filter(method -> Objects.equals(method.getName(), mockitoMethod.getName()))
                    .filter(method -> Objects.equals(method.getReturnType(), mockitoMethod.getReturnType()))
                    .filter(method -> Arrays.equals(method.getParameterTypes(), mockitoMethod.getParameterTypes()))
                    .findFirst();
            if (withMockitoMethod.isEmpty()) {
                final Optional<Method> withArgumentMatchersMethod = withArgumentMatchersMethods.stream()
                        .filter(method -> Objects.equals(method.getName(), mockitoMethod.getName()))
                        .filter(method -> Objects.equals(method.getReturnType(), mockitoMethod.getReturnType()))
                        .filter(method -> Arrays.equals(method.getParameterTypes(), mockitoMethod.getParameterTypes()))
                        .findFirst();
                if (withArgumentMatchersMethod.isEmpty()) {
                    fail("Missing: " + mockitoMethod.toString());
                }
            }
        }

    }

}
