import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        1. array basics
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person [] people = new Person[3]; //this is an array of null until we declare the objects at each index
        people[0] = new Person("Andrea");
        people[1] = new Person("Jacob");
        people[2] = new Person("Lily");

        //this works because we've declared the toString method in the person class
        System.out.println(Arrays.toString(people));

        //we dont need to use toString here because were already looping through the array, so it'll show the correct info
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        people = addPerson(people, new Person("Lucy"));
        System.out.println(Arrays.toString(people));
    }
    public static Person[] addPerson(Person[] people, Person newPerson) {
        //create a copy of people that has one new extra slot in it
        Person []newPeopleArray = Arrays.copyOf(people,people.length+1);
        newPeopleArray[newPeopleArray.length -1] = newPerson;
        return newPeopleArray;
    }

}
