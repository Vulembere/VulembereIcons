/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icons;

import GUIControllers.LCONController;
import GUIControllers.LCON_1Controller;
import static GUIControllers.MAINController.public_contenaire;
import de.jensd.fx.glyphs.weathericons.WeatherIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author VULEMBERE
 */
public class Weathericon {

    private WeatherIcon[] ICONS;

    public Weathericon() {
        this.ICONS = ICONS = WeatherIcon.values();
    }

    public void load(String element) {
        public_contenaire.getChildren().clear();
        if (element == null) {
            for (WeatherIcon fontAwesomeIcon : ICONS) {
                LCON_1Controller.icon = fontAwesomeIcon;
                LCON_1Controller.Nom = fontAwesomeIcon.toString();
                try {
                    public_contenaire.getChildren().add(FXMLLoader.load(getClass().getResource("/GUI/lCON_1.fxml"))); 
                } catch (IOException ex) {
                    Logger.getLogger(WeatherIcon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            for (WeatherIcon fontAwesomeIcon : ICONS) {
                if (fontAwesomeIcon.toString().toUpperCase().contains(element.toUpperCase())) {
                    LCON_1Controller.icon = fontAwesomeIcon;
                    LCON_1Controller.Nom = fontAwesomeIcon.toString();
                    try {
                        public_contenaire.getChildren().add(FXMLLoader.load(getClass().getResource("/GUI/lCON_1.fxml"))); 
                    } catch (IOException ex) {
                        Logger.getLogger(WeatherIcon.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }

    }
}
