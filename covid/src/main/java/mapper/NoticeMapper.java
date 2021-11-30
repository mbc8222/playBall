package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import vo.NoticeVo;
import vo.PageVo;

@Mapper
public interface NoticeMapper {

	public int totList(PageVo vo);
	public List<NoticeVo> search(PageVo vo);
	public void create(NoticeVo vo);
	public void modify(NoticeVo vo);
	public void delete(NoticeVo vo);
	public List<NoticeVo> detail(NoticeVo vo);
}
