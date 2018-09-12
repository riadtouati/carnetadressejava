package entree;
/**
 * Repr�sente une personne.
 *
 * @author Riad TOUATI
 * @version 1.0
 */
public class Personne {
	/** Le nom de la personne. */
	private String nom;
	
	/** Le ou les pr�noms de la personne. */
	private String[] prenoms;
	
	/** Le genre de la personne. */
	private Genre genre;
	
	/** Le conjoint de la personne. */
	private Personne conjoint;
	
	/** La soci�t� dans laquelle travaille la personne. */
	private Societe societe;
	
	/** Le m�tier de la personne. */
	private String fonction;
	
	/**
	 * Construit une personne ayant les caract�ristiques donn�es en param�tres.
	 *
	 * @param nom Le nom de la personne.
	 * @param prenoms Le ou les pr�noms de la personne.
	 * @param genre Le genre de la personne.
	 * @param conjoint Le conjoint de la personne.
	 * @param societe La soci�t� dans laquelle travaille la personne.
	 * @param fonction Le m�tier de la personne.
	 */
	public Personne(String nom, String[] prenoms, Genre genre, Personne conjoint, Societe societe, String fonction)
	{
		this.nom = nom;
		this.prenoms = prenoms;
		this.genre = genre;
		this.conjoint = conjoint;
		this.societe = societe;
		this.fonction = fonction;
	}

	/**
	 * Accesseur sur le nom de la personne.
	 *
	 * @return Le nom de la personne.
	 */
	public String getNom()
	{
		return nom;
	}

	/**
	 * Accesseur sur le ou les pr�noms de la personne.
	 *
	 * @return Le ou les pr�noms de la personne.
	 */
	public String[] getPrenoms()
	{
		return prenoms;
	}

	/**
	 * Accesseur sur le genre de la personne.
	 *
	 * @return Le genre de la personne.
	 */
	public Genre getGenre()
	{
		return genre;
	}

	/**
	 * Accesseur sur le conjoint de la personne.
	 *
	 * @return Le conjoint de la personne.
	 */
	public Personne getConjoint()
	{
		return conjoint;
	}

	/**
	 * Accesseur sur la soci�t� dans laquelle travaille la personne.
	 *
	 * @return La soci�t� dans laquelle travaille la personne.
	 */
	public Societe getSociete()
	{
		return societe;
	}

	/**
	 * Accesseur sur le m�tier de la personne.
	 *
	 * @return Le m�tier de la personne.
	 */
	public String getFonction()
	{
		return fonction;
	}

	/**
	 * Change le conjoint de la personne.
	 *
	 * @param conjoint Le nouveau conjoint de la personne.
	 */
	public void setConjoint(Personne conjoint)
	{
		this.conjoint = conjoint;
	}	

	/**
	 * Modifie la soci�t� dans laquelle travaille la personne.
	 *
	 * @param societe La nouvelle soci�t� dans laquelle travaille la personne.
	 */
	public void setSociete(Societe societe)
	{
		this.societe = societe;
	}

	/**
	 * Modifie le m�tier de la personne.
	 *
	 * @param fonction Le nouveau m�tier de la personne.
	 */
	public void setFonction(String fonction)
	{
		this.fonction = fonction;
	}

	/**
	 * Repr�sente les caract�ristiques de la personne sous forme de chaine de caract�res.
	 *
	 * @return Les caract�ristiques de la personne format�es suivants les param�tres donn�es, sous forme de cha�ne de caract�res.
	 */
	@Override
	public String toString()
	{
		return toString(Presentation.COMPLET, Sens.NOM_PRENOMS);
	}

	/**
	 * Repr�sente l'entr�e sous forme de chaine de caract�res, format�e
	 * suivant les param�tres de pr�sentations donn�es.
	 *
	 * @param present La pr�sentation des entr�es (simple/complet/abr�g�).
	 * @param sens Le sens d'affichage (pr�noms puis nom ou inversement).
	 * @return L'entr�e format�e suivant les param�tres donn�es, sous forme de cha�ne de caract�res.
	 */
	public String toString(Presentation present, Sens sens)
	{
		String maPhrase="";
		String sexe="";
		String mesPrenoms="";
		if(present==present.ABREGE) 
		{
			String monNom=this.nom;
			for(int i=0;i<prenoms.length;i++)
				mesPrenoms+=this.prenoms[i].charAt(0)+" ";
					if(sens==sens.NOM_PRENOMS)
						maPhrase+= monNom+" "+mesPrenoms;
					else
						maPhrase+= mesPrenoms+" "+monNom;
		}

		if(present==present.SIMPLE)
		{
			if(this.genre==Genre.FEMME)
				sexe="Mme";
			else
				sexe="M.";
			mesPrenoms+=prenoms[0]+" ";
			if(mesPrenoms.length()>1)
			{
				for(int i=1;i<prenoms.length;i++)
					mesPrenoms+=this.prenoms[i].charAt(0)+" ";
			}
			if(sens==sens.NOM_PRENOMS)
				maPhrase+=sexe+" "+this.nom+" "+mesPrenoms;
			else
				maPhrase+=sexe+" "+mesPrenoms+" "+this.nom;
			if(this.societe!=null)
				maPhrase+=" ("+this.societe+")";
		}

		if(present==present.COMPLET)
		{
			if(this.genre==Genre.FEMME)
				sexe="Mme";
			else
				sexe="M.";
			for(int i=0;i<prenoms.length;i++)
				mesPrenoms+=this.prenoms[i]+" ";
			if(sens==sens.NOM_PRENOMS)
				maPhrase+=sexe+" "+this.nom+" "+mesPrenoms;
			else
				maPhrase+=sexe+" "+mesPrenoms+" "+this.nom;
			if(this.societe!=null)			
				maPhrase+="\n- Soci�t� : "+this.societe;
			if(this.fonction!=null)
				maPhrase+="\n- Fonction : "+this.fonction;		
		}
		return maPhrase;
	}
}
