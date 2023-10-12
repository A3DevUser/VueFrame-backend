package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.FieldData;
import com.Backend.VueFrame.Repository.FieldRepository;
import com.Backend.VueFrame.Services.FieldServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class FieldController {
	
	
	@Autowired
	private FieldServices fieldServ;
	
	@GetMapping("getField")
	public List<FieldData> getFieldData(@RequestParam String formId) {
		
		return fieldServ.getFieldData(formId);
		
	}
	

}
