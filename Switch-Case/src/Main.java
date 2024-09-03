
public class Main {
    public static void main(String[] args) {
        //switch case are similar to else-if, but you must know the values that you are looking for
        //the switch is only evaluated once
        //once it meets a condition, it short-circuits
        //break keyword is used to denote a break from the case code
        //default keyword is used like an else statement

        //Program to convert numbers to days of the week
        int day = 5;
        //switch(thing to be compared / condition)
        switch (day){
            //cases are the conditions that day will be compared to
            //the must be exact and contain a break to break out of the case if the cond. is true
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            //default is used like a else here
            default:
                System.out.println("Invalid day");
        }

    }
}