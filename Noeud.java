package projet;

/**
 * <p>Titre: Arbre Arithmetique</p>
 * <p>Universite: Ecole Superieure d'Infotronique d'Haiti (ESIH)</p>
 * <p>Classe: L3_Soir</p>
 * Auteur: James PIERRE-LOUIS
 * TOUSSAINT Benjy
 * BLANC Jean Davidson
 */
public class Noeud {
  protected Noeud succ;
  protected Noeud prec;
  protected Object info;
  public Noeud(Object e) {
    info=e;
  }
  public Noeud(Object e,Noeud s,Noeud p){
    info=e;
    succ=s;
    prec=p;
  }
}
