package Demos;

public class ObjectDemo {

    public static void main(String[] args) {
        Person alex = new Person("Alex","G","S");
//        Person.personCounter++; //how to access the shared static variable we use the class name

        alex.setFirstName("Alex");
        alex.setMiddleName("G");
        alex.setLastName("S");
        System.out.println(alex.getFirstName());
        System.out.println(alex.getMiddleName());
        System.out.println(alex.getLastName());
        System.out.println(alex.sayHello());

        Person sue = new Person("Sue");
//        Person.personCounter++;
//        sue.setFirstName("Sue");
        System.out.println(sue.sayHello());

    }
}
