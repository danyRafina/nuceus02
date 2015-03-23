package fr.noixcoop.nuceus;

import java.util.ArrayList;
import java.util.List;

public class MetierVarietes {
	private List<Variete> varietes = new ArrayList<Variete>() ;

	public MetierVarietes() {
		super();
		// TODO Auto-generated constructor stub
		varietes.add(new Variete("Franquette",true)) ;
		varietes.add(new Variete("Mayette",true)) ;
		varietes.add(new Variete("Parisienne",true)) ;
		varietes.add(new Variete("Maylanaise",false)) ;
		varietes.add(new Variete("Pleureur",false)) ;
		varietes.add(new Variete("Rubis",false)) ;
		varietes.add(new Variete("Soleze",false)) ;
		varietes.add(new Variete("Verdelet",false)) ;
		varietes.add(new Variete("Verdot",false)) ;
		varietes.add(new Variete("Serr",false)) ;
		varietes.add(new Variete("Grandjean",false)) ;
		varietes.add(new Variete("Fernett",false)) ;
		varietes.add(new Variete("Fernor",false)) ;
		varietes.add(new Variete("Chandler",false)) ;
		varietes.add(new Variete("Bijou",false)) ;
	}

	/** Rechercher la position d'une variété dans la liste des variétés
	 * @param libelle Nom de la variété recherchée
	 * @return Position de la variété ou -1 si non trouvée
	 */
	@SuppressWarnings("unused")
	private int rechercher(String libelle){
		int pos = -1 ;
		int i = 0 ;
		while(i < varietes.size() && pos == -1){
			if(libelle.toUpperCase().equals(varietes.get(i).getLibelle().toUpperCase())){
				pos = i ;
			}
			else {
				i += 1 ;
			}
		}
		return pos ;
	}

	/** Consulter la liste des variétés
	 * 
	 * @return Liste des variétés
	 */
	public List<Variete> consulter(){
		return this.varietes ;
	}

	/** Consulter une variété
	 * 
	 * @param libelle Nom de la variété 
	 * @return Variété
	 */
	public Variete consulter(String libelle){
		int pos = rechercher(libelle) ;
		if(pos != -1){
			return varietes.get(pos) ;
		}
		else {
			return null ;
		}
	}

	/** Ajouter une variété
	 * 
	 * @param variete Variété à ajouter
	 * @return true si l'ajout s'est déroulé avec succès
	 */
	public boolean ajouter(Variete variete){
		boolean result = false;
		System.out.println(varietes.toString());
		Variete v = consulter(variete.getLibelle());
		if(v == null)
			
			result= true;
		
		return result;
	}

	/** Modifier les caractéristiques d'une variété
	 * 
	 * @param variete Variété à modifier
	 * @return true si la modification s'est déroulée avec succès
	 */
	public boolean modifier(Variete variete){
		int pos = rechercher(variete.getLibelle()) ;
		if(pos != -1){
			varietes.set(pos,variete) ;
			return true ;
		}
		else {
			return false ;
		}
	}

	/** Supprimer une variété de la liste
	 * 
	 * @param libelle Nom de la variété
	 * @return true si la suppression s'est déroulée avec succès
	 */
	public boolean supprimer(String libelle){
		int pos = rechercher(libelle) ;
		if(pos != -1){
			varietes.remove(pos) ;
			return true ;
		}
		else {
			return false ;
		}
	}

	/** Supprimer une variété de la liste
	 * 
	 * @param variete Variété à supprimer
	 * @return true si la suppression s'est déroulée avec succès
	 */
	public boolean supprimer(Variete variete){
		return supprimer(variete.getLibelle()) ;
	}

}
