package sprint1;

public class offer {
 private driver d1;
 private int price;
 //constructor
public offer(driver d1, int price) {
	super();
	this.d1 = d1;
	this.price = price;
}

public driver getD1() {
	return d1;
}

public void setD1(driver d1) {
	this.d1 = d1;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
 
}
