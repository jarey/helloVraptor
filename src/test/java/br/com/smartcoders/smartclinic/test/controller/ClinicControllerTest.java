package br.com.smartcoders.smartclinic.test.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.util.test.MockResult;
import br.com.smartcoders.smartclinic.controller.ClinicsController;
import br.com.smartcoders.smartclinic.model.Clinic;
import br.com.smartcoders.smartclinic.persistence.InMemoryClinicDAO;

public class ClinicControllerTest {
	
	
	private static final int CLINIC_ID = 1;
	
	private ClinicsController controller;
	private MockResult result;
	private InMemoryClinicDAO repo;
	
	private Clinic aClinic;
	
	@Before
	public void setup(){
		result = new MockResult();
		repo = new InMemoryClinicDAO();
		controller = new ClinicsController(result, repo);
		
		aClinic = new Clinic();
		aClinic.setId(CLINIC_ID);
		aClinic.setName("Clínica São Pedro");
		aClinic.setAddress("Av. Pontes Vieira");
	}
	
	@Test
	public void shouldReturnAListOfExistingClinics(){
		controller.index();
		List<Clinic> clinics = result.included("clinicList");
		
		Assert.assertNotNull(clinics);
	}
	
	@Test
	public void shouldAddANewClinic(){
		
		controller.add(aClinic);
		controller.index();
		List<Clinic> clinics = result.included("clinicList");
		
		Assert.assertNotNull(clinics);
		Assert.assertTrue(clinics.contains(aClinic));
	}
	
	@Test
	public void shouldExibitAnExistingClinic(){
		controller.add(aClinic);
		controller.get(aClinic);
		Clinic clinic = result.included("clinic");
		
		Assert.assertEquals(aClinic, clinic);
	}
	
	@Test 
	public void shouldDeleteAClinic(){
		controller.add(aClinic);
		controller.index();
		
		List<Clinic> clinics = result.included("clinicList");
		
		Assert.assertNotNull(clinics);
		Assert.assertTrue(clinics.contains(aClinic));
		
		controller.remove(aClinic);
		controller.index();
		
		clinics = result.included("clinicList");
		
		Assert.assertNotNull(clinics);
		Assert.assertFalse(clinics.contains(aClinic));
	}

}
