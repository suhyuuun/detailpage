package controller;

//http://localhost:8090/myapp/list.do

import java.util.List;

//http://localhost:8090/myapp/list.do

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.DetailpageDTO;
import dto.PageDTO;
import service.DetailpageService;

@Controller
public class DetailpageController {
	private DetailpageService service;
	private PageDTO pdto;
	private int currentPage;
	
	public DetailpageController() {
		// TODO Auto-generated constructor stub
	}
	
	public void setService(DetailpageService service) {
		this.service = service;
	}
	
//	@RequestMapping(value= "/list.do")
//	public ModelAndView listMethod(String foodstore_id, String foodtype, String road_name, String latitude,
//			String longitude, String foodstroe_num, String img_url, ModelAndView mav) {
//		List<DetailpageDTO> aList = service.f_data_list(foodstore_id, foodtype, road_name, latitude, longitude, foodstroe_num, img_url);
//		mav.addObject(aList);
//		mav.setViewName("list");
//		return mav;
//	}

	
//	@RequestMapping(value= "/list.do", method = RequestMethod.GET)
//	public ModelAndView listMethod(DetailpageDTO dpdto, ModelAndView mav) {
//		List<DetailpageDTO> aList = service.f_data_list(this.ddto);
//		mav.addObject(aList);
//		mav.addObject("dpdto", this.ddto);
//		mav.setViewName("list");
//		return mav;
//	}

	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public ModelAndView listMethod(PageDTO pv, ModelAndView mav) {
		int totalRecord = service.countProcess();
		if (totalRecord >= 1) {
			if (pv.getCurrentPage() == 0)
				this.currentPage = 1;
			else
				this.currentPage = pv.getCurrentPage();
			this.pdto = new PageDTO(currentPage, totalRecord);
			List<DetailpageDTO> aList = service.f_data_list(this.pdto);
			mav.addObject("aList", aList);
			mav.addObject("pv", this.pdto);
		}
		mav.setViewName("list");
		return mav;
	}// listMethod()
}
