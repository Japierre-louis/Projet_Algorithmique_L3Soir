package projet;

/**
 * <p>Titre: Arbre Arithmetique</p>
 * <p>Universite: Ecole Superieure d'Infotronique d'Haiti (ESIH)</p>
 * <p>Classe: L3_Soir</p>
 * Auteur: James PIERRE-LOUIS
 * TOUSSAINT Benjy
 * BLANC Jean Davidson
 */

public interface Pile
        {
        public void depiler() throws PileVideException;
        public void empiler(Object e) throws PileSatureeException, TypeIncompatibleException;
        public Object sommet() throws PileVideException;
        public boolean vide ();
        public boolean saturee();
        public void effacer ();
        public void afficher();
          public Pile Copie();
          public boolean equals(Pile P);
        }
