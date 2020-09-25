package test;
import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable{
	private String uName,pWord,fName,lName,Addr,Mid;
	private long Phno;
	public UserBean(){}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String Addr) {
		this.Addr = Addr;
	}
	public String getMid() {
		return Mid;
	}
	public void setMid(String Mid) {
		this.Mid = Mid;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long Phno) {
		this.Phno = Phno;
	}
	
}
