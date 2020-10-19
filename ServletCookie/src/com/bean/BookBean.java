package com.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BookBean implements Serializable {
	public BookBean() { }
	
	private String bCode,bName,bAuthor;
	private float bPrice; int bQty;

	public String getbCode() {
		System.out.println("BookBean.getbCode()");
		return bCode;
	}

	public void setbCode(String bCode) {System.out.println("BookBean.setbCode()");
		this.bCode = bCode;
	}

	public String getbName() {System.out.println("BookBean.getbName()");
		return bName;
	}

	public void setbName(String bName) {System.out.println("BookBean.setbName()");
		this.bName = bName;
	}

	public String getbAuthor() {System.out.println("BookBean.getbAuthor()");
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {System.out.println("BookBean.setbAuthor()");
		this.bAuthor = bAuthor;
	}

	public float getbPrice() {System.out.println("BookBean.getbPrice()");
		return bPrice;
	}

	public void setbPrice(float bPrice) {System.out.println("BookBean.setbPrice()");
		this.bPrice = bPrice;
	}

	public int getbQty() {System.out.println("BookBean.getbQty()");
		return bQty;
	}

	public void setbQty(int bQty) {System.out.println("BookBean.setbQty()");
		this.bQty = bQty;
	}
	
}
