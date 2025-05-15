beans{
	memberRepository(com.workshop03.sec03.MemoryMemberRepository, [1: "홍길동"])
	
	discountPolicy(com.workshop03.sec03.FixDiscountPolicy)
	
	orderService(com.workshop03.sec03.OrderServiceImpl, discountPolicy, memberRepository)
}