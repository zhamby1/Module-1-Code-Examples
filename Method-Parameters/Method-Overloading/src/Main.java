//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //call method by same name but return different data types
    public static double add_numbers(double number_1, double number_2) {
        double sum = number_1 + number_2;
        return sum;

    }

    public static int add_numbers(int number_1, int number_2) {
        int sum = number_1 + number_2;
        return sum;
    }

    public static void main(String[] args) {

        double total = add_numbers(2.0, 3.0);
        System.out.println(total);

        int total2 = add_numbers(2, 3);
        System.out.println(total2);

    }
}