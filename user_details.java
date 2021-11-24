package sprint1;

public class user_details {
	
	private String username;
	private String email;
	private String password;
	private int mobileNumber;
	Client c1;
	driver d1;
	
	//default consructor
	public user_details() {
		super();
		this.username = " ";
		this.email = " " ;
		this.password = " ";
		this.mobileNumber = 0;
	}

	//Constructor
	public user_details(String username, String email, String password, int mobileNumber) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public user_details(String username, String password, int mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void register( String type, String username, String email, String password, int mobileNumber, DB_system DB)
	{
		if(type.equals("client"))
		{
			this.setUsername(username);
			this.setEmail(email);
			this.setPassword(password);
			this.setMobileNumber(mobileNumber);
			c1.setClientProfile(this);
			DB.addClient(c1);
		}
		else if(type.equals("driver"))
		{
			this.setUsername(username);
			this.setEmail(email);
			this.setPassword(password);
			this.setMobileNumber(mobileNumber);
			c1.setClientProfile(this);
			DB.addClient(c1);
		}
		
		
	}
//	public void login( String type, String username, String password, DB_system DB)
//	{
//		if(type.equals("client"))
//		{
//			Client c1 = DB.getClientList();
//		}
//		else if(type.equals("driver"))
//		{
//		
//		}
//	}
	
}
