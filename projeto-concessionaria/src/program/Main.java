package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Car;
import entities.Dealership;
import entities.Motorcycle;
import entities.Pickup;
import entities.State;
import entities.Truck;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Dealership d = new Dealership();
		// add 3 car
		Car car = new Car("jfg-3546", sdf.parse("20/03/2020 12:00:00"), sdf.parse("20/03/2020 14:00:00"),
				State.valueOf("notAvaliable"), 15.0);
		d.register(car);
		car = new Car("jhi-3556", sdf.parse("20/03/2020 12:00:00"), sdf.parse("21/03/2020 19:00:00"),
				State.valueOf("notAvaliable"), 15.0);
		d.register(car);
		car = new Car("jhi-3098", sdf.parse("25/03/2020 12:00:00"), sdf.parse("28/03/2020 10:00:00"),
				State.valueOf("notAvaliable"), 15.0);
		d.register(car);
		
		//add 3 motorcycle
		Motorcycle motorcycle = new Motorcycle("jll-2230", sdf.parse("20/03/2020 10:00:00"), sdf.parse("26/03/2020 13:00:00"),
				State.valueOf("notAvaliable"), 10.00);
		d.register(motorcycle);
		motorcycle = new Motorcycle("jjy-7998", sdf.parse("20/03/2020 08:00:00"), sdf.parse("20/03/2020 14:00:00"),
				State.valueOf("notAvaliable"), 10.00);
		d.register(motorcycle);
		motorcycle = new Motorcycle("jda-2431", sdf.parse("25/03/2020 12:00:00"), sdf.parse("01/04/2020 14:00:00"),
				State.valueOf("notAvaliable"), 10.00);
		d.register(motorcycle);
		
		// add 3 truck
		Truck truck = new Truck("jlo-8756", sdf.parse("20/03/2020 12:00:00"), sdf.parse("22/03/2020 14:00:00"),
				State.valueOf("notAvaliable"), 30.0);
		d.register(truck);
		truck = new Truck("jkc-8888", sdf.parse("24/03/2020 09:00:00"), sdf.parse("25/03/2020 14:00:00"),
				State.valueOf("notAvaliable"), 30.0);
		d.register(truck);
		truck = new Truck("jpo-9675", sdf.parse("21/03/2020 11:00:00"), sdf.parse("23/03/2020 20:00:00"),
				State.valueOf("notAvaliable"), 30.0);
		d.register(truck);

		// add 3 Pickup
		Pickup pickup = new Pickup("jmn-3426", sdf.parse("20/03/2020 12:00:00"), sdf.parse("22/03/2020 14:00:00"),
				State.valueOf("notAvaliable"), 20.0);
		d.register(pickup);
		pickup = new Pickup("jjk-0212", sdf.parse("22/03/2020 08:00:00"), sdf.parse("22/03/2020 22:00:00"),
				State.valueOf("notAvaliable"), 20.0);
		d.register(pickup);
		pickup = new Pickup("jdf-7846", sdf.parse("24/03/2020 15:00:00"), sdf.parse("29/03/2020 14:00:00"),
				State.valueOf("notAvaliable"), 20.0);
		d.register(pickup);
		
		//update the exit date of vehicle
		System.out.println("update the exit date of: \n" + pickup.toString());
		d.updateDateExit(pickup, sdf.parse("29/03/2020 16:00:00"));
		System.out.println();
		
		//control the status of vehicle
		System.out.println("Change the state of: \n" + truck.toString());
		d.rental(truck, State.valueOf("avaliable"));
		System.out.println("New state of: \n" + truck.toString());
		System.out.println();
		
		//delete vehicle
		System.out.println("Delete the vehicle: \n" + truck.toString());
		d.delete(truck);
		System.out.println();
			
		//report
		System.out.println("Report of the vehicles: \n");
		d.report();
	}

}
