package sprint1;

public class Client {

	private user_details ClientProfile;
	private Ride requestedRide;
	private String Notification;
	
	//methods
	public Client(user_details clientProfile) {
		super();
		this.ClientProfile = clientProfile;
	}
	public user_details getClientProfile() {
		return ClientProfile;
	}
	public void setClientProfile(user_details clientProfile) {
		this.ClientProfile = clientProfile;
	}
	public Ride getRequestedRide() {
		return requestedRide;
	}
	public String getNotification() {
		return Notification;
	}
	public void setNotification(String notification) {
		Notification = notification;
	}
	public void setRequestedRide(Ride requestedRide) {
		this.requestedRide = requestedRide;
	}
	@Override
	public String toString() {
		return "Client [Client Profile=" + ClientProfile + ", requested Ride=" + requestedRide + "]";
	}
	
	public Boolean requestride(int id ,String source , String destination,DB_system Data)
	{
		this.requestedRide.setId(id);
		this.requestedRide.setSource(source);
		this.requestedRide.setDestination(destination);
		Data.addRide(requestedRide);
		System.out.println("Succesfully Request Ride");
		return true;
	}
	public void Show_notification()
	{
		System.out.println(this.getNotification());
	}
	
}
