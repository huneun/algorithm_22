package greedy;

public class Bag implements Comparable<Bag> {
	
	public Integer distance;
	public String vertex;
	
	public Bag(Integer distance, String vertex) {
		this.distance = distance;
		this.vertex = vertex;
	}

	@Override
	public int compareTo(Bag o) {
		// TODO Auto-generated method stub
		return this.distance - o.distance;
	}
	

	
	

}
