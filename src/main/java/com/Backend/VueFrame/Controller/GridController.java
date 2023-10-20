package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.GridData;
import com.Backend.VueFrame.Services.GridServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class GridController {

	
	@Autowired
	private GridServices gridServ;
	
	
	@GetMapping("getByGrid")
	public List<GridData> getGrid(@RequestParam String formId) {
		
		return gridServ.getGridData(formId);
	}
}
