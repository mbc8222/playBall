package dao;

import java.util.List;

import vo.NoticeVo;
import vo.PageVo;

public interface NoticeDao {

	public List<NoticeVo> search(PageVo vo);
	public void create(NoticeVo vo);
	public void modify(NoticeVo vo);
	public void delete(NoticeVo vo);
	public List<NoticeVo> detail(NoticeVo vo);
}
