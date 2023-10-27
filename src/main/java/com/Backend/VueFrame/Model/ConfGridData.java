package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "vf_conf_grid_dtls")
public class ConfGridData {
	
	
	@Id
	@Column(name="GRID_ID")
	private String gridId;
	
	@Column(name = "GRID_NAME")
	private String gridName;
	
	@Column(name = "DB_TABLE_NAME")
	private String dbTableName;
	
	@Column(name = "GRID_TITLE")
	private String gridTitle;
	
	@Column(name = "SEC_ID")
	private String secId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "IS_MROW")
	private String isMrow;
	
	@Column(name = "API")
	private String api;
	
	
	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getGridId() {
		return gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public String getGridName() {
		return gridName;
	}

	public void setGridName(String gridName) {
		this.gridName = gridName;
	}

	public String getDbTableName() {
		return dbTableName;
	}

	public void setDbTableName(String dbTableName) {
		this.dbTableName = dbTableName;
	}

	public String getGridTitle() {
		return gridTitle;
	}

	public void setGridTitle(String gridTitle) {
		this.gridTitle = gridTitle;
	}
	
	public String getSecId() {
		return secId;
	}

	public void setSecId(String secId) {
		this.secId = secId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}
	
	public String getIsMrow() {
		return isMrow;
	}

	public void setIsMrow(String isMrow) {
		this.isMrow = isMrow;
	}

	
	

	
	public ConfGridData(String gridId, String gridName, String dbTableName, String gridTitle, String secId,
			String formId, String isMrow, String api) {
		super();
		this.gridId = gridId;
		this.gridName = gridName;
		this.dbTableName = dbTableName;
		this.gridTitle = gridTitle;
		this.secId = secId;
		this.formId = formId;
		this.isMrow = isMrow;
		this.api = api;
	}

	public ConfGridData() {
		super();
		// TODO Auto-generated constructor stub
	}

}
