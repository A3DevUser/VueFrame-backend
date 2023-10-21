package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ConfSectionData;
import com.Backend.VueFrame.Services.ConfSectionService;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ConfSectionController {

	
	@Autowired
	private ConfSectionService confSectionServ;
	
	
	@GetMapping("getConSection")
	public List<ConfSectionData> getConfSecData (@RequestParam String formId) {
		
		
		return confSectionServ.getConfSection(formId); 
	}
}
