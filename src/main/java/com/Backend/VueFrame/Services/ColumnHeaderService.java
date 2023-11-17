package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.ColumnHeaderData;
import com.Backend.VueFrame.Model.NavBarData;
import com.Backend.VueFrame.Repository.ColumnHeaderRepository;

@Service
public class ColumnHeaderService {
	
	@Autowired
	private ColumnHeaderRepository columnHeadRepo;

	
	public List<ColumnHeaderData> getColumnData(@RequestParam String formId) {
		
		return columnHeadRepo.getByFormId(formId);
		
	}
	
//	public List<ColumnHeaderData> getColumn(@RequestParam String formId) {
//		
//		return columnHeadRepo.getByFormId(formId);
//	}
	

	public List<ColumnHeaderData> SetColumnData(@RequestBody List<ColumnHeaderData> setData) {
		
		List<ColumnHeaderData> list = columnHeadRepo.saveAll(setData);
		
		return list;
	}
    public List<ColumnHeaderData> getlistofColumns(@RequestParam String formId,@RequestParam  String emd) {
        
        return columnHeadRepo.getlistofColumns(formId,emd);
        //return null;
}    

    
    public String getGridDataResp(String formId) {
		return columnHeadRepo.getGridCreationDtls(formId);
	}    
	
}
