package queue;
public class Product1 {
		public String pCode,pName;
		public float pPrice;
		public float pQty;
		public  Product1(String pCode,String pName,float pPrice,float pQty){ //constructor
			this.pCode=pCode;
			this.pName=pName;
			this.pPrice=pPrice;
			this.pQty=pQty;
		}
		public String toString(){
			return pCode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
		}
		
}
