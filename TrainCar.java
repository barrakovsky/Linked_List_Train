
public class TrainCar {
	
	Passenger[] passangers = new Passenger[3];
	private int psCount = 0;
	TrainCar nextTrain; 
	

	public TrainCar() {
		
	}
	
	public TrainCar(Passenger p) {
		this.addPassanger(p);
		
	}
	
	
	public Passenger[] getPassangers() {
		return passangers;
	}


	public void addPassanger(Passenger passanger) {
		this.passangers[this.psCount] = passanger;
		this.psCount++;
	}
	
	
	
	public int getPsCount() {
		return psCount;
	}


	public void setPsCount(int psCount) {
		this.psCount = psCount;
	}


	

	public String toString(){
		return "needs to implement in TrainCar class"; 
	}


	

}
