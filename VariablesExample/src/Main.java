
public class Main {
    public static void main(String[] args) {

        //declare a variable..
        //you have to use it's data type before you declare it
        //int, float, double, string etc..
        //int whole number
        //long whole number double range of int
        //float decimal number
        //double decimal number double range of a float

        //arithmetic operations are the same in Java as other langauages - +,-,*,/

        int number1 = 15;
        int number2 = 20;

        int answer = number1 + number2;
        System.out.println(answer);

        double number3 = 15;
        double number4 = 20;

        double answer2 = number3 / number4;
        System.out.println(answer2);

        //modulus - calculating remainder value.. ie two numbers are divided and the remainder is the answer
        //we use this to do "clock math" or determining things like even and odd

        double mod1 = 11;
        double mod2 = 2;
        double mod_answer = mod1 % mod2;
        System.out.println(mod_answer);

        //you can actually use a built in method for exponents from the Math library
        //Math.pow(base,exponent);
        double expon = Math.pow(2,3);
        System.out.println(expon);

        String myname = "Zach";
        int age = 39;

        System.out.println("My name is " + myname + " and my age is " + age);




    }
}