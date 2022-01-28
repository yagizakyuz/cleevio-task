package com.cleevio.task.Models.Requests;

import java.sql.Timestamp;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class CreateWatchRequest 
{
	@NotBlank
	@Size(min=1, max=255)
	private String title;
	
	@NotNull
	@PositiveOrZero
	private int price;
	
	@Size(min=0, max=255)
	private String description;
	
	@NotBlank
	@Size(min=0, max=3000)
	private String fountain;
	
	private Timestamp transactionDate = new Timestamp(System.currentTimeMillis());
	
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
