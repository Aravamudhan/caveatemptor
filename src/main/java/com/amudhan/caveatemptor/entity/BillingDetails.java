package com.amudhan.caveatemptor.entity;

import javax.persistence.Entity;

@Entity
public abstract class BillingDetails {
	private long id;
	private User owner;
	
	public enum BillingType { CREDITCARD, BANKACCOUNT}
	
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public long getId() {
		return id;
	}
}