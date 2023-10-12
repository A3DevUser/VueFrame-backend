package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ApiRepoData;
import com.Backend.VueFrame.Services.ApiRepoSevices;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ApiRepoController {

	
	@Autowired
	private ApiRepoSevices apiRepoServ;
	
	
	@GetMapping("getApiById")
	public List<ApiRepoData> getApi(@RequestParam String apiId, @RequestParam String formId) {
		
		return apiRepoServ.getApi(apiId, formId);
	}
}
