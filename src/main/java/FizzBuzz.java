public class FizzBuzz {
    public String say(int number) {
        final Word commonNumberWord = new CommonNumberWord(null);
        final Word buzzWord = new BuzzWord(commonNumberWord);
        final Word fizzWord = new FizzWord(buzzWord);
        final Word word = new FizzBuzzWord(fizzWord);

        return word.say(number);
    }
}
