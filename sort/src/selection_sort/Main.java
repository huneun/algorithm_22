package selection_sort;

import java.util.ArrayList;

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
		
		Selection mysort = new Selection();
		
		ArrayList<Integer> sortedArray = mysort.selectionSort(arrayList);
		
		System.out.println("sorted : " + sortedArray);


	}

}
