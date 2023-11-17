package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "vf_column_header")
public class ColumnHeaderData {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "column_id_generator")
	 @GenericGenerator(name = "column_id_generator", strategy = "com.Backend.VueFrame.CustomIDGenerator")
	 
	@Column(name="COLUMN_ID")
	private String columnId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "COLUMN_NAME")
	private String fieldName;
	
	@Column(name = "COLUMN_STORED_VALUE")
	private String accessor;
	
	@Column(name = "COLUMN_FILTER_TYPE")
	private String columnFilterType;

	@Column(name = "SEC_ID")
	private String secId;
	
	@Column(name = "CELL_TYPE")
	private String cellType;
	
	@Column(name = "WIDTH")
	private String width;
	
	@Column(name = "SUB_SEC_NAME")
	private String subSecName;
	
	@Column(name = "SUB_SEC_ID")
	private String subSecId;
	
	@Column(name = "SUB_SEC_WIDTH")
	private String subSecWidth;
	
	@Column(name = "SUB_SEC_TYPE")
	private String subSecType;
	
	@Column(name = "ORDER_BY")
	private String number;
	
	@Column(name = "GRID_ID")
	private String gridId;
	
	@Column (name = "STICKY")
	private String sticky;
	
	@Column(name = "DB_COLUMN_LIMIT")
	private String dbcolLimit;
	
	@Column(name = "DB_COLUMN_CONST")
	private String dbcolConst;
	
	
	public String getColumnId() {
		return columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getAccessor() {
		return accessor;
	}

	public void setAccessor(String accessor) {
		this.accessor = accessor;
	}

	public String getColumnFilterType() {
		return columnFilterType;
	}

	public void setColumnFilterType(String columnFilterType) {
		this.columnFilterType = columnFilterType;
	}

	public String getSecId() {
		return secId;
	}

	public void setSecId(String secId) {
		this.secId = secId;
	}

	public String getCellType() {
		return cellType;
	}

	public void setCellType(String cellType) {
		this.cellType = cellType;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getSubSecName() {
		return subSecName;
	}

	public void setSubSecName(String subSecName) {
		this.subSecName = subSecName;
	}

	public String getSubSecId() {
		return subSecId;
	}

	public void setSubSecId(String subSecId) {
		this.subSecId = subSecId;
	}

	public String getSubSecWidth() {
		return subSecWidth;
	}

	public void setSubSecWidth(String subSecWidth) {
		this.subSecWidth = subSecWidth;
	}

	public String getSubSecType() {
		return subSecType;
	}

	public void setSubSecType(String subSecType) {
		this.subSecType = subSecType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGridId() {
		return gridId;
	}

	public void setGridId(String gridId) {
		this.gridId = gridId;
	}

	public String getSticky() {
		return sticky;
	}

	public void setSticky(String sticky) {
		this.sticky = sticky;
	}
	
	

	public String getDbcolLimit() {
		return dbcolLimit;
	}

	public void setDbcolLimit(String dbcolLimit) {
		this.dbcolLimit = dbcolLimit;
	}

	public String getDbcolConst() {
		return dbcolConst;
	}

	public void setDbcolConst(String dbcolConst) {
		this.dbcolConst = dbcolConst;
	}

	

	public ColumnHeaderData(String columnId, String formId, String fieldName, String accessor, String columnFilterType,
			String secId, String cellType, String width, String subSecName, String subSecId, String subSecWidth,
			String subSecType, String number, String gridId, String sticky, String dbcolLimit, String dbcolConst) {
		super();
		this.columnId = columnId;
		this.formId = formId;
		this.fieldName = fieldName;
		this.accessor = accessor;
		this.columnFilterType = columnFilterType;
		this.secId = secId;
		this.cellType = cellType;
		this.width = width;
		this.subSecName = subSecName;
		this.subSecId = subSecId;
		this.subSecWidth = subSecWidth;
		this.subSecType = subSecType;
		this.number = number;
		this.gridId = gridId;
		this.sticky = sticky;
		this.dbcolLimit = dbcolLimit;
		this.dbcolConst = dbcolConst;
	}

	public ColumnHeaderData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
	
}
