package tests.ocaJavaSE;

/**
 * chapter 7: Working with Inheritance
 */
class Cinema {
    private String name;

    public Cinema(String name) {
        this.name = name;
    }

    void printCinemaName(){
        System.out.println(name);
    }
}
