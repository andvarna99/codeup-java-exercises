import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenExercise {

    private static Input userInput = new Input();

    public static void main(String[] args) {

        String input = userInput.getString("Enter Something: ");

        System.out.printf("You entered: %s", input);

        System.out.println();

        if(!StringUtils.isNumeric(input)){
            System.out.printf("'%s' is not a number!",input);
        }

        System.out.println();

        String swapCase = StringUtils.swapCase(input);

        System.out.printf("Flipped case: %s",swapCase);

        System.out.println();

        String reversed = StringUtils.reverse(input);

        System.out.printf("Reversed: %s",reversed);
    }
}
