package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.FieldConfigData;
import com.Backend.VueFrame.Services.FieldConfigServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class FieldConfigController {
	
	@Autowired
	private FieldConfigServices fieldConfigServices;
	
	@PostMapping("setFieldConfig")
	public List<FieldConfigData> setFieldConfig(@RequestBody List<FieldConfigData> setData) {
		
		for (FieldConfigData i :  setData) {
			fieldConfigServices.setFieldId(i);
		 }
		
		List<FieldConfigData> list = fieldConfigServices.setFieldConfig(setData);
		
		return list;
	}
}
