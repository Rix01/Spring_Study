package com.workshop03.sec02;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {
	@Bean
	public MemberRepository memberRepository() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "홍길동");
		return new MemoryMemberRepository(map);
	}
	
	@Bean
	public DiscountPolicy discountPolicy() {
		return new RateDiscountPolicy(10);	// 10퍼
	}
	
	@Bean("service")
	public OrderService orderService() {
		OrderService service = new OrderServiceImpl(discountPolicy(), memberRepository());
		return service;
	}
}
