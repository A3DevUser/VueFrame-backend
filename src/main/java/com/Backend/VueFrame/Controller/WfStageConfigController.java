package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.WfStageConfigData;
import com.Backend.VueFrame.Services.WfStageConfigServices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class WfStageConfigController {
	
	@Autowired
	private WfStageConfigServices wfStageConfigServs; 
	
	@PostMapping("setWfStageConfig")
	public List<WfStageConfigData> setWfStageConfig(@RequestBody List<WfStageConfigData> setData) {
		
		List<WfStageConfigData> list = wfStageConfigServs.setWfStageConfig(setData);
		
		return list;
	}
}
