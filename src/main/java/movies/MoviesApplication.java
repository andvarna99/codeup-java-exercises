package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    private static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Input myInput = new Input();

        while(true) {
            printMenu();
            int answer = myInput.getInt();
            doChoices(answer);
            if(answer == 0){
                break;
            }
            }
        }
    private static void printMenu(){
        System.out.println("""
                    What would you like to do?
                                    
                    0 - exit
                    1 - view all movies
                    2 - view movie in the animated category
                    3 - view movies in the drama category
                    4 - view movies in the horror category
                    5 - view movies in the sci-fi category
                    6 - view movies in the musical category
                    7 - view movies in the comedy category
                                    
                    Enter your choice:
                    """);
    }
    private static void doChoices(int answer){
        for (int i = 0; i < movies.length; i++) {
            if (answer == 1) {
                //print all movies
                System.out.println(movies[i].getName() +"--"+ movies[i].getCategory());
            } else if (answer == 2) {
                //print animated movies
                viewMoviesByCategory(movies,"animated", i);
            } else if (answer == 3) {
                //print drama movies
                viewMoviesByCategory(movies,"drama", i);
            } else if (answer == 4) {
                //print horror movies
                viewMoviesByCategory(movies,"horror", i);
            } else if (answer == 5) {
                //print sci-fi movies
                viewMoviesByCategory(movies,"scifi", i);
            } else if (answer == 6) {
                //print musical movies
                viewMoviesByCategory(movies,"musical", i);
            } else if (answer == 7) {
                //print comedy movies
                viewMoviesByCategory(movies,"comedy", i);
            }else if (answer == 0) {
                    break;
                }
        }
    }
    private static void viewMoviesByCategory(Movie[] movies, String category, int i) {
            if(movies[i].getCategory().equals(category)){
                System.out.println(movies[i].getName() + "--" + movies[i].getCategory());
            }
    }

}

