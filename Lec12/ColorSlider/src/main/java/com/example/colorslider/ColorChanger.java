package com.example.colorslider;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorChanger extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the Text that will change color
        Text colorText = new Text("Show colors");
        colorText.setStyle("-fx-font-size: 24px;");

        // Create ScrollBars for red, green, blue, and opacity
        ScrollBar redScrollBar = new ScrollBar();
        ScrollBar greenScrollBar = new ScrollBar();
        ScrollBar blueScrollBar = new ScrollBar();
        ScrollBar opacityScrollBar = new ScrollBar();

        // Set the ScrollBars' range and initial value
        setScrollBarProperties(redScrollBar, "Red");
        setScrollBarProperties(greenScrollBar, "Green");
        setScrollBarProperties(blueScrollBar, "Blue");
        setScrollBarProperties(opacityScrollBar, "Opacity");

        // Add listeners to update the text color
        ChangeListener<Number> colorChangeListener = new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                updateTextColor(colorText, redScrollBar, greenScrollBar, blueScrollBar, opacityScrollBar);
            }
        };

        redScrollBar.valueProperty().addListener(colorChangeListener);
        greenScrollBar.valueProperty().addListener(colorChangeListener);
        blueScrollBar.valueProperty().addListener(colorChangeListener);
        opacityScrollBar.valueProperty().addListener(colorChangeListener);

        // Create Labels for each ScrollBar
        Label redLabel = new Label("Red");
        Label greenLabel = new Label("Green");
        Label blueLabel = new Label("Blue");
        Label opacityLabel = new Label("Opacity");

        // Arrange the UI components in a VBox
        VBox vbox = new VBox(10,
                colorText,
                redLabel, redScrollBar,
                greenLabel, greenScrollBar,
                blueLabel, blueScrollBar,
                opacityLabel, opacityScrollBar);
        vbox.setPadding(new Insets(20));

        // Set up the Scene and Stage
        Scene scene = new Scene(vbox, 300, 350);
        primaryStage.setTitle("Color Changer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to set ScrollBar properties
    private void setScrollBarProperties(ScrollBar scrollBar, String name) {
        scrollBar.setMin(0);
        scrollBar.setMax(100);
        scrollBar.setValue(50);
        scrollBar.setBlockIncrement(1);
        scrollBar.setPrefWidth(200);
        scrollBar.setAccessibleText(name);
    }

    // Method to update the text color based on ScrollBar values
    private void updateTextColor(Text text, ScrollBar red, ScrollBar green, ScrollBar blue, ScrollBar opacity) {
        double redValue = red.getValue() / 100;
        double greenValue = green.getValue() / 100;
        double blueValue = blue.getValue() / 100;
        double opacityValue = opacity.getValue() / 100;
        text.setFill(Color.color(redValue, greenValue, blueValue, opacityValue));
    }

    public static void main(String[] args) {
        launch(args);
    }
}