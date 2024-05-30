package com.example.finalproject;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

public class WorkoutListView extends BorderPane {
    private WorkoutController workoutController;
    private ListView<Workout> listView;

    public WorkoutListView() {
        workoutController = new WorkoutController();
        listView = new ListView<>(workoutController.getWorkouts());
        listView.setCellFactory(param -> new WorkoutListCell(workoutController));

        Button addWorkoutButton = new Button("Add Workout");
        addWorkoutButton.setOnAction(e -> showAddWorkoutDialog());

        setCenter(listView);
        setBottom(addWorkoutButton);
    }

    private void showAddWorkoutDialog() {
        AddWorkoutView addWorkoutView = new AddWorkoutView(workoutController);
        addWorkoutView.show();
    }
}