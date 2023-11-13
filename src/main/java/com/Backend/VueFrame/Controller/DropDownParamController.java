package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Model.ColumnHeaderData;
import com.Backend.VueFrame.Model.DropDownParamModel;
import com.Backend.VueFrame.Services.DropDownParamService;

@RequestMapping("VF/")
@CrossOrigin(origins = "*")
@RestController
public class DropDownParamController {
	
	@Autowired
	private DropDownParamService eDropServ;
	
	
	@PostMapping("setddparam")
	public List<DropDownParamModel> setDDParam (@RequestBody List<DropDownParamModel> ddData){
		//List<DropDownParamModel> list = eDropServ.setDataDropDownParam(ddData);
		
	    List<DropDownParamModel> resultList = new ArrayList<>();

    	for (DropDownParamModel dropData :  ddData) {
    		eDropServ.setParamId(dropData);
            resultList.add(dropData);

//            obj.put("columnId",column.getColumnId());

    	}
    	List<DropDownParamModel> list = eDropServ.setDataDropDownParam(ddData);
		return list;
	
	}	
	
}