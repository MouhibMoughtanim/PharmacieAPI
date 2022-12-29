package com.example.pharmacieapi.entity;



import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;

@Embeddable
public class PharmacieDeGardeRelation implements Serializable {


    private int pharmaciePK;
	private int gardePK;


	public PharmacieDeGardeRelation(int pharmaciePK, int gardePK) {
		super();
		this.pharmaciePK = pharmaciePK;
		this.gardePK = gardePK;
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



	public PharmacieDeGardeRelation() {
		super();
	}

}
