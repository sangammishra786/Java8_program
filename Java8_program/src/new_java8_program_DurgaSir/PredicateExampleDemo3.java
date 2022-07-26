//Program to authenticate the user login

package new_java8_program_DurgaSir;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String password;
	
	User(String username, String password){
		this.username = username;
		this.password = password;
	}
}


public class PredicateExampleDemo3 {
	public static void main(String[] args) {
		
		Predicate<User> authentication = user -> user.username.equals("sangam") && user.password.equals("mishra");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username - ");
		String name = sc.next();
		System.out.print("Enter password - ");
		String password = sc.next();
		
		User user = new User(name, password);
		if(authentication.test(user)) {
			System.out.println("Welcome to the internet !!");
		}else {
			System.out.println("Invalid Username and password !!");
		}
		
	}
}
