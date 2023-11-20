package com.Backend.VueFrame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Backend.VueFrame.Model.WfStageConfigData;

public interface WfStageConfigRepository extends JpaRepository<WfStageConfigData, String> {
	
	@Query(value="SELECT VF_STAGE_SEQ.NEXTVAL FROM DUAL", nativeQuery = true)
	String setStageSequence();
	
}