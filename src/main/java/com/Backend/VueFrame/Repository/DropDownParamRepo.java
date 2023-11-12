package com.Backend.VueFrame.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.DropDownParamModel;

@Repository
public interface DropDownParamRepo extends JpaRepository<DropDownParamModel, String > {
	
	List<DropDownParamModel> findByid(String id);
}

