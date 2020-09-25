package map;
public class Product1 {
		public String pName;
		public float pPrice;
		public float pQty;
		public  Product1(String pName,float pPrice,float pQty){ //constructor
			this.pName=pName;
			this.pPrice=pPrice;
			this.pQty=pQty;
		}
		public String toString(){
			return pName+"\t"+pPrice+"\t"+pQty;
		}
		
}
