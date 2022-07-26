package new_java8_program_DurgaSir;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaniningExample2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the username : ");
		String userName = sc.next();
		System.out.print("Enter the password : ");
		String pass = sc.next();
		
		Function<String, String> f1 = s -> s.substring(0, 5);
		Function<String, String> f2 = s-> s.toLowerCase();
		
		if(f1.andThen(f2).apply(userName).equals("durga") && pass.equals("java")) {
			System.out.println("Welcome to DurgaSoft classes");
		}else {
			System.out.println("Username and password is incorrect");
		}
		sc.close();
	}
}
