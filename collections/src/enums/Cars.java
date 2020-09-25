package enums;
public enum Cars {
	Figo(900),Alto(400),Dezire(800);//constructor
	public int price;
	private Cars(int price){ //constructor with parameter
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
}
