package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.catalina.realm.CombinedRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ColumnHeaderData;
import com.Backend.VueFrame.Model.CombinedData;
import com.Backend.VueFrame.Model.CombinedObject;
import com.Backend.VueFrame.Model.CombinedResultDTO;
import com.Backend.VueFrame.Model.GridData;
import com.Backend.VueFrame.Model.NavBarData;
import com.Backend.VueFrame.Model.SectionData;
import com.Backend.VueFrame.Services.ColumnHeaderService;
import com.Backend.VueFrame.Services.ConfigurationFomrService;
import com.fasterxml.jackson.databind.util.JSONPObject;


@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ConfigurationFormController {
	

	    @Autowired
	    private ConfigurationFomrService confService;
	    
	    @Autowired
	    private ColumnHeaderService confServ;
	   

	    @PostMapping("postConfigData")
	    public Object configureAll(@RequestBody List<CombinedObject> combinedObjectList) {
	        List<NavBarData> navBarDataList = new ArrayList<>();
	        List<GridData> gridDataList = new ArrayList<>();
	        Map<String,Object> obj = new HashMap<>();
	        
	        for (CombinedObject combinedObject : combinedObjectList) {
	          
	                // Create a new NavBarData instance
	                NavBarData navBarData = new NavBarData();
	                confService.setFormId(navBarData);	              
	                obj.put("formId",navBarData.getFormId());
	                navBarData.setNavName(combinedObject.getNavName());
	                navBarData.setNavStoredValue(combinedObject.getNavStoredValue());
	                navBarData.setNavigate("/GridForm");

	                navBarDataList.add(navBarData);

	                GridData gridData = new GridData();
	                confService.setGridId(gridData);
	                obj.put("gridId",gridData.getGridId());
	                gridData.setFormId(navBarData.getFormId());
	                gridData.setGridName(combinedObject.getGridName());
	                gridData.setDbTableName(combinedObject.getDbTableName());
	                gridData.setIsMrow(combinedObject.getIsMrow());
	                gridData.setIsMain("true");
	                
	                
	                // Set other GridData fields as needed

	                // Set the gridId for GridData

	                // Add the GridData instance to the list
	                gridDataList.add(gridData);
	            }
	        

	        // Save the lists of NavBarData and GridData instances
	        List<NavBarData> updatedNavDataList = confService.SetNavData(navBarDataList);
	        List<GridData> savedGridDataList = confService.setGridData(gridDataList);

	        // You may want to return a response if needed
//	        List<String,String> Op = new List();
	        return ResponseEntity.ok(obj);
	    }

	    
	    //Section Config Api
	    @PostMapping("postSectionData")
	    public Object getSecData(@RequestBody List<SectionData> secData) {
	    	
	        Map<String,Object> obj = new HashMap<>();
//    		HashMap<String, S> val = new HashMap<>();


	    	
	    	for (SectionData sec :  secData) {
	    		confService.setSectionId(sec);
//	            obj.put("secId",sec.getSecId());
	            obj.put("formId", sec.getFormId());
//	            val.put("secId", sec.setSecName(sec.getSecId()));
	    	}
	    	List<SectionData> list = confService.setSectionData(secData);
	  		return obj;
	    }
	    	    
	    @PostMapping("postGridData")
	    public Object getGridData(@RequestBody List<GridData> gridData) {
	        Map<String,Object> obj = new HashMap<>();
	        String formId = null;
	    	for (GridData grid :  gridData) {
	    		confService.setGridId(grid);
	            obj.put("formId",grid.getFormId());
	            formId = grid.getFormId();	  
	            
	    	}
	    	List<GridData> list = confService.setGridData(gridData);
	    	String str = confService.getmrowUpdate(formId); 	    
	    	obj.put("errMsg",str);
	  		return obj;
	    }
		    
	    @PostMapping("postColumnData")
	    public Object getColumnData(@RequestBody List<ColumnHeaderData> columnData) {
	    	
	        Map<String,Object> obj = new HashMap<>();
	        String formId = null;
	    	for (ColumnHeaderData column :  columnData) {
	    		confService.setColumnId(column);	            
	            obj.put("formId", column.getFormId());
	            formId = column.getFormId();	            
	    	}
	    	List<ColumnHeaderData> list = confService.SetColumnData(columnData);	
	    	String str = confServ.getGridDataResp(formId); 	    
	    	obj.put("errMsg",str);
	  		return obj;
	    }
	    

}


