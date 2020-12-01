package com.cf.services;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cf.dao.ProjetRepository;
import com.cf.entities.Projet;
import com.cf.metier.ProjetMetier;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProjetRestService {

	@Autowired
	private ProjetMetier projetMetier;
	
	@Autowired
	private ProjetRepository projetRepository;
	
	@RequestMapping(value = "/projets", method=RequestMethod.GET)
	public List<Projet> listProjet() {
		return projetMetier.listProjet();
	}
	
	@RequestMapping(value = "/projets", method=RequestMethod.POST)
	public Projet saveProjet(@RequestBody(required=false) Projet pr) {
		return projetMetier.saveProjet(pr);
	}
	
	@GetMapping("/projets/{numProjet}")
    public ResponseEntity<Projet> getProjectById(@PathVariable(value = "numProjet") Long projetId)
        throws ResourceNotFoundException {
		Projet projet = projetRepository.findById(projetId)
          .orElseThrow(() -> new ResourceNotFoundException("Projet not found for this id :: " + projetId));
        return ResponseEntity.ok().body(projet);
    }
	
	@PutMapping("/projets/updateProject/{numProjet}")
    public ResponseEntity<Projet> updateProject(@PathVariable(value = "numProjet") Long projetId,
         @Valid @RequestBody Projet projectDetails) throws ResourceNotFoundException {
		Projet projet = projetRepository.findById(projetId)
        .orElseThrow(() -> new ResourceNotFoundException("Project not found for this numProjet :: " + projetId));

		projet.setNameProjet(projectDetails.getNameProjet());
		projet.setDescription(projectDetails.getDescription());
		projet.setDate(projectDetails.getDate());
		projet.setCategorie(projectDetails.getCategorie());
		projet.setObjectif(projectDetails.getObjectif());
		projet.setDureeTime(projectDetails.getDureeTime());
		projet.setEtat(projectDetails.getEtat());
		projet.setMontantDesire(projectDetails.getMontantDesire());
		projet.setSolde(projectDetails.getSolde());
		projet.setCommantaire(projectDetails.getCommantaire());
		projet.setFAQ(projectDetails.getFAQ());
		final Projet updateProject = projetRepository.save(projet);
        return ResponseEntity.ok(updateProject);
    }
	
	
	
	/*
	 * @RequestMapping(value = "/projects", method = RequestMethod.POST) public void
	 * saveFilm(@RequestParam("file") MultipartFile file) throws Exception {
	 * 
	 * File convFile = new File("/projets/upload/"+file.getOriginalFilename());
	 * convFile.createNewFile(); FileOutputStream fos = new
	 * FileOutputStream(convFile); Blob blob = new SerialBlob(file.getBytes());
	 * 
	 * fos.write(file.getBytes()); fos.close();
	 * System.out.println(convFile.getName());
	 * 
	 * 
	 * projetRepository.save(new Projet()); }
	 * 
	 * @RequestMapping(value = "/projets", method = RequestMethod.GET) public
	 * List<Projet> getAllFilms() { return projetRepository.findAll(); }
	 */
	 
	
	/*
	 * @RequestMapping(value = "/updateprojets/{numProjet}",
	 * method=RequestMethod.PUT) public Projet
	 * updateProjet(@RequestBody(required=false) Projet pr) { return
	 * projetMetier.updateProjet(pr); }
	 */
	
	/*
	 * @RequestMapping(value = "/findByprojets", method=RequestMethod.POST) public
	 * Projet findByProteur (@RequestBody(required=false) Projet pp) { return
	 * (Projet) projetMetier.findByProteur(pp); }
	 */
	
}
