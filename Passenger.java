
public class Passenger {
	
	private String first; 
	private String last; 
	

	public Passenger(String first, String last) {
		this.setFirst(first);
		this.setLast(last);
		
	}


	public String getFirst() {
		return first;
	}


	public void setFirst(String first) {
		this.first = first;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}
	
	public String toString(){
		
		return this.getFirst() + " " + this.getLast();
	}

}
