package binary;

import java.util.*;

public class Binary {
	
	public boolean binarySearch(ArrayList<Integer> array, int data) {
		
		//예외사항은 항상 먼저 처리한다.
		if(array.size() == 1 && array.get(0) == data) {
			return true;
		}
		if(array.size() == 1 && array.get(0) != data) {
			return false;
		}
		if(array.size() == 0) {
			return false;
		}
		
		int point = array.size()/2;
		
		if(data == array.get(point)) {
			return true;
		}else {
			if(data < array.get(point)) {
				return this.binarySearch(new ArrayList<Integer>(array.subList(0, point)), data);
			}else {
				return this.binarySearch(new ArrayList<Integer>(array.subList(point, array.size())), data);
			}
		}
		
	}

}
