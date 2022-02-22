package default2;

import java.util.*;

public class Snippet {
	public ArrayList<Integer> randomArrayList(int size) {
			ArrayList<Integer> array = new ArrayList<>();
			for(int i =0; i<size; i++) {
				array.add((int) (Math.random() * 100 +1));
			}
			return array;
	}
		
}

