package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import tn.esprit.spring.entities.SecteurActivite;

public interface SecteurActiviteService {
	List<SecteurActivite> retrieveAllSecteurActivites();
	SecteurActivite addSecteurActivite (SecteurActivite sa);
	SecteurActivite updateSecteurActivite (SecteurActivite sa);
	SecteurActivite retrieveSecteurActivite (Long id);
	void removeSecteurActivite (Long id);

}
