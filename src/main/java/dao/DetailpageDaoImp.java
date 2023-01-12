package dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.DetailpageDTO;
import dto.PageDTO;

public class DetailpageDaoImp implements DetailpageDao{

	private SqlSessionTemplate sqlSession;
	
	public DetailpageDaoImp() {
		// TODO Auto-generated constructor stub
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DetailpageDTO> list(PageDTO pv) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<DetailpageDTO> list(DetailpageDTO ddto) {
//		return sqlSession.selectList("jimat.detailpage_all", ddto);
//	}
	
//	@Override
//	public List<DetailpageDTO> data_list(HashMap<String, Object> seoulfooddata) {
//		return sqlSession.selectList("jimat.detailpage_all", seoulfooddata);
//	}

}
