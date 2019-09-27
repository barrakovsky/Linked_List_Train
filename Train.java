
public class Train {
	
	TrainCar firstTrainCar  ;

	public Train() {
	
	}
	
	public void add(Passenger p){
		
		if(firstTrainCar == null ){
			firstTrainCar =  new TrainCar(p); 	
			return;
		}
		
		TrainCar temp = firstTrainCar;
		
		if(temp.getPsCount() < temp.passangers.length){
			temp.addPassanger(p);
			return;
		}
		
		while(temp.nextTrain != null ){
			if(temp.nextTrain.getPsCount() != temp.nextTrain.passangers.length){
				temp.nextTrain.addPassanger(p);
				return;
			}
			temp = temp.nextTrain;
		}
		
		temp.nextTrain = new TrainCar(p);
		
		
		
		
		
		
	}

}
