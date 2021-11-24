package sprint1;

import java.util.Vector;

public class DB_system {

	private static Vector<Client> clientList=new Vector<Client>();
	private static Vector<Ride> rideList=new Vector<Ride>();
	private static Vector<driver> driverList=new Vector<driver>();
	
	public DB_system(Vector<Client> clientList, Vector<Ride> rideList, Vector<driver> driverList) {
		super();
		this.clientList = clientList;
		this.rideList = rideList;
		this.driverList = driverList;
	}

	public Vector<Client> getClientList() {
		return clientList;
	}

	public void setClientList(Vector<Client> clientList) {
		this.clientList = clientList;
	}

	public Vector<Ride> getRideList() {
		return rideList;
	}

	public void setRideList(Vector<Ride> rideList) {
		this.rideList = rideList;
	}

	public Vector<driver> getDriverList() {
		return driverList;
	}

	public void setDriverList(Vector<driver> driverList) {
		this.driverList = driverList;
	}
	
	public void addClient(Client c1)
	{
		this.clientList.add(c1);
	}
	
	public void addRide(Ride r1)
	{
		this.rideList.add(r1);
	}


}
