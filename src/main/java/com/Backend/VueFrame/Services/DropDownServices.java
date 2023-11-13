package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Backend.VueFrame.Model.DropDownData;
import com.Backend.VueFrame.Model.DropDownParamModel;
import com.Backend.VueFrame.Repository.DropDownRepository;

@Service
public class DropDownServices {

	@Autowired
	private DropDownRepository eDropRepo;
	
	public DropDownData getDataByDropdata(String formId, String colId,String gridId){
		
		return eDropRepo.getdropdownquery(formId,colId,gridId);
		
	}
	
	
	public String getListofDropdown (String queryData) {
		String query_out = "";
		query_out =  eDropRepo.getListofDropdown(queryData);
		return query_out;
	}
	/*
	 * public List<DropDownValueObject[]> getListofDropdown() { // TODO
	 * Auto-generated method stub return eDropRepo.getListofDropdown(); }
	 */
	public String getdropdownCol(String formId, String colId,String gridId){
			return eDropRepo.getDropdownCols(formId,colId,gridId);		
	}
	
	public String getDataByColDtlServ (String queryData) {
		String query_out = "";
		query_out =  eDropRepo.getDataByColDtls(queryData);
		return query_out;
	}


	public String getDropDown(String formId, String colId, String gridId, String jsonDrop) {
		String query_out = "";
		query_out =  eDropRepo.getDDDataRep(formId,colId,gridId,jsonDrop);
		return query_out;
	}
	
	 public DropDownData setDropDownId(@RequestBody DropDownData ddData) {
		    String seq = eDropRepo.setDdId();
		    String formattedParamId = "DD-" + seq;
		    ddData.setDropdownId(formattedParamId);
		    return ddData;
		}
	
	public List<DropDownData> setDataDropDown(List <DropDownData> setData){
		List<DropDownData> list = eDropRepo.saveAllAndFlush(setData);
		return list;
		
	}


	
	
}