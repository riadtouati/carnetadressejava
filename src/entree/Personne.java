package entree;
/**
 * Représente une personne.
 *
 * @author Riad TOUATI
 * @version 1.0
 */
public class Personne {
	/** Le nom de la personne. */
	private String nom;
	
	/** Le ou les prénoms de la personne. */
	private String[] prenoms;
	
	/** Le genre de la personne. */
	private Genre genre;
	
	/** Le conjoint de la personne. */
	private Personne conjoint;
	
	/** La société dans laquelle travaille la personne. */
	private Societe societe;
	
	/** Le métier de la personne. */
	private String fonction;
	
	/**
	 * Construit une personne ayant les caractéristiques données en paramètres.
	 *
	 * @param nom Le nom de la personne.
	 * @param prenoms Le ou les prénoms de la personne.
	 * @param genre Le genre de la personne.
	 * @param conjoint Le conjoint de la personne.
	 * @param societe La société dans laquelle travaille la personne.
	 * @param fonction Le métier de la personne.
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
	 * Accesseur sur le ou les prénoms de la personne.
	 *
	 * @return Le ou les prénoms de la personne.
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
	 * Accesseur sur la société dans laquelle travaille la personne.
	 *
	 * @return La société dans laquelle travaille la personne.
	 */
	public Societe getSociete()
	{
		return societe;
	}

	/**
	 * Accesseur sur le métier de la personne.
	 *
	 * @return Le métier de la personne.
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
	 * Modifie la société dans laquelle travaille la personne.
	 *
	 * @param societe La nouvelle société dans laquelle travaille la personne.
	 */
	public void setSociete(Societe societe)
	{
		this.societe = societe;
	}

	/**
	 * Modifie le métier de la personne.
	 *
	 * @param fonction Le nouveau métier de la personne.
	 */
	public void setFonction(String fonction)
	{
		this.fonction = fonction;
	}

	/**
	 * Représente les caractéristiques de la personne sous forme de chaine de caractères.
	 *
	 * @return Les caractéristiques de la personne formatées suivants les paramètres données, sous forme de chaîne de caractères.
	 */
	@Override
	public String toString()
	{
		return toString(Presentation.COMPLET, Sens.NOM_PRENOMS);
	}

	/**
	 * Représente l'entrée sous forme de chaine de caractères, formatée
	 * suivant les paramètres de présentations données.
	 *
	 * @param present La présentation des entrées (simple/complet/abrégé).
	 * @param sens Le sens d'affichage (prénoms puis nom ou inversement).
	 * @return L'entrée formatée suivant les paramètres données, sous forme de chaîne de caractères.
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
				maPhrase+="\n- Société : "+this.societe;
			if(this.fonction!=null)
				maPhrase+="\n- Fonction : "+this.fonction;		
		}
		return maPhrase;
	}
}
