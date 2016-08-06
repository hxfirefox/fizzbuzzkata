package github.hxfirefox.kata.fizzbuzz.cor;

public class CommonNumberWord extends Word {
    public CommonNumberWord(Word word) {
        super(word);
    }

    @Override
    public String say(int number) {
        return String.valueOf(number);
    }

    @Override
    public boolean match(int number) {
        return true;
    }

    @Override
    public String out(int number) {
        return String.valueOf(number);
    }
}
