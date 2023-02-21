package Demos;

public class ExceptionsLec {
    public static void main(String[] args) {
//     ---THROWING EXCEPTIONS---
//            -no code executes until the exception is handled
//            -when you throw an exception you can make that a signal to use
//            -you don't always want to handle the exception in the same function

//            -two ways to respond (handle) an exception appropriately: try/catch and finally
//            -structured: try is its own code block
//            -figuring out the exceptions is really up to the try block
//            -try catch has some overhead on computer side
//            -you want catch to be as specific as possible
        try {
            throw new RuntimeException("boo");
//            no other code inside the try block will be executed after the throw
//            System.out.println("will this code print");   //will not print
        }catch(RuntimeException e){
            System.out.println("an exception occured: ");
        }finally{
            //anything in finally block will execute after the catch
            //mostly cleanup goes in the finally
            System.out.println("finally code always executes");
        }
        System.out.println("program is still going");

//     ---using arithmetic as an example---
        try {
            int x = 5 / 0;
        }catch(ArithmeticException e){
            System.out.println("Don't divide by zero!");
        }

//     ---ArrayIndexOutOfBounds EXAMPLE---
//          -you can handle all kinds of exceptions in one try catch block with multiple catches: most specific handler has to go first
//          -if the function is doing something where there is a chance for an error to occur the function/method
//          should be put in a try/catch
//          -you want to avoid having a try/catch inside a try/catch
        try {
            int[] nums = new int[10]; //this is visible only within the braces it is declared in (not visible in the catch or after)
            nums[11] = 4; //out of bounds error
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Does the exception handler print?"); //this is the most specific catch so it executes
//            System.out.println(nums); //wont work as scope is incorrect: int nums must be declared outside the try/catch
        }catch(Exception e){
            System.out.println("Does the exception handler print?");
        }

//     ---CHECKED AND UNCHECKED EXCEPTIONS---
//          -in java file errors are out of control of program and are very possible to happen:
//          they are not the fault of programmer; these errors are called checked exceptions
//          -runtime exceptions are unchecked by default
//          -surround exception in a try catch or throw it up to the caller

//              ---CHECKED EXCEPTIONS---
//              -all exceptions inherit from Exception and Exception is checked by default
//              -intellij gives us two ways to handle: throw in a try/catch or throwing it up to the caller
        try {
            throw new Exception("checked exception");
        }catch(Exception e){
//            throw new RuntimeException(e);
        }

//              ---UNCHECKED EXCEPTIONS---
//                  -you do not want to throw the call to the main ever
//                  -if you want to print the stack trace it's okay to do that in the catch
//                  -considered clean practice:
//                      -bundling up exceptions into a single runtime exception
//                      -picking good variable names
//                      -good function names
//                      -classes as small as possible
//                      -make exception messages helpful

        try {
            String userInput = getUserInput();
        } catch (Exception e) {
            System.out.println("hey man chill out");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//     ---CUSTOM EXCEPTIONS---
//          -using PersonException to create the custom exception
//          -for what we do the way we use them is useful for having application specific exceptions
        Person p = new Person("bob"); //added code to the Person class to throw the exception

    }

    private static String getUserInput() throws Exception {
        throw new Exception("the user hates us!"); //are checked; so we have to try/catch or throw it to caller
    }
}
