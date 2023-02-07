public class SyntaxTypesVariables {
    public static void main(String[] args) {
        //demo code
//        byte myByte = 127;
//        myByte += 1;
//        System.out.println(myByte); // logs -128
//
//        String myString = "This is a string";
//        System.out.println(myString);
//
//        double pi = 3.14159;
//        int almostPi = (int) pi;

        //exercise code
        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        String myString = "This is a string";
        System.out.println(myString);

        float myNumber = 123; // decimals don't work because you need to use the double data type or cast it
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++); //5
//        System.out.println(x); //6
        //difference between the two is the first is a post increment and the second is a pre increment
        //the first returns x then adds one while the second adds one to x then returns x
//        int x = 5;
//        System.out.println(++x); //6
//        System.out.println(x); //6

        //class is a reserved word
        //int class;

        //produces two errors: the first is a string cannot be cast to a class integer,
        // the second is the string can't be converted to an integer
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

        int x = 4;
//        x = x + 5;
        x += 5;
        System.out.println(x);

        int a = 3;
        int b = 4;
//        b = b * a;
        b *= a;
        System.out.println(b);

        int c = 10;
        int d = 2;
//        c = c / d;
//        d = d - c;
        c /= d;
        d -= c;
        System.out.println(c); //5
        System.out.println(d); //-3

        //if you assign a value to a numerical variable that is larger (or smaller) than the type can hold it will not work
//        byte myByte = 128;
        //if you increment a numeric variable past the type's capacity it will log the lowest possible number instead
//        byte myByte = 127;
//        myByte += 1;
//        System.out.println(myByte);
//
//        int myInt = Integer.MAX_VALUE;
//        myInt += 1;
//        System.out.println(myInt);
    }
}
