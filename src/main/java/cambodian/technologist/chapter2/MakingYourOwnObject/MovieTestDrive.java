package cambodian.technologist.chapter2.MakingYourOwnObject;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "Look up";
        movie1.genre = "Horror";
        System.out.println(movie1.title);
        movie1.playIt();


        Movie movie2 = new Movie();

        movie2.rating = 4;
        movie2.title = "Business Proposal";
        movie2.genre = "rom-com";
        System.out.println(movie2.title);
        movie2.playIt();




    }
}
