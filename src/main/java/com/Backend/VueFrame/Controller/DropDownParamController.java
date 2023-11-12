package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.DropDownParamModel;
import com.Backend.VueFrame.Services.DropDownParamService;

@RequestMapping("VF/")
@CrossOrigin(origins = "*")
@RestController
public class DropDownParamController {
	
	@Autowired
	private DropDownParamService eDropServ;
	
	
	@PostMapping("setddparam")
	public List<DropDownParamModel> setDDParam (@RequestBody List<DropDownParamModel> ddData){
		List<DropDownParamModel> list = eDropServ.setDataDropDownParam(ddData);
		return list;
	
	}	
	
}
