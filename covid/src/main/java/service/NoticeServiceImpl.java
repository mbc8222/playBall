package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.NoticeDaoImpl;
import vo.NoticeVo;
import vo.PageVo;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Autowired
	NoticeDaoImpl dao;
	
	@Override
	public List<NoticeVo> search(PageVo vo) {
		List<NoticeVo> list=new ArrayList<NoticeVo>();
		list=dao.search(vo);
		return list;
	}

	@Override
	public void create(NoticeVo vo) {
		dao.create(vo);

	}

	@Override
	public void modify(NoticeVo vo) {
		dao.modify(vo);
		
	}

	@Override
	public List<NoticeVo> detail(NoticeVo vo) {
		List<NoticeVo> list=new ArrayList<NoticeVo>();
		System.out.println("service"+vo.getSerial());
		list=dao.detail(vo);
		return list;
	}

	@Override
	public void delete(NoticeVo vo) {
		dao.delete(vo);
	}


}
