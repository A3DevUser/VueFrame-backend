package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ColumnHeaderData;
import com.Backend.VueFrame.Model.DropDownData;
import com.Backend.VueFrame.Model.DropDownParamModel;
import com.Backend.VueFrame.Services.DropDownParamService;

@RequestMapping("VF/")
@CrossOrigin(origins = "*")
@RestController
public class DropDownParamController {
	
	@Autowired
	private DropDownParamService eDropServ;
	
	
	@PostMapping("setddparam")
	public  ResponseEntity<List<DropDownParamModel>> setDDParam (@RequestBody List<DropDownParamModel> ddData){
		//List<DropDownParamModel> list = eDropServ.setDataDropDownParam(ddData);
		
	    List<DropDownParamModel> resultList = new ArrayList<>();

    	for (DropDownParamModel dropData :  ddData) {
    		DropDownParamModel updateData = eDropServ.setParamData(dropData);
            resultList.add(updateData);

//            obj.put("columnId",column.getColumnId());

    	}
    	List<DropDownParamModel> list = eDropServ.setDataDropDownParam(resultList);
        return new ResponseEntity<>(list, HttpStatus.OK);
	
	}	
	
	
	
	
	
	
}
