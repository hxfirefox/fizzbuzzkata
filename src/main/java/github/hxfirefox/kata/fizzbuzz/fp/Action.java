package github.hxfirefox.kata.fizzbuzz.fp;

@FunctionalInterface
public interface Action {
    String to(int number);

    static Action to(String out) {
        return x -> out;
    }

    static Action nop(){
        return x->String.valueOf(x);
    }
}
