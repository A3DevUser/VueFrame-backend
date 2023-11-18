package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Backend.VueFrame.Model.GridData;

public interface GridRepository extends JpaRepository<GridData, String>{

//	List<GridData> getBySecId(String secId);

	List<GridData> getByFormId(String formId);
	
	
	@Query(value = "SELECT GRID_ID_SEQUENCE.NEXTVAL FROM DUAL", nativeQuery = true)
	String setGridSequence();
	
	@Procedure(procedureName="VF_MROW_DATA", outputParameterName = "p_result")
			  String getMrowData(@Param("p_form_id") String formId);

}
