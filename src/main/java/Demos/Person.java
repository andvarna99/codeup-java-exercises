package Demos;

class Person { //blueprint for making a person object

    //when the program starts it creates space for this variable for the whole class and
    // initiallizes it to zero
    public static int personCounter = 0;
    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String firstName, String middleName, String lastName) {
        personCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Person(String firstName) {
        this(firstName,"","");
    }

    public Person(){
        this("","","");
        System.out.println("no arg constructor called");
    }

    //this function can only be called on an object
    public String sayHello(){ //doesn't need to use getter because its in the person class
        return String.format("Hello from %s %s! Person counter is %d", firstName, lastName, personCounter);
    }

//    public static void foo(){
//        lastName = "X"; // static shuffle
//    }

    //should a person be a runnable program?
    //just for testing
    //every single class can have a main; doesn't mean it should, but it can
    public static void main(String[] args) {
//        this.middleName = "X";
//        Person rick = new Person(); //tells computer to take person class and make a new object from it
//
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
//        System.out.println(rick.sayHello());
//        //prints "Hello from Rick Sanchez!"
//
//
//        Person sue = new Person();
//        sue.firstName = "Sue";
//        sue.lastName = "Smith";
//        System.out.println(sue.sayHello());
//        //prints "Hello from Sue Smith!"
    }

    // ---accessors---
    //getter does not have a void return, you don't pass it a parameter,
    // set the return to the field you want to get
    public String getFirstName() {
        return firstName;
    }
    //setter have a void return type, pass as a parameter first name and uses this to refer to the
    // field and sets it equal to the value you passed to it
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
