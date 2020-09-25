package interFace;
interface Driver{
	void connect();
}
class OracleDriver implements Driver{
	public void connect(){
		System.out.println("connect to oracle driver");
	}
}
class MysqlDriver implements Driver{
	public void connect(){
		System.out.println("connect to mysql database");
	}
}
public class Runtime {
	void cc(Driver dd){//runtime caller
		dd.connect(); //runtime caller
	}
	public static void main(String[] args) {
	Driver d;
	d=new OracleDriver();
	d.connect();
	d=new MysqlDriver();
	d.connect();
	
	Runtime r=new Runtime();//runtime caller
	OracleDriver o=new OracleDriver();
	MysqlDriver m=new MysqlDriver();
	r.cc(o);
	r.cc(m);
	}

}
