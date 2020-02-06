package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;

public class WithBDDMockitoTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withBDDMockitoMethods = ReflectionUtils.getAllMethods(WithBDDMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> bddMockitoMethods = ReflectionUtils.getAllMethods(BDDMockito.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withBDDMockitoMethods.size()).isEqualTo(bddMockitoMethods.size());
    }

}
