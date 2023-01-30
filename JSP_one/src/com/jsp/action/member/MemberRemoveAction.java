package com.jsp.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.dto.MemberVO;
import com.jsp.service.MemberService;

public class MemberRemoveAction implements Action{

	private MemberService service;
	public void setMemberService(MemberService service) {
		this.service = service;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url="/member/remove";
		
		String id = request.getParameter("id");
		
		try {
			MemberVO member = service.getMember(id);
			
			request.setAttribute("member", member);
			
			service.remove(id);			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return url;
	}

}
