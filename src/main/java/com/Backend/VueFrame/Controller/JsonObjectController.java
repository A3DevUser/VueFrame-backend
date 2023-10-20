package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.KeyValuePair;
import com.Backend.VueFrame.Model.YourData;
import com.Backend.VueFrame.Repository.JsonObjectRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class JsonObjectController {

	
	@Autowired
    private JsonObjectRepository jsonRepo;

//    @PostMapping("jsonObject")
//    public ResponseEntity<String> setJson(@RequestBody Action json) {
//    	
////    	return 
//      
////      return jsonRepo.insertJasonData();
//    }    
//    




//	@PostMapping("splitJson")
//	public YourData splitJson(@RequestBody String jsonString) {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            YourData yourData = mapper.readValue(jsonString, YourData.class);
//            return yourData;
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Handle the exception
//            return new YourData(); // or return an error response
//        }
//	}
	
	
	

	    @PostMapping("splitJson")
	    public List<KeyValuePair> splitJson(@RequestBody String jsonString) {
	        try {
	            ObjectMapper mapper = new ObjectMapper();
	            YourData yourData = mapper.readValue(jsonString, YourData.class);

	            List<KeyValuePair> keyValues = new ArrayList<>();

	            List<String> columnNames = yourData.getColumn_name();
	            List<String> columnValues = yourData.getColumn_value();
	            List<String> constraints = yourData.getConstraints();
	            
	                for (int i = 0; i < columnNames.size(); i++) {
	                    KeyValuePair pair = new KeyValuePair();
	                    pair.setColumnName(columnNames.get(i));
	                    pair.setColumnValue(columnValues.get(i));
	                    pair.setConstraint(constraints.get(i));
	                    keyValues.add(pair);
	                }

	            return keyValues;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return new ArrayList<>();
	        }
	    }
	    
	}

