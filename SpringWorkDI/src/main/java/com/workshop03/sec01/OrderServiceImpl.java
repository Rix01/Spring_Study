package com.workshop03.sec01;

public class OrderServiceImpl implements OrderService {
	private DiscountPolicy discountPolicy;
	private MemberRepository memberRepository;

	public OrderServiceImpl(DiscountPolicy discountPolicy, MemberRepository memberRepository) {
		super();
		this.discountPolicy = discountPolicy;
		this.memberRepository = memberRepository;
	}

	@Override
	public String order(int id, int price) {
		String name = memberRepository.findMemberById(id);
		int discountAmount = discountPolicy.getDiscountAmount(price);
		int discountPrice = price - discountAmount;	// 최종 금액

		return String.format("회원: %s\n주문 금액: %d 원\n할인금액: %d 원\n최종 결제 금액:%d 원\n", name, price, discountAmount, discountPrice);
	}

}
