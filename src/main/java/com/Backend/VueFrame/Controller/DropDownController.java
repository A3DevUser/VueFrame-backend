package com.Backend.VueFrame.Controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Base64.Decoder;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Backend.VueFrame.Model.DropDownData;
import com.Backend.VueFrame.Services.DropDownServices;


@RequestMapping("VF/")
@CrossOrigin(origins = "*")
@RestController
public class DropDownController {

	@Autowired
	private DropDownServices eDropServ;
	
	//For getting list of the parameter as a json object for execution of Dropdown
	@GetMapping("DropData1")
	public String getdropdownCol(@RequestParam String formId, @RequestParam String colId,
			@RequestParam String gridId) {
		
	String dropJson = eDropServ.getdropdownCol(formId, colId, gridId);
		return dropJson;
	}
	
	//Old Code for executing DropDown where there were no Dropdowns 
	@GetMapping("DropData")
	public String getdropdownData(@RequestParam String formId, @RequestParam String colId,
			@RequestParam String gridId) {
		
		DropDownData sQuery = eDropServ.getDataByDropdata(formId, colId, gridId);
		String str;
		System.out.println("Query: " + sQuery.getQuery());
		str = sQuery.getQuery();
		System.out.println("Query2: " + str);
		//String list = eDropServ.getListofDropdown(str);
		String list = eDropServ.getListofDropdown(str);
		System.out.println("list: " + list);
		return list;
	}
	
	//Secopn API that will pass Json object with parameter details and get stored and display value
	@GetMapping("DropDataColData")
	public String getdropdownCol(@RequestParam String jsonDrop) {
		
		String dropJson = eDropServ.getDataByColDtlServ(jsonDrop);
		return dropJson;
	}
	
	//Final Main Proc, Other end points not required
	@GetMapping("dropdown")
	public String getddData(@RequestParam String formId, @RequestParam String colId,
			@RequestParam String gridId,@RequestParam String jsonDrop) throws UnsupportedEncodingException {
		String str = URLDecoder.decode(jsonDrop,"UTF-8");
		String jsonDataSD = eDropServ.getDropDown(formId,colId,gridId,jsonDrop);
		return jsonDataSD;
		
	}
	
	@PostMapping("setddData")
	public Map<String, Object> setDDData(@RequestBody List<DropDownData> ddData) {
        List<DropDownData> updatedDropDownData = new ArrayList<>();
        Map<String,Object> obj = new HashMap<>();

        for (DropDownData data : ddData) {
            // Set dropdownId for each item using setDropDownId method
            obj.put("formId",data.getFormId());

            DropDownData updatedData = eDropServ.setDropDownId(data);
            updatedDropDownData.add(updatedData);
        }

        // Save the updated data using setDataDropDown method
        List<DropDownData> savedData = eDropServ.setDataDropDown(updatedDropDownData);

        return obj;
    }
	
}
