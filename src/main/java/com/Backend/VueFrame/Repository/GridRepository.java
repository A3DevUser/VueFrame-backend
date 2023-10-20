package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.VueFrame.Model.GridData;

public interface GridRepository extends JpaRepository<GridData, String>{

//	List<GridData> getBySecId(String secId);

	List<GridData> getByFormId(String formId);

}
