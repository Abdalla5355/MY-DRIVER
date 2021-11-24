package sprint1;

public class rate {
	public Client c1;
	public int Enumrate ;
	
	public Client getC1() {
		return c1;
	}
	public void setC1(Client c1) {
		this.c1 = c1;
	}
	public int getEnumTest() {
		return Enumrate;
	}
	public void setEnumTest(int enumrate) {
		if(enumrate==1 || enumrate==2|| enumrate==3|| enumrate==4 ||enumrate==5 )
		Enumrate = enumrate;
	}
	
	
	
}
