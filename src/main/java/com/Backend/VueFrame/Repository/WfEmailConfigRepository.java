package com.Backend.VueFrame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Backend.VueFrame.Model.WfEmailConfigData;

public interface WfEmailConfigRepository extends JpaRepository<WfEmailConfigData, String> {
	
	@Query(value = "SELECT VF_EMAIL_SEQ.NEXTVAL FROM DUAL", nativeQuery = true)
	String setEcSequence();


}