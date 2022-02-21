package bubble_sort;

import java.util.*;

public class Bubble {
	
	
	public ArrayList<Integer> mySort(ArrayList<Integer> array) {
		
		ArrayList<Integer> sortArray = array;
		
		for(int i =0; i<array.size()-1; i++) {
			boolean swap = false;
			for(int j=0; j<array.size()-1-i; j++) {
				if(sortArray.get(i) > sortArray.get(j)) {
					Collections.swap(sortArray, i, j);
					swap = true;
				}	
			}
			if(!swap) {
				break;
			}
		}
		
		return sortArray;
	}
	
	

}
