package grocerylist;


import util.Input;

import java.util.*;

public class GroceryListApplication {
    private static Input userInput = new Input();

    private static final ArrayList<String> CATEGORIES = new ArrayList<>(Arrays.asList("bakery", "condiments", "dairy", "frozen", "meat", "produce"));

    private static final HashMap<String, Grocery> groceryList = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("Would you like to create a grocery list?(yes/no)");

        String initialResponse = userInput.getString();

        if (initialResponse.equalsIgnoreCase("yes")) {

            while (true) {

                System.out.println("Would you like to enter a new item?(yes/no)");
                String input = userInput.getString();

                if (input.equalsIgnoreCase("no")) {

                    break;

                }else if(input.equalsIgnoreCase("yes")) {

                    chooseCategory();

                    System.out.println("Do you want to finalize the list?(yes/no)");
                    String finalize = userInput.getString();

                    if (finalize.equalsIgnoreCase("yes")) {

                        sortListItems(groceryList);
                        break;

                    }
                }else{
                    System.out.println("That's not yes or no...");
                }
            }
        }
    }

    public static void chooseCategory() {

            System.out.println("Choose a category: ");

            for (int i = 0; i < CATEGORIES.size(); i++) {
                System.out.println(CATEGORIES.get(i));
            }

            String categoryInput = userInput.getString();
            if (categoryInput.equalsIgnoreCase("produce") || categoryInput.equalsIgnoreCase("meat") || categoryInput.equalsIgnoreCase("dairy") || categoryInput.equalsIgnoreCase("frozen") || categoryInput.equalsIgnoreCase("bakery") || categoryInput.equalsIgnoreCase("condiments")) {

                addListItem(categoryInput);

            } else{
                System.out.println("That's not a category...");
            }
            userInput.getScanner().nextLine();

    }
    public static void addListItem(String category){

        String groceryItemName = userInput.getString("Enter a grocery item name: ");

        int groceryItemCount = userInput.getInt("Enter how many you will get: ");

        groceryList.put(category, new Grocery(groceryItemName, category,groceryItemCount));
        System.out.println(groceryList);

    }
    public static void sortListItems(HashMap groceryList){

        ArrayList <String> sortedGroceryItems;
        sortedGroceryItems = new ArrayList<>(groceryList.keySet());

        Collections.sort(sortedGroceryItems);

        for (String key : sortedGroceryItems) {
            System.out.println(key + ":" + groceryList.get(key));
        }
    }
}
