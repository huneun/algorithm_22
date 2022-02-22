package recursion;

import java.util.ArrayList;

public class Function {
	public int func1(int n) {
		if(n > 1) {
			return n * this.func1(n-1);
		}else {
			return 1;
		}
	}
	
	public int func2(int n) {
		if(n <= 1) {
			return 1;
		}
		return n*this.func2(n-1);
	}
	
	public int func3(ArrayList<Integer> array) {
		if(array.size() <= 0) {
			return 0;
		}
		
		return array.get(0) + this.func3(new ArrayList<Integer>(array.subList(1, array.size())));
	}
	
	public int func4(int n) {
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 2;
		}else if(n == 3) {
			return 4;
		}
		
		return func4(n-1) + func4(n-2) + func4(n-3);
	}
}
