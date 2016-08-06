package github.hxfirefox.kata.fizzbuzz.fp;

@FunctionalInterface
public interface Matcher {
    boolean matches(int factor);

    static Matcher times(int factor) {
        return x -> x % factor == 0;
    }

    static Matcher always(boolean flag) {
        return x -> flag;
    }
}
