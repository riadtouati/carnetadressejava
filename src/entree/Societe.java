package entree;

/**
 * Repr�sente une soci�t�, caract�ris�e par sa raison sociale.
 *
 * @author Maxime Pinot, Alexandre Paquier
 * @version 1.0
 */
public class Societe implements Entree
{
	/** La raison sociale de la soci�t�. */
	private String raisonSociale;

	/**
	 * Construit une soci�t� dont la raison sociale sera celle donn�e en param�tre.
	 *
	 * @param raisonSociale La raison sociale de la soci�t�.
	 */
	public Societe(String raisonSociale)
	{
		this.raisonSociale = raisonSociale;
	}

	/**
	 * Accesseur sur la raison sociale de la soci�t�.
	 *
	 * @return La raison sociale de la soci�t�.
	 */
	public String getRaisonSociale()
	{
		return raisonSociale;
	}

	/**
	 * Modifie la raison sociale de la soci�t�.
	 *
	 * @param raisonSociale La nouvelle raison sociale de la soci�t�.
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
	 * Repr�sente l'entr�e sous forme de chaine de caract�res, format�e
	 * suivant les param�tres de pr�sentations donn�es.
	 *
	 * @param presentation La pr�sentation des entr�es (simple/complet/abr�g�).
	 * @param sens Le sens d'affichage (pr�noms puis nom ou inversement).
	 * @return L'entr�e format�e suivant les param�tres donn�es, sous forme de cha�ne de caract�res.
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