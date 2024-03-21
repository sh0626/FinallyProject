package com.health.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.health.dao.MemberDao;
import com.health.domain.Member;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public int login(String id, String pw) {
		
		Member m = memberDao.getMember(id);
		
		int result = -1;
		
		// id가 존재하지 않으면
		if(m == null) {
			return result;
		}
		
		if(passwordEncoder.matches(pw, m.getPw())) {
			result =1;
			
		} else { // 비밀번호가 틀리면
					result = 0;
		}
		
		return result;
	}
	
	@Override
	public Member getMember(String id) {
		return memberDao.getMember(id);
	}
}
