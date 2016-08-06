package github.hxfirefox.kata.fizzbuzz.cor;

public class FizzBuzz {
    private static Word word;

    static {
        final Word commonNumberWord = new CommonNumberWord(null);
        final Word buzzWord = new BuzzWord(commonNumberWord);
        final Word fizzWord = new FizzWord(buzzWord);
        word = new FizzBuzzWord(fizzWord);
    }

    public String say(int number) {
        return word.say(number);
    }
}
