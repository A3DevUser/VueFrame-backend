package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ButtonData;
import com.Backend.VueFrame.Services.ButtonServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ButtonController {
	
	
	@Autowired
	private ButtonServices btnServ;
	
//	@GetMapping("getBtn")
//	public List<ButtonData> getData(@RequestParam String formId) {
//		return btnServ.getButtonData(formId);
//	}

}
