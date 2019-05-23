package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Livre;

public interface IServiceLivre {
	
	public void ajouterLivre(Livre l);
	public void updateLivre(int id, Livre l);
	public void deleteLivre(int id);
	public Livre getById(int id);
	
	public List<Livre> getAll();

}
