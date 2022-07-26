package Default_static;

public interface Interface3 extends Interface2{

	default void methodC() {
		System.out.println("Interface method C");
	}
	
	@Override
	default void methodB() {
		System.out.println("Interface method B inside interface3" + Interface3.class);
	}
	
	@Override
	default void methodA() {
		System.out.println("Interface method A inside interface3" + Interface3.class);
	}
}
