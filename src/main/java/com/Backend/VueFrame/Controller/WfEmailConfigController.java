package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.WfEmailConfigData;
import com.Backend.VueFrame.Services.WfEmailConfigServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class WfEmailConfigController {
	
	@Autowired
	private WfEmailConfigServices wfEmailConfigServs;
	
	@PostMapping("setWfEmailConfig")
	public List<WfEmailConfigData> setWfEmailConfig(@RequestBody List<WfEmailConfigData> setData) {
		
		for(WfEmailConfigData i : setData) {
			wfEmailConfigServs.setEcId(i);
		}
		
		List<WfEmailConfigData> list = wfEmailConfigServs.setWfEmailConfig(setData);
		
		return list;
	}
}


