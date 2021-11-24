package sprint1;

import java.util.ArrayList;
import java.util.Vector;

public class admin {
user_details info;

public user_details getInfo() {
	return info;
}
public void setInfo(user_details info) {
	this.info = info;
}
public void verify(driver d1) {
	d1.setIsVerfied(true);
}
public void suspend(driver Driver) {
	Driver.setIsVerfied(false);
}
public Vector<driver> listPendingDriver(){
	DB_system d1 = null;
	return d1.getDriverList();
	
}
}
