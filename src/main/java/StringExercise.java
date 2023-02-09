public class StringExercise {
    public static void main(String[] args) {

    //demo code for Strings lesson

        //string immutability
//        String myName = "Bob";
//        myName = "Robert";
//
//        //string concatenation
//        int age = 42;
////        String formattedAge = Integer.toString(age);
//        String formattedAge = "" + age;
//
//        //string comparison
//        System.out.println(myName.startsWith("Rob")); //true
//        System.out.println(myName.startsWith("rob")); // false
//        System.out.println("DocRob".startsWith("D"));
//
//        System.out.println(myName.equals("Robert")); //instead of this
//        System.out.println("Robert".equals(myName)); //do this
//
//        System.out.println("DocRob".endsWith("Rob"));
//
//        //string manipulation
//        System.out.println("DocRob".charAt(2)); //prints c
//
//        System.out.println("DocRob".indexOf("Ro")); //prints index 3
//        System.out.println("DocRob".indexOf("ro")); // prints index of -1 as it's an invalid index
//        System.out.println("The quick brown fox jumped over the lazy dog.".indexOf(" ",3+1)); //finds the second match
//        int index = -1;
//        String bigString = "The quick brown fox jumped over the lazy dog.";
//        do{
//            index = bigString.indexOf(" ",index + 1);
//            if(index > -1) {
//                System.out.println("Found a space at index " + index);
//            }
//        }while(index > -1);
//
//        System.out.println(bigString.lastIndexOf(" ")); //searches from the end not beginning
//
//        System.out.println(bigString.length()); //returns the length of the string
//
//        String converted = bigString.replaceAll(" ", "|"); //as long as the pattern doesn't get too complicated this is okay to use
//        System.out.println(converted); // the thing you search for is a regular expression
//
//        String replaced = bigString.replace(' ', '|'); // make sure you use single quotes for characters
//        System.out.println(replaced);
//
//        System.out.println(bigString.substring(4,21)); //returns text from one index to another
//
//        System.out.println(bigString.toUpperCase()); //returns string in all uppercase
//
//        System.out.println("   the quick   ".trim() + "XXXXXX"); //doesn't modify actual contents but returns a reference to a new string with whitespace removed and x's added

        //1.String Basics

        String lyrics = """
                we don't need no education
                we don't need no thought control
                """;
        System.out.println(lyrics);

        String quotes = """
                Check "this" out!, "s inside of "s!
                """;
        System.out.println(quotes);

        String windows = """
                In windows, the main drive is usually C:\\
                """;
        System.out.println(windows);

        String backslash = """
                I can do backslashes \\, double backslashes \\\\,
                and the amazing triple backslash \\\\\\!
                """;
        System.out.println(backslash);

    }
}
