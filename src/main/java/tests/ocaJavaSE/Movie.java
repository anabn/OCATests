package tests.ocaJavaSE;

class Movie extends Cinema{

    public Movie(String name) {
        super(name); // -- does not compile without super as 1 line
    }


    public static void main(String[] args) {
//        System.out.println(new Movie("hello").name); --does not compile, name is private
        new Movie("hello").printCinemaName();
    }
}
