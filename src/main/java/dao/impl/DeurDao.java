package dao.impl;

import java.util.List;

import domain.Deur;

public interface DeurDao {

	
	public List <Deur> listDeurs();

	public void saveDeur(Deur deur);

	public void removeDeur(long id);
	
	
}