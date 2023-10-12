package com.Backend.VueFrame.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.ButtonData;
import com.Backend.VueFrame.Repository.ButtonRepository;

@Service
public class ButtonServices {
	
	
	@Autowired
	private ButtonRepository btnRepo;
	
	public List<ButtonData> getButtonData(@RequestParam String formId) {
		return btnRepo.getByFormId(formId);
	}

}
