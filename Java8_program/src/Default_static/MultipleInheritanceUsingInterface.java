package Default_static;

public class MultipleInheritanceUsingInterface implements Interface1, Interface2, Interface3 {
	
	@Override
	public void methodA() {
		System.out.println("Interface method A inside interface3" + MultipleInheritanceUsingInterface.class);
	}
	public static void main(String[] args) {
		
		MultipleInheritanceUsingInterface obj = new MultipleInheritanceUsingInterface();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}
