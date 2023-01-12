package service;

import java.util.HashMap;
import java.util.List;

import dao.DetailpageDao;
import dto.DetailpageDTO;
import dto.PageDTO;

public class DetailpageServiceImp implements DetailpageService{
	private DetailpageDao dao;

	public DetailpageServiceImp() {

	}
	
	public void setDao(DetailpageDao dao) {
		this.dao = dao;
	}

	@Override
	public List<DetailpageDTO> f_data_list(PageDTO pv) {
		return dao.list(pv);
	}

	@Override
	public int countProcess() {
		return dao.count();
	}

//	@Override
//	public List<DetailpageDTO> f_data_list(String foodstore_id, String foodtype, String road_name, String latitude,
//			String longitude, String foodstroe_num, String img_url) {
//		HashMap<String, Object> seoulfood_data = new HashMap<String, Object>();
//		seoulfood_data.put("foodstore_id", foodstore_id);
//		seoulfood_data.put("foodtype", foodtype);
//		seoulfood_data.put("road_name", road_name);
//		seoulfood_data.put("latitude", latitude);
//		seoulfood_data.put("longitude", longitude);
//		seoulfood_data.put("foodstroe_num", foodstroe_num);
//		seoulfood_data.put("img_url", seoulfood_data);
//		return dao.data_list(seoulfood_data);
//	}

}
