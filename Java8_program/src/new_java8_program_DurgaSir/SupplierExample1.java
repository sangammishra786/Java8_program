package new_java8_program_DurgaSir;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample1 {
	public static void main(String[] args) {
		
		Supplier<Date> supplier = () -> new Date();
		System.out.println(supplier.get());
		
		Supplier<String> s1 = () -> {
			String[] str = {"Aman", "kajal", "Sangam", "Shubhi"};
			int randomString = (int)(Math.random()*4);
			
			return str[randomString];
		};
		
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());
		
		
		//Program to generate the OTP using number
		Supplier<String> s2 = () -> {
			String otp = "";
			for(int i = 1; i <= 6 ; i++) {
				otp = otp + (int)(Math.random()*9);
			}
			return otp;
		};
		
		System.out.println("OTP is : "+s2.get());
	}
}
