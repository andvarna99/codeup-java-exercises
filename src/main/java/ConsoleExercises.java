import java.util.Scanner; //tells us where the scanner is in the jdk

public class ConsoleExercises {
    public static void main(String[] args) {
        //demo code
//        int a = -17;
//        String myName = "Bob";
//        double c = 12.57;

//        System.out.println("Howdy" + myName + "ag: " + a + " makes " + c + " bucks per hr.");
//        System.out.printf("Howdy %s age: %+05d makes %7.2f bucks per hr%n", myName, a, c);

//        Scanner input = new Scanner(System.in); //creates a new scanner object
//
//        System.out.print("Enter your name: "); //we print out this line of text
//        String aName = input.next(); // set the aName variable to the input method to receive input from the keyboard
//                                     //next pulls the next token out of the keyhold
//        System.out.println("Your name is " + aName);
//
//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//        System.out.println("Your age is" + age);
//
//        input.close();

        //exercise code
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %4.2f.%n",pi);
//
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
//
//        System.out.println("Enter an integer: ");
//        int myInt = input.nextInt();
//        System.out.println("Your integer is " + myInt);
//
//        input.nextLine(); // gets the input out of the buffer
//
//        System.out.println("Enter three words: ");
//        String firstString = input.next();
//        String secondString = input.next();
//        String thirdString = input.next();
//        System.out.printf("Your words are %s %s %s%n", firstString, secondString,thirdString);
//
//        input.nextLine(); // gets the input out of the buffer
//
//        System.out.println("Enter a sentence: ");
//        String mySentence = input.nextLine();
//        System.out.println("Your sentence is " + mySentence);

        System.out.println("Enter the length and width of the classroom: ");
//        String length = String.valueOf(Double.parseDouble(input.nextLine()));
//        String width = String.valueOf(Double.parseDouble(input.nextLine()));
//        String area = String.valueOf(Double.parseDouble(length) * Double.parseDouble(width));
//        String perimeter = String.valueOf((Double.parseDouble(length)*2)+(Double.parseDouble(width)*2));
        double length = input.nextDouble();
        double width = input.nextDouble();
        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("The length is: %s%nThe width is: %s%nThe area is: %s%nThe perimeter is: %s%n", length, width, area, perimeter);

        input.close();
    }
}
