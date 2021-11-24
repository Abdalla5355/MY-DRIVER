package sprint1;

import java.util.Vector;

public class Ride {
	private int id;
	private String source;
	private String destination;
	private Client cl1;
	private Vector<offer> offers=new Vector<offer>();
	
	public Ride(int id, String source, String destination, Client cl1, Vector<offer> offers) {
		super();
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.cl1 = cl1;
		this.offers = offers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Client getCl1() {
		return cl1;
	}

	public void setCl1(Client cl1) {
		this.cl1 = cl1;
	}

	public Vector<offer> getOffers() {
		return offers;
	}

	public void setOffers(Vector<offer> offers) {
		this.offers = offers;
	}
	
	

}
