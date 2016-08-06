package github.hxfirefox.kata.fizzbuzz.cor;

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

    @Override
    public boolean match(int number) {
        return number % 3 == 0;
    }

    @Override
    public String out(int number) {
        return "Fizz";
    }
}
