package com.example.labone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HotelController implements Initializable {
    @FXML
    private TextField franchiseTextField;

    @FXML
    private ComboBox<String> roomTypeComboBox;

    @FXML
    private TextField roomNumberTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private CheckBox isAvailableCheckBox;

    @FXML
    private Label textLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I'm in the Initialize method.");
        // remove label invisible
        textLabel.setVisible(false);

        // populate genres to combobox
        roomTypeComboBox.getItems().addAll(Hotel.roomsTypeList());
    }
    @FXML
    void submitButton(ActionEvent event) {
        System.out.println("Button Clicked");

        try {
            //Store user data in variables
            String Franchise = franchiseTextField.getText();
            String roomType = roomTypeComboBox.getSelectionModel().getSelectedItem();
            int roomNumber = Integer.parseInt(roomNumberTextField.getText());
            double price = (!priceTextField.getText().isBlank()) ? Double.parseDouble(priceTextField.getText()) : -1;
            boolean isAvailable = isAvailableCheckBox.isSelected();

            //Create book Object
            Hotel Hotel = new Hotel(Franchise, roomType, roomNumber, price, isAvailable);

            textLabel.setVisible(true);
            textLabel.setText(Hotel.toString());
            System.out.println(Hotel.toString());
        }
        catch (Exception e){
            // Show proper exception to user
            textLabel.setVisible(true);
            textLabel.setText(e.getMessage());
        }
    }
}


