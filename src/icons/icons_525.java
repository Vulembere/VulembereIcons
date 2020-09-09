/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icons;

import GUIControllers.LCON_2_1Controller;
import static GUIControllers.MAINController.public_contenaire;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.icons525.Icons525;
import de.jensd.fx.glyphs.icons525.Icons525View;
import de.jensd.fx.glyphs.weathericons.WeatherIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 *
 * @author VULEMBERE
 */
public class icons_525 {

    private Icons525[] ICONS;

    public icons_525() {
        this.ICONS = ICONS = Icons525.values();
    }

    public void load(String element) {
        public_contenaire.getChildren().clear();
        if (element == null) {
            for (Icons525 fontAwesomeIcon : ICONS) {
//                LCON_2_1Controller.icon = fontAwesomeIcon;
//                LCON_2_1Controller.Nom = fontAwesomeIcon.toString(); 
 
                AnchorPane pan;
////                pan = new AnchorPane(new FontAwesomeIconView(Icons525.ADDRESS_BOOK));
//                pan.setNodeOrientation(NodeOrientation.INHERIT);
//                public_contenaire.getChildren().add(pan);

            }
        } else {
            for (Icons525 fontAwesomeIcon : ICONS) {
                if (fontAwesomeIcon.toString().toUpperCase().contains(element.toUpperCase())) {
                    LCON_2_1Controller.icon = fontAwesomeIcon;
                    LCON_2_1Controller.Nom = fontAwesomeIcon.toString();
//                    try {
//                        public_contenaire.getChildren().add(FXMLLoader.load(getClass().getResource("/GUI/lCON_2_1.fxml")));
//                    } catch (IOException ex) {
//                        Logger.getLogger(WeatherIcon.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                }

            }
        }

    }
}
