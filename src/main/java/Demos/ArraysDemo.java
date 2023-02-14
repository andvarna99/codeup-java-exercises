package Demos;

import util.Input;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        //demo
        int [] ages = new int [10]; // arrays must be initialized with the new keyword
        ages[0]= 42;
        ages[5]= 75;

        Input input = new Input();
        System.out.println("How many elements? ");
        int arrayLength = input.getInt();
        ages = new int[arrayLength];

//        ages[11]=25; //array out of bounds exception
        System.out.println(Arrays.toString(ages));

        String [] daysOfWeek = {"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"};
        System.out.println(Arrays.toString(daysOfWeek));

        //loops and arrays
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
            daysOfWeek[i]="blah";
        }
        System.out.println(Arrays.toString(daysOfWeek));

        for (String day: daysOfWeek) { //for each day in days of week array
            System.out.println(day);
            day = "blah";
        }
        //fill
//        Arrays.fill(daysOfWeek, "blah");
        System.out.println(Arrays.toString(daysOfWeek));

        //equals
        String [] otherArray = {"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"};
//        Arrays.fill(otherArray, "blah");
        System.out.println(daysOfWeek == otherArray);
        System.out.println(Arrays.equals(daysOfWeek, otherArray));

        //copy of
        String []newArray = Arrays.copyOf(daysOfWeek,10);
        System.out.println(Arrays.toString(newArray));

        daysOfWeek = Arrays.copyOf(daysOfWeek, 15);
        System.out.println(Arrays.toString(daysOfWeek));

        //sort
        Arrays.sort(daysOfWeek); // lowercase and uppercase letters are sorted differently and so are numbers
        System.out.println(Arrays.toString(daysOfWeek));

        //would import the fighter class form other class but i dont have it created
//        Fighter [] arena = new Fighter [5];
//        System.out.println(Arrays.toString(arena));
//
//        arena[0] = new Fighter("Knull");
//        System.out.println(Arrays.toString(arena));


    }
}
