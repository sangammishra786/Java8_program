package Default_static;

import java.util.List;

public class MultiplierImp implements Multiplier{

	@Override
	public int multiply(List<Integer> integerList) {
		return integerList.stream()
				.reduce(1, (a,b)-> (a *b));
	}

	@Override
	public int size(List<Integer> integerList) {
	System.out.println("Inside the MultiplierImp Class");
		return integerList.size();
	}
	
	

}
