package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
