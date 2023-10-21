package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.ConfSectionData;

@Repository
public interface ConfSectionRepository extends JpaRepository<ConfSectionData, String> {

	List<ConfSectionData> getByFormId(String formId);

}
