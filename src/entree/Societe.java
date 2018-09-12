package entree;

/**
 * Représente une société, caractérisée par sa raison sociale.
 *
 * @author Maxime Pinot, Alexandre Paquier
 * @version 1.0
 */
public class Societe implements Entree
{
	/** La raison sociale de la société. */
	private String raisonSociale;

	/**
	 * Construit une société dont la raison sociale sera celle donnée en paramètre.
	 *
	 * @param raisonSociale La raison sociale de la société.
	 */
	public Societe(String raisonSociale)
	{
		this.raisonSociale = raisonSociale;
	}

	/**
	 * Accesseur sur la raison sociale de la société.
	 *
	 * @return La raison sociale de la société.
	 */
	public String getRaisonSociale()
	{
		return raisonSociale;
	}

	/**
	 * Modifie la raison sociale de la société.
	 *
	 * @param raisonSociale La nouvelle raison sociale de la société.
	 */
	public void setRaisonSociale(String raisonSociale)
	{
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString()
	{
		return toString(null, null);
	}

	/**
	 * Représente l'entrée sous forme de chaine de caractères, formatée
	 * suivant les paramètres de présentations données.
	 *
	 * @param presentation La présentation des entrées (simple/complet/abrégé).
	 * @param sens Le sens d'affichage (prénoms puis nom ou inversement).
	 * @return L'entrée formatée suivant les paramètres données, sous forme de chaîne de caractères.
	 */
	@Override
	public String toString(Presentation presentation, Sens sens)
	{
		return raisonSociale;
	}

	@Override
	public boolean recherche(String s) {
		// TODO Auto-generated method stub
		return false;
	}
}