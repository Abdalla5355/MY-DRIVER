package sprint1;

import java.util.ArrayList;
import java.util.Vector;

public class driver {

	private user_details info;
	private String license;
	private String National_id;
	private Vector<String> favourite_area=new Vector<String>();
	private Boolean isVerfied;
	private Vector<rate> userRatings ;
	private float averageRate; 
	private String notification;
	
	
	
	
	
	public user_details getInfo() {
		return info;
	}
	public void setInfo(user_details info) {
		this.info = info;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getNational_id() {
		return National_id;
	}
	public void setNational_id(String national_id) {
		National_id = national_id;
	}
	public Vector<String> getFavourite_area() {
		return favourite_area;
	}
	public void setFavourite_area(Vector<String> favourite_area) {
		this.favourite_area = favourite_area;
	}
	public Boolean getIsVerfied() {
		return isVerfied;
	}
	public void setIsVerfied(Boolean isVerfied) {
		this.isVerfied = isVerfied;
	}
	public Vector<rate> getUserRatings() {
		return userRatings;
	}
	public void setUserRatings(Vector<rate> userRatings) {
		this.userRatings = userRatings;
	}
	public float getAverageRate() {
		return averageRate;
	}
	public void setAverageRate() {
		
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public void addFavoriteAreas(String area) {
		this.favourite_area.add(area);
	}
	public void evaluateAverageRate() {
		rate r1 = null;
		int avg=0;
		avg+=r1.Enumrate;
	}

	public void notifyClientOwner() {
		
	}

	public void displayNotification() {
		
	}
	
	
}
