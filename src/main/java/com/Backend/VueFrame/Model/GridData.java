package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "VF_GRID_DETAILS")
public class GridData {
	
	@Id
//	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grid_id_generator")
//    @GenericGenerator(name = "grid_id_generator", strategy = "com.Backend.VueFrame.CustomIDGenerator")
	@Column(name="GRID_ID")
	private String gridId;
	
	@Column(name = "GRID_NAME")
	private String gridName;
	
	@Column(name = "DB_TABLE_NAME")
	private String dbTableName;
	
	@Column(name = "GRID_ACRONYM")
	private String gridTitle;
	
	@Column(name = "SEC_ID")
	private String secId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "IS_MROW")
	private String isMrow;
	
	@Column(name = "is_main")
	private String isMain;
	
	@Column(name = "ORDER_ID")
	private String orderId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	
	
	public String getIsMain() {
		return isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

	

	
	public GridData(String gridId, String gridName, String dbTableName, String gridTitle, String secId, String formId,
			String isMrow, String isMain, String orderId) {
		super();
		this.gridId = gridId;
		this.gridName = gridName;
		this.dbTableName = dbTableName;
		this.gridTitle = gridTitle;
		this.secId = secId;
		this.formId = formId;
		this.isMrow = isMrow;
		this.isMain = isMain;
		this.orderId = orderId;
	}

	public GridData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
																																																																																													
	
	
	

}
