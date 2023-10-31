package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Backend.VueFrame.Model.GridData;

public interface GridRepository extends JpaRepository<GridData, String>{

//	List<GridData> getBySecId(String secId);

	List<GridData> getByFormId(String formId);
	
	
	@Query(value = "SELECT GRID_ID_SEQUENCE.NEXTVAL FROM DUAL", nativeQuery = true)
	String setGridSequence();
	

}
