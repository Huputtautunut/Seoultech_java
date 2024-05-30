package com.example.finalproject;

import java.time.LocalDate;

public class Workout {
    private String type;
    private LocalDate date;
    private int duration; // Duration in minutes
    private int caloriesBurned;

    public Workout(String type, LocalDate date, int duration, int caloriesBurned) {
        this.type = type;
        this.date = date;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}