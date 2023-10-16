package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.NavBarData;
import com.Backend.VueFrame.Services.NavBarServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class NavBarController {

	
	@Autowired
	private NavBarServices navServ;
	
	
	@GetMapping("getNavEleFormId")
	public List<NavBarData> getNavDataByFormId(@RequestParam String formId) {
		
		return navServ.getNavBarData(formId);
	}
	
	@GetMapping("getNavEle")
	public List<NavBarData> getNavData() {
		
		return navServ.getNavData();
	}
}
