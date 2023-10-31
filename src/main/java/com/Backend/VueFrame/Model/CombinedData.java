package com.Backend.VueFrame.Model;
import java.util.List;

public class CombinedData {
    private List<NavBarData> navBarData;
    private List<GridData> gridData;

    public CombinedData(List<NavBarData> navBarData, List<GridData> gridData) {
        this.navBarData = navBarData;
        this.gridData = gridData;
    }

    public CombinedData() {
		// TODO Auto-generated constructor stub
	}

	public List<NavBarData> getNavBarData() {
        return navBarData;
    }

    public void setNavBarData(List<NavBarData> navBarData) {
        this.navBarData = navBarData;
    }

    public List<GridData> getGridData() {
        return gridData;
    }

    public void setGridData(List<GridData> gridData) {
        this.gridData = gridData;
    }
}
