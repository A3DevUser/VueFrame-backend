package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.ConfGridData;
import com.Backend.VueFrame.Repository.ConfGridRepository;

@Service
public class ConfGridService {
	
	@Autowired
	private ConfGridRepository confGridRepo;
	
	public List<ConfGridData> getConfGrid(@RequestParam String formId) {
		
		return confGridRepo.getByFormId(formId);
	}

}
