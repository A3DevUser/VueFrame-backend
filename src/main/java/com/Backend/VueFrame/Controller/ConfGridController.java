package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ConfGridData;
import com.Backend.VueFrame.Services.ConfGridService;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ConfGridController {
	
	
	@Autowired
	private ConfGridService confGridServ;
	
	@GetMapping("getConfSGrid")
	public List<ConfGridData> getConfGrid(@RequestParam String formId){
		return confGridServ.getConfGrid(formId);
	}

}
