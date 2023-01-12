package service;

import java.util.List;

import dto.DetailpageDTO;
import dto.PageDTO;

public interface DetailpageService {
	public int countProcess();
	public List<DetailpageDTO> f_data_list(PageDTO pv);
}
