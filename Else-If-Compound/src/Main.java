import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        //else if statements allow for many conditions and for you to pick one.  if this or if this or if this and then an else
        //create a program using else if statements that gives me a letter grade based on a
        //numerical grade (a >=90, b >= 80, c >= 70, etc...)


        double number_grade = 50;

        if(number_grade >= 90){
            System.out.println("Your grade is A");
        }
        else if (number_grade >= 80){
            System.out.println("Your grade is B");
        }
        else if (number_grade >= 70){
            System.out.println("Your grade is C");
        }
        else if (number_grade >= 60){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("You failed");
        }

        //compound conditions are useful when you need to meet multiple requirements
        // && - and    Both statements must be true for the result to be true
        // || - or     Only one statement must be true for the result to be true
        // not - !     Reverses the boolean evaluation ie true becomes false

        //voting program and expand it.. We want to check if you are >= 18 yrs old and a US Citizen
        int age = 19;
        String us_citizen = "y";
        if(age >= 18 && us_citizen == "Y" || us_citizen == "y"){
            System.out.println("You can vote!");
        }
        else{
            System.out.println("You cannot vote");
        }

        //check to see if a human is disguised as a lizard person
        //using the not condition
        System.out.println("Do you eat people food? Press 1 and enter for Yes or 2 for No");
        int eat = myscanner.nextInt();
        if(eat != 1){
            System.out.println("You are a lizard person");
        }




    }
}