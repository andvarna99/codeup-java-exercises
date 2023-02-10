package Demos;

import java.util.Scanner;

public class MethodsExerciseDemo {

    private static String myName; // creates a string that is global to this class (MethodsExercises)
    // adding static now there is only one for the whole class

    public static String sayHello (String name){
        return String.format("Hello, %s", name);
    }
    public static String sayHello (){
        return String.format("Hello there!");
    }
    public static String sayHello (int numRepeats){
        String str = "";
        for (int i = 0; i < numRepeats; i++) {
//            str += String.format("Hello there!!!\n");
            str += sayHello() + "!!\n";
        }
        return str;
    }
    private static void changMyName(String oldName, String newName) {
        myName = newName;
        System.out.println("oldName is now: " + myName);
    }
    private static String makeNewName(String newName) {
        return newName;
    }
    private static int getNumberFromOneTo10(Scanner input) { //scanner input so you dont have to keep calling the scanner
        System.out.println("Enter number from 1 to 10: "); //gives prompt
        int aNumber = input.nextInt(); //user types number
        if(aNumber < 1 || aNumber > 10){    //outside the parameters
            return getNumberFromOneTo10(input); //if you didn't do it right do it again
        }
        //otherwise you did it right so return it
        return aNumber;
    }
    public static long fib(int n){
        if (n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("bob"));
        System.out.println(MethodsExerciseDemo.sayHello());
        System.out.println(MethodsExerciseDemo.sayHello(5));

        myName = "jimbob";
        changMyName(myName, "bob");
        System.out.println(myName);

        myName = makeNewName("bob");

        Scanner input = new Scanner(System.in);
        int n = getNumberFromOneTo10(input);

        input.close();

        System.out.println(fib(30));
    }
}
