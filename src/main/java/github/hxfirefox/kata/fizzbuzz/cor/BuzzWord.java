package github.hxfirefox.kata.fizzbuzz.cor;

public class BuzzWord extends Word {
    public BuzzWord(Word word) {
        super(word);
    }

    @Override
    public boolean match(int number) {
        return number % 5 == 0;
    }

    @Override
    public String out(int number) {
        return "Buzz";
    }
}
