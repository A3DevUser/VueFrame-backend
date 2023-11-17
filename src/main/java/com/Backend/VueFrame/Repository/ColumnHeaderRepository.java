package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.ColumnHeaderData;

@Repository
public interface ColumnHeaderRepository extends JpaRepository<ColumnHeaderData, String> {

	List<ColumnHeaderData> getByFormId(String formId);

//	List<ColumnHeaderData> findByOrderByOrdByAsc();

	List<ColumnHeaderData> findByOrderByNumberAsc();

//	List<ColumnHeaderData> getByFormIdAndGridId(String formId);
	
	@Query(value = "SELECT COLUMN_ID_SEQUENCE.NEXTVAL FROM DUAL", nativeQuery = true)
	String setColumnSequence();
	
	
	@Query(value = "select FORM_ID, COLUMN_ID, COLUMN_NAME, \r\n"
            + "COLUMN_STORED_VALUE, \r\n"
            + "COLUMN_FILTER_TYPE, \r\n"
            + "SEC_ID,DECODE(:emd,'yes',CELL_TYPE,'add',CELL_TYPE,'no',null,null) as CELL_TYPE,\r\n"
            + "WIDTH, SUB_SEC_ID, SUB_SEC_NAME, SUB_SEC_WIDTH, \r\n"
            + "SUB_SEC_TYPE, ORDER_BY, CATEGORY_ID, GRID_ID, STICKY , DB_COLUMN_LIMIT, DB_COLUMN_CONST\r\n"
            + "from vf_column_header where FORM_ID = :formId\r\n"
            + "and (CELL_TYPE not like ('modalBtn') or CELL_TYPE is null)\r\n"
            + "union\r\n"
            + "select FORM_ID, COLUMN_ID, COLUMN_NAME, \r\n"
            + "COLUMN_STORED_VALUE, \r\n"
            + "COLUMN_FILTER_TYPE, \r\n"
            + "SEC_ID, CELL_TYPE, WIDTH, \r\n"
            + "SUB_SEC_ID, SUB_SEC_NAME, SUB_SEC_WIDTH, \r\n"
            + "SUB_SEC_TYPE, ORDER_BY, CATEGORY_ID, GRID_ID, STICKY, DB_COLUMN_LIMIT, DB_COLUMN_CONST \r\n"
            + "from vf_column_header where FORM_ID = :formId\r\n"
            + "and CELL_TYPE = 'modalBtn'", nativeQuery = true)
	List<ColumnHeaderData> getlistofColumns(@Param("formId") String formId, @Param("emd") String gridId);	

	
	
	@Procedure(procedureName="VF_CREATE_GRIDS", outputParameterName = "p_result")
	String getGridCreationDtls(@Param("p_form_id") String formId);	


}
