package Default_static;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		
		List<Integer> integerList1 = Arrays.asList();
		Multiplier multiplier = new MultiplierImp();
		
		System.out.println("Result of multiplication is : " + multiplier.multiply(integerList));
		System.out.println("Result of size is : " + multiplier.size(integerList1));
		System.out.println("Result of isEmpty is : " + Multiplier.isEmpty(integerList1));
	}
}
