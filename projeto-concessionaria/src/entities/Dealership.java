package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dealership {
	private List<Vehicles> list = new ArrayList<>();

	
	public Dealership() {
	}

	public void register(Vehicles vehicle) {
		list.add(vehicle);
	}
	
	public void rental(Vehicles vehicles, State state) {
		for(Vehicles v : list) {
			if(v.getBoard() == vehicles.getBoard()) {
				v.setState(state);
			}	
		}
	}
	
	public void updateDateExit(Vehicles vehicles, Date date) {
		for(Vehicles v : list) {
			if(v.getBoard() == vehicles.getBoard()) {
				v.setExit(date);
			}	
		}
	}
	
	public void delete(Vehicles vehicles) {
		list.remove(vehicles);
	}
	
	public void report() {
		for(Vehicles v : list) {
			System.out.println(v.toString());
		}
	}
	


	

	

}
