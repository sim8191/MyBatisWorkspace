package com.kh.mybatis.emp.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.common.SqlSessionTemplate;
import com.kh.mybatis.emp.model.dao.EmpDao;

public class EmpService {
	
	private EmpDao dao = new EmpDao();
	
	public List<Map<String, Object>> selectAll() {
		// 사용한 자원은 반납을 해야해서 항상 이렇게 번거롭게 다써야함
		SqlSession session = SqlSessionTemplate.getSession();
		List<Map<String, Object>> list = dao.selectAll(session);
		session.close();
		return list;
				
		
	}

	public List<Map<String, Object>> search1(Map<String, Object> param) {
		
		SqlSession session = SqlSessionTemplate.getSession();
		List<Map<String, Object>> list = dao.search1(session, param);
		session.close();
		return list;
	}

	public List<Map<String, Object>> search2(Map<String, Object> param) {
		
		SqlSession session = SqlSessionTemplate.getSession();
		List<Map<String, Object>> list = dao.search2(session, param);
		session.close();
		return list;
		
	}

	public List selectJobList() {
		SqlSession session = SqlSessionTemplate.getSession();
		List jobList = dao.selectJobList(session);
		session.close();
		return jobList;
	}

	public List search3(Map<String, Object> param) {
		SqlSession session = SqlSessionTemplate.getSession();
		List list = dao.searct3(session, param);
		session.close();
		return list;
	}

}
