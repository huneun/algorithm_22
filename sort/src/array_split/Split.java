package array_split;

import java.util.*;

public class Split {
	
	public void arrangeHalfSplit(int[] array) {
		System.out.println("arrangeHalfSplit()");
		int position = array.length/2;
		int[] array1 = new int[position];
		int[] array2 = new int[array.length-position];
		
		for(int i = 0; i<array.length; i++) {
			if(position > i) {
				array1[i] = array[i];
			}else {
				array2[i-position] = array[i];	
			}
		}
		System.out.println("split array1 : " + Arrays.toString(array1)+ " / split array2 : " + Arrays.toString(array2));
	}
	
	public void arrayListSplit(ArrayList<Integer> arrayList) {
		System.out.println("arrayListSplit()");
		int position = arrayList.size()/2;
		
		ArrayList<Integer> arrayList1  = new ArrayList<Integer>(arrayList.subList(0, position));
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(arrayList.subList(position, arrayList.size()));
		
		System.out.println("split array1 : " + arrayList1+ " / split array2 : " + arrayList2);
	}
	
	public ArrayList<Integer> arrayListSplitMerge(ArrayList<Integer> arrayList) {
		if(arrayList.size()<=1) {
			return arrayList;  
		}
		int position = arrayList.size()/2;
		
		ArrayList<Integer> arrayList1  = new ArrayList<>();
		arrayList1 = arrayListSplitMerge(new ArrayList<Integer>(arrayList.subList(0, position)));
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList2 = arrayListSplitMerge(new ArrayList<Integer>(arrayList.subList(position, arrayList.size())));
		
		return mergeList(arrayList1, arrayList2);
	}
	
	public int[] randomArray(int size) {
		
		int[] array = new int[size];
		for(int i = 0; i < size; i ++) {
			array[i] = (int) (Math.random() * 100 +1);
		}
		return array;
	}
	
	public ArrayList<Integer> randomArrayList(int size) {
		ArrayList<Integer> array = new ArrayList<>();
		for(int i =0; i<size; i++) {
			array.add((int) (Math.random() * 100 +1));
		}
		return array;
	}
	
	public ArrayList<Integer> mergeList(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
		ArrayList<Integer> mergeList = new ArrayList<>();
		int leftPointer = 0;
		int rightPointer = 0;
		
		//CASE1: left/right 둘다 있을 때
		while(leftList.size() > leftPointer && rightList.size() > rightPointer) {
			if(leftList.get(leftPointer) > rightList.get(rightPointer)) {
				mergeList.add(rightList.get(rightPointer));
				rightPointer ++;
			}else {
				mergeList.add(leftList.get(leftPointer));
				leftPointer ++;
			}
		}
		
		//CASE2: right데이터가 없을때
		while(leftList.size() > leftPointer) {
			mergeList.add(leftList.get(leftPointer));
			leftPointer ++;
		}
		
		//CASE3: left데이터가 없을 때
		while(rightList.size() > rightPointer) {
			mergeList.add(rightList.get(rightPointer));
			rightPointer ++;
		}
		
		return mergeList;
	}

}
