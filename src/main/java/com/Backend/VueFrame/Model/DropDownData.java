package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "VF_COL_DROPDOWNS")
public class DropDownData {
	
	@Id
	@Column(name="DROPDOWN_ID")
	private String dropdownId;
	@Column(name="GRID_ID")
	private String gridId;
	@Column(name="COL_ID")
	private String colId;
	@Column(name="QUERY")
	private String query;
	@Column(name="FORM_ID")
	private String formId;
	
	public String getGridId() {
		return gridId;
	}
	public void setGridId(String gridId) {
		this.gridId = gridId;
	}
	public String getColId() {
		return colId;
	}
	public void setColId(String colId) {
		this.colId = colId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getDropdownId() {
		return dropdownId;
	}
	public void setDropdownId(String dropdownId) {
		this.dropdownId = dropdownId;
	}
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	public DropDownData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DropDownData(String gridId, String colId, String query, String dropdownId, String formId) {
		super();
		this.gridId = gridId;
		this.colId = colId;
		this.query = query;
		this.dropdownId = dropdownId;
		this.formId = formId;
	}
	
	
	
}
