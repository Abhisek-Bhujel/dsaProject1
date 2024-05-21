package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        var c = Movie.getMovie("C","Fun");
        c.watchMovie();

        var fun = new Comedy("Fun");
        fun.watchComedyMovie();

        Object unknownObject = Movie.getMovie("C","Badsaah");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy comic = (Comedy) unknownObject;
            comic.watchComedyMovie();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure)unknownObject).watchAdventureMovie();
        } else if (unknownObject instanceof Comedy cm) {
            cm.watchMovie();
        }
    }
}
