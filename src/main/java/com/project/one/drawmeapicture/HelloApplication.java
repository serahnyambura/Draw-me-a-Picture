// Package declaration indicating the location of the Java class within the project structure
package com.project.one.drawmeapicture;

// Import necessary JavaFX packages
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

// Define a class named HouseApp that extends the Application class
public class HelloApplication extends Application {

    // Entry point of the JavaFX application
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    // Override the start method to initialize and display the JavaFX scene
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        // Create a pane to hold the graphical elements
        Pane root = new Pane();

        // House body
        Rectangle houseBody = new Rectangle(50, 150, 200, 150);
        houseBody.setFill(Color.LIGHTBLUE);

        // Roof
        Polygon roof = new Polygon();
        roof.getPoints().addAll(50.0, 150.0, 150.0, 50.0, 250.0, 150.0);
        roof.setFill(Color.RED);

        // Door
        Rectangle door = new Rectangle(120, 200, 60, 100);
        door.setFill(Color.BROWN);

        // Windows
        Rectangle window1 = new Rectangle(70, 170, 40, 40);
        Rectangle window2 = new Rectangle(190, 170, 40, 40);
        window1.setFill(Color.YELLOW);
        window2.setFill(Color.YELLOW);

        // Chimney
        Rectangle chimneyBase = new Rectangle(180, 70, 20, 40);
        Rectangle chimneyTop = new Rectangle(180, 50, 20, 20);
        chimneyBase.setFill(Color.GRAY);
        chimneyTop.setFill(Color.GRAY);

        // Sun
        Circle sun = new Circle(450, 50, 30);
        sun.setFill(Color.YELLOW);

        // Additional shapes
        Circle treeTop = new Circle(400, 250, 20, Color.GREEN);
        Rectangle treeTrunk = new Rectangle(395, 270, 10, 30);

        Ellipse cloud1 = new Ellipse(50, 50, 40, 20);
        Ellipse cloud2 = new Ellipse(90, 50, 40, 20);

        Rectangle fence1 = new Rectangle(10, 250, 10, 30);
        Rectangle fence2 = new Rectangle(30, 250, 10, 30);

        // Car
        Rectangle carBody = new Rectangle(300, 220, 80, 40);
        carBody.setFill(Color.BLUE);
        Polygon carRoof = new Polygon(300, 220, 340, 200, 380, 220);
        carRoof.setFill(Color.DARKBLUE);

        // People
        Circle person1Head = new Circle(100, 250, 10, Color.YELLOW);
        Rectangle person1Body = new Rectangle(95, 260, 10, 20);

        Circle person2Head = new Circle(120, 250, 10, Color.YELLOW);
        Rectangle person2Body = new Rectangle(115, 260, 10, 20);

        // Swimming pool
        Rectangle pool = new Rectangle(250, 200, 80, 50);
        pool.setFill(Color.LIGHTBLUE);

        // Animals
        Circle fish1 = new Circle(270, 220, 5, Color.ORANGE);
        Circle fish2 = new Circle(260, 230, 5, Color.ORANGE);

        Polygon bird = new Polygon(430, 100, 440, 90, 450, 100);
        bird.setFill(Color.PURPLE);

        // Add all shapes to the root pane
        root.getChildren().addAll(
                houseBody, roof, door, window1, window2, chimneyBase, chimneyTop, sun,
                treeTop, treeTrunk, cloud1, cloud2, fence1, fence2,
                carBody, carRoof,
                person1Head, person1Body,
                person2Head, person2Body,
                pool,
                fish1, fish2,
                bird);

        // Create a scene with the specified dimensions
        Scene scene = new Scene(root, 800, 600);

        // Set the scene for the primaryStage and display the window
        primaryStage.setScene(scene);
        primaryStage.setTitle("Draw me a Picture");
        primaryStage.show();
    }
}
