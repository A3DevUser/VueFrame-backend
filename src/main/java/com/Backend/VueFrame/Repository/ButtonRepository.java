package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.ButtonData;

@Repository
public interface ButtonRepository  extends JpaRepository<ButtonData, String> {

	List<ButtonData> getByFormId(String formId);

}
