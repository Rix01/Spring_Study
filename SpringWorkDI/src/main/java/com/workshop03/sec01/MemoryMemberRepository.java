package com.workshop03.sec01;

import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
	private Map<Integer, String> members;
	
	public MemoryMemberRepository() {
		
	}
	
	public MemoryMemberRepository(Map<Integer, String> members) {
		this.members = members;
	}

	@Override
	public String findMemberById(int id) {
		return members.get(id);
	}

}
