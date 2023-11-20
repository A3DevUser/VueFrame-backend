package com.Backend.VueFrame.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.Backend.VueFrame.Model.FormData;
import com.Backend.VueFrame.Model.WorkflowData;

public interface WorkflowRepository extends JpaRepository<WorkflowData, String> {

	List<WorkflowData> getByFormId(String formId);
	
	
//	   @Query(value = "CALL WF_PACKAGE.VF_WORKFLOW_PROCEDURE(:jsonData)", nativeQuery = true)
//       void callWorkflowProcedure(List<List<FormData>> jsonData);
//	
//	
//	@Modifying
//    @Transactional
//    @Query(nativeQuery = true, value = "BEGIN "
//            + "json_data := :jsonData; "
//            + "VF_JSONARRAYPACKAGE.InsertDataFromDynamicJsonArray(json_data); "
//            + "COMMIT; "
//            + "END;")
//    void callWorkflowProcedure(String jsonData);
//
//	
	 @Procedure(procedureName = "VF_JSONARRAYPACKAGE.InsertDataFromDynamicJsonArray")
	    void insertDataFromDynamicJsonArray(@Param("p_json_array") String json);
	 
	 @Procedure(procedureName = "SET_GRID_DATA")
		void setGridData(@Param("p_gridId") String gridId);


	@Query(value = "SELECT VF_WF_SEQ.NEXTVAL FROM DUAL", nativeQuery = true)
			String setWfSequence();

	
}


     