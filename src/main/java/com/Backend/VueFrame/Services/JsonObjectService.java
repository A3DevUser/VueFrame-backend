package com.Backend.VueFrame.Services;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.VueFrame.Model.Action;
import com.Backend.VueFrame.Repository.JsonObjectRepository;

@Service
public class JsonObjectService {

	@Autowired
	private JsonObjectRepository jsonObjectRepo;
	@Autowired
	private EntityManager entityManager;
	
//	@Autowired
//	public JsonObjectService (JsonObjectRepository jsonObjectRepo, EntityManager entityManager) {
//		this.jsonObjectRepo=jsonObjectRepo;
//	}
	
	public void saveJson(Action jsonObject) {
		jsonObjectRepo.save(jsonObject);
		StoredProcedureQuery procedureQuery = entityManager.createStoredProcedureQuery("VF_JSON_OBJECT_COLLECT");
        procedureQuery.registerStoredProcedureParameter("p_action_id", String.class, ParameterMode.IN);
        procedureQuery.setParameter("p_action_id", jsonObject.getActionId());
        procedureQuery.execute();
        
	}
	
	
//	public void save(Action jsonObject) {
//		jsonObjectRepo.save(jsonObject);
//		StoredProcedureQuery.procedureQuery = entityManager.createStoredProcedureQuery(null)
//	}
	
	
}

