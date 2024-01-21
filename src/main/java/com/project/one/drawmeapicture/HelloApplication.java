// Package declaration indicating the location of the Java class within the project structure
package com.project.one.drawmeapicture;

// Import necessary JavaFX classes for building graphical applications
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;

// Class declaration for the JavaFX application, extending the Application class
public class HelloApplication extends Application {

    // The main method called when launching the JavaFX application
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        // Create a Pane to hold the shapes
        Pane root = new Pane();

        // Create a background gradient
        Stop[] stops = new Stop[]{new Stop(0, Color.DARKBLUE), new Stop(1, Color.BLACK)};
        LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        root.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, #2e3b4e, #16253d);");

        // Sun
        Circle sun = new Circle(50, Color.YELLOW);
        sun.setCenterX(100);
        sun.setCenterY(100);

        // Mountains
        Polygon mountain1 = new Polygon(200, 300, 400, 100, 600, 300);
        mountain1.setFill(Color.DARKSLATEGRAY);

        Polygon mountain2 = new Polygon(400, 300, 600, 100, 800, 300);
        mountain2.setFill(Color.DARKSLATEGRAY);

        // Clouds
        Circle cloud1 = new Circle(250, 50, 30, Color.WHITE);
        Circle cloud2 = new Circle(300, 80, 40, Color.WHITE);
        Circle cloud3 = new Circle(350, 50, 30, Color.WHITE);

        // House
        Rectangle houseBody = new Rectangle(500, 200, 150, 150);
        houseBody.setFill(Color.BROWN);

        Polygon roof = new Polygon(500, 200, 625, 100, 650, 200);
        roof.setFill(Color.RED);

        Rectangle door = new Rectangle(550, 250, 50, 100);
        door.setFill(Color.SADDLEBROWN);

        Circle window = new Circle(600, 275, 20, Color.LIGHTBLUE);

        // Tree
        Rectangle trunk = new Rectangle(750, 250, 20, 80);
        trunk.setFill(Color.SIENNA);

        Circle leaves = new Circle(760, 230, 40, Color.DARKGREEN);

        // Flower
        Circle flowerCenter = new Circle(300, 350, 10, Color.YELLOW);
        Circle petal1 = new Circle(300, 340, 15, Color.PINK);
        Circle petal2 = new Circle(310, 350, 15, Color.PINK);
        Circle petal3 = new Circle(300, 360, 15, Color.PINK);
        Circle petal4 = new Circle(290, 350, 15, Color.PINK);

        // Butterfly
        Polygon butterflyBody = new Polygon(500, 350, 510, 340, 520, 350, 510, 360);
        butterflyBody.setFill(Color.PURPLE);
        Line wing1 = new Line(505, 345, 495, 335);
        Line wing2 = new Line(515, 345, 525, 335);

        // Additional Shapes
        Ellipse ellipse = new Ellipse(100, 300, 30, 20);
        ellipse.setFill(Color.LIGHTSTEELBLUE);

        Rectangle rectangle = new Rectangle(50, 400, 80, 40);
        rectangle.setFill(Color.LIGHTGREEN);

        Circle circle2 = new Circle(200, 400, 25, Color.DARKORANGE);

        // Oval
        Ellipse oval = new Ellipse(700, 400, 30, 20);
        oval.setFill(Color.MEDIUMVIOLETRED);

        // Draw a car
        Rectangle carBody = new Rectangle(50, 600, 200, 50);
        carBody.setFill(Color.BLUE);

        Rectangle carRoof = new Rectangle(70, 550, 160, 50);
        carRoof.setFill(Color.BLUE);

        Circle frontWheel = new Circle(80, 650, 15, Color.BLACK);
        Circle rearWheel = new Circle(170, 650, 15, Color.BLACK);

        // Draw a rocket
        Polygon rocketBody = new Polygon(400, 600, 450, 550, 500, 600, 500, 700, 450, 750, 400, 700);
        rocketBody.setFill(Color.RED);

        Polygon rocketTop = new Polygon(450, 530, 470, 490, 490, 530);
        rocketTop.setFill(Color.YELLOW);

        Rectangle rocketWindow = new Rectangle(460, 580, 10, 10);
        rocketWindow.setFill(Color.LIGHTBLUE);

        // Draw the head
        Circle head = new Circle(100, 500, 20, Color.LIGHTSKYBLUE);

        // Draw the body
        Rectangle body = new Rectangle(90, 520, 20, 40);
        body.setFill(Color.LIGHTGREEN);

        // Draw the arms
        Line leftArm = new Line(70, 530, 90, 530);
        Line rightArm = new Line(110, 530, 130, 530);

        // Draw the legs
        Line leftLeg = new Line(90, 560, 90, 590);
        Line rightLeg = new Line(110, 560, 110, 590);

        //Draw the arc
        Arc arc = new Arc(700, 500, 30, 50, 45, 270);
        arc.setFill(Color.ORANGE);
        //root.getChildren().add(arc);

        // Draw the line
        Line line = new Line(200, 500, 300, 500);
        line.setStrokeWidth(3);
        line.setStroke(Color.DARKSLATEGRAY);
        //root.getChildren().add(line);

        Polygon polygon = new Polygon(500, 400, 550, 350, 600, 400, 550, 450);
        polygon.setFill(Color.DARKGREEN);
        //root.getChildren().add(polygon);

        root.getChildren().addAll(
                sun, mountain1, mountain2, cloud1, cloud2, cloud3,
                houseBody, roof, door, window,
                trunk, leaves,
                flowerCenter, petal1, petal2, petal3, petal4,
                butterflyBody, wing1, wing2,
                ellipse, rectangle, circle2, oval,
                carBody, carRoof, frontWheel, rearWheel,
                rocketBody, rocketTop, rocketWindow,
                head, body, leftArm, rightArm, leftLeg, rightLeg,
                arc, line, polygon
        );

        // Create the scene and set it to the stage
        Scene scene = new Scene(root, 1000, 900);
        primaryStage.setTitle("Draw me a Picture");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
