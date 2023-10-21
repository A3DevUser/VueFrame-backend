package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.ConfSectionData;
import com.Backend.VueFrame.Repository.ConfSectionRepository;

@Service
public class ConfSectionService {
	
	@Autowired
	private ConfSectionRepository confSecRepo;
	
	
	public List<ConfSectionData> getConfSection(@RequestParam String formId) {
		
		return confSecRepo.getByFormId(formId);
	}

}
