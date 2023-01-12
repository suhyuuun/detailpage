package dao;

import java.util.HashMap;
import java.util.List;

import dto.DetailpageDTO;
import dto.PageDTO;

public interface DetailpageDao {
	public int count();
	public List<DetailpageDTO> list(PageDTO pv);
	//	public List<DetailpageDTO> data_list(HashMap<String, Object> data);
}
