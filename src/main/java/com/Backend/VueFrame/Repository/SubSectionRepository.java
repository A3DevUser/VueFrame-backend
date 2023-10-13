package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.SubSectionDetails;

@Repository
public interface SubSectionRepository extends JpaRepository<SubSectionDetails, String> {

	List<SubSectionDetails> getByFormId(String formId);

}
