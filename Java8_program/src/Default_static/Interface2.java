package Default_static;

public interface Interface2 extends Interface1{

	default void methodB() {
		System.out.println("Interface method B");
	}
	
	@Override
	default void methodA() {
		System.out.println("Interface method A inside interface2" + Interface2.class);
	}
}
