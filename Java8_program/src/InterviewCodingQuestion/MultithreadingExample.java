package InterviewCodingQuestion;

public class MultithreadingExample{
	
	public static void main(String[] args) {
		//using Runnable interface
		Runnable runnable = () -> {
				System.out.println("Hello World");
		};
		
		new Thread(runnable).start();
		
		//using Thread class
		Thread thread = new Thread(()-> {
			System.out.println("Thread using by extending thread class");
		});
		 thread.start();
	}
}
