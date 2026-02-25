package com.kh.mybatis.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class EmpDao {

	public List<Map<String, Object>> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		return session.selectList("emp.selectAll");
	}

	public List<Map<String, Object>> search1(SqlSession session, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("emp.search1", param);
	}

	public List<Map<String, Object>> search2(SqlSession session, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("emp.search2", param);
	}

	public List selectJobList(SqlSession session) {
		// TODO Auto-generated method stub
		return session.selectList("emp.selectJobList");
	}

	public List searct3(SqlSession session, Map<String, Object> param) {
		// TODO Auto-generated method stub
		return session.selectList("emp.search3", param);
	}

}
