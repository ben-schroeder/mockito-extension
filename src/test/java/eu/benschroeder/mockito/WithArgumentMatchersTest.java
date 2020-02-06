package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;

public class WithArgumentMatchersTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withArgumentMatchersMethods = ReflectionUtils.getAllMethods(WithArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> argumentMatchersMethods = ReflectionUtils.getAllMethods(ArgumentMatchers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withArgumentMatchersMethods.size()).isEqualTo(argumentMatchersMethods.size());

    }

}
