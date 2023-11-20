package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Backend.VueFrame.Model.FieldConfigData;
import com.Backend.VueFrame.Repository.FieldConfigRepository;

@Service
public class FieldConfigServices {
	
	@Autowired
	private FieldConfigRepository fieldConfigRepository;
	
	public List<FieldConfigData> setFieldConfig(List<FieldConfigData> setData) {
		
		List<FieldConfigData> list = fieldConfigRepository.saveAll(setData);
		
		return list;
	}
	
	public FieldConfigData setFieldId(@RequestBody FieldConfigData setData) {
		String seq = fieldConfigRepository.setFieldSequence();
	    String formatedstr = "FC-" + seq;
	    setData.setFieldId(formatedstr);
	    return setData;
	}
}

