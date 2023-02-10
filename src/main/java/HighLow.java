import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
    gameDev();
    }

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

}
