package com.Backend.VueFrame.Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.Backend.VueFrame.Model.ColumnHeaderData;
import com.Backend.VueFrame.Model.GridData;
import com.Backend.VueFrame.Model.NavBarData;
import com.Backend.VueFrame.Model.SectionData;
import com.Backend.VueFrame.Repository.ColumnHeaderRepository;
import com.Backend.VueFrame.Repository.GridRepository;
import com.Backend.VueFrame.Repository.NavBarRepository;
import com.Backend.VueFrame.Repository.SectionRepository;

@Service
public class ConfigurationFomrService {
	
	
	@Autowired
	private NavBarRepository navRepo;
	
	@Autowired
	private GridRepository gridRepo;
	
	@Autowired
	private SectionRepository sectionRepo;
	
	@Autowired
	private ColumnHeaderRepository columnRepo;
	

	
	//Generate FomrId
	public NavBarData setFormId(@RequestBody NavBarData setData) {
	    String seq = navRepo.setFormIdSequence();
	    String formattedFormId = "FORM-" + seq;
	    setData.setFormId(formattedFormId);
	    return setData;
	}
	
	 //Set Nav/Form Data in NavaBar Table
    public List<NavBarData> SetNavData(@RequestBody List<NavBarData> setData) {
		
		List<NavBarData> list = navRepo.saveAll(setData);
		
		return list;
	}
    
	
	
//	//Generate GridId
//	public String setGridId() {
//		return gridRepo.setGridSequence();
//	}
//	
	 //Set GridId in Grid Table
    
    public GridData setGridId(@RequestBody GridData setData) {
	    String seq = gridRepo.setGridSequence();
	    String formattedGridId = "GID-" + seq;
	    setData.setGridId(formattedGridId);
	    return setData;
	}
    
    
//    public void setGridId(HashMap<String, String> gridMap) {
//        for (String gridName : gridMap.keySet()) {
//            String nextValue = gridRepo.setGridSequence();
//            String formattedGridId = "GID-" + nextValue; // Customize the prefix as needed
//            gridMap.put(gridName, formattedGridId);
//        }
//    }
    //set Grid Data in GridTable
	    public List<GridData> setGridData(@RequestParam List<GridData> setData) {
			
			List<GridData> list = gridRepo.saveAll(setData);
			
			return list;
		}
     
      //Set SectionId in Section Table
      public void setSectionId(HashMap<String, String> sectionMap) {
          for (String secName : sectionMap.keySet()) {
              String nextValue = sectionRepo.setSectionSequence();
              sectionMap.put(secName, nextValue);
          }
      }
      
      
      
      //set SectionData in section Table
      public List<SectionData> setSectionData(@RequestParam List<SectionData> setData) {
  		
  		
  		List<SectionData> list = sectionRepo.saveAll(setData);
  		
  		return list;
  	}
      
      //setColumnId in Column Data Table
      
      public String setColumnId() {
    	  return columnRepo.setColumnSequence();
      }
      
      //set ColumnData
      public List<ColumnHeaderData> SetColumnData(@RequestBody List<ColumnHeaderData> setData) {
  		
  		List<ColumnHeaderData> list = columnRepo.saveAll(setData);
  		
  		return list;
  	}

          
	
	}
	



 

