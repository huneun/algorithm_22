package bubble_sort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(8);
		arrayList.add(11);
		arrayList.add(2);
		arrayList.add(4);
		
		System.out.println("not sorting : " + arrayList);
		
		Bubble bubble = new Bubble();
		
		ArrayList<Integer> mySorted = bubble.mySort(arrayList);
		
		System.out.println("sorted : "+ mySorted);
		
		
	}
	
	

}
