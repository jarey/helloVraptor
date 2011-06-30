package br.com.smartcoders.smartclinic.persistence;

import java.util.List;

import br.com.smartcoders.smartclinic.model.Clinic;

public interface ClinicDAO {
	
	public List<Clinic> findAll();
	
	public void add(Clinic clinic);

	public Clinic findById(Integer id);

	public void remove(Clinic clinic);
	
}
