package com.Backend.VueFrame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.VueFrame.Model.WfStageConfigData;

public interface WfStageConfigRepository extends JpaRepository<WfStageConfigData, String> {
	
}