package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.SectionData;
import com.Backend.VueFrame.Services.SectionServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class SectionController {
	
	
	@Autowired
	private SectionServices secServ;
	
	@GetMapping("getSection")
	public List<SectionData> getSecData(@RequestParam String formId) {
		
		return secServ.getSecData(formId);
	}

	
	@PostMapping("setSection")
	public List<SectionData> setData(@RequestBody List<SectionData> setData) {
		
		List<SectionData> list = secServ.setSectionData(setData);
		
		return list;
	}
}
