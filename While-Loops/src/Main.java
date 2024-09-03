import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //loops repeat code until a condition is met
        //while loops are used with relational operators to check for condition
        //pre-test loops - does not execute if condition is not met at the beginning of the loop

        //the big feature of while loops are sentinel values or flags
        //these 'flags' help exit the loop when the time is right
        //very useful in menu based programs

        //guessing number game - guess a random number
        Scanner myscanner = new Scanner(System.in);
        int number;
        number = 10;

        System.out.println("Guess a magic number between 1 and 50");
        int guess = myscanner.nextInt();

        while (guess != number) {
            if (guess > number){
                System.out.println("Your guess is too high..try again");
                guess = myscanner.nextInt();
            }
            if (guess < number){
                System.out.println("Your guess is too low try again");
                guess = myscanner.nextInt();
            }
        }
        System.out.println("You guessed the correct number");

        //loops are also useful in keeping track of running data
        //running totals, sums, avgs etc
        System.out.println("Enter a number to be added to a total. Enter 0 ends program");
        int numbers = myscanner.nextInt();
        int sum = 0;
        while(numbers != 0){
            sum = sum + numbers;
            System.out.println("Enter a number to be added to a total. Enter 0 ends program");
            numbers = myscanner.nextInt();
        }
        System.out.println("The total sum is: " + sum);

    }
}