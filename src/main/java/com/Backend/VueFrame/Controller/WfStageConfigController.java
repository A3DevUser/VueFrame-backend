package com.Backend.VueFrame.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public Object setWfStageConfig(@RequestBody List<WfStageConfigData> setData) {
		
		
        Map<String,Object> obj = new HashMap<>();

		for(WfStageConfigData wf : setData) {
			wfStageConfigServs.setConfigId(wf);
            obj.put("formId",wf.getFormId());
			
		}
		
		List<WfStageConfigData> list = wfStageConfigServs.setWfStageConfig(setData);
		
		return obj;
	}
}
