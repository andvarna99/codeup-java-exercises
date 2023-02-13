import java.util.Scanner;

public class HighLow {

    public static int randomNumber(int max, int min){
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void gameDev(){
        Scanner input = new Scanner(System.in);

        int guessedNum;
        int generatedNum = randomNumber(100,1);

        while(true) {
            System.out.println("Guess a number between 1 and 100: ");
            guessedNum = input.nextInt();

            if (guessedNum < generatedNum) {
                System.out.println("HIGHER");
            } else if (guessedNum > generatedNum) {
                System.out.println("LOWER");
            } else if (guessedNum == generatedNum) {
                System.out.println("GOOD GUESS!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        gameDev();

//        review code
//        int myNumber = (int)(Math.random() * 100) + 1;
//        int guesses = 0;
//        int userInput;
//        do {
//            System.out.println("Choose a number between 1-100");
//
//            userInput = MethodsExercises.getInteger(1, 100);
//
//            compareGuess(userInput,myNumber);
//
//            guesses ++;
//
//            if(guesses > 5){
//                break;
//            }
//
//        }while(userInput != myNumber);
//        System.out.println("GAME OVER");
//        System.out.println("You made " + guesses + " guesses");
    }
//    public static void compareGuess(int userInput, int answer){
//        if (userInput > answer) {
//            System.out.println("LOWER");
//        } else if (userInput < answer) {
//            System.out.println("HIGHER");
//        } else {
//            System.out.println("GOOD GUESS");
//        }
//    }
}
