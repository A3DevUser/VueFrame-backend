package com.Backend.VueFrame.Model;

public class KeyValuePair {
    private String columnName;
    private String columnValue;
    private String constraint;
    
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getColumnValue() {
		return columnValue;
	}
	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}
	
	public String getConstraint() {
		return constraint;
	}
	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}
	
	
	
	
	public KeyValuePair(String columnName, String columnValue, String constraint) {
		super();
		this.columnName = columnName;
		this.columnValue = columnValue;
		this.constraint = constraint;
	}
	
	
	public KeyValuePair() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
    
    
}