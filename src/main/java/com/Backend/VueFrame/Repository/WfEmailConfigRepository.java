package com.Backend.VueFrame.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.VueFrame.Model.WfEmailConfigData;

public interface WfEmailConfigRepository extends JpaRepository<WfEmailConfigData, String> {

}