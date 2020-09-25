package INFO;
public class SetGetMethods {
		private String pCode,pName;
		private float pPrice;
		private int pQty;
		public String getpCode() {
			return pCode;
		}
		public void setpCode(String pCode) {
			this.pCode = pCode;
		}
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public float getpPrice() {
			return pPrice;
		}
		public void setpPrice(float pPrice) {
			this.pPrice = pPrice;
		}
		public int getpQty() {
			return pQty;
		}
		public void setpQty(int pQty) {
			this.pQty = pQty;
		}
		public static void main(String args[]){
			SetGetMethods sg=new SetGetMethods();
			System.out.println(sg.getpCode());
			System.out.println(sg.getpName());
			System.out.println(sg.getpPrice());
			System.out.println(sg.getpQty());
			
			sg.setpCode("A121");
			System.out.println(sg.getpCode());
			
			sg.setpName("Sri");
			System.out.println(sg.getpName());
			
			sg.setpPrice(1200);
			System.out.println(sg.getpPrice());
			
			sg.setpQty(12);
			System.out.println(sg.getpQty());
			
			
			
		}
}
