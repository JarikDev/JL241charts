package com;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Grapefruit", 13),
                new PieChart.Data("Orange", 25),
                new PieChart.Data("Plums", 10),
                new PieChart.Data("Pear", 22),
                new PieChart.Data("Apples", 30));
        PieChart chart=new PieChart(pieChartData);
        chart.setTitle("Title");

        Group root = new Group();
        root.getChildren().add(chart);
        primaryStage.setTitle("Charts");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }
}






























