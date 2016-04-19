public class FizzBuzz {
    public String say(int number) {
        if(3 == number) {
         return "fizz";
        } else if (5 == number){
            return "buzz";
        }
        return String.valueOf(number);
    }
}
