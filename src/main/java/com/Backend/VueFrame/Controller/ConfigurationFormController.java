package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
import com.Backend.VueFrame.Services.ConfigurationFomrService;


@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class ConfigurationFormController {
	

	    @Autowired
	    private ConfigurationFomrService confService;
	   

	    @PostMapping("postConfigData")
	    public ResponseEntity<List<CombinedObject>> configureAll(@RequestBody List<CombinedObject> combinedObjectList) {
	        List<NavBarData> navBarDataList = new ArrayList<>();
	        List<GridData> gridDataList = new ArrayList<>();

	        
	        for (CombinedObject combinedObject : combinedObjectList) {
	            if (combinedObject.getNavName() != null) {
	                // Create a new NavBarData instance
	                NavBarData navBarData = new NavBarData();
	                confService.setFormId(navBarData);
	                navBarData.setNavName(combinedObject.getNavName());
	                navBarData.setNavStoredValue(combinedObject.getNavStoredValue());
	                navBarData.setNavigate(combinedObject.getNavigate());
	                // Set other NavBarData fields as needed

	                // Set the formId for NavBarData

	                // Add the NavBarData instance to the list
	                navBarDataList.add(navBarData);
	            } else if (combinedObject.getGridName() != null) {
	                // Create a new GridData instance
	            	
	                GridData gridData = new GridData();
	                confService.setGridId(gridData);
	                gridData.setGridName(combinedObject.getGridName());
	                gridData.setDbTableName(combinedObject.getDbTableName());
	                gridData.setIsMain(combinedObject.getIsMain());
	                // Set other GridData fields as needed

	                // Set the gridId for GridData

	                // Add the GridData instance to the list
	                gridDataList.add(gridData);
	            }
	        }

	        // Save the lists of NavBarData and GridData instances
	        List<NavBarData> updatedNavDataList = confService.SetNavData(navBarDataList);
	        List<GridData> savedGridDataList = confService.setGridData(gridDataList);

	        // You may want to return a response if needed
	        return ResponseEntity.ok(combinedObjectList);
	    }


	
}


