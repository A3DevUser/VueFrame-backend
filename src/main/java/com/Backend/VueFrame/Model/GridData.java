package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "VF_GRID_DETAILS")
public class GridData {
	
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

	

	public GridData(String gridId, String gridName, String dbTableName, String gridTitle, String secId) {
		super();
		this.gridId = gridId;
		this.gridName = gridName;
		this.dbTableName = dbTableName;
		this.gridTitle = gridTitle;
		this.secId = secId;
	}

	public GridData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
