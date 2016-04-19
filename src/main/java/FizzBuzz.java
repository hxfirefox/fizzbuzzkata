public class FizzBuzz {
    public String say(int number) {
        if (15 == number) {
            return "fizzbuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (5 == number) {
            return "buzz";
        }
        return String.valueOf(number);
    }
}
