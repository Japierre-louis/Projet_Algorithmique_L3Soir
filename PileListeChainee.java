package projet;

import static projet.ListeDoubleChainee.max_size;

/**
 * <p>Titre: Arbre Arithmetique</p>
 * <p>Universite: Ecole Superieure d'Infotronique d'Haiti (ESIH)</p>
 * <p>Classe: L3_Soir</p>
 * Auteur: James PIERRE-LOUIS
 * TOUSSAINT Benjy
 * BLANC Jean Davidson
 */

public class PileListeChainee extends ListeDoubleChainee implements Pile{

  public PileListeChainee(int n,@SuppressWarnings("rawtypes") Class c){
    super(n,c);
  }
  public PileListeChainee(@SuppressWarnings("rawtypes") Class c){
    super(c);
  }
  public void depiler() throws PileVideException{
    if (vide()) throw new PileVideException();
        try { supprimer(lg); }
        catch (PositionInvalideException a)
        { System.out.println(a);}
        catch (ListeVideException a)
        { System.out.println(a);}

  }
  public void empiler(Object e) throws PileSatureeException,
      TypeIncompatibleException{
    if ( saturee() ) throw new PileSatureeException();
     try { inserer(lg+1,e) ;}
     catch (TypeIncompatibleException a)
    { System.out.println(a); }
    catch (ListeSatureeException a)
    { System.out.println(a); }
    catch (PositionInvalideException a)
    { System.out.println(a);}
  }
  public Object sommet() throws PileVideException{
    if (vide()) throw new PileVideException();
    Object e = null;
    try { e = recuperer(lg); }
    catch (PositionInvalideException a)
    { System.out.println(a);}
    catch (ListeVideException a)
    { System.out.println(a);}
    return e;

  }
  public boolean vide (){
    return (super.vide());
  }
  public boolean saturee(){
    return (super.saturee());
  }
  public void effacer (){
    for (int i=1; i<=lg; i++)
     {  try { supprimer(1); }
        catch (PositionInvalideException a)
        { System.out.println(a);}
        catch (ListeVideException a)
        { System.out.println(a);}  }

  }
  public void afficher(){
    super.affiche();
  }
  public Pile Copie()
  { Pile P = new PileListeChainee(max_size,typeDesElements);

    for (int i= lg; i>=1; i--)
      try {
        P.empiler(recuperer(i));
      }
      catch (ListeVideException ex) {
      }
      catch (PositionInvalideException ex) {
      }
      catch (TypeIncompatibleException ex) {
      }
      catch (PileSatureeException ex) {
      }


    return P;  }

  public boolean equals(Pile P){
    try {
      return (super.equals( (Liste) P));
    }
    catch (ListeVideException ex) {
      return false;
    }
    catch (TypeIncompatibleException ex) {
      return false;
    }
    catch (PositionInvalideException ex) {
      return false;
    }
  }

}
