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
	    private ConfigurationFomrService ConfService;
	   

	    @PostMapping("postConfigData")
	    public ResponseEntity<String> configureAll(@RequestBody List<NavBarData> setData) {
	        // Call the service method to set the FormId for each NavBarData object
	        for (NavBarData navData : setData) {
	        	ConfService.setFormId(navData);
	        }

	        // Call the service method to save the updated NavBarData objects
	        List<NavBarData> updatedNavDataList = ConfService.SetNavData(setData);

	        // Perform additional operations if needed

	        return ResponseEntity.ok("All configurations have been completed.");
	    }

	
}


