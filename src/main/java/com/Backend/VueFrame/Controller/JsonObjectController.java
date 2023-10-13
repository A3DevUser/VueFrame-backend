package com.Backend.VueFrame.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.VueFrame.Repository.JsonObjectRepository;
import com.Backend.VueFrame.Services.JsonObjectService;

import ch.qos.logback.core.joran.action.Action;
import oracle.jdbc.proxy.annotation.Post;

@RestController
@RequestMapping("VF/")
@CrossOrigin(origins = "*")
public class JsonObjectController {

	
	@Autowired
    private JsonObjectRepository jsonRepo;

    @PostMapping("jsonObject")
    public Object setJson(@RequestBody Action json) {
    	
    	return jsonRepo.getClass();
      
//      return jsonRepo.insertJasonData();
    }    
    
}
