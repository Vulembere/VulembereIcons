/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icons;

import GUIControllers.LCONController;
import GUIControllers.MAINController;
import static GUIControllers.MAINController.public_contenaire;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author VULEMBERE
 */
public class FontAwasome {

    private FontAwesomeIcon[] ICONS;

    public FontAwasome() {
        this.ICONS = ICONS = FontAwesomeIcon.values();
    }

    public  void load(String element) { 
        public_contenaire.getChildren().clear();
        if (element == null) {
            for (FontAwesomeIcon fontAwesomeIcon : ICONS) {
                LCONController.icon = fontAwesomeIcon;
                LCONController.Nom = fontAwesomeIcon.toString();
                try {
                    public_contenaire.getChildren().add(FXMLLoader.load(getClass().getResource("/GUI/lCON.fxml"))); 
                } catch (IOException ex) {
                    Logger.getLogger(MAINController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            for (FontAwesomeIcon fontAwesomeIcon : ICONS) {
                if (fontAwesomeIcon.toString().toUpperCase().contains(element.toUpperCase())) {
                    LCONController.icon = fontAwesomeIcon;
                    LCONController.Nom = fontAwesomeIcon.toString();
                    try {
                        public_contenaire.getChildren().add(FXMLLoader.load(getClass().getResource("/GUI/lCON.fxml"))); 
                    } catch (IOException ex) {
                        Logger.getLogger(MAINController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }

    }
}
