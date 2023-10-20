package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("getcolumn")
	public List<ColumnHeaderData> getcolumnData(@RequestParam String formId) {
	   return columnServ.getColumnData(formId);
	    
	   
	 
}	
		
	
//	@GetMapping("getColumnOrder")
//	public List<ColumnHeaderData> getColumnByOrder(){
//		return columnServ.getOrderData();
//	}
	
	@GetMapping("getColumnHeader")
	public List<ColumnHeaderData> getColHead(@RequestParam String formId, 
			                                @RequestParam String secId,
			                                @RequestParam String gridId) {
		return columnServ.getColumn(formId, secId, gridId);
	}

	
}
