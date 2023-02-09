import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //demo code
//        int age = -1;
//        String name = null;
//        if(name == null){
//            System.out.println("Invalid name");
//        }else {
//            System.out.println("Name is okay");
//        }
//        String name = "bob";
//        switch (name.length()) {
//            case 10 -> System.out.println("long name");
//            case 2 -> System.out.println("wow!");
//            default -> System.out.println("somewhat normal name");
//        }
//        Scanner input = new Scanner(System.in);
//        String choice = "";
//        boolean done = false;
//        //ask user for a choice until they choose quit
//        do{
//            //prompt the user to make a choice
//            System.out.println("make a choice: ");
//            //get the choice via scanner
//            choice = input.nextLine();
//            System.out.println("you entered" + choice);
//            //determine if we are done
//            if(choice.equals("quit")){
//                done = true;
//            }
//        }while (!done); //we don't have to use this kind to stop, can also just use true instead of !done and a break instead of the done = true inside the loop
//
//        for (int i = 0; i < choice.length(); i++) {
//            System.out.println(choice.charAt(i));
//        }
//
//        input.close();

        //exercise code
        //loop basics
        //a while loop
//            int i = 5;
//            while(i <= 15){
//                System.out.println("i is " + i);
//                i++;
//            }

        //a refactored for loop
        for (int i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        //b do while loop
//            int x = 100;
//            do {
//                System.out.println("x is " + x);
//                x -= 5;
//            }while(x > -10);

        //b refactored for loop
        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

        //b do while loop
//            long y = 2;
//            do{
//                System.out.println("y is " + y);
//                y *= y;
//            }while(y < 1000000);

        //b refactored for loop
        for (long i = 2; i < 1000000; i *= i) {
            System.out.println(i);
        }

        //fizz buzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //table of powers
        Scanner input = new Scanner(System.in);

        System.out.println("What number would you like to go up to? ");
        double number = input.nextDouble();
        System.out.println("Here is your table!");
        System.out.print("""
                number | squared | cubed
                ------ | ------- | -----
                """);
        for (double i = 1; i <= number; i++) {
            if (i < 4) {
                System.out.printf("%.0f      | %.0f       | %.0f    %n", i, Math.pow(i, 2), Math.pow(i, 3));
            } else {
                System.out.printf("%.0f      | %.0f      | %.0f    %n", i, Math.pow(i, 2), Math.pow(i, 3));
            }
        }
        //demo code for table loop
//        int maxNum = input.nextInt();
//        for (int i = 1; i <= maxNum ; i++) {
//            int s = i * i;
//            int c = i * i * i;
//            System.out.printf("%-6d | %-7d | %-5d%n",i,s,c);
//        }

        //number grades to letter grades
        do {
            System.out.println("Enter a grade from 0-100: ");
            byte grade = input.nextByte();
            input.nextLine();
            if (grade >= 97 && grade <= 100) {
                System.out.printf("Your grade of %s is an A+", grade);
            } else if (grade >= 93 && grade <= 96) {
                System.out.printf("Your grade of %s is an A", grade);
            } else if (grade >= 90 && grade <= 92) {
                System.out.printf("Your grade of %s is an A-", grade);
            } else if (grade >= 87 && grade <= 89) {
                System.out.printf("Your grade of %s is a B+", grade);
            } else if (grade >= 83 && grade <= 86) {
                System.out.printf("Your grade of %s is a B", grade);
            } else if (grade >= 80 && grade <= 82) {
                System.out.printf("Your grade of %s is a B-", grade);
            } else if (grade >= 77 && grade <= 79) {
                System.out.printf("Your grade of %s is a C+", grade);
            } else if (grade >= 73 && grade <= 76) {
                System.out.printf("Your grade of %s is a C", grade);
            } else if (grade >= 70 && grade <= 72) {
                System.out.printf("Your grade of %s is a C-", grade);
            } else if (grade >= 67 && grade <= 69) {
                System.out.printf("Your grade of %s is a D+", grade);
            } else if (grade >= 63 && grade <= 66) {
                System.out.printf("Your grade of %s is a D", grade);
            } else if (grade >= 60 && grade <= 62) {
                System.out.printf("Your grade of %s is a D-", grade);
            } else if (grade >= 0 && grade <= 59) {
                System.out.printf("Your grade of %s is an F", grade);
            }
            input.nextLine();
            System.out.print("Continue? ");
            String keepGoing = input.nextLine();
            if(!keepGoing.equalsIgnoreCase("yes")) {
                break;
            }
        }while(true);
        //demo grades
//        do{
//            int myGrade = input.nextInt();
//            //clears new line out of buffer
//            input.nextLine();
//            String letterGrade = "F";
//            if (myGrade >= 88) {
//                letterGrade = "A";
//            } else if (myGrade >= 80) {
//                letterGrade = "B";
//            } else if (myGrade >= 67) {
//                letterGrade = "C";
//            } else if (myGrade >= 60) {
//                letterGrade = "D";
//            }
//            System.out.println(letterGrade);
//            System.out.print("Continue? ");
//            String keepGoing = input.nextLine();
//            if(!keepGoing.equalsIgnoreCase("yes")) {
//                break;
//            }
//        }while(true);
//
        input.close();
    }
}
