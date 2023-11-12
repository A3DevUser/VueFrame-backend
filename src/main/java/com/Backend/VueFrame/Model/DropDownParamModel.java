package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "VF_PARAMETER_DROP")
public class DropDownParamModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="DROP_ID")
	private String dropId;
	
	@Column(name="PARAMETER_NAME")
	private String paramName;
	
	@Column(name="COLUMN_ACCESSOR")
	private String columnAccessor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDropId() {
		return dropId;
	}

	public void setDropId(String dropId) {
		this.dropId = dropId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getColumnAccessor() {
		return columnAccessor;
	}

	public void setColumnAccessor(String columnAccessor) {
		this.columnAccessor = columnAccessor;
	}


	public DropDownParamModel(int id, String dropId, String paramName, String columnAccessor) {
		super();
		this.id = id;
		this.dropId = dropId;
		this.paramName = paramName;
		this.columnAccessor = columnAccessor;
	}

	public DropDownParamModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
