package com.Backend.VueFrame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.Backend.VueFrame.Model.DropDownData;

@Repository
public interface DropDownRepository extends JpaRepository<DropDownData, String> {

	@Query(value = "select * from VF_COL_Dropdowns where FORM_ID = :formId and COL_ID = :colId   and GRID_ID = :gridId", nativeQuery = true)
	DropDownData getdropdownquery(@Param("formId") String formId, @Param("colId") String colId,
			@Param("gridId") String gridId);

		
		  @Procedure(procedureName="VF_DD_DYNAMIC_RUN", outputParameterName = "result")
		  String getListofDropdown(@Param("query_string") String query_string);
		  
		  @Query(value = "SELECT vf_col_dd_id.NEXTVAL FROM DUAL", nativeQuery = true)
		  String setDdId();
		 
		 

		  @Query(value = "SELECT JSON_OBJECT('ddId' IS (SELECT DROPDOWN_ID FROM VF_COL_Dropdowns \r\n"
		  		+ "WHERE FORM_ID = :formId AND COL_ID = :colId AND GRID_ID = :gridId),\r\n"
		  		+ "'colId' IS NVL((SELECT JSON_ARRAYAGG(column_id ORDER BY column_id)\r\n"
		  		+ "FROM VF_PARAMETER_DROP WHERE DROP_ID = (SELECT DROPDOWN_ID\r\n"
		  		+ "FROM VF_COL_Dropdowns WHERE FORM_ID = :formId AND COL_ID = :colId AND GRID_ID = :gridId)\r\n"
		  		+ "), '[]' ) ) AS json_data FROM DUAL", nativeQuery = true)
			String getDropdownCols(@Param("formId") String formId, @Param("colId") String colId,
							@Param("gridId") String gridId);
		  
		  @Procedure(procedureName="VF_DD_MAIN_PROC", outputParameterName = "p_result")
		  String getDataByColDtls(@Param("p_query") String query_string);

		  @Procedure(procedureName="VF_DD_DATA_MAIN_PROC", outputParameterName = "p_result")
		  String getDDDataRep(@Param("p_formId") String formId, @Param("p_colId") String colId,
					@Param("p_gridId") String gridId,@Param("p_jsonData") String jsonDrop);
}