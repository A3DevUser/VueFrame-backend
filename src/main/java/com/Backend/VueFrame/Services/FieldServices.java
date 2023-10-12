package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.FieldData;
import com.Backend.VueFrame.Repository.FieldRepository;

@Service
public class FieldServices {
	
	
	@Autowired
	private FieldRepository fieldRepo;
	
	public List<FieldData> getFieldData(@RequestParam String formId) {
		
		return fieldRepo.getByFormId(formId);
	}

}
