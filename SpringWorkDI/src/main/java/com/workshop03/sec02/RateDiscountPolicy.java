package com.workshop03.sec02;

public class RateDiscountPolicy implements DiscountPolicy{
	private int rate;	// 10이면 10퍼
	
	public RateDiscountPolicy(int rate) {
		super();
		this.rate = rate;
	}

	@Override
	public int getDiscountAmount(int price) {
		return price*rate/100;
	}

}
