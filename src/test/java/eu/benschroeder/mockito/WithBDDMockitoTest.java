package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

class WithBDDMockitoTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withBDDMockitoMethods = ReflectionUtils.getAllMethods(WithBDDMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> bddMockitoMethods = ReflectionUtils.getAllMethods(BDDMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withBDDMockitoMethods.size()).isEqualTo(bddMockitoMethods.size());
    }

    @Test
    @SuppressWarnings("unchecked")
    void testMethodsMatch() {

        final Set<Method> bddMockitoMethods = ReflectionUtils.getAllMethods(BDDMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));
        final Set<Method> withBDDMockitoMethods = ReflectionUtils.getAllMethods(WithBDDMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));
        final Set<Method> withMockitoMethods = ReflectionUtils.getAllMethods(WithMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));
        final Set<Method> withArgumentMatchersMethods = ReflectionUtils.getAllMethods(WithArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        for (final Method bddMockitoMethod : bddMockitoMethods) {
            final Optional<Method> withBDDMockitoMethod = withBDDMockitoMethods.stream()
                    .filter(method -> Objects.equals(method.getName(), bddMockitoMethod.getName()))
                    .filter(method -> Objects.equals(method.getReturnType(), bddMockitoMethod.getReturnType()))
                    .filter(method -> Arrays.equals(method.getParameterTypes(), bddMockitoMethod.getParameterTypes()))
                    .findFirst();
            if (withBDDMockitoMethod.isEmpty()) {
                final Optional<Method> withMockitoMethod = withMockitoMethods.stream()
                        .filter(method -> Objects.equals(method.getName(), bddMockitoMethod.getName()))
                        .filter(method -> Objects.equals(method.getReturnType(), bddMockitoMethod.getReturnType()))
                        .filter(method -> Arrays.equals(method.getParameterTypes(), bddMockitoMethod.getParameterTypes()))
                        .findFirst();
                if (withMockitoMethod.isEmpty()) {
                    final Optional<Method> withArgumentMatchersMethod = withArgumentMatchersMethods.stream()
                            .filter(method -> Objects.equals(method.getName(), bddMockitoMethod.getName()))
                            .filter(method -> Objects.equals(method.getReturnType(), bddMockitoMethod.getReturnType()))
                            .filter(method -> Arrays.equals(method.getParameterTypes(), bddMockitoMethod.getParameterTypes()))
                            .findFirst();
                    if (withArgumentMatchersMethod.isEmpty()) {
                        fail("Missing: " + bddMockitoMethod.toString());
                    }
                }
            }
        }

    }

}
