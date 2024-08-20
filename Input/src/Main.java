import java.util.Scanner;  //imports scanner for input
public class Main {
    public static void main(String[] args) {
        //create an instance of the scanner object
        //we have to 'activate' the scanner object and attach it to a variable
        //because Java is a 'strongly typed language' we have to declare the scanner type
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        //by default a scanner takes in everything as a string
        //the default way to grab data is the nextLine() method/function
        String name = myscanner.nextLine();
        System.out.println("My name is " + name);

        //once you create an instance of scanner, you can use it in the rest of your program or method
        //However, if you take a data type in besides a string you have to use a different method based on the data types name
        //ie nextDouble(), nextInt(), nextBoolean(), nextFloat() etc...
        int age = myscanner.nextInt();
        System.out.println("My age is " + age);

        //nextDouble() to grab doubles
        double bankaccount = myscanner.nextDouble();
        System.out.println("My bank account balance is " + bankaccount);
        System.out.println("This is change");


    }
}