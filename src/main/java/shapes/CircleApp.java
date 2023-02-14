package shapes;

import util.Input;

public class CircleApp {
    private static int circleCounter = 0;

    public static void main(String[] args) {
        Input userInput = new Input();
        boolean exit = false;
        do {
            Circle circle = new Circle(userInput.getInt());

            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());

            userInput.getString();

            System.out.println("Make another circle?");
            boolean keepGoing = userInput.yesNo();
            System.out.println(keepGoing);

            circleCounter++;

            if(!keepGoing){
                System.out.println("You made "+ circleCounter + " circles!");
                break;
            }
        }while(!exit);
    }
}
