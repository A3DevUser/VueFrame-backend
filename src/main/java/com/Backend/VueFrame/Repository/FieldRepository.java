package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.FieldData;

@Repository
public interface FieldRepository extends JpaRepository<FieldData, String> {

	List<FieldData> getByFormId(String formId);

}
