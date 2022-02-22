package flower;

import java.util.*;

public class Quick {
	//퀵정렬
	//pivot의 개념이 있는 정렬
	//하나의 데이터를 피벗으로 정하여 해당 데이터보다 작은 수면 왼쪽 큰수면 오른쪽으로 두는 것을 반복하여 정렬
	
	//피벗을 기준으로 왼쪽 오른쪽 리스트로 나누는 메소드
	
	public void pivotSortBeta(ArrayList<Integer> array) {
		System.out.println("pivot sort before : "+array);
		int pivot = array.get(0);
		
		if(array.size() <= 1) {
			return;
		}
		
		ArrayList<Integer> leftArray = new ArrayList<>();
		ArrayList<Integer> rightArray = new ArrayList<>();
		
		for(int i =1; i<array.size(); i++) {
			if(pivot < array.get(i)) {
				rightArray.add(array.get(i));
			}else {
				leftArray.add(array.get(i));
			}
		}
		
		//합치기
		ArrayList<Integer> mergeList = new ArrayList<>();
		mergeList.addAll(leftArray);
		mergeList.addAll(Arrays.asList(pivot));
		mergeList.addAll(rightArray);
		
		System.out.println("pivot sort After : "+mergeList);
	}
	
	//업그레이드 해보자
	public ArrayList<Integer> pivotSort(ArrayList<Integer> array) {
//		System.out.println("pivot sort before : "+array);
		
		if(array.size() <= 1) {
			return array;
		}
		int pivot = array.get(0);
		
		ArrayList<Integer> leftArray = new ArrayList<>();
		ArrayList<Integer> rightArray = new ArrayList<>();
		
		for(int i =1; i<array.size(); i++) {
			if(pivot < array.get(i)) {
				rightArray.add(array.get(i));
			}else {
				leftArray.add(array.get(i));
			}
		}
		
		//합치기
		ArrayList<Integer> mergeList = new ArrayList<>();
		mergeList.addAll(pivotSort(leftArray));
		mergeList.addAll(Arrays.asList(pivot));
		mergeList.addAll(pivotSort(rightArray));
		
		return mergeList;
	}
	
	public ArrayList<Integer> randomArrayList(int size) {
		ArrayList<Integer> array = new ArrayList<>();
		for(int i =0; i<size; i++) {
			array.add((int) (Math.random() * 100 +1));
		}
		return array;
	}
	
}
