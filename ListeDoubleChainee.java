package projet;

/**
 * <p>Titre: Arbre Arithmetique</p>
 * <p>Universite: Ecole Superieure d'Infotronique d'Haiti (ESIH)</p>
 * <p>Classe: L3_Soir</p>
 * Auteur: James PIERRE-LOUIS
 * TOUSSAINT Benjy
 * BLANC Jean Davidson
 */

public class ListeDoubleChainee implements Liste {
 public  static int max_size=100;
 Noeud tete;
 Noeud queue;
 public int lg;
 @SuppressWarnings("rawtypes")
public Class typeDesElements;
  public ListeDoubleChainee(int n,@SuppressWarnings("rawtypes") Class c) {
   typeDesElements=c;
   max_size=n;
  }
  public ListeDoubleChainee(@SuppressWarnings("rawtypes") Class c) {
    this(max_size,c);
   }
   public int taille(){return lg;}
   public Object recuperer(int pos)
       throws PositionInvalideException,ListeVideException
   {
     if(vide())throw new ListeVideException();
    if(pos<1||pos>lg)throw new PositionInvalideException();
Noeud q=tete;
     for(int i=1;i<pos;i++){
       q=q.succ;
     }
     return q.info;
   }
   public void inserer(int pos,Object o)
       throws PositionInvalideException,ListeSatureeException,TypeIncompatibleException
   {
     if(o.getClass()!=typeDesElements)throw new
          TypeIncompatibleException();
    if(saturee())throw new ListeSatureeException();
    if(pos<1||pos>lg+1)throw new
          PositionInvalideException();

     Noeud n=new Noeud(o);
     if(lg==0)tete=queue=n;
     if(pos==1){
       tete.prec=n;
       n.succ=tete;
       tete=n;
     }
     else
       if(pos==lg+1){
         queue.succ=n;
         n.prec=queue;
         queue=n;
       }
       else{
         Noeud p=null,q=tete;
         for(int i=1;i<pos;i++){
           p=q;
           q=q.succ;
         }
         p.succ=n;n.prec=p;n.succ=q;q.prec=n;
       }
       lg++;
   }
   public void supprimer(int pos)
       throws PositionInvalideException,ListeVideException
   {
     if(vide())throw new ListeVideException();
  if(pos<1||pos>lg)throw new PositionInvalideException();
     if(lg==1)tete=queue=null;
       else if(pos==1){
         tete=tete.succ;
         tete.prec=null;
       }
       else if(pos==lg){
         queue=queue.prec;
         queue.succ=null;
       }
       else{
         Noeud q=tete,p=null;
         for(int i=1;i<pos;i++){
           p=q;
           q=q.succ;
         }
         q.succ.prec=p;
         p.succ=q.succ;
       }
    lg--;
   }
   public boolean equals(Liste l)
       throws PositionInvalideException,TypeIncompatibleException,ListeVideException
   {
return this.equals(l);
   }
   public Liste copie(){
      return this;
   }
   public boolean vide(){
     return (taille()==0);
   }
   public boolean saturee(){
     return (taille()==max_size);
   }
   public void affiche(){
     Noeud q=tete;
     for(int i=1;i<=taille();i++){
      System.out.println(q.info);
      q=q.succ;
     }
   }
static public void main(String [] argv) throws TypeIncompatibleException,
      ListeSatureeException, PositionInvalideException, ListeVideException,
      PositionInvalideException {
     ListeDoubleChainee n=new ListeDoubleChainee(java.lang.Integer.class);
     for(int i=1;i<10;i++)

    {
      n.inserer(i, new Integer(i + 1));
    }

      System.out.print( (Integer) n.recuperer(10));

   }
 }
