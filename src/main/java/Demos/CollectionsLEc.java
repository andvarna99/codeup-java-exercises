package Demos;

import PlayGround.Fighter;
import PlayGround.Ninja;

import java.util.*;

public class CollectionsLEc {
    public static void main(String[] args) {
        //think of collections as a way to group things together
        //say you want to group fruits together instead of using an array you can use a list, a set, or a map

//    ------array list-------
            //if you want a dynamic or flexible array use an array list
            //not a good choice for doing precise look up

            //initialization and declaration is more complicated:
            //need to import the class and declare the type in the angled brackets, called a generic

            //this one is specific to holding strings, could say its an array list of objects;
            // BUT you cant access the specific subclass without casting

        //array list syntax
        ArrayList <String> foods = new ArrayList<>();
        //add foods: expecting a string
        foods.add("pizza");
        foods.add("shepard's pie");
        System.out.println(foods); //prints out a string version of itself without having to call array to string
        //can also see that we didnt have to do any resizing; finally getting back to the conveniences of javascript arrays

        //adding an array to the list
        String [] otherFoods = {"kibble","bits"};
        foods.addAll(Arrays.asList(otherFoods)); //can also put the strings where otherFoods is
        System.out.println(foods);

        //use arraylist as initializer
        foods = new ArrayList<>(Arrays.asList("apple", "banana"));
        foods.add("pear");
        System.out.println(foods);

        //how to loop: has a size method not a property
        System.out.println(foods.size());
        foods.add("cake");
        System.out.println(foods.size());

        //get an element at a given index: similar to arrays; use size instead of index
        System.out.println(foods.get(foods.size()-1));

        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }
        for (String food : foods) {
            System.out.println(food);
        }

        //indexOf
        System.out.println(foods.indexOf("cake")); //returns 3
        System.out.println(foods.indexOf("apple")); //returns 0
        System.out.println(foods.indexOf("nutrigrain bar")); //returns -1 as it's not found and is an invalid index
        foods.add("cake");
        System.out.println(foods);
        System.out.println(foods.lastIndexOf("cake")); //index of the 2nd occurance of cake

        //.contains
        System.out.println(foods.contains("Cake"));
        System.out.println(foods.contains("cake"));
        System.out.println(foods.contains("nutrigrain bar"));

        //.remove()
        //located using the equals method
        //arrays as list is mutable
        //list of is immutable
//        foods.remove("cake");
        foods.removeAll(List.of("apple","cake")); //has advantages over Arrays.asList
        System.out.println(foods);

        //.removeAll
        foods.removeAll(Arrays.asList("apple","cake"));

        //isEmpty
        System.out.println(foods.isEmpty());

//***************************************************************************

//    ------hash map------
        //if you want easy quick efficient finding if things use a map; meant to provide key to values
        //really quick ways to look things up if you know what you're looking for
        //like a filing cabinets tabs to help you find what you're looking for: called a KEY
        //the thing in the folder is called the VALUE
        //we find a specific value by looking for its key, but you HAVE to know the key
        //a kind of map
        //have to specify two things, the data type of the key and the data type of the value
        HashMap<String, Fighter> roster = new HashMap<>();
        Fighter knull = new Fighter("Knull");
        roster.put("Knull", knull); //i don't have the knull variable
        System.out.println(roster);
        //like we've taken a folder, assigned a name to it, and put it in our filing cabinet

        //.putIfAbsent
        roster.putIfAbsent("Knull",null);
        System.out.println(roster);

        //getOrDefault
//        f1 = roster.getOrDefault("KnullXXX", new Fighter());

        //containsKey
        System.out.println(roster.containsKey("Knull"));
        System.out.println(roster.containsKey("KnullXXX"));

        //contains value: may need to define .equals
        System.out.println(roster.containsValue(knull));

        Fighter checkFighter = new Fighter ("Knull");

        System.out.println(roster.containsValue(checkFighter));

        //.replace
        System.out.println(roster);
        roster.replace("Knull", null);
        System.out.println(roster);

        //.remove
        roster.remove("Knull");
        System.out.println(roster.isEmpty()); //returns true

        roster.clear(); //clears the hashmap

        //how to iterate over the hashmap with .keySet or foreach with .get()
        roster.put("bob",new Fighter("Bob"));
        roster.put("sue",new Ninja("Sue"));
        roster.put("bragnar",new Ninja("Ragnar"));

        //have to grab the set of keys first then we iterate over each of the keys
        Set<String> keys = roster.keySet();
        for (String key : keys) {
            Fighter aFighter = roster.get(key);
            System.out.println(aFighter);
        }

//****************************************************************************

//    ------hash set------
        //if you want to keep track of non-duplicate things use a set
        //if you need to eliminate duplicates use the set



    }
}
