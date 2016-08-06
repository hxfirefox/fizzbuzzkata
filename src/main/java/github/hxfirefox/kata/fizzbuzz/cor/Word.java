package github.hxfirefox.kata.fizzbuzz.cor;

public abstract class Word {
    protected Word word;

    public Word(Word word) {
        this.word = word;
    }

    public abstract String say(int number);

    public abstract boolean match(int number);

    public abstract String out(int number);
}
