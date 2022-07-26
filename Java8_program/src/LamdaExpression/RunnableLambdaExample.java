package LamdaExpression;

public class RunnableLambdaExample {
	public static void main(String[] args) {
		/*
		 * Implement Runnable Interface  Prior to java 8 
		 */
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable interface 1");
				
			}
		};
		
		new Thread(runnable).start();
		
		/*
		 * Implement Runnable interface using lamda in java 8
		 */
		//first way
		Runnable lamdaRunnable = ()->{
			System.out.println("Runnable Interface 2");
		};
		
		new Thread(lamdaRunnable).start();
		
		//second way, creating Anonymous object
		new Thread(()->{System.out.println("Runnable Interface 3");}).start();
	}
}
