package eu.benschroeder.mockito;

import eu.benschroeder.assertj.WithAssertJ;
import org.junit.jupiter.api.Test;
import org.mockito.AdditionalAnswers;
import org.mockito.ArgumentMatchers;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Set;

class WithAdditionalAnswersTest implements WithAssertJ {

    @Test
    @SuppressWarnings("unchecked")
    void testMethodCountMatches() {

        final Set<Method> withAdditionalAnswersMethods = ReflectionUtils.getAllMethods(WithAdditionalAnswers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        final Set<Method> additionalAnswersMethods = ReflectionUtils.getAllMethods(AdditionalAnswers.class, ReflectionUtils.withModifier(Modifier.PUBLIC));

        assertThat(withAdditionalAnswersMethods.size()).isEqualTo(additionalAnswersMethods.size());

    }

}
