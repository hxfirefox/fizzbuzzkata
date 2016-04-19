public class FizzBuzz {
    public String say(int number) {
        if(3 == number) {
         return "fizz";
        }
        if (5 == number){
            return "buzz";
        }
        if (15 == number){
            return "fizzbuzz";
        }
        return String.valueOf(number);
    }
}
