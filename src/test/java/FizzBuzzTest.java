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
}
