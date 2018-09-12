package test;

import entree.Genre;
import entree.Sens;

/**
 * Test le bon fonctionnement de la classe Personne.
 *
 * @author Alexandre Paquier
 * @version 1.0
 */
class TestPersonne
{
	public static void main(String[] args)
	{
		String[] gPrenoms = {"Weasley"};
		String[] hPrenoms = {"Harry","James"};
		Societe maSociete= new Societe("Ecole de sorcellerie Poudlard");
		Personne ginny= new Personne("Ginny",gPrenoms,Genre.FEMME,null,maSociete,"Elève");
		Personne harry= new Personne("Potter",hPrenoms,Genre.HOMME,ginny,maSociete,"Elève");
		ginny.setConjoint(harry);
		System.out.println(harry.toString(Presentation.ABREGE, Sens.PRENOMS_NOM));
		System.out.println(ginny.toString(Presentation.SIMPLE, Sens.NOM_PRENOMS));
	}
}