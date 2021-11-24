package service;

import vo.MemberVo;

public interface MemberService {
	public void create(MemberVo vo);
	public MemberVo login(MemberVo vo);
	public int idcheck(String id);
}
