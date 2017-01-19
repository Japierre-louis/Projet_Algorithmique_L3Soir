package projet;

/**
 * <p>Titre: Arbre Arithmetique</p>
 * <p>Universite: Ecole Superieure d'Infotronique d'Haiti (ESIH)</p>
 * <p>Classe: L3_Soir</p>
 * Auteur: James PIERRE-LOUIS
 * TOUSSAINT Benjy
 * BLANC Jean Davidson
 */
public interface Liste {
  public int taille();
  public Object recuperer(int pos)throws PositionInvalideException,
                                         ListeVideException;
  public void inserer(int pos,Object o)throws PositionInvalideException,
                                              ListeSatureeException,
                                              TypeIncompatibleException;
  public void supprimer(int pos)throws PositionInvalideException,
                                       ListeVideException;
  public boolean equals(Liste L)throws PositionInvalideException,
                                     TypeIncompatibleException,
                                     ListeVideException;
  public Liste copie();
  public boolean vide();
  public boolean saturee();
  public void affiche();
}
