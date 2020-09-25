//complex and Imaginary
package aggregation;
class Complex{
	private float real;
	private float img;
	void setComplex(float real,float img){
		this.real=real;
		this.img=img;
	}
	void printComplex(){
		System.out.println(real+" "+img);
	}
	Complex addComplex(Complex c){
		Complex c1=new Complex();
		c1.real=real+c.real;
		c1.img=img+c.img;
		return c1; //non-primetive reference class return type is mandatory.
	}
}
public class RefferenceType {

	public static void main(String[] args) {
		Complex c2=new Complex();
		Complex c3=new Complex();
		c2.setComplex(1.5f, 1.2f);
		c3.setComplex(1.2f, 1.5f);
		Complex c4=c2.addComplex(c3);
		c2.printComplex();
		c3.printComplex();
		c4.printComplex();
	}

}
