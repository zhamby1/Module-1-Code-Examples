//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {        //methods are pretty much functions
    //there are some differences..especially in java
    //methods are required to be part of a class
    //methods have access modifiers

    //all the following are accurate(ish) descriptions of a function/method
    //they take data in, transform it, and output a result
    //functions/methods are considered actions
    //SDEV definition - functions are blocks of code that can be repeated when it's name
    // is called.  It can have data passed to it and can return data as a result
    //methods have () when used

    //lets look at a simple method that executes a println when called.
    //methods have to be part of a class so you have to declare them in the Main class but outside main method

    //static means i can use this method without making an instance of the main class
    //void means not a return method/function and does not return data into a variable
    //public means any other class can have access to it
    //private means only the current class or subclasses have access
    public static void myMethod(){
        System.out.println("Hello World");
    }


    public static void main(String[] args) {
        myMethod();
        myMethod();


    }
}