package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicles {
	private String board;
	protected Date arrived;
	protected Date exit;
	private State state;
	

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public Vehicles() {
	}
	

	public Vehicles(String board, Date arrived, Date exit, State state) {
		super();
		this.board = board;
		this.arrived = arrived;
		this.exit = exit;
		this.state = state;
	}


	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}



	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public Date getarrived() {
		return arrived;
	}

	public Date getExit() {
		return exit;
	}

	public void setExit(Date exit) {
		this.exit = exit;
	}


	public double totalValue() {
		return 0;
	}


	@Override
	public String toString() {
		return "board=" + board + ", arrived=" + sdf.format(arrived) + ", exit=" + sdf.format(exit) + ", state=" + state;
	}
	

}
