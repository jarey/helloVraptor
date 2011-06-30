package br.com.smartcoders.smartclinic.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.smartcoders.smartclinic.model.Clinic;

@Component
@ApplicationScoped
public class InMemoryClinicDAO implements ClinicDAO {

	private List<Clinic> repo;
	private static int id = 0;

	public InMemoryClinicDAO() {
		repo = new ArrayList<Clinic>();
	}

	public List<Clinic> findAll() {
		return repo;
	}

	public void add(Clinic clinic) {
		repo.add(clinic);
		clinic.setId(id++);
	}

	public Clinic findById(Integer id) {
		for (Clinic clinic : repo) {
			if (clinic.getId().equals(id)) {
				return clinic;
			}
		}
		return null;
	}

	public void remove(Clinic clinic) {
		if (repo.contains(clinic)) {
			repo.remove(clinic);
		}
	}

}
