package com.Backend.VueFrame.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.DropDownParamModel;

@Repository
public interface DropDownParamRepo extends JpaRepository<DropDownParamModel, String > {
	
	List<DropDownParamModel> findByparamId(String paramId);
	
	@Query(value = "SELECT PARAMETER_ID_SEQUENCE.NEXTVAL FROM DUAL", nativeQuery = true)
	String setParamSequence();
}

