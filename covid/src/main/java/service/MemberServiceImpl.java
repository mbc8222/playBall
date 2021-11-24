package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDaoImpl;
import vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberDaoImpl dao;
	
	@Override
	public void create(MemberVo vo) {
		dao.create(vo);
		
	}

	@Override
	public MemberVo login(MemberVo vo) {

		MemberVo login=dao.login(vo);
		return login;
	}

	@Override
	public int idcheck(String id) {
		int result=dao.idcheck(id);
		return result;
	}

}
