package com.example.mathcurve;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {
    private double width = 400;
    private double height = 200;
    private double centerX = width / 2;
    private double centerY = height / 2;
    private double frequency = 8 * Math.PI / width; // Adjusted to fit 8π (4 cycles) in the width

    private boolean movingRight = true;
    private Timeline animation;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Create X and Y axis
        Line xAxis = new Line(0, centerY, width, centerY);
        Line yAxis = new Line(centerX, 0, centerX, height);

        // Create cosine curve
        Polyline cosineCurve = new Polyline();
        for (int x = 0; x <= width; x++) {
            cosineCurve.getPoints().addAll((double) x, centerY - 50 * Math.cos(frequency * x));
        }
        cosineCurve.setStroke(Color.BLUE);

        // Create the ball
        Circle ball = new Circle(5, Color.RED);
        ball.setCenterX(0);
        ball.setCenterY(centerY - 50 * Math.cos(frequency * 0));

        // Add the axis markings
        Text text1 = new Text(140, 115, "-\u03c0");
        Text text2 = new Text(240, 115, "\u03c0");
        Text text3 = new Text(90, 115, "-2\u03c0");
        Text text4 = new Text(290, 115, "2\u03c0");

        // Add elements to the pane
        pane.getChildren().addAll(xAxis, yAxis, cosineCurve, ball, text1, text2, text3, text4);

        // Create the animation
        animation = new Timeline(new KeyFrame(Duration.millis(10), e -> moveBall(ball)));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Handle mouse clicks for pausing/resuming
        pane.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY || event.getButton() == MouseButton.SECONDARY) {
                if (animation.getStatus() == Timeline.Status.RUNNING) {
                    animation.pause();
                } else {
                    animation.play();
                }
            }
        });

        Scene scene = new Scene(pane, width, height);
        primaryStage.setTitle("Cosine Curve Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void moveBall(Circle ball) {
        double x = ball.getCenterX();
        if (movingRight) {
            x += 1;
            if (x >= width) {
                movingRight = false;
            }
        } else {
            x -= 1;
            if (x <= 0) {
                movingRight = true;
            }
        }
        ball.setCenterX(x);
        ball.setCenterY(centerY - 50 * Math.cos(frequency * x));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
