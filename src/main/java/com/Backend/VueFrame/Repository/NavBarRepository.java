package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.NavBarData;

@Repository
public interface NavBarRepository extends JpaRepository<NavBarData, String> {

	List<NavBarData> getByFormId(String formId);

}
