package com.cleevio.task.Models.Responses;

import java.sql.Timestamp;

public class GetWatchesResponse 
{
	private Long id;
	
	private String title;
	
	private int price;
	
	private String description;
	
	private String fountain;
	
	private Timestamp transactionDate;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getFountain() {
		return fountain;
	}
	
	public void setFountain(String fountain) {
		this.fountain = fountain;
	}
	
	public Timestamp getTransactionDate() {
		return transactionDate;
	}
	
	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}	
}
