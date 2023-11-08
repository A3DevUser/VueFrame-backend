package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.SubSectionDetails;
import com.Backend.VueFrame.Services.SubSectionService;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class SubSectionController {
	
	@Autowired
	private SubSectionService subSecServ;
	
//	@GetMapping("getSubSection")
//	public List<SubSectionDetails> getSub(@RequestParam String formId) {
//		
//		return subSecServ.getSubSec(formId);
//	}

}
