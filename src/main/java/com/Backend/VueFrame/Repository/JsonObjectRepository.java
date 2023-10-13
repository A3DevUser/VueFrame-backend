package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.Backend.VueFrame.Model.Action;

public interface JsonObjectRepository extends JpaRepository<Action, String> {

	
	@Procedure("InsertDataFromJson")
	Object insertJasonData(Object list);
	
}
