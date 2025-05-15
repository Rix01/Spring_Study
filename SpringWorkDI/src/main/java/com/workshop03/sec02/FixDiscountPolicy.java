package com.workshop03.sec02;

public class FixDiscountPolicy implements DiscountPolicy{
	private final int fixedDiscount = 1000;
	
	public FixDiscountPolicy() {
		super();
	}

	public int getFixedDiscount() {
		return fixedDiscount;
	}

	@Override
	public int getDiscountAmount(int price) {
		return price-fixedDiscount;
	}

}
