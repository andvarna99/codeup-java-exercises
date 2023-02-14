package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
//        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    public boolean yesNo(){
        System.out.println("Enter yes/y: ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int num = scanner.nextInt();
        if (num >= min && num <= max) {
            System.out.println(num + " is between " + min + " and " + max + "!");
        }else {
            return getInt(1, 10);
        }
        return num;
    }

    public  int getInt(){
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        return input;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal between " + min + " and " + max + ":");
        double dec = scanner.nextDouble();
        if (dec >= min && dec <= max) {
            System.out.println(dec + " is between " + min + " and " + max + "!");
        }else {
            return getDouble(1, 10);
        }
        return dec;
    }

    public double getDouble(){
        System.out.println("Enter a decimal: ");
        double input = scanner.nextDouble();
        return input;
    }

}
