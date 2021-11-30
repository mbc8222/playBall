package service;

import java.util.List;

import vo.NoticeVo;
import vo.PageVo;

public interface NoticeService {

	public List<NoticeVo> search(PageVo vo);
	public void create(NoticeVo vo);
	public void modify(NoticeVo vo);
	public void delete(NoticeVo vo);
	public List<NoticeVo> detail(NoticeVo vo);
}
