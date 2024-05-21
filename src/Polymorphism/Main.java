package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie adventureMovie = new Adventure("StarWars");
        adventureMovie.watchMovie();

        Movie comedyMovie =  new Comedy("Hera Pheri");
        comedyMovie.watchMovie();

        Movie theMovie = Movie.getMovie("Adventure","Jungle king");
        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter movie type: A for adventure , C for comedy, and Q to quit: ");
            String type = s.nextLine().toLowerCase();
            if (type.equals("q") ){
                break;
            }

            System.out.println("Enter move title: ");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();

        }
    }
}
