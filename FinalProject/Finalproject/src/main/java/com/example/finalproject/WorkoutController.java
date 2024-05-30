package com.example.finalproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class WorkoutController {
    private ObservableList<Workout> workouts;

    public WorkoutController() {
        workouts = FXCollections.observableArrayList();
    }

    public ObservableList<Workout> getWorkouts() {
        return workouts;
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void removeWorkout(Workout workout) {
        workouts.remove(workout);
    }
}