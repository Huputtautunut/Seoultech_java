package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Market share data
        PieChart.Data[] slices = {
                new PieChart.Data("Apple -- 20%", 20),
                new PieChart.Data("HTC -- 26%", 26),
                new PieChart.Data("Samsung -- 28%", 28),
                new PieChart.Data("Others -- 26%", 26)
        };

        // Create a pie chart
        PieChart pieChart = new PieChart();
        pieChart.getData().addAll(slices);
        pieChart.setTitle("Market Share Distribution");

        // Set slice colors
        pieChart.getData().forEach(data ->
                data.getNode().setStyle("-fx-pie-color: " +
                        switch (data.getName()) {
                            case "Apple -- 20%" -> "red";
                            case "Samsung -- 28%" -> "green";
                            case "HTC -- 26%" -> "blue";
                            default -> "orange";
                        }));

        // Add pie chart to a stack pane
        StackPane root = new StackPane(pieChart);
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pie Chart");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
