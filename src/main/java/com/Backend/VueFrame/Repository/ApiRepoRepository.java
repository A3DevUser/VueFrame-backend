package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Backend.VueFrame.Model.ApiRepoData;

public  interface ApiRepoRepository extends JpaRepository<ApiRepoData, String> {

//	List<ApiRepoData> getByApiId(String apiId, String formId);

	List<ApiRepoData> getByApiIdAndFormId(String apiId, String formId);
	
	

}
