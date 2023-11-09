package com.example.mylab15;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        BorderPane borderPane= new BorderPane();

        Button btk= new Button("Next");
        borderPane.setBottom(btk);
        BorderPane.setAlignment(btk,Pos.CENTER);
        int n = (int) (Math.random() * 3);
        ArrayList<Image> myImages = new ArrayList<>();
        Image img1 = new Image("C:\\\\Users\\\\denaa\\\\OneDrive\\\\Desktop\\\\javaprojects\\\\pics\\\\download.jpg");
        Image img2 = new Image("C:\\\\Users\\\\denaa\\\\OneDrive\\\\Desktop\\\\javaprojects\\\\pics\\\\download (1).jpg");
        Image img3 = new Image("C:\\\\Users\\\\denaa\\\\OneDrive\\\\Desktop\\\\javaprojects\\\\pics\\\\d.jpg");

        myImages.add(img1);
        myImages.add(img2);
        myImages.add(img3);

        ImageView theSelectedImage = new ImageView(myImages.get(n));
        pane.getChildren().add(theSelectedImage);
        borderPane.setCenter(pane);

        btk.setOnAction(event -> {
            int newNum= (int) (Math.random() * myImages.size());
            theSelectedImage.setImage(myImages.get(newNum));
        });

        Scene scene = new Scene(borderPane);
        stage.setTitle("Random Pictures");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

