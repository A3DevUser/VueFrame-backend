package com.Backend.VueFrame.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Backend.VueFrame.Model.ColumnHeaderData;

@Repository
public interface ColumnHeaderRepository extends JpaRepository<ColumnHeaderData, String> {

	List<ColumnHeaderData> getByFormId(String formId);

//	List<ColumnHeaderData> findByOrderByOrdByAsc();

	List<ColumnHeaderData> findByOrderByNumberAsc();

	List<ColumnHeaderData> getByFormIdAndGridId(String formId, String gridId);

	

}
