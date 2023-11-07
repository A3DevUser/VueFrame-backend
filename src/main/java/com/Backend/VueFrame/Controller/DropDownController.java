package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Backend.VueFrame.Model.DropDownData;
import com.Backend.VueFrame.Services.DropDownServices;

@RequestMapping("VF/")
@CrossOrigin(origins = "*")
@RestController
public class DropDownController {

	@Autowired
	private DropDownServices eDropServ;
	
	//For getting list of the parameter as a json object for execution of Dropdown
	@GetMapping("dropdown")
	public String getdropdownCol(@RequestParam String formId, @RequestParam String colId,
			@RequestParam String gridId) {
		
		String dropJson = eDropServ.getdropdownCol(formId, colId, gridId);
		return dropJson;
	}
	
	//Old Code for executing DropDown where there were no Dropdowns 
	@GetMapping("DropData")
	public String getdropdownData(@RequestParam String formId, @RequestParam String colId,
			@RequestParam String gridId) {
		
		DropDownData sQuery = eDropServ.getDataByDropdata(formId, colId, gridId);
		String str;
		System.out.println("Query: " + sQuery.getQuery());
		str = sQuery.getQuery();
		System.out.println("Query2: " + str);
		//String list = eDropServ.getListofDropdown(str);
		String list = eDropServ.getListofDropdown(str);
		System.out.println("list: " + list);
		return list;
	}
	
	//Secopn API that will pass Json object with parameter details and get stored and display value
	@GetMapping("DropDataColData")
	public String getdropdownCol(@RequestParam String jsonDrop) {
		
		String dropJson = eDropServ.getDataByColDtlServ(jsonDrop);
		return dropJson;
	}
}
