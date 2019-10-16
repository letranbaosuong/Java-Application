package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import javax.swing.*;

public class Controller {
    @FXML
    public Button btn;

    public void khaClick(MouseEvent mouseEvent) {
        System.out.println("ngon");
        JOptionPane.showMessageDialog(null, "ngon");
    }
}
