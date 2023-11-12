package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.VueFrame.Model.DropDownParamModel;
import com.Backend.VueFrame.Repository.DropDownParamRepo;

@Service
public class DropDownParamService {

	@Autowired
	private DropDownParamRepo eDropRepo;
	
	public List<DropDownParamModel> setDataDropDownParam(List <DropDownParamModel> setData){
		List<DropDownParamModel> list = eDropRepo.saveAllAndFlush(setData);
		return list;
		
	}
}
