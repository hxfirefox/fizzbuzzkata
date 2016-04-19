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
        assertThat(out, is("fizz"));
    }

    @Test
    public void should_say_buzz_when_meet_5() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(5);
        // then
        assertThat(out, is("buzz"));
    }

    @Test
    public void should_say_fizzbuzz_when_meet_15() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(15);
        // then
        assertThat(out, is("fizzbuzz"));
    }

    @Test
    public void should_say_fizz_when_meet_6() throws Exception {
        // given

        // when
        String out = fizzBuzz.say(6);
        // then
        assertThat(out, is("fizz"));
    }
}
