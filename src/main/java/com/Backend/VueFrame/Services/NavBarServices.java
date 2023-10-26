package com.Backend.VueFrame.Services;

import java.util.List;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.NavBarData;
import com.Backend.VueFrame.Repository.NavBarRepository;


@Service
public class NavBarServices {

	@Autowired
	private NavBarRepository navRepo;
	
	
	public List<NavBarData> getNavBarData(@RequestParam String formId) {
		
		return navRepo.getByFormId(formId);
	}
	
	
	
	public List<NavBarData> getNavData() {
		return navRepo.findByOrderByNumberAsc();
		
	}
	
	
	public List<NavBarData> SetNavData(@RequestBody List<NavBarData> setData) {
		
		List<NavBarData> list = navRepo.saveAll(setData);
		
		return list;
	}
}


