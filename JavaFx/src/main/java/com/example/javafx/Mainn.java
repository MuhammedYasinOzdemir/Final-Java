package com.example.javafx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.HashSet;

public class Mainn extends Application {

    Stage window;
    static Scene scene;

    private static char[][] mapa = {
            {'X','X','X','X','X'},
            {'X','.','.','.','X'},
            {'X','.','M','.','X'},
            {'X','.','.','.','X'},
            {'X','X','X','X','X'}
    };

    private final int sizeX = 16;
    private final int sizeY = 16;

    static HashSet<String> currentlyActiveKeys;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Hello World");

        Group root = new Group();
        scene = new Scene(root);

        window.setScene(scene);

        Canvas canvas = new Canvas(512 - 64, 256);
        root.getChildren().add(canvas);

        prepareActionHandlers();

        GraphicsContext gc = canvas.getGraphicsContext2D();

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.clearRect(0,0,512,512);

                for(int i = 0; i < mapa.length; i++) {
                    for(int j = 0; j < mapa[i].length; j++) {
                        if(mapa[i][j] == 'X') {
                            gc.setLineWidth(5);
                            gc.setFill(Color.RED);
                            gc.fillRect(sizeX + i*sizeX, sizeY + j*sizeY, sizeX, sizeY);
                        } else if(mapa[i][j] == '.') {
                            gc.setLineWidth(5);
                            gc.setFill(Color.GREEN);
                            gc.fillRect(sizeX + i*sizeX, sizeY + j*sizeY, sizeX, sizeY);
                        } else if(mapa[i][j] == 'M') {
                            gc.setLineWidth(5);
                            gc.setFill(Color.BLACK);
                            gc.fillRect(sizeX + i*sizeX, sizeY + j*sizeY, sizeX, sizeY);
                        }
                    }
                }

                if(currentlyActiveKeys.contains("LEFT")) {
                    System.out.println("left");
                }

                if(currentlyActiveKeys.contains("RIGHT")) {
                    System.out.println("right");
                }

                if(currentlyActiveKeys.contains("UP")) {
                    System.out.println("up");
                }

                if(currentlyActiveKeys.contains("DOWN")) {
                    System.out.println("down");
                }
            }
        }.start();

        window.show();
    }

    private static void prepareActionHandlers()
    {
        currentlyActiveKeys = new HashSet<String>();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event)
            {
                currentlyActiveKeys.add(event.getCode().toString());

            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event)
            {
                currentlyActiveKeys.remove(event.getCode().toString());

            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}