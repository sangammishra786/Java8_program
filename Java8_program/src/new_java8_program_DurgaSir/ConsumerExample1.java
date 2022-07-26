package new_java8_program_DurgaSir;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String movieName;
	String actor;
	String actress;

	public Movie(String movieName, String actor, String actress) {
		super();
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
	}

}

public class ConsumerExample1 {
	public static void main(String[] args) {
		/*
		 * Consumer<String> c = s -> System.out.println(s); c.accept("Sangam");
		 */

		// Program to display movie information using Consumer
		ArrayList<Movie> list = new ArrayList<Movie>();
		populate(list);

		Consumer<Movie> c = m -> {
			System.out.print("[Movie : "+m.movieName+", Actor : "+m.actor+", Actress : "+m.actress+"]");
			System.out.println();
		};
		
		for(Movie movie : list) {
			c.accept(movie);
		}
	}

	public static void populate(ArrayList<Movie> list) {
		list.add(new Movie("Bahubali", "Prabhas", "Anuskha Shetty"));
		list.add(new Movie("Sultan", "Salman", "Anuskha Sharma"));
		list.add(new Movie("KGF", "Yash", "Tamanna"));
		list.add(new Movie("Shershah", "Sidharth", "Kiyara Advani"));
	}
}
