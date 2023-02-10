import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addNumbers(10, 15));
        System.out.println(subNumbers(15,10));
        System.out.println(multNumbers(10,10));
        System.out.println(divNumbers(100,10));
        System.out.println(modNumbers(10,2));



        int userInput = getInteger(1,10);

        // factorials
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
        int num = getInteger(1,10);
//        int num = input.nextInt();
        System.out.printf("Factorial of %d is %d", num, getFactorial(num));
        System.out.println();
//        input.close();

        //dice
        rollDice();


    }

    //1.a addition
    public static int addNumbers(int x, int y){
        return x + y;
    }

    //1.a subtraction
    public static int subNumbers(int x, int y){
        return x - y;
    }

    //1.a multiplication
//    public static int multNumbers(int x, int y){
//        return x * y;
//    }
    //bonus.a
//    public static int multNumbers(int x, int y){
//        int sum = 0;
//        for (int i = 0; i < x; i++) {
//            sum = sum + y;
//        }
//        return sum;
//    }
    //bonus.b
    public static int multNumbers(int x, int y){
        if(y == 0){
            return 0;
        }
        if(y > 0){
            return (x + multNumbers(x, y -1));
        }
        return -1;
    }

    //1.a division
    public static int divNumbers(int x, int y){
        return x / y;
    }

    //1.d modulus
    public static int modNumbers(int x, int y){
        return x % y;
    }

    // 2.
    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int num = input.nextInt();
        if(num < 1 || num > 10){
            return getInteger(min,max);
        }
        return num;
    }

    // 3.
    public static long getFactorial( int num) {
        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

    // 4.
    public static int randomNumber(int max){
        return (int)Math.floor(Math.random() * (max + 1) );
    }

    public static void rollDice(){
        Scanner input = new Scanner(System.in);
        boolean exitChoice = false;

        System.out.println("Enter the number of sides for the dice: ");
        int diceSides = input.nextInt();

        do {
            System.out.println("Roll the dice with ENTER!");
            String roll = input.nextLine();

            System.out.println("1st dice: " + randomNumber(diceSides));
            System.out.println("2nd dice: " + randomNumber(diceSides));

            System.out.println("Say yes to roll again!");
            String rollAnswer = input.nextLine();

            if(rollAnswer.equalsIgnoreCase("yes")){
                exitChoice = true;
            }

        }while(exitChoice);
    }
}
