package Demos;

public class PersonException  extends RuntimeException{
//    extending from runtime exception makes it unchecked by default
    public PersonException(String message){
        super(message);
    }
}
