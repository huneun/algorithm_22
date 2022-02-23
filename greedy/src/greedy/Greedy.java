package greedy;

import java.util.*;

public class Greedy {
	public void func(Integer[][] objList, double capacity) {
		double totalValue = 0.0;
		double fraction = 0.0;
		
		Arrays.sort(objList, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] objItem1, Integer[] objItem2) { 
				return (objItem2[1]/objItem2[0] - objItem1[1] - objItem1[0] );
			}
		});
			
		
		for(int i = 0; i<objList.length; i++) {
			if(capacity - (double)objList[i][0] >0) {
				capacity -=(double)objList[i][0];
				totalValue += (double)objList[i][1];
				System.out.println("���� : "+ objList[i][0] + ", ��ġ : "+ objList[i][1]);
			}else {
				fraction = capacity / (double)objList[i][0];
				totalValue += (double)objList[i][1]*fraction;
				System.out.println("���� : "+ objList[i][0] + ", ��ġ : "+ objList[i][1]+", ���� : "+fraction);
			}
		}
		System.out.println("�� ���� �� �ִ� ��ġ : "+totalValue);
	}

}
