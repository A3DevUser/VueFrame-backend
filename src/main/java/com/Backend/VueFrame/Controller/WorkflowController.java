package com.Backend.VueFrame.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.FormData;
import com.Backend.VueFrame.Model.WorkflowData;
import com.Backend.VueFrame.Services.LoggerService;
import com.Backend.VueFrame.Services.WorkflowService;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class WorkflowController {

	
	@Autowired
	private WorkflowService workFlowServ;
	
	@Autowired
	private LoggerService logServ;
	
	@GetMapping("getWFName")
	public List<WorkflowData> getWorkFlowData(@RequestParam String formId) {
		
		return workFlowServ.getWorkFlowData(formId);
	}
	
	
//	@PostMapping("callWorkflowProcedure")
//    public void callWorkflowProcedure(@RequestBody String jsonData) {
//		workFlowServ.callWorkflowProcedure(jsonData);
//S
//    }
//	
	
	 @PostMapping("callWorkflowProcedure")
	 public String insertData(@RequestBody String json) {
		 
		 logServ.log("e", "Error", "Error Details" + json);
		 logServ.log("d", "Debug Subject", "Debug Details" + json);

		 workFlowServ.callInsertDataFromDynamicJsonArray(json);
		 return json;
	    }
	 
	 @PostMapping("setWorkflowData")
	 public List<WorkflowData> setWorkflowData(@RequestBody List<WorkflowData> setData) {
		 
		 List<WorkflowData> list = workFlowServ.setWorkflowData(setData);
		 
		 return list;
	 }
}
