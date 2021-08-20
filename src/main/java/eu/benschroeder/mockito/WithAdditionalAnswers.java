package eu.benschroeder.mockito;

import org.mockito.AdditionalAnswers;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Answer1;
import org.mockito.stubbing.Answer2;
import org.mockito.stubbing.Answer3;
import org.mockito.stubbing.Answer4;
import org.mockito.stubbing.Answer5;
import org.mockito.stubbing.Answer6;
import org.mockito.stubbing.VoidAnswer1;
import org.mockito.stubbing.VoidAnswer2;
import org.mockito.stubbing.VoidAnswer3;
import org.mockito.stubbing.VoidAnswer4;
import org.mockito.stubbing.VoidAnswer5;
import org.mockito.stubbing.VoidAnswer6;

import java.util.Collection;

/**
 * Mockito {@link AdditionalAnswers} as an interface to use in test classes.
 * <p>
 * Inspired by https://blog.javabien.net/2014/04/23/what-if-assertj-used-java-8/
 * and https://github.com/szpak/mockito-java8
 *
 * @author Benjamin Schröder
 */
public interface WithAdditionalAnswers {

    /**
     * @see AdditionalAnswers#returnsFirstArg()
     */
    default<T> Answer<T> returnsFirstArg() {
        return AdditionalAnswers.returnsFirstArg();
    }

    /**
     * @see AdditionalAnswers#returnsSecondArg()
     */
    default<T> Answer<T> returnsSecondArg() {
        return AdditionalAnswers.returnsSecondArg();
    }

    /**
     * @see AdditionalAnswers#returnsLastArg()
     */
    default<T> Answer<T> returnsLastArg() {
        return AdditionalAnswers.returnsLastArg();
    }

    /**
     * @see AdditionalAnswers#returnsArgAt(int)
     */
    default<T> Answer<T> returnsArgAt(int position) {
        return AdditionalAnswers.returnsArgAt(position);
    }

    /**
     * @see AdditionalAnswers#delegatesTo(Object) 
     */
    default<T> Answer<T> delegatesTo(Object delegate) {
        return AdditionalAnswers.delegatesTo(delegate);
    }

    /**
     * @see AdditionalAnswers#returnsElementsOf(Collection)
     */
    default<T> Answer<T> returnsElementsOf(Collection<?> elements) {
        return AdditionalAnswers.returnsElementsOf(elements);
    }

    /**
     * @see AdditionalAnswers#answersWithDelay(long, Answer)
     */
    default<T> Answer<T> answersWithDelay(long sleepyTime, Answer<T> answer) {
        return AdditionalAnswers.answersWithDelay(sleepyTime, answer);
    }

    /**
     * @see AdditionalAnswers#answer(Answer1)
     */
    default<T, A> Answer<T> answer(Answer1<T, A> answer) {
        return AdditionalAnswers.answer(answer);
    }

    /**
     * @see AdditionalAnswers#answerVoid(VoidAnswer1)
     */
    default<A> Answer<Void> answerVoid(VoidAnswer1<A> answer) {
        return AdditionalAnswers.answerVoid(answer);
    }

    /**
     * @see AdditionalAnswers#answer(Answer2)
     */
    default<T, A, B> Answer<T> answer(Answer2<T, A, B> answer) {
        return AdditionalAnswers.answer(answer);
    }

    /**
     * @see AdditionalAnswers#answerVoid(VoidAnswer2)
     */
    default<A, B> Answer<Void> answerVoid(VoidAnswer2<A, B> answer) {
        return AdditionalAnswers.answerVoid(answer);
    }

    /**
     * @see AdditionalAnswers#answer(Answer3)
     */
    default<T, A, B, C> Answer<T> answer(Answer3<T, A, B, C> answer) {
        return AdditionalAnswers.answer(answer);
    }

    /**
     * @see AdditionalAnswers#answerVoid(VoidAnswer3)
     */
    default<A, B, C> Answer<Void> answerVoid(VoidAnswer3<A, B, C> answer) {
        return AdditionalAnswers.answerVoid(answer);
    }

    /**
     * @see AdditionalAnswers#answer(Answer4)
     */
    default<T, A, B, C, D> Answer<T> answer(Answer4<T, A, B, C, D> answer) {
        return AdditionalAnswers.answer(answer);
    }

    /**
     * @see AdditionalAnswers#answerVoid(VoidAnswer4)
     */
    default<A, B, C, D> Answer<Void> answerVoid(VoidAnswer4<A, B, C, D> answer) {
        return AdditionalAnswers.answerVoid(answer);
    }

    /**
     * @see AdditionalAnswers#answer(Answer5)
     */
    default<T, A, B, C, D, E> Answer<T> answer(Answer5<T, A, B, C, D, E> answer) {
        return AdditionalAnswers.answer(answer);
    }

    /**
     * @see AdditionalAnswers#answerVoid(VoidAnswer5)
     */
    default<A, B, C, D, E> Answer<Void> answerVoid(VoidAnswer5<A, B, C, D, E> answer) {
        return AdditionalAnswers.answerVoid(answer);
    }

    /**
     * @see AdditionalAnswers#answer(Answer6)
     */
    default<T, A, B, C, D, E, F> Answer<T> answer(Answer6<T, A, B, C, D, E, F> answer) {
        return AdditionalAnswers.answer(answer);
    }

    /**
     * @see AdditionalAnswers#answerVoid(VoidAnswer6)
     */
    default<A, B, C, D, E, F> Answer<Void> answerVoid(VoidAnswer6<A, B, C, D, E, F> answer) {
        return AdditionalAnswers.answerVoid(answer);
    }
    
}
