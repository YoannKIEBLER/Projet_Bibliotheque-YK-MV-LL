package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Livre;

public interface IDaoLivre {
	
	public void ajouterLivre(Livre l);
	public void updateLivre(int id, Livre l);
	public void deleteLivre(int id);
	public Livre getById(int id);
	
	public List<Livre> getAll();
	

}
