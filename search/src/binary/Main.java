package binary;

import default2.Snippet;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Snippet sp = new Snippet();
		ArrayList<Integer> randomList =  sp.randomArrayList(100);
		
		Collections.sort(randomList);
		
		Binary by = new Binary();
		boolean result = by.binarySearch(randomList, 5);
		System.out.println("list : "+randomList);
		System.out.println("binary search : "+result);
		
	}

}
