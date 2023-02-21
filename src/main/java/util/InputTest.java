package util;

public class InputTest {

    public static void main(String[] args) {
        Input userInput = new Input();

        //we don't want this to crash
        int anInt = userInput.getInt();
        System.out.println(anInt);

        double aDouble = userInput.getDouble();
        System.out.println(aDouble);

        int aBinary = userInput.getBinary();
        System.out.println(aBinary);

        int aHex = userInput.getHex();
        System.out.println(aHex);

        System.out.println(userInput.getString("Enter a string: "));
        System.out.println(userInput.yesNo("Enter yes/y: "));
        System.out.println(userInput.getInt(1,10));
        System.out.println(userInput.getInt("Enter a number: "));
        System.out.println(userInput.getDouble(1,10));
        System.out.println(userInput.getDouble("Enter a decimal: "));
    }
}
