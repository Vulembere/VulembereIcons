/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIControllers;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import org.controlsfx.control.PopOver;

/**
 * FXML Controller class
 *
 * @author VULEMBERE
 */
public class LCON_2Controller implements Initializable {

    @FXML
    private Label txtName;
    @FXML
    private MaterialDesignIconView font;
    public static MaterialDesignIcon icon;
    public static String Nom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        font.setIcon(icon);
        txtName.setText(Nom);
    }

    @FXML
    private void choix(MouseEvent event) throws IOException {
        MAINController.public_icon = txtName.getText();
        MAINController.main.popOverMenu(font, PopOver.ArrowLocation.TOP_CENTER);
    }

}
