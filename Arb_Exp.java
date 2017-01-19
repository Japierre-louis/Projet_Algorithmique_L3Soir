package projet;

/**
 * <p>Titre: Arbre Arithmetique</p>
 * <p>Universite: Ecole Superieure d'Infotronique d'Haiti (ESIH)</p>
 * <p>Classe: L3_Soir</p>
 * Auteur: James PIERRE-LOUIS
 * TOUSSAINT Benjy
 * BLANC Jean Davidson
 */

public interface Arb_Exp {
  public void Inserer(@SuppressWarnings("rawtypes") Comparable x)throws
      TypeIncompatibleException,ArbreSatureException;
  public void Afficher(int Ordre);
  public boolean Vide();
  public boolean Sature();
  public int Taille();
}
