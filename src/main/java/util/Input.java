package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo(){
//        System.out.println("Enter yes/y: ");
        String input = scanner.nextLine();
        //String response = getString();
        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int num = scanner.nextInt();
        //int anInt = getInt();
        if (num >= min && num <= max) {
            System.out.println(num + " is between " + min + " and " + max + "!");
        }else {
            return getInt(1, 10);
        }
        return num;
    }

    public  int getInt(){
        return scanner.nextInt();
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal between " + min + " and " + max + ":");
        double dec = scanner.nextDouble();
        //double aDouble = getDouble();
        if (dec >= min && dec <= max) {
            System.out.println(dec + " is between " + min + " and " + max + "!");
        }else {
            return getDouble(1, 10);
        }
        return dec;
    }

    public double getDouble(){
        return scanner.nextDouble();
    }
    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }

}
