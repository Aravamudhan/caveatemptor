package com.amudhan.caveatemptor.dao;

import com.amudhan.caveatemptor.entity.CreditCard;

public interface CreditCardDao {
	public void persist(CreditCard creditCard);
	public void remove(CreditCard creditCard);
}
