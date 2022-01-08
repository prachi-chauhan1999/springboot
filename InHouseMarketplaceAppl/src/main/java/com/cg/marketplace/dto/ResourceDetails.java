package com.cg.marketplace.dto;

import java.time.LocalDate;

import com.cg.marketplace.entities.Employee;

public class ResourceDetails {
	private int resId;
	private String title;
	private String description;
	private String category;
	private LocalDate date;
	private String type;
	private double	price;
	private Employee emp;
	public  ResourceDetails() {
		
	}
	public ResourceDetails(int resId, String title, String description, String category, LocalDate date, String type,
			double price, Employee emp) {
		super();
		this.resId = resId;
		this.title = title;
		this.description = description;
		this.category = category;
		this.date = date;
		this.type = type;
		this.price = price;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Resource [resId=" + resId + ", title=" + title + ", description=" + description + ", category="
				+ category + ", date=" + date + ", type=" + type + ", price=" + price + ", emp=" + emp + "]";
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

}
