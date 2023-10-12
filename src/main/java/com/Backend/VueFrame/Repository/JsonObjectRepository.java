package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.Backend.VueFrame.Model.JsonObjectData;

public interface JsonObjectRepository extends JpaRepository<JsonObjectData, String> {

//	
//	@Procedure("InsertDataFromJson")
//	Object insertJasonData();
//	
}
