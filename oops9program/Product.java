package com.oops9program;

public class Product {
int Pid;
String pname;
int Price;
String UnitOfMesurement;

public Product(int pid, String pname, int price, String unitOfMesurement) {
	super();
	Pid = pid;
	pname = pname;
	Price = price;
	UnitOfMesurement = unitOfMesurement;
}

public int getPid() {
	return Pid;
}

public void setPid(int pid) {
	Pid = pid;
}

public String getpname() {
	return pname;
}

public void setpname(String pname) {
	pname = pname;
}

public int getPrice() {
	return Price;
}

public void setPrice(int price) {
	Price = price;
}

public String getUnitOfMesurement() {
	return UnitOfMesurement;
}

public void setUnitOfMesurement(String unitOfMesurement) {
	UnitOfMesurement = unitOfMesurement;
}

public Object clone() throws CloneNotSupportedException{
	return super.clone();
}

}
