package projet;

import javax.swing.UIManager;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Titre: Arbre Arithmetique</p>
 * <p>Universite: Ecole Superieure d'Infotronique d'Haiti (ESIH)</p>
 * <p>Classe: L3_Soir</p>
 * Auteur: James PIERRE-LOUIS
 * TOUSSAINT Benjy
 * BLANC Jean Davidson
 */

public class Main {
  boolean packFrame = false;

  //Construct the application
  public Main() {
    Graphique frame = new Graphique();
    
    if (packFrame) {
      frame.pack();
    }
    else {
      frame.validate();
    }
    //Center the window
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = frame.getSize();
    if (frameSize.height > screenSize.height) {
      frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
      frameSize.width = screenSize.width;
    }
    frame.setLocation(0, 0);
    frame.setSize(screenSize.width,screenSize.height);
    frame.setVisible(true);
  }
  //Main method
  public static void main(String[] args) {
    try {
  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    new Main();
  }
}