package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.SectionData;
import com.Backend.VueFrame.Repository.SectionRepository;

@Service
public class SectionServices {
	
	
	@Autowired
	private SectionRepository secRepo;
	
	public List<SectionData> getSecData(@RequestParam String formId) {
		return secRepo.getByFormId(formId);
	}

	
	
}
