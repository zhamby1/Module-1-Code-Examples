
public class Main {

    //create a method to add two numbers together that are doubles
    //parameter are place holders for unknown value
    //method defining parameters are places in the parenthesis and separated by a comma
    //the var name must match within the methods body, outside of that does not matter

    public static void add_numbers(double number_1, double number_2) {
        double sum = number_1 + number_2;
        System.out.println("Your total is " + sum);

    }
    public static void main(String[] args) {
        double num1 = 80;
        double num2 = 70;
        add_numbers(5,10);
        add_numbers(num1,num2);

    }
}