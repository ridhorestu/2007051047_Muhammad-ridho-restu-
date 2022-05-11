/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisdesktop;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Ridho restu
 */
public class FXMLDocumentController implements Initializable {
    
      @FXML
    private Button button;

    @FXML
    private ComboBox<?> cbmerekheadphone;

    @FXML
    private DatePicker dpTanggalpembelian;

    @FXML
    private ToggleGroup merek;

    @FXML
    private Label label;

    @FXML
    private RadioButton rdOverrear;

    @FXML
    private RadioButton rdclosedback;

    @FXML
    private RadioButton rdopenback;

    @FXML
    private TextField tfHarga;

    @FXML
    private TextField tfKode;

    @FXML
    private TextField tfNama;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
      //  label.setText("Hello World!");
      System.out.println(tfKode.getText());
        System.out.println(tfNama.getText());
        System.out.println(tfHarga.getText());
        System.out.println(dpTanggalpembelian.getValue().toString());
        String merek="";
        if (rdOverrear.isSelected())
           merek=rdOverrear.getText();
        if (rdclosedback.isSelected())
           merek=rdclosedback.getText();
        if (rdopenback.isSelected())
           merek=rdopenback.getText();
        
        System.out.println(merek);
        System.out.println(cbmerekheadphone.getValue().toString());
    }
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        ArrayList <String> list = new ArrayList<String>();
        list.add("Logitech G733");
        list.add("Razer BlackShark V2 Pror");
         list.add("R Audio-Technica ATH-G1");
        ObservableList items = FXCollections.observableArrayList(list);
        cbmerekheadphone.setItems(items);
    }    
    
}

   