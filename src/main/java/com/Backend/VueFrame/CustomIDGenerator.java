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
	        String sequenceValue = ((Number) session.createNativeQuery("SELECT COLUMN_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
	        return "C-" + sequenceValue;
	    } 
//	    else if (obj instanceof SectionData) {
//	        String sequenceValue = ((Number) session.createNativeQuery("SELECT SECTION_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
//	        return "S-" + sequenceValue;
//	    } else if (obj instanceof GridData) {
//	        String sequenceValue = ((Number) session.createNativeQuery("SELECT GRID_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
//	        return "GID-" + sequenceValue;
//	    } 
	    else if (obj instanceof NavBarData) {
	        String sequenceValue = ((Number) session.createNativeQuery("SELECT FORM_ID_SEQUENCE.NEXTVAL FROM DUAL").uniqueResult()).toString();
	        return "N-" + sequenceValue;
	    } else {
	        throw new UnsupportedOperationException("Unsupported entity type for ID generation");
	    }
	}
}
