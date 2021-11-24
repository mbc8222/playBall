package dao;

import java.util.List;

import vo.MemberVo;

public interface MemberDao {

	public void create(MemberVo vo);
	public MemberVo login(MemberVo vo);
	public int idcheck(String id);
}
