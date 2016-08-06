package github.hxfirefox.kata.fizzbuzz.cor;

public class FizzWord extends Word {
    public FizzWord(Word word) {
        super(word);
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
