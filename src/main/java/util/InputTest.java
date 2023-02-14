package util;

public class InputTest {

    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println(userInput.getString("Enter a string: "));
        System.out.println(userInput.yesNo("Enter yes/y: "));
        System.out.println(userInput.getInt(1,10));
        System.out.println(userInput.getInt("Enter a number: "));
        System.out.println(userInput.getDouble(1,10));
        System.out.println(userInput.getDouble("Enter a decimal: "));
    }
}
