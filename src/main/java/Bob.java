import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String message = input.nextLine();

        do {
            if (message.contains("?")) {
                System.out.println("""
                        Bob says: "Sure."
                        """);
            } else if (message.contains("!")) { // message.endsWith("!")
                System.out.println("""
                        Bob says: "Woah chill out!"
                        """);
            } else if (message.equals("")) { //message.trim().length() == 0
                System.out.println("""
                        Bob says: "Fine. Be that way!"
                        """);
            } else {
                System.out.println("""
                        Bob says: "Whatever."
                        """);
            }
            message = input.nextLine();
        } while (!message.equalsIgnoreCase("bye"));

        input.close();

    }
}
