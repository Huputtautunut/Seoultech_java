package com.example.finalproject;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class AddWorkoutView extends Stage {
    public AddWorkoutView(WorkoutController workoutController) {
        setTitle("Add Workout");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        Label typeLabel = new Label("Workout Type:");
        GridPane.setConstraints(typeLabel, 0, 0);
        TextField typeInput = new TextField();
        GridPane.setConstraints(typeInput, 1, 0);

        Label dateLabel = new Label("Date:");
        GridPane.setConstraints(dateLabel, 0, 1);
        DatePicker datePicker = new DatePicker();
        GridPane.setConstraints(datePicker, 1, 1);

        Label durationLabel = new Label("Duration (minutes):");
        GridPane.setConstraints(durationLabel, 0, 2);
        TextField durationInput = new TextField();
        GridPane.setConstraints(durationInput, 1, 2);

        Label caloriesLabel = new Label("Calories Burned:");
        GridPane.setConstraints(caloriesLabel, 0, 3);
        TextField caloriesInput = new TextField();
        GridPane.setConstraints(caloriesInput, 1, 3);

        Button addButton = new Button("Add");
        GridPane.setConstraints(addButton, 1, 4);
        addButton.setOnAction(e -> {
            String type = typeInput.getText();
            LocalDate date = datePicker.getValue();
            int duration = Integer.parseInt(durationInput.getText());
            int caloriesBurned = Integer.parseInt(caloriesInput.getText());

            Workout workout = new Workout(type, date, duration, caloriesBurned);
            workoutController.addWorkout(workout);
            close();
        });

        gridPane.getChildren().addAll(typeLabel, typeInput, dateLabel, datePicker, durationLabel, durationInput, caloriesLabel, caloriesInput, addButton);

        Scene scene = new Scene(gridPane, 300, 200);
        setScene(scene);
    }
}