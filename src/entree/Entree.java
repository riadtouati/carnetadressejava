package entree;

/**
 * Interface permettant d'être sûr qu'une méthode toString() avec différents
 * paramètres d'affichage et qu'une méthode recherche() prenant une chaîne
 * en paramètre sont bien présentes dans une classe donnée.
 *
 * @author Riad TOUATI
 * @version 1.0
 */
public interface Entree
{
	/**
	 * Représente l'entrée sous forme de chaine de caractères, formatée
	 * suivant les paramètres de présentations données.
	 *
	 * @param presentation La présentation des entrées (simple/complet/abrégé).
	 * @param sens Le sens d'affichage (prénoms puis nom ou inversement).
	 * @return L'entrée formatée suivant les paramètres données, sous forme de chaîne de caractères.
	 */
	String toString(Presentation presentation, Sens sens);

	/**
	 * Recherche si les caratéristiques principales de l'entrée contiennent
	 * la chaîne donnée en paramètre.
	 *
	 * @param s La chaîne avec laquelle la recherche sera effectuée.
	 * @return true si la chaîne est contenue dans une des caractéristiques principales
	 *         de l'entrée, sinon false.
	 */
	boolean recherche(String s);
}
