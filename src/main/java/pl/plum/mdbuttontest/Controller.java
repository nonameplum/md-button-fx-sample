package pl.plum.mdbuttontest;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    AnchorPane main;

    MaterialDesignButton materialDesignButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        materialDesignButton = new MaterialDesignButton("MATERIAL BUTTON");
        materialDesignButton.setTextAlignment(TextAlignment.CENTER);
        // Define custom color of ripple effect
        //materialDesignButton.setRippleColor(Color.RED);

        AnchorPane.setTopAnchor(materialDesignButton, 50.0);
        AnchorPane.setLeftAnchor(materialDesignButton, 50.0);
        AnchorPane.setRightAnchor(materialDesignButton, 50.0);

        main.getChildren().add(materialDesignButton);
    }

    @FXML
    public void changeRippleColor() {
        final double r = Math.random();
        final double g = Math.random();
        final double b = Math.random();

        materialDesignButton.setRippleColor(new Color(r, g, b, 0.25));
    }
}
