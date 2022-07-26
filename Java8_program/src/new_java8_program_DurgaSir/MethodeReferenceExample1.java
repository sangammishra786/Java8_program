package new_java8_program_DurgaSir;

/*
 * interface Interf{ public void m1(int a, int b); }
 * 
 * public class MethodeReferenceExample1 { public static void m2(int a, int b) {
 * //calculate the sum of two number
 * System.out.println("The sum of two number is : "+(a + b)); }
 * 
 * public static void main(String[] args) {
 * 
 * Interf i = MethodeReferenceExample1::m2; i.m1(10,45); } }
 */

class MethodeReferenceExample1 implements Runnable{

	@Override
	public void run() {
		System.out.println("Table of 19 is printed");
		for(int i =1; i<=10; i++) {
			System.out.print(19+" * "+i+ " = " + 19*i);
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Runnable r = new MethodeReferenceExample1();
		//Lamda expression
		//Runnable r = () -> {};
		Thread t = new Thread(r);
		t.start();
				
	}
	
}
