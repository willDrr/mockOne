package com.cliente;

import java.util.Date;
import java.util.Objects;

public class Perfil {
	
	private final String name;
	private final String email;
	private final Date date;
	private final char gender;
	
	private String phone;
	private String adress;	
	private String site;
	
	
	/**
	 * 
	 * @param name
	 * @param email
	 * @param date
	 * @param gender
	 * @param phone
	 * @param adress
	 * @param site
	 */
	public Perfil(String name, String email, Date date, char gender, String phone, String adress, String site) {	
		
		this.name = Objects.requireNonNull(name, "Name can not be null");
		this.email = Objects.requireNonNull(email, "E-mail can not be null");
		this.date = Objects.requireNonNull(date, "Date can not be null");  
		this.gender = Objects.requireNonNull(gender, "Gender  can not be null");  
		
		this.phone = phone;
		this.adress = adress;
		this.site = site;
		
	}

	
	/**
	 * 
	 * @return
	 */
	public String getPhone() {
		return phone;
	}

	
	/**
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	/**
	 * 
	 * @return
	 */
	public String getAdress() {
		return adress;
	}

	
	/**
	 * 
	 * @param adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	
	/**
	 * 
	 * @return
	 */
	public String getSite() {
		return site;
	}

	
	/**
	 * 
	 * @param site
	 */
	public void setSite(String site) {
		this.site = site;
	}

	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * 
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	
	/**
	 * 
	 * @return
	 */
	public Date getDate() {
		return date;
	}

	
	/**
	 * 
	 * @return
	 */
	public char getGender() {
		return gender;
	}


	@Override
	public String toString() {
		return "Perfil [name=" + getName() + ", email=" + getEmail() + ", date=" + getDate() + ", gender=" + getGender() + ", phone="
				+ getPhone() + ", adress=" + getAdress() + ", site=" + getSite() + "]";
	}
	
	
}
