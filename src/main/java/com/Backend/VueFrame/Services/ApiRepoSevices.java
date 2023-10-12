package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.ApiRepoData;
import com.Backend.VueFrame.Repository.ApiRepoRepository;

@Service
public class ApiRepoSevices {

	
	@Autowired
	private ApiRepoRepository apiRepo;
	
	
	public List<ApiRepoData> getApi(@RequestParam String apiId, @RequestParam String formId) {
		
		return apiRepo.getByApiIdAndFormId(apiId, formId);
	}
}
