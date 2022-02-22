package flower;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quick quick = new Quick();
		ArrayList<Integer> arrayList = quick.randomArrayList(10);
		
		quick.pivotSortBeta(arrayList);
		
		ArrayList<Integer> arrayList1 = quick.randomArrayList(10);
		System.out.println("quick sort result : "+quick.pivotSort(arrayList1));
	}

}
