package com.Backend.VueFrame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Backend.VueFrame.Model.FieldConfigData;

public interface FieldConfigRepository extends JpaRepository<FieldConfigData, String> {
	
	@Query(value = "SELECT VF_FIELD_SEQ.NEXTVAL FROM DUAL", nativeQuery = true)
	String setFieldSequence();

}