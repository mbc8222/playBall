package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mapper.NoticeMapper;
import vo.NoticeVo;
import vo.PageVo;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Autowired
	NoticeMapper mapper;
	
	@Transactional
	public List<NoticeVo> search(PageVo vo){
		List<NoticeVo> list=new ArrayList<NoticeVo>();
		int totList=mapper.totList(vo);
		vo.setTotList(totList);
		vo.compute();
		list=mapper.search(vo);
		return list;
	}
	
	@Override
	@Transactional
	public void create(NoticeVo vo) {
		System.out.println(vo.getId());
		System.out.println(vo.getTitle());
		System.out.println(vo.getContent());
		System.out.println(vo.getTime());
		mapper.create(vo);
		
	}

	@Override
	public void modify(NoticeVo vo) {
		mapper.modify(vo);
		
	}

	@Override
	@Transactional
	public List<NoticeVo> detail(NoticeVo vo) {
		List<NoticeVo> list=new ArrayList<NoticeVo>();
		System.out.println("dao"+vo.getSerial());
		list=mapper.detail(vo);
		return list;
	}

	@Override
	public void delete(NoticeVo vo) {
		mapper.delete(vo);
		
	}
	
	
}
