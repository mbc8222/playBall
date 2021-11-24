package mapper;

import org.apache.ibatis.annotations.Mapper;

import vo.MemberVo;

@Mapper
public interface MemberMapper {
	public void create(MemberVo vo);
	public MemberVo login(MemberVo vo);
	public int idcheck(String id);
}
