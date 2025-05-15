package com.workshop03.sec01;

public class FixDiscountPolicy implements DiscountPolicy{
	private final int fixedDiscount = 1000;
	
	public FixDiscountPolicy() {
		super();
	}


	@Override
	public int getDiscountAmount(int price) {
		return fixedDiscount;
	}

}
