package com.example.finaljavfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TabloOlusturma extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TableView<Person> tableView = new TableView<>();

        // Create columns for the table
        TableColumn<Person, String> nameCol = new TableColumn<>("Name");
        TableColumn<Person, String> ageCol = new TableColumn<>("Age");

        // Bind the columns to properties of the Person class
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));

        // Add the columns to the table
        tableView.getColumns().addAll(nameCol, ageCol);

        // Create an ObservableList of Person objects to display in the table
        ObservableList<Person> people = FXCollections.observableArrayList(
                new Person("John", "25"),
                new Person("Sara", "30"),
                new Person("Mike", "35")
        );

        // Set the items for the table to the ObservableList of Person objects
        tableView.setItems(people);

        Pane pane = new Pane(tableView);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}

class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
