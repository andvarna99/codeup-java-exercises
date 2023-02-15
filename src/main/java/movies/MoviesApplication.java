package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    //initializing stuff right when you declare it pops up right when the class is loaded
    private static Movie[] movies = MoviesArray.findAll();
    private static Input myInput = new Input();

    public static void main(String[] args) {

        //try to keep main simple and hide the details in other methods/functions
        while(true) {
            //print the menu
            printMenu();
            //wait for user to enter a choice
            int answer = myInput.getInt();
            //do the choice
            doChoices(answer);
            //until users choice is zero
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
                    8 - add a movie
                                    
                    Enter your choice:
                    """);
    }
    private static void doChoices(int answer){
        for (int i = 0; i < movies.length; i++) {
            if (answer == 1) {
                //print all movies
                printAllMovies();
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
            }else if(answer == 8){
                //get the new line out of the buffer
                myInput.getString();
                //add a movie
                addMovie();
                break;
            }else if (answer == 0) {
                    break;
                }
        }
    }
    private static void printAllMovies(){
        //print all movies to the console
        for (Movie movie : movies) {
            System.out.println(movie);
        //System.out.println(movies[i].getName() +"--"+ movies[i].getCategory()); //this works but its simpler to do it the other way
        }
        //to put a blank line at the end of the movies
        System.out.println();
    }
    private static void viewMoviesByCategory(Movie[] movies, String category, int i) {
            if(movies[i].getCategory().equals(category)){
                System.out.println(movies[i].getName() + "--" + movies[i].getCategory());
            }
    }

    //bonus
    public static void addMovie(){
        //get new movie info from user
        String movieName = myInput.getString("Enter a movie name: ");
        String movieCategory = myInput.getString("Enter a movie category: ");

        //make the movie here
        Movie movie = new Movie(movieName, movieCategory);

        //overwrite movies with a new copy of itself with an extra slot
        movies = Arrays.copyOf(movies, movies.length + 1);
        movies[movies.length -1] = movie;
    }

}

