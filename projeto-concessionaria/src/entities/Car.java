package entities;

import java.util.Date;

public class Car extends Vehicles{
	
	private double rentTax;
		

	public Car(String board, Date arrived, Date exit, State state, double rentTax) {
		super(board, arrived, exit, state);
		this.rentTax = rentTax;
	}



	@Override
	public double totalValue() {
		long tempArrived = arrived.getTime();
		long tempExit = exit.getTime();
		double hours = (double) (tempExit - tempArrived) / 1000 / 60 / 60;

		return rentTax * hours;
	}



	

}
