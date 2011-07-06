package br.com.smartcoders.smartclinic.controller;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.smartcoders.smartclinic.model.Clinic;
import br.com.smartcoders.smartclinic.persistence.ClinicDAO;

@Resource
@Path("/clinics")
public class ClinicsController {

	private Result result;
	private ClinicDAO repo;

	public ClinicsController(Result result, ClinicDAO dao) {
		this.result = result;
		repo = dao;
		result.include("breadcomb", "Clinics");
	}
	@Path("/")
	public void index() {
		result.include("clinicList", repo.findAll());
	}

	@Get
	@Path("new")
	public void newClinic() {
		result.include("clinic", new Clinic());
	}

	@Post
	public void add(Clinic clinic) {
		repo.add(clinic);
		result.redirectTo(ClinicsController.class).index();
	}

	@Get
	@Path(value = "{clinic.id}", priority = Path.HIGHEST)
	public void show(Clinic clinic) {
		result.include("clinic", repo.findById(clinic.getId()));
	}

	@Delete
	@Path("{clinic.id}")
	public void remove(Clinic clinic) {
		repo.remove(clinic);
		result.redirectTo(ClinicsController.class).index();
	}

}
