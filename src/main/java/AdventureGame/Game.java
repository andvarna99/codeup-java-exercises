package AdventureGame;

import util.Input;

public class Game {
    private static final Input input = new Input();
    private static final int EXIT = 0;
    private static final int CREATE_CHARACTER = 1;
    private static final int PRINT_CHARACTER = 2;


    private static Hero theHero = null;

    public static void main(String[] args) {
        //welcome screen
        printWelcome();
        //loop until user quits
        while(true){
            //print menu
            printMenu();

            System.out.println("Enter a number: ");
            int choice = input.getInt(0,5);
            //process users choice
            doChoice(choice);
            //if user quits then break
            if(choice == EXIT){
                break;
            }
        }
        //hero initialization

    }

    private static void doChoice(int choice) {
        switch(choice){
            case CREATE_CHARACTER:
                theHero = createCharacter();
                break;
            case PRINT_CHARACTER:
                printHero();
                break;
        }
    }

    private static void printHero() {
        System.out.println(theHero);
    }

    private static Hero createCharacter() {
        String name = input.getString("Enter your character's name: ");
        Hero hero = new Hero(name);
        return hero;
    }

    private static void printMenu() {
        System.out.println("""
                0 - exit
                1 - create character
                2 - print character
                3 - fight something
                """);
    }

    private static void printWelcome() {
        System.out.println("Welcome to the game!");
    }
}
