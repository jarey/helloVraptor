package br.com.smartcoders.smartclinic.test.dao;


import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.smartcoders.smartclinic.model.Clinic;
import br.com.smartcoders.smartclinic.persistence.InMemoryClinicDAO;

public class InMemoryClinicDAOTest {
	
	private Clinic clinic1;
	private Clinic clinic2;
	
	private InMemoryClinicDAO dao;
	
	@Before
	public void setUp() throws Exception {
		dao = new InMemoryClinicDAO();
		
		clinic1 = new Clinic();
		clinic1.setAddress("Address");
		clinic1.setName("Name");
		clinic1.setId(1);
		
		
		clinic2 = new Clinic();
		clinic2.setAddress("Address");
		clinic2.setName("Name");
		clinic2.setId(2);
	}
	
	@Test
	public void itShouldAddClinics(){
		dao.add(clinic1);
		
		List<Clinic> all = dao.findAll();
		Assert.assertNotNull(all);
		Assert.assertEquals(1, all.size());
		Assert.assertEquals(clinic1, all.get(0));
	}
	
	@Test
	public void itShouldReturnAClinicIfItFindIt(){
		dao.add(clinic1);
		
		Clinic clinic = dao.findById(1);
		Assert.assertNotNull(clinic);
		Assert.assertEquals(clinic1, clinic);
	}
	
	@Test
	public void itShouldReturnNullIfNotFindAClinic(){
		dao.add(clinic1);
		
		Clinic clinic = dao.findById(2);
		Assert.assertNull(clinic);
		
		dao.add(clinic2);
		clinic = dao.findById(2);
		Assert.assertNotNull(clinic);
		Assert.assertEquals(clinic2, clinic);
	}
	
	
}
