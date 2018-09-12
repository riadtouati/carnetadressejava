package entree;

/**
 * Interface permettant d'�tre s�r qu'une m�thode toString() avec diff�rents
 * param�tres d'affichage et qu'une m�thode recherche() prenant une cha�ne
 * en param�tre sont bien pr�sentes dans une classe donn�e.
 *
 * @author Riad TOUATI
 * @version 1.0
 */
public interface Entree
{
	/**
	 * Repr�sente l'entr�e sous forme de chaine de caract�res, format�e
	 * suivant les param�tres de pr�sentations donn�es.
	 *
	 * @param presentation La pr�sentation des entr�es (simple/complet/abr�g�).
	 * @param sens Le sens d'affichage (pr�noms puis nom ou inversement).
	 * @return L'entr�e format�e suivant les param�tres donn�es, sous forme de cha�ne de caract�res.
	 */
	String toString(Presentation presentation, Sens sens);

	/**
	 * Recherche si les carat�ristiques principales de l'entr�e contiennent
	 * la cha�ne donn�e en param�tre.
	 *
	 * @param s La cha�ne avec laquelle la recherche sera effectu�e.
	 * @return true si la cha�ne est contenue dans une des caract�ristiques principales
	 *         de l'entr�e, sinon false.
	 */
	boolean recherche(String s);
}
