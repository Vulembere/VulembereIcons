/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIControllers;

import icons.FontAwasome;
import icons.Materialdesignicon;
import icons.Weathericon;
import icons.icons_525;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import org.controlsfx.control.PopOver;

/**
 * FXML Controller class
 *
 * @author VULEMBERE
 */
public class MAINController implements Initializable {

    public static String public_icon;

    @FXML
    private FlowPane contenaire;
    @FXML
    private TextField txtSearch;
    public static FlowPane public_contenaire;
    public FontAwasome Awasome;
    public Weathericon weatherIcon;
    public Materialdesignicon materialIcon;
    public static String TypeIcons;
    public icons_525 icon_525;
    @FXML
    private Label FontAwasome;
    @FXML
    private Label laWeather;
    @FXML
    private Label labMaterial;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        public_contenaire = contenaire;
        Awasome = new FontAwasome();
        weatherIcon = new Weathericon();
        materialIcon = new Materialdesignicon();
        icon_525 = new icons_525();

        Awasome.load(null);
        TypeIcons = "FA";
        init(FontAwasome,laWeather,labMaterial);
    }

    @FXML
    private void rechercher(KeyEvent event) {
        switch (TypeIcons) {
            case "FA":
                Awasome.load(txtSearch.getText());
                break;
            case "WA":
                weatherIcon.load(txtSearch.getText());
                break;
            case "MA":
                materialIcon.load(txtSearch.getText());
                break;
            case "I525":
                icon_525.load(txtSearch.getText());
                break;
            default:
                System.out.println("Not_exist");
        }

    }

    public void popOverMenu(Node node, PopOver.ArrowLocation arrowLocation) throws IOException {
        if (!over.isShowing()) {
            AnchorPane box = FXMLLoader.load(getClass().getResource("/GUI/INFOS.fxml"));
            over.setArrowLocation(arrowLocation);
            over.setAutoHide(true);
            over.setContentNode(box);
//            over.getStyle().
            over.show(node, 0);
        } else {
            over.hide();
        }
    }
    public static final PopOver over = new PopOver();
    public static final MAINController main = new MAINController();

    @FXML
    private void selectFontAwesomeIcon(MouseEvent event) {
        Awasome.load(null);
        TypeIcons = "FA";
        init(FontAwasome,laWeather,labMaterial);
    }

    @FXML
    private void selectWeatherIcon(MouseEvent event) {
        weatherIcon.load(null);
        TypeIcons = "WA";
        init(laWeather,FontAwasome,labMaterial);
    }

    @FXML
    private void SelectMaterialDesignIcon(MouseEvent event) {
        materialIcon.load(null);
        TypeIcons = "MA";
        init(labMaterial,FontAwasome,laWeather);
    }

  

    void init(Label... node) {
        for (Node node1 : node) {
            Label lab = (Label) node1;
            lab.setStyle("-fx-background-color:#F4F4F4");
        }
        node[0].setStyle("-fx-background-color:#E9E9E9");  
    }
}
