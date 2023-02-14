package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input userInput = new Input();
        boolean exit = false;
        System.out.println("Make a circle! Enter the radius: ");
        do {
            Circle circle = new Circle(userInput.getInt());

            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());

            userInput.getString();

            System.out.println("Make another circle?");
            boolean keepGoing = userInput.yesNo();
            System.out.println(keepGoing);


            if(!keepGoing){
                System.out.println("You made "+ Circle.getCircleCounter() + " circles!");
                break; //System.exit(1); successful exit has a 1
            }
        }while(!exit);
    }
}
