package com.crud.hiber.Hiber5;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;



public class TravellerDaoImp {

	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	// crud functions 
	
	@Transactional
	public int insert(Traveller t) {
		// TODO Auto-generated method stub
		int i = (Integer) this.ht.save(t);
		return i;
	}

	public Traveller getTraveller(int id) {
		// TODO Auto-generated method stub
		Traveller t = this.ht.get(Traveller.class, id);
		return t;
	}

	@Transactional
	public void deleteTraveller(int id) {
		// TODO Auto-generated method stub
		Traveller t =  this.ht.get(Traveller.class, id);
		this.ht.delete(t);
	}

	public List<Traveller> LoadAll() {
		// TODO Auto-generated method stub
		List<Traveller> l = this.ht.loadAll(Traveller.class);
		return l;
	}
	@Transactional
	public void update(Traveller t) {
		this.ht.update(t);
	}

}
