package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Operateur;
import tn.esprit.spring.entities.SecteurActivite;
import tn.esprit.spring.services.OperateurService;
import tn.esprit.spring.services.SecteurActiviteService;

@RestController
@RequestMapping("/secteur-activite")
public class SecteurActiviteRestController {
	@Autowired
	SecteurActiviteService secteurActiviteService;
	@GetMapping("/retrieve-all-secteur-activites")
	public List<SecteurActivite> getSecteurActivites(){
		List<SecteurActivite>secteurActivites=secteurActiviteService.retrieveAllSecteurActivites();
		return secteurActivites;
	}
	@GetMapping("retrieve-secteur-activite/{idSecteurActivite}")
	public SecteurActivite retrieveSecteurActivite(@PathVariable("idSecteurActivite") Long idSecteurActivite) {
		return secteurActiviteService.retrieveSecteurActivite(idSecteurActivite);
		
	}
	@PostMapping("/add-secteur-activite")
	public SecteurActivite addSecteurActivite(@RequestBody SecteurActivite sa) {
		SecteurActivite secteurActivite=secteurActiviteService.addSecteurActivite(sa);
		return secteurActivite;
		
	}
	@DeleteMapping("/remove-secteur-activite/{idSecteurActivite}")
	public void removeSecteurActivite(@PathVariable("idSecteurActivite") Long idSecteurActivite) {
		secteurActiviteService.removeSecteurActivite(idSecteurActivite);
	}
	@PutMapping("/modify-secteur-activite")
	public SecteurActivite modifySecteurActivite(@RequestBody SecteurActivite sa) {
		return secteurActiviteService.updateSecteurActivite(sa);
	}


}
