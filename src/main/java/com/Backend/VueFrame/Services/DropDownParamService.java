package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Backend.VueFrame.Model.DropDownParamModel;
import com.Backend.VueFrame.Model.GridData;
import com.Backend.VueFrame.Repository.DropDownParamRepo;

@Service
public class DropDownParamService {

	@Autowired
	private DropDownParamRepo eDropRepo;
	
	 public DropDownParamModel setParamData(DropDownParamModel setData) {
		    String seq = eDropRepo.setParamSequence();
		    String formattedParamId = "P-" + seq;
		    setData.setparamId(formattedParamId);
		    return setData;
		}
	
	public List<DropDownParamModel> setDataDropDownParam(List <DropDownParamModel> setData){
		List<DropDownParamModel> list = eDropRepo.saveAllAndFlush(setData);
		return list;
		
	}
}
