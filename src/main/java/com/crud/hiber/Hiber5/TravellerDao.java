package com.crud.hiber.Hiber5;

import java.util.List;

public interface TravellerDao {
	
	public int insert(Traveller t);
	public Traveller getTraveller(int id);
	public void deleteTraveller(int id);
	public List<Traveller> LoadAll();
	public void update();

}
