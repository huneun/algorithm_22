package flower;

import java.util.*;

public class Quick {
	//������
	//pivot�� ������ �ִ� ����
	//�ϳ��� �����͸� �ǹ����� ���Ͽ� �ش� �����ͺ��� ���� ���� ���� ū���� ���������� �δ� ���� �ݺ��Ͽ� ����
	
	//�ǹ��� �������� ���� ������ ����Ʈ�� ������ �޼ҵ�
	
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
		
		//��ġ��
		ArrayList<Integer> mergeList = new ArrayList<>();
		mergeList.addAll(leftArray);
		mergeList.addAll(Arrays.asList(pivot));
		mergeList.addAll(rightArray);
		
		System.out.println("pivot sort After : "+mergeList);
	}
	
	//���׷��̵� �غ���
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
		
		//��ġ��
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
