package com.Backend.VueFrame;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.Backend.VueFrame.Model.ColumnHeaderData;
import com.Backend.VueFrame.Model.GridData;
import com.Backend.VueFrame.Model.NavBarData;
import com.Backend.VueFrame.Model.SectionData;

import java.io.Serializable;

public class CustomIDGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object obj) throws HibernateException {
	    if (obj instanceof ColumnHeaderData) {
	        // Logic to generate a unique ID for columns with the prefix "c-"
	        String sequenceValue = ((Number) session.createNativeQuery("SELECT COLUMN_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
	        return "C-" + sequenceValue;
	    } else if (obj instanceof SectionData) {
	        // Logic to generate a unique ID for sections with the prefix "s-"
	        String sequenceValue = ((Number) session.createNativeQuery("SELECT SECTION_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
	        return "S-" + sequenceValue;
	    } else if (obj instanceof GridData) {
	        // Logic to generate a unique ID for grids with the prefix "g-"
	        String sequenceValue = ((Number) session.createNativeQuery("SELECT GRID_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
	        return "GID-" + sequenceValue;
	    } else if (obj instanceof NavBarData) {
	        // Logic to generate a unique ID for navbars with the prefix "f-"
	        String sequenceValue = ((Number) session.createNativeQuery("SELECT FORM_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
	        return "FORM-" + sequenceValue;
	    } else {
	        // Handle other cases or throw an exception if needed
	        throw new UnsupportedOperationException("Unsupported entity type for ID generation");
	    }
	}
}
