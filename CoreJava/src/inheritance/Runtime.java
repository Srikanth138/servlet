package inheritance;
class Sim{
	void connect(){
		System.out.println("connecting to sim");
	}
}
class Airtel extends Sim{
	void connect(){
		System.out.println("connecting to airtel Sim network");
	}
}
class Bsnl extends Sim{
	void connect(){
		System.out.println("connecting to Bsnl Sim network");
	}
}
class Mobile{
	void insert(Sim s){
		s.connect();
	}
}
public class Runtime {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		Airtel a=new Airtel();
		Bsnl b=new Bsnl();
		m.insert(a);
		m.insert(b);
	}

}
