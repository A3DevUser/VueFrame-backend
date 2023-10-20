package com.Backend.VueFrame.Model;

import java.util.List;

public class YourData {
	
	
	 private String table_name;
	    private List<String> columnname;
	    private List<String> columnvalue;
	    private List<String> constraints;
		public String getTable_name() {
			return table_name;
		}
		public void setTable_name(String table_name) {
			this.table_name = table_name;
		}
		public List<String> getColumn_name() {
			return columnname;
		}
		public void setColumn_name(List<String> columnname) {
			this.columnname = columnname;
		}
		public List<String> getColumn_value() {
			return columnvalue;
		}
		public void setColumn_value(List<String> columnvalue) {
			this.columnvalue = columnvalue;
		}
		public List<String> getConstraints() {
			return constraints;
		}
		public void setConstraints(List<String> constraints) {
			this.constraints = constraints;
		}
		public YourData(String table_name, List<String> columnname, List<String> columnvalue,
				List<String> constraints) {
			super();
			this.table_name = table_name;
			this.columnname = columnname;
			this.columnvalue = columnvalue;
			this.constraints = constraints;
		}
		public YourData() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
