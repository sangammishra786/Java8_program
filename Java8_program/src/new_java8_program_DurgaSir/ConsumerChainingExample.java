package new_java8_program_DurgaSir;

import java.util.function.Consumer;

class MovieInf {
	String name;
	String result;

	public MovieInf(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}

}

public class ConsumerChainingExample {
	public static void main(String[] args) {

		Consumer<MovieInf> c1 = m -> System.out.println("Movie " + m.name + " is ready to release");
		Consumer<MovieInf> c2 = m -> System.out.println("Movie " + m.name + " is released and it is " + m.result);
		Consumer<MovieInf> c3 = m -> System.out.println("Movie:" + m.name + " information storing in the database");

		Consumer<MovieInf> c = c1.andThen(c2).andThen(c3);

		MovieInf m1 = new MovieInf("Bahubali", "Hit");
		c.accept(m1);

		MovieInf m2 = new MovieInf("KGF 2", "SuperHit");
		c.accept(m2);
	}
}
