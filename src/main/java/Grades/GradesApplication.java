package Grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GradesApplication {
    private static Input myInput = new Input();
    private static HashMap<String, Student> students = new HashMap<>();
    private static Set<String> keys = students.keySet();

    public static void main(String[] args) {

        Student Andrea = new Student("Andrea", new ArrayList<>());
        Andrea.addGrade(100);
        Andrea.addGrade(99);
        Andrea.addGrade(95);
        Student Micah = new Student("Micah", new ArrayList<>());
        Micah.addGrade(93);
        Micah.addGrade(99);
        Micah.addGrade(100);
        Student Emi = new Student("Emi", new ArrayList<>());
        Emi.addGrade(100);
        Emi.addGrade(80);
        Emi.addGrade(95);
        Student Matt = new Student("Micah", new ArrayList<>());
        Matt.addGrade(99);
        Matt.addGrade(90);
        Matt.addGrade(88);

        students.put("andreaUsername", Andrea);
        students.put("micahUsername", Micah);
        students.put("emiUsername", Emi);
        students.put("mattUsername", Matt);

        printMenu();
        while (true) {

            System.out.println("What student would you like to see more information on?");

            String userInput = myInput.getString();

            doChoiceOne(userInput);

            String doNext = myInput.getString("Would you like to see another student?");

            if(doNext.equalsIgnoreCase("no")){
                System.out.println("okay bye!");
                break;
            }
        }

    }
    private static void printMenu(){
        System.out.printf("""
                Welcome!

                Here are the Github usernames of our students:

                %s
                                
                """,keys);
    }
    private static void doChoiceOne(String userInput){
        if(!students.containsKey(userInput)){
                System.out.printf("Sorry, no student found with the GitHub username of %s.%n",userInput);
        }else {
                System.out.println(students.get(userInput).toString());
        }

    }

}
