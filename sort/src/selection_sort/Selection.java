package selection_sort;

import java.util.ArrayList;
import java.util.Collections;

public class Selection {
	
	public ArrayList<Integer> selectionSort(ArrayList<Integer> array) {
		
		ArrayList<Integer> sortArray = array;
		int select;
		
		for(int i =0; i<array.size()-1; i++) {
			select = i;
			for(int j=i+1; j<array.size(); j++) {
				if(sortArray.get(select) > sortArray.get(j)) {
					select = j;
				}	
			}
			Collections.swap(sortArray, i, select);
			
		}
		
		return sortArray;
	}
}
