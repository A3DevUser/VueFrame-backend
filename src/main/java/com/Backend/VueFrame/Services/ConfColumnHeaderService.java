package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.ConfColumnHeaderData;
import com.Backend.VueFrame.Repository.ConfColumnHeaderRepository;

@Service
public class ConfColumnHeaderService {
	
	@Autowired
	private ConfColumnHeaderRepository confColumnHeaderRepo;
	
	
	public List<ConfColumnHeaderData> getConfColumnHeader(@RequestParam String formId) {
		
		return confColumnHeaderRepo.getByFormId(formId);
	}
	
	

}
