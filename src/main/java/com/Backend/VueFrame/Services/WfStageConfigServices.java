package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.VueFrame.Model.WfStageConfigData;
import com.Backend.VueFrame.Repository.WfStageConfigRepository;

@Service
public class WfStageConfigServices {
	
	@Autowired
	private WfStageConfigRepository wfStageConfigRepo;
	
	
	public WfStageConfigData setConfigId(WfStageConfigData setData) {
		String seq = wfStageConfigRepo.setStageSequence();
		String formatedstr = "SC-"+seq;
		setData.setConfigId(formatedstr);
		return setData;
	}
	
	public List<WfStageConfigData> setWfStageConfig(List<WfStageConfigData> setData) {
		
		List<WfStageConfigData> list = wfStageConfigRepo.saveAll(setData);
		
		return list;
	}
}