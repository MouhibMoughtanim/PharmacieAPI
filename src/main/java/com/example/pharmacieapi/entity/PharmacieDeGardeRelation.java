package com.example.pharmacieapi.entity;



import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class PharmacieDeGardeRelation  {


	private int pharmaciePK;
	private int gardePK;
	private Date dateDebut;

	public PharmacieDeGardeRelation(int pharmaciePK, int gardePK, Date dateDebut) {
		super();
		this.pharmaciePK = pharmaciePK;
		this.gardePK = gardePK;
		this.setDateDebut(dateDebut);
	}

	public int getPharmaciePK() {
		return pharmaciePK;
	}

	public void setPharmaciePK(int pharmaciePK) {
		this.pharmaciePK = pharmaciePK;
	}

	public int getGardePK() {
		return gardePK;
	}

	public void setGardePK(int gardePK) {
		this.gardePK = gardePK;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public PharmacieDeGardeRelation() {
		super();
	}

}
