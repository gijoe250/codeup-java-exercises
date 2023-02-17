package movies;

import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoviesApplication {
//    Create a class named MoviesApplication that has a main method.
//    Give the user a list of options for viewing all the movies or viewing movies by category.
//    Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//    If a category is selected, only movies from that category should be displayed.
//    Your application should continue to run until the user chooses to exit.
    private Movie[] movieList;

    public static void main(String[] args){
        Input input = new Input();
        boolean go = true;

        Movie[] movieList = MoviesArray.findAll();

        while(go){
            int userInput = input.getInt(
                    "What would you like to do?\n" +
                            "\n" +
                            "0 - exit\n" +
                            "1 - view all movies\n" +
                            "2 - view movies in the animated category\n" +
                            "3 - view movies in the drama category\n" +
                            "4 - view movies in the horror category\n" +
                            "5 - view movies in the scifi category\n" +
                            "6 - view movies in the musical category\n" +
                            "7 - add a movie to the list");
            if (userInput == 0){
                break;
            }
            if (userInput == 1){
                filterMovies("all",movieList);
            } else if (userInput == 2) {
                filterMovies("animated",movieList);
            }else if (userInput == 3) {
                filterMovies("drama", movieList);
            }else if (userInput == 4) {
                filterMovies("horror", movieList);
            }else if (userInput == 5) {
                filterMovies("scifi", movieList);
            }else if (userInput == 6) {
                filterMovies("musical", movieList);
            } else if (userInput == 7) {
                String movieName = input.getString("Enter a movie name");
                String movieCategory = input.getString("Enter one of the following for the category for the movie: \n" +
                        "animated, drama, horror, scifi, musical");
                Movie newMovie = new Movie(movieName, movieCategory);

                MoviesArray.addMovie(movieList, newMovie);
            }

            go = input.yesNo();
        }
    }

    public static void filterMovies(String category, Movie[] movieList){
        Movie[] moviesFiltered = new Movie[0];

        System.out.println(category.toUpperCase() + "\n"
                + "-------------");
        for (Movie movie : movieList){
            if (category.equals("all")){
                moviesFiltered = Arrays.copyOf(moviesFiltered, moviesFiltered.length + 1);
                moviesFiltered[moviesFiltered.length -1] = movie;
                System.out.println(movie.getName());
                continue;
            }
            if (movie.getCategory().equals(category)){
                moviesFiltered = Arrays.copyOf(moviesFiltered, moviesFiltered.length + 1);
                moviesFiltered[moviesFiltered.length -1] = movie;
                System.out.println(movie.getName());
            }
        }
    }
}
