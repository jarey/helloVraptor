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
public class ClinicsController {
	
	private Result result;
	private ClinicDAO repo;
	
	public ClinicsController(Result result, ClinicDAO dao) {
		this.result = result;
		repo = dao;
	}
	
	@Path("/clinics")
	public void index() {
		result.include("clinicList", repo.findAll());
	}
	
	@Get
	@Path("/clinics/new")
	public void form(){
	}
	
	@Post
	public void add(Clinic clinic){
		repo.add(clinic);
		result.redirectTo(ClinicsController.class).index();
	}
	
	@Get
	@Path(value="/clinics/{clinic.id}",priority=Path.HIGHEST)
	public void get(Clinic clinic) {
		result.include("clinic", repo.findById(clinic.getId()));
		result.forwardTo(ClinicsController.class).form();
	}
	
	@Delete
	@Path("/clinics/{clinic.id}")
	public void remove(Clinic clinic) {
		repo.remove(clinic);
		result.redirectTo(ClinicsController.class).index();
	}
	

}
