import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        1. array basics
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person [] people = new Person[3];
        people[0] = new Person("Andrea");
        people[1] = new Person("Jacob");
        people[2] = new Person("Lily");

        System.out.println(Arrays.toString(people));

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        people = addPerson(people, new Person("Lucy"));
        System.out.println(Arrays.toString(people));
    }
    public static Person[] addPerson(Person[] people, Person person) {
            //    copy of
        Person []newPeopleArray = Arrays.copyOf(people,people.length+1);
        newPeopleArray[newPeopleArray.length -1] = person;
        return newPeopleArray;
    }

}
