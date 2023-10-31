package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.NavBarData;

@Repository
public interface NavBarRepository extends JpaRepository<NavBarData, String> {

	List<NavBarData> getByFormId(String formId);

//	List<NavBarData> findByOrderByOrderByAsc();

	List<NavBarData> findByOrderByNumberAsc();

	Object findTopByOrderByFormIdDesc();
	
	@Query(value = "SELECT FORM_ID_SEQUENCE.NEXTVAL FROM DUAL", nativeQuery = true)
	String setFormIdSequence();

	List<NavBarData> save(List<Object> setData);
	

}
