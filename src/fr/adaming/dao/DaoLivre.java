package fr.adaming.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.adaming.model.Livre;
import fr.adaming.util.ConnectionDB;

public class DaoLivre implements IDaoLivre{
	
	Connection connect;
	PreparedStatement ps;
	
	

	public DaoLivre()   {
		try {
			connect = ConnectionDB.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public void ajouterLivre(Livre l) {
		// TODO Auto-generated method stub
		
		try {
			String req = "insert into livre (titre, auteur, prix) values (?,?,?);";
			ps = connect.prepareStatement(req);
			ps.setString(1, l.getTitre());
			ps.setString(2, l.getAuteur());	
			ps.setFloat(3, (float) l.getPrix()); 
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateLivre(int id, Livre l) {
		try {
			String req = "UPDATE livre SET titre = ?, auteur = ?, prix = ? WHERE id=?";
			ps = connect.prepareStatement(req);
			ps.setString(1, l.getTitre());
			ps.setString(2, l.getAuteur());	
			ps.setFloat(3, (float) l.getPrix());
			ps.setInt(4, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteLivre(int id) {
		try {
			String req = "DELETE FROM livre WHERE id = ?";
			ps = connect.prepareStatement(req);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Livre> getAll() {
		try {
			String req = "SELECT * FROM livre";
			ps = connect.prepareStatement(req);
			ResultSet rs = ps.executeQuery();
			List<Livre> list = new ArrayList<Livre>();
			
			while (rs.next()) {
				list.add(new Livre(rs.getInt("id"), rs.getString("titre"), rs.getString("auteur"), rs.getFloat("prix")));
				

			}	
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
		
	

	@Override
	public Livre getById(int id) {
		try {
			String req = "SELECT * FROM livre WHERE id=?";
			ps = connect.prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			Livre l = new Livre (rs.getInt("id"), rs.getString("titre"), rs.getString("auteur"), rs.getFloat("prix"));
			return l;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
