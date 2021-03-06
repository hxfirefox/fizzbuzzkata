package github.hxfirefox.kata.fizzbuzz.cor;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_say_1_when_meet_1() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(1);
        // then
        assertThat(out, is("1"));
    }

    @Test
    public void should_say_2_when_meet_2() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(2);
        // then
        assertThat(out, is("2"));
    }

    @Test
    public void should_say_fizz_when_meet_3() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(3);
        // then
        assertThat(out, is("Fizz"));
    }

    @Test
    public void should_say_buzz_when_meet_5() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(5);
        // then
        assertThat(out, is("Buzz"));
    }

    @Test
    public void should_say_fizzbuzz_when_meet_15() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(15);
        // then
        assertThat(out, is("FizzBuzz"));
    }

    @Test
    public void should_say_fizz_when_meet_6() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(6);
        // then
        assertThat(out, is("Fizz"));
    }

    @Test
    public void should_say_buzz_when_meet_10() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(10);
        // then
        assertThat(out, is("Buzz"));
    }

    @Test
    public void should_say_fizzbuzz_when_meet_mutilpies_of_3_and_5() throws Exception {
        // given

        // when
        String out30 = fizzBuzz.say(30);
        String out45 = fizzBuzz.say(45);
        // then
        assertThat(out45, is("FizzBuzz"));
        assertThat(out30, is("FizzBuzz"));
    }
}
