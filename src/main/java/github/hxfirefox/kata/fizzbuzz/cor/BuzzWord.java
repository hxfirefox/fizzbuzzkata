package github.hxfirefox.kata.fizzbuzz.cor;

public class BuzzWord extends Word {
    public BuzzWord(Word word) {
        super(word);
    }

    @Override
    public String say(int number) {
        if (number % 5 == 0) {
            return "buzz";
        }
        return word.say(number);
    }
}
