package greedy;

import java.util.ArrayList;

public class Coin {
	
	public void greedyMethod(Integer price, ArrayList<Integer> coinList) {
		Integer total = 0;
		Integer coinCount = 0;
		
		ArrayList<Integer> detail = new ArrayList<>();
		
		for(int i = 0; i<coinList.size(); i++) {
			coinCount = price / coinList.get(i);
			total += coinCount;
			price -= coinCount * coinList.get(i);
			detail.add(coinCount);
			System.out.print(coinList.get(i) + "¿ø " + coinCount + "°³  " );
			
		}
		System.out.println("ÃÑ µ¿Àü °¹¼ö : "+ total);
	}

}
