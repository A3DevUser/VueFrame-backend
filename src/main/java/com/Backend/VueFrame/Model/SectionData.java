package com.Backend.VueFrame.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VF_SECTION_DETAILS")
public class SectionData {
	
     @Id
//     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "section_id_generator")
//	 @GenericGenerator(name = "section_id_generator", strategy = "com.Backend.VueFrame.CustomIDGenerator")
	@Column(name = "SEC_ID")
	private String secId;
	
	@Column(name = "FORM_ID")
	private String formId;
	
	@Column(name = "SEC_NAME")
	private String secName;
	
	@Column(name = "SEC_STORED_VALUE")
	private String secStoredValue;
	
	@Column(name = "SEC_IS_OPEN")
	private String isOpen;
	
	@Column(name = "WIDTH")
	private String width;
	
	@Column(name = "HEIGHT")
	private String height;
	
	@Column(name = "ORDER_ID")
	private String orderId;
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getSecName() {
		return secName;
	}

	public String setSecName(String secName) {
		return this.secName = secName;
	}

	public String getSecStoredValue() {
		return secStoredValue;
	}

	public void setSecStoredValue(String secStoredValue) {
		this.secStoredValue = secStoredValue;
	}
	
	

	public String getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

	

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	

	public SectionData(String secId, String formId, String secName, String secStoredValue, String isOpen, String width,
			String height, String orderId) {
		super();
		this.secId = secId;
		this.formId = formId;
		this.secName = secName;
		this.secStoredValue = secStoredValue;
		this.isOpen = isOpen;
		this.width = width;
		this.height = height;
		this.orderId = orderId;
	}



	public SectionData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
