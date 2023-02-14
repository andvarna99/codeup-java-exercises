package util;

public class InputTest {

    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println(userInput.getString());
        System.out.println(userInput.yesNo());
        System.out.println(userInput.getInt(1,10));
        System.out.println(userInput.getInt());
        System.out.println(userInput.getDouble(1,10));
        System.out.println(userInput.getDouble());
    }
}
