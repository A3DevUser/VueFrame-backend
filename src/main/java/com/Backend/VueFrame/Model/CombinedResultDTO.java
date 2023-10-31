package com.Backend.VueFrame.Model;

import java.util.HashMap;
import java.util.List;

public class CombinedResultDTO {
	
	private String formIdResult;
    private HashMap<String, String> gridIdResult;
    private List<GridData> gridDataResult;
    private List<NavBarData> navDataResult;
    private HashMap<String, String> sectionIdResult;
    private List<SectionData> sectionDataResult;
    private String columnIdResult;
    private List<ColumnHeaderData> columnDataResult;
	public String getFormIdResult() {
		return formIdResult;
	}
	public void setFormIdResult(String formIdResult) {
		this.formIdResult = formIdResult;
	}
	public HashMap<String, String> getGridIdResult() {
		return gridIdResult;
	}
	public void setGridIdResult(HashMap<String, String> gridIdResult) {
		this.gridIdResult = gridIdResult;
	}
	public List<GridData> getGridDataResult() {
		return gridDataResult;
	}
	public void setGridDataResult(List<GridData> gridDataResult) {
		this.gridDataResult = gridDataResult;
	}
	public List<NavBarData> getNavDataResult() {
		return navDataResult;
	}
	public void setNavDataResult(List<NavBarData> navDataResult) {
		this.navDataResult = navDataResult;
	}
	public HashMap<String, String> getSectionIdResult() {
		return sectionIdResult;
	}
	public void setSectionIdResult(HashMap<String, String> sectionIdResult) {
		this.sectionIdResult = sectionIdResult;
	}
	public List<SectionData> getSectionDataResult() {
		return sectionDataResult;
	}
	public void setSectionDataResult(List<SectionData> sectionDataResult) {
		this.sectionDataResult = sectionDataResult;
	}
	public String getColumnIdResult() {
		return columnIdResult;
	}
	public void setColumnIdResult(String columnIdResult) {
		this.columnIdResult = columnIdResult;
	}
	public List<ColumnHeaderData> getColumnDataResult() {
		return columnDataResult;
	}
	public void setColumnDataResult(List<ColumnHeaderData> columnDataResult) {
		this.columnDataResult = columnDataResult;
	}
	public CombinedResultDTO(String formIdResult, HashMap<String, String> gridIdResult, List<GridData> gridDataResult,
			List<NavBarData> navDataResult, HashMap<String, String> sectionIdResult,
			List<SectionData> sectionDataResult, String columnIdResult, List<ColumnHeaderData> columnDataResult) {
		super();
		this.formIdResult = formIdResult;
		this.gridIdResult = gridIdResult;
		this.gridDataResult = gridDataResult;
		this.navDataResult = navDataResult;
		this.sectionIdResult = sectionIdResult;
		this.sectionDataResult = sectionDataResult;
		this.columnIdResult = columnIdResult;
		this.columnDataResult = columnDataResult;
	}
	public CombinedResultDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


    
}
