package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.VueFrame.Model.WfEmailConfigData;
import com.Backend.VueFrame.Repository.WfEmailConfigRepository;

@Service
public class WfEmailConfigServices {
	
	@Autowired
	private WfEmailConfigRepository wfEmailConfigRepo;
	
	public List<WfEmailConfigData> setWfEmailConfig(List<WfEmailConfigData> setData) {
		
		List<WfEmailConfigData> list = wfEmailConfigRepo.saveAll(setData);
		
		return list;
	}
	
}