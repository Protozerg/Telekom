public class Abonent {
	
	private String number;
	private String name;
	private String surname;
	private String otch;
	private String adress;
	private int debt;
	
	public Abonent(){
		this.number = "";
		this.name = "";
		this.surname = "";
		this.otch = "";
		this.adress = "";
		this.debt = 0;
	}
	
	public Abonent(String nu, String na, String su, String ot, String ad, int de){
		this.number = nu;
		this.name = na;
		this.surname = su;
		this.otch = ot;
		this.adress = ad;
		this.debt = de;
	}
	
	public void setNumber(String nu){
		this.number = nu;
	}
	
	public void setName(String na){
		this.name = na;
	}
	
	public void setSurname(String su){
		this.surname = su;
	}
	
	public void setOtch(String ot){
		this.otch = ot;
	}
	
	public void setAdress(String ad){
		this.adress = ad;
	}
	
	public void setDebt(int de){
		this.debt = de;
	}
	
	public String getNumber(){
		return number;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSurname(){
		return surname;
	}
	
	public String getOtch(){
		return otch;
	}
	
	public String getAdress(){
		return adress;
	}
	
	public int getDebt(){
		return debt;
	}

}
