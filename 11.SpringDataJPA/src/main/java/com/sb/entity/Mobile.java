package com.sb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PHONE")
public class Mobile  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private Integer imeiNumber;
	private String name;
	private double price;
	private String brand;
	public Mobile() {}
	public Mobile(Integer imeiNumber, String name, double price, String brand) {
		super();
		this.imeiNumber = imeiNumber;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	public Integer getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(Integer imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [imeiNumber=" + imeiNumber + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}
}
