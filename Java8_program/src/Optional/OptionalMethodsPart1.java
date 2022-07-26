package Optional;

import java.util.Optional;

public class OptionalMethodsPart1 {

	public static Optional<String> ofNullableMethod(String str){
		Optional<String> str1 = Optional.ofNullable(str);
		return str1;
	}
	
	public static Optional<String> ofMethod(){
		Optional<String> str1 = Optional.of(""); //In this method we have to pass the input, if we pass the null as input 
		//then it will throw the NullPointerException
		return str1;
	}
	
	public static Optional<String> emptyMethod(){
		return Optional.empty();
	}
	
	public static void main(String[] args) {
	System.out.println("OfNullable Method : " + ofNullableMethod("Hello World").get());
	System.out.println("Of Method : " + ofMethod());
	System.out.println("empty Method : " + emptyMethod());
	}
}
