package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.FormData;
import com.Backend.VueFrame.Model.WorkflowData;
import com.Backend.VueFrame.Repository.WorkflowRepository;

@Service
public class WorkflowService {
	
	@Autowired
	private WorkflowRepository workFlowRepo;
	
	public List<WorkflowData> getWorkFlowData(@RequestParam String formId) {
		
		return workFlowRepo.getByFormId(formId);
	}
	
	
	
	public void callInsertDataFromDynamicJsonArray(String json) {
		workFlowRepo.insertDataFromDynamicJsonArray(json);
		
		
		
    }
	
	public void callSetGridData(String gridId) {
		workFlowRepo.setGridData(gridId);
	}
	
	
	public WorkflowData setWfId(@RequestBody WorkflowData setData) {
		String seq = workFlowRepo.setWfSequence();
	    String formattedWfId = "WF-" + seq;
	    setData.setWfId(formattedWfId);
	    return setData;
	}
	
public List<WorkflowData> setWorkflowData(@RequestParam List<WorkflowData> setData) {
		
		List<WorkflowData> list = workFlowRepo.saveAll(setData);
		
		return list;
	}
}
