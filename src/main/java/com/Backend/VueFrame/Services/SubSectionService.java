package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.SubSectionDetails;
import com.Backend.VueFrame.Repository.SubSectionRepository;

@Service
public class SubSectionService {
	
	
	@Autowired
	private SubSectionRepository subSecRepo;
	
	public List<SubSectionDetails> getSubSec(@RequestParam String formId) {
		
		return subSecRepo.getByFormId(formId);
	}

}
