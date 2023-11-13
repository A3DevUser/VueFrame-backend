package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ColumnHeaderData;
import com.Backend.VueFrame.Services.ColumnHeaderService;



@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ColumnHeaderController {
	
	
	@Autowired
	private ColumnHeaderService columnServ;
	
    private static final Logger logger = LoggerFactory.getLogger(ColumnHeaderController.class);

	
	@GetMapping("getcolumn")
	public List<ColumnHeaderData> getcolumnData(@RequestParam String formId) {
		logger.info("This is an information message." + formId);
        logger.error("An error occurred.");
	   return columnServ.getColumnData(formId); 
}	
		
	
//	@GetMapping("getColumnOrder")
//	public List<ColumnHeaderData> getColumnByOrder(){
//		return columnServ.getOrderData();
//	} 
	
	
	@PostMapping("setColumnHead") 
	public List<ColumnHeaderData> setColumnData(@RequestBody List<ColumnHeaderData> setData) {
		
		List<ColumnHeaderData> list = columnServ.SetColumnData(setData);
		
		return list;

	}
	
	@GetMapping("getcol")
	public List<ColumnHeaderData> getlistofColumns(@RequestParam String formId, @RequestParam String emd){
		return columnServ.getlistofColumns(formId,emd); 
	}

  
	

	
	
	
	
}
