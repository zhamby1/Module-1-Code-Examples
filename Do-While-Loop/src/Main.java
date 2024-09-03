import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //a do while loop check condition at the end
        //runs at least once
        // known as a post-test loop (test loop at the end).
        Scanner myscanner = new Scanner(System.in);

        int number;
        number = 10;
        int guess;

        System.out.println("Guess a magic number between 1 and 50");
        do {
            guess = myscanner.nextInt();
            if (guess > number) {
                System.out.println("Your guess is too high..try again");
            }
            if (guess < number) {
                System.out.println("Your guess is too low try again");
            }
        }
        while(guess != number);

        System.out.println("You guessed the correct number");



    }
}