package dao.impl;

import java.util.List;

import domain.Deur;
import domain.Trap;

public interface TrapDao {

	
	public List <Trap> listTrappen();

	public void saveTrap(Trap trap);

	public void removeTrap(long id);
	
	
}