package com.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BeanClass implements Serializable{
	
	private String bCode,bName,bAuthor;
	private float bPrice;
	private int bQty;
	
	public BeanClass() {} 
		
	public String getbCode() {
		System.out.println("BeanClass.getbCode()");
		return bCode;
	}
	public void setbCode(String bCode) {
		System.out.println("BeanClass.setbCode()");
		this.bCode = bCode;
	}
	public String getbName() {
		System.out.println("BeanClass.getbName()");
		return bName;
	}
	public void setbName(String bName) {
		System.out.println("BeanClass.setbName()");
		this.bName = bName;
	}
	public String getbAuthor() {
		System.out.println("BeanClass.getbAuthor()");
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		System.out.println("BeanClass.setbAuthor()");
		this.bAuthor = bAuthor;
	}
	public float getbPrice() {
		System.out.println("BeanClass.getbPrice()");
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		System.out.println("BeanClass.setbPrice()");
		this.bPrice = bPrice;
	}
	public int getbQty() {
		System.out.println("BeanClass.getbQty()");
		return bQty;
	}
	public void setbQty(int bQty) {
		System.out.println("BeanClass.setbQty()");
		this.bQty = bQty;
	}
	

}
