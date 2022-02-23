package greedy;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coin co = new Coin();
		co.greedyMethod(7820, new ArrayList<Integer>(Arrays.asList(500,100,50,1)));
		
		
		Bag bag1 = new Bag(12, "A");
		Bag bag2 = new Bag(10, "A");
		Bag bag3 = new Bag(13, "A");
		Bag[] bags = new Bag[] {bag1, bag2, bag3};
		
		//comparable ���� Ŭ������ �����ϴ� ��
		Arrays.sort(bags);
		
		for(Bag bag :bags) {
			System.out.println("Comparable sorting : "+bag.distance);
		}
	
		//Comparator �߻�Ŭ���� �����Ͽ� ����
		Pocket pocket1 = new Pocket(12, "A");
		Pocket pocket2 = new Pocket(10, "A");
		Pocket pocket3 = new Pocket(13, "A");
		Pocket[] Pockets = new Pocket[] {pocket1, pocket2, pocket3};
		//
		Arrays.sort(Pockets, new Comparator<Pocket>() {

			@Override
			public int compare(Pocket o1, Pocket o2) {
				// TODO Auto-generated method stub
				return o1.distance-o2.distance;
			}
			
		});
		
		for(Pocket p : Pockets) {
			System.out.println("Comparator sorting : "+p.distance);
		}
		
		//Comparable �� Comparator �Ѵ� ���������̸� Comparator�� ���� �켱������ ���´�
		
		
		Integer[][] obj = {{10,10},{15,12},{20,10},{25,8},{30,5}};
		
		Greedy gd = new Greedy();
		gd.func(obj, 30.0);
	}

}
