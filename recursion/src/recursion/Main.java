package recursion;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function selfMethod = new Function();
		
		int result1 = selfMethod.func1(7);
		
		int result2 = selfMethod.func2(5);
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(5);
		arr.add(6);
		arr.add(6);
		arr.add(6);
		
		int result3 = selfMethod.func3(arr);
		
		System.out.println("recursion func1 : " + result1 );
		System.out.println("recursion func2 : " + result2 );
		System.out.println("recursion func3 : " + result3 );

		int result4 = selfMethod.func4(5);
		
		System.out.println("recursion func4 : " + result4 );
		
	}

}
