import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) throws IOException {
         //TODO --> complete main function
        while (true) {
            System.out.println("Enter 1 for searching movies\nEnter 2 for searching actors\nEnter 3 to exit");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            if (a == 1) {
                System.out.print("Enter the movie name\n");
                String m = input.nextLine();
                Movie movie;
                movie = new Movie(new ArrayList<>(), "", 0);
                String dis = movie.getMovieData(m);
                System.out.println(movie.getImdbVotesViaApi(dis));
                System.out.println(movie.getRatingViaApi(dis));
            }
            if (a == 2) {
                System.out.print("Enter the actor name\n");
                String ac = input.nextLine();
                Actors actor;
                actor = new Actors("", false);
                String b = actor.getActorData(ac);
                System.out.println(actor.getNetWorthViaApi(b));
                System.out.println(actor.isAlive(b));
                System.out.println(actor.getDateOfDeathViaApi(b));
            }
            if(a==3)
                break;
        }

        //Movie movie;
//        Actors actor;
//        actor = new Actors("",true);
//        System.out.println(Actors.getActorData("jennifer lawrence"));
        //movie = new Movie(new ArrayList<>(),"",0);
        //System.out.println(movie.getMovieData("inception"));
        //System.out.println(movie.getMovieData("troy"));
        //runMenu();
    }
    public static void runMenu() {
        // TODO

    }
}