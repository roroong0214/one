package com.jsp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.jsp.command.SearchCriteria;
import com.jsp.dto.MemberVO;

public interface MemberDAO {

	List<MemberVO> selectSearchMemberList(SqlSession session,SearchCriteria cri) throws Exception;

	int selectSearchMemberListCount(SqlSession session, SearchCriteria cri) throws SQLException;

	MemberVO selectMemberById(SqlSession session, String id) throws SQLException;

	public void insertMember(SqlSession session, MemberVO member) throws SQLException;

	public void updateMember(SqlSession session, MemberVO member) throws SQLException;

	void deleteMember(SqlSession session, String id) throws SQLException;

}
