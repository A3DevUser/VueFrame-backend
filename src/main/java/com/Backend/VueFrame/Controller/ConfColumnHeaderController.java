package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ConfColumnHeaderData;
import com.Backend.VueFrame.Services.ConfColumnHeaderService;


@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ConfColumnHeaderController {
	
	@Autowired
	private ConfColumnHeaderService confColumnHaederServ;

	
	@GetMapping("getConfColumn")
	public List<ConfColumnHeaderData> getConfColumn(@RequestParam String formId) {
		
		return confColumnHaederServ.getConfColumnHeader(formId);
	}
}
