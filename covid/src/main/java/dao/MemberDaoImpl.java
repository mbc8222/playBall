package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mapper.MemberMapper;
import vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	MemberMapper member;
	
	@Override
	@Transactional
	public void create(MemberVo vo) {
		System.out.println("dao");
		System.out.println("dao"+vo.getId());
		System.out.println("dao"+vo.getPassword());
		System.out.println("dao"+vo.getName());
		System.out.println("dao"+vo.getPhone());
		member.create(vo);
	}

	@Override
	@Transactional
	public MemberVo login(MemberVo vo) {
		System.out.println("daologin");
		System.out.println("daologin"+vo.getId());
		System.out.println("daologin"+vo.getPassword());
		MemberVo login=member.login(vo);
		return login;
		
	}

	@Override
	@Transactional
	public int idcheck(String id) {
		int result=member.idcheck(id);
		return result;
	}

}
