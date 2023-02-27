package Demos;

import PlayGround.Fighter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLec {
    public static void main(String[] args) {
        Path aDir = Paths.get("adir");
        Path aFile = Paths.get("adir","afile.txt"); //overloaded function where you can specify as many paths as you want

        System.out.println(Files.exists(aDir));

        if(!Files.exists(aDir)){
            try {
                Files.createDirectories(aDir);
                System.out.println("Directory created");
            } catch (IOException e) {
                System.out.println("createDirectory exception: " + e.getMessage());
            }
        }else{
            System.out.println("the directory exists already");
        }
        //first step towards us being able to make our programs persistent (have data stick around)

        if(!Files.exists(aFile)){ //can also do this creation without the if statement by using another catch with FileAlreadyExists instead of the else
            try {
                Files.createFile(aFile);
                System.out.println("File created");
            } catch (IOException e) {
                System.out.println("createFile exception: " + e.getMessage()); //e.getMessage is what happened to the file
                e.printStackTrace();
            }
        } else{
            System.out.println("the file exists!");
        }
        //don't use single letter variable names EXCEPT as a control variable in a loop (i,j,k) or in a catch (e)

        //more specific errors HAVE to go at the top of the catch when you have more than one

//--------writing to a file with strings--------
        //using java strings are weird: string auto does some things
        List<String> fruits = Arrays.asList("apple", "pear", "banana"); //overrides data when you rerun it
        try {
            //, StandardOpenOption.APPEND
            Files.write(aFile, fruits); //appends/adds data when you rerun it
        } catch (IOException e) {
            System.out.println("file write exception: " + e.getMessage());
        }

//--------reading a file of strings--------
//        try {
//            List<String> fileStrings = Files.readAllLines(aFile);
//            System.out.println(fileStrings.size());
//            System.out.println(fileStrings);
//        } catch (IOException e) {
//            System.out.println("file read exception: " + e.getMessage());
//        }

//--------writing a file with objects--------
        Fighter bob = new Fighter("bob"); //we need a method that can turn bob into a string
        Fighter sue = new Fighter("sue");
        sue.setStrength(1000);
        sue.setHealth(1000);
//        System.out.println(bob.toFileString());

        List<String> fighterStrings = Arrays.asList(bob.toFileString(),sue.toFileString());
        try {
            //, StandardOpenOption.APPEND
            Files.write(aFile, fighterStrings); //appends/adds data when you rerun it
        } catch (IOException e) {
            System.out.println("file write exception: " + e.getMessage());
        }

//--------making a string into an object--------
        try {
            List<String> fileStrings = Files.readAllLines(aFile);
            Fighter cloneofBob = Fighter.fromFileString(fileStrings.get(0));
            System.out.println("cloneofBob = " + cloneofBob);
//            System.out.println((cloneofBob));
//            System.out.println(fileStrings.size());
//            System.out.println(fileStrings);
        } catch (IOException e) {
            System.out.println("file read exception: " + e.getMessage());
        }

    }
}
