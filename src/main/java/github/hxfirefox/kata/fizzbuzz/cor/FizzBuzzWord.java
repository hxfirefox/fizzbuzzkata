package github.hxfirefox.kata.fizzbuzz.cor;

public class FizzBuzzWord  extends Word {

    public FizzBuzzWord(Word word) {
        super(word);
    }

    @Override
    public String say(int number) {

        if (number % 15 == 0) {
            return "fizzbuzz";
        }

        return word.say(number);
    }

    @Override
    public boolean match(int number) {
        return number%15==0;
    }

    @Override
    public String out(int number) {
        return "FizzBuzz";
    }
}
