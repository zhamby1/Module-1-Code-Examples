import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        //if statements in Java use the same relational operators as any other language
        // < <= > >= == !=
        //if statements in Java have the conditions surrounded in parenthesis followed by braces
        int a = 7;
        int b = 8;

        if(b > a){
            System.out.println("B is larger");
        }

        //create a program where you determine if someone can vote by being 18 or older
        System.out.println("Tell me your age ");
        int age = myscanner.nextInt();
        if(age >= 18){
            System.out.println("You can vote");
        }
        //else means anything else run the following code
        else{
            System.out.println("You can't vote");
        }

        //determining even or odd
        int number = 7;
        if (number % 2 == 0){
            System.out.println("You are even");
        }
        else{
            System.out.println("You are odd");
        }

    }
}