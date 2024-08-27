package com.java.collections.arrylist;

public class Laptop {

	private int price;
	private String brand;
	private int ram;
	
	public Laptop(int price, String brand, int ram) {
		this.price = price;
		this.brand = brand;
		this.ram = ram;
		
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + ", ram=" + ram + "]";
	}
	
//	public String toString() {
//		return "price : "+price+", Brand: "+brand+", RAM: "+ram;
//	}
}
