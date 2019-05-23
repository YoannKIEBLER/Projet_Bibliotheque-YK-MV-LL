package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.DaoLivre;
import fr.adaming.dao.IDaoLivre;
import fr.adaming.model.Livre;

public class ServiceLivre implements IServiceLivre {
	
	IDaoLivre dao = new DaoLivre();

	@Override
	public void ajouterLivre(Livre l) {
		// TODO Auto-generated method stub
		dao.ajouterLivre(l);
		
	}

	@Override
	public void updateLivre(int id, Livre l) {
		// TODO Auto-generated method stub
		dao.updateLivre(id, l);
	}

	@Override
	public void deleteLivre(int id) {
		// TODO Auto-generated method stub
		dao.deleteLivre(id);
	}

	@Override
	public Livre getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public List<Livre> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
