package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.SectionData;

@Repository
public interface SectionRepository extends JpaRepository<SectionData, String> {

	List<SectionData> getByFormId(String formId);

}
