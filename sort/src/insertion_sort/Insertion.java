package insertion_sort;

import java.util.ArrayList;
import java.util.Collections;

public class Insertion {
	
	public ArrayList<Integer> insertionSort(ArrayList<Integer> array) {
		
		for(int i = 0; i<array.size()-1; i++) {
			for(int j = i+1; j>0; j--) {
				if(array.get(j) < array.get(j-1) ) {
					Collections.swap(array, j, j-1);
				}else {
					break;
				}
			}
		}
		
		return array;
		
	}

}
