package array_split;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Split split = new Split();
		
		int[] array = split.randomArray(6);
		split.arrangeHalfSplit(array);
		
		ArrayList<Integer> arrayList = split.randomArrayList(5);
		split.arrayListSplit(arrayList);
		
		ArrayList<Integer> arrayList2 = split.randomArrayList(5);
		ArrayList<Integer> mergeResult = split.arrayListSplitMerge(arrayList2);
		System.out.println("merge result : "+mergeResult);

	}

}
