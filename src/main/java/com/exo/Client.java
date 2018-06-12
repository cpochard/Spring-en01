package com.exo;

import java.util.List;

public class Client {

	String nom;
	String prenom;
	int age;
	List<Adresse> adresses;

	public Client() {
	}

	public List<Adresse> getAdresse() {
		return adresses;
	}

	public void setAdresse(List<Adresse> adresse) {
		this.adresses = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", age=");
		builder.append(age);
		builder.append(", adresse=");
		builder.append(adresses.toString());
		builder.append("]");
		return builder.toString();
	}

}
