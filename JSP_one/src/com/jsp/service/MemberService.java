package com.jsp.service;

import java.util.Map;


public interface MemberService {

	public Map<String,Object> getMemberListForPage(SearchCriteria cri)
			throws Exception;
	
	public MemberVO getMember(String id)throws Exception;
	
	public void regist(MemberVO member)throws Exception;
	
	public void modify(MemberVO member)throws Exception;
	
	public void remove(String id)throws Exception;
}
