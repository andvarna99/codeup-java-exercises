
public class Person {

    private String name; //name field not static so you can change the name of each person

    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println("Hello from " + name + "!");
    }

    public Person(String name) { //constructor
        this.name = name;
    }

    public static void main(String[] args) {
        Person andrea = new Person("Andrea");
//        andrea.setName("Andrea");
        System.out.println(andrea.getName());
        andrea.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

    //accessors
    public String getName(){ //getter
    //TODO: return the person's name
        return name;
    }
    public void setName(String name){ //setter
    //TODO: change the name field to the passed value
        this.name = name;
    }
}
