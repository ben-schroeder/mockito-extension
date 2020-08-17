package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;

class WithMockitoTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withMockitoMethods = ReflectionUtils.getAllMethods(WithMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> mockitoMethods = ReflectionUtils.getAllMethods(Mockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withMockitoMethods.size()).isEqualTo(mockitoMethods.size());

    }

}
