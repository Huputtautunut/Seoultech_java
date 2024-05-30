package com.example.finalproject;


import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class WorkoutListCell extends ListCell<Workout> {
    private WorkoutController workoutController;

    public WorkoutListCell(WorkoutController workoutController) {
        this.workoutController = workoutController;
    }

    @Override
    protected void updateItem(Workout workout, boolean empty) {
        super.updateItem(workout, empty);

        if (empty || workout == null) {
            setText(null);
            setGraphic(null);
        } else {
            VBox vbox = new VBox();
            Text typeText = new Text("Type: " + workout.getType());
            Text dateText = new Text("Date: " + workout.getDate());
            Text durationText = new Text("Duration: " + workout.getDuration() + " minutes");
            Text caloriesText = new Text("Calories: " + workout.getCaloriesBurned());

            Button deleteButton = new Button("Delete");
            deleteButton.setOnAction(e -> {
                workoutController.removeWorkout(workout);
            });

            HBox hbox = new HBox(vbox, deleteButton);
            hbox.setSpacing(10);

            vbox.getChildren().addAll(typeText, dateText, durationText, caloriesText);
            setGraphic(hbox);
        }
    }
}