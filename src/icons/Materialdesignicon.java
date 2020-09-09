/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icons;

import GUIControllers.LCON_2Controller;
import static GUIControllers.MAINController.public_contenaire;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.weathericons.WeatherIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author VULEMBERE
 */
public class Materialdesignicon {

    private MaterialDesignIcon[] ICONS;

    public Materialdesignicon() {
        this.ICONS = ICONS = MaterialDesignIcon.values();
    }

    public void load(String element) {
        public_contenaire.getChildren().clear();
        if (element == null) {
            for (MaterialDesignIcon fontAwesomeIcon : ICONS) {
                LCON_2Controller.icon = fontAwesomeIcon;
                LCON_2Controller.Nom = fontAwesomeIcon.toString();
                try {
                    public_contenaire.getChildren().add(FXMLLoader.load(getClass().getResource("/GUI/lCON_2.fxml")));
                } catch (IOException ex) {
                    Logger.getLogger(WeatherIcon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            for (MaterialDesignIcon fontAwesomeIcon : ICONS) {
                if (fontAwesomeIcon.toString().toUpperCase().contains(element.toUpperCase())) {
                    LCON_2Controller.icon = fontAwesomeIcon;
                    LCON_2Controller.Nom = fontAwesomeIcon.toString();
                    try {
                        public_contenaire.getChildren().add(FXMLLoader.load(getClass().getResource("/GUI/lCON_2.fxml")));
                    } catch (IOException ex) {
                        Logger.getLogger(WeatherIcon.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }

    }
}
