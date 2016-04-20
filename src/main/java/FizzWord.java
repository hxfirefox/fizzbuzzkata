/**
 * Created by hx on 16-4-19.
 */
public class FizzWord extends Word {
    public FizzWord(Word word) {
        super(word);
    }

    @Override
    public String say(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        return word.say(number);
    }
}
