package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.SectionData;

@Repository
public interface SectionRepository extends JpaRepository<SectionData, String> {

	List<SectionData> getByFormId(String formId);
	
	@Query(value = "SELECT SECTION_ID_SEQUENCE.NEXTVAL FROM DUAL", nativeQuery = true)
	String setSectionSequence();
	

}
