package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.ConfColumnHeaderData;

@Repository
public interface ConfColumnHeaderRepository extends JpaRepository<ConfColumnHeaderData, String> {

	List<ConfColumnHeaderData> getByFormId(String formId);

}
