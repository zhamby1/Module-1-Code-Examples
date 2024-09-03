//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //returnable methods are different than void methods
    //they MUST return into a variable
    //they must return into the type that is declared
    public static double add_numbers(double number_1, double number_2) {
        double sum = number_1 + number_2;
        return sum;

    }
    public static void main(String[] args) {
        double total = add_numbers(5,10);
        System.out.println(total);

    }
}