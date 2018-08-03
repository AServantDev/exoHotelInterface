package exoHotelInterface;

import java.util.Scanner;

public class Chalet implements HotelLuxe{
	
	double prix;
	double etoiles;
	int nbChambres;
	String nom;
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public double getEtoiles() {
		return etoiles;
	}
	public void setEtoiles(double etoiles) {
		this.etoiles = etoiles;
	}
	public int getNbChambres() {
		return nbChambres;
	}
	public void setNbChambres(int nbChambres) {
		this.nbChambres = nbChambres;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public void descriptionHotel() {
		
		System.out.println("Le chalet " + getNom() + " possède " + getEtoiles() + " étoiles et " + getNbChambres() + " chambres.");
		
	}
	@Override
	public void reserverHotel() {
		prix = (getPrix() * getEtoiles()) * 0.4;
		System.out.println("Le prix d'une chambre s'élève à " +prix+ "€.");
		System.out.println("Voulez vous une chambre? Oui(o), Non(n)");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		if((input == 'o') || (input == 'O') ) {
			System.out.println("Votre chambre est réservée!");
			}else {
			System.out.println("Réservation annulée...");
		}
	}
	
	

}
