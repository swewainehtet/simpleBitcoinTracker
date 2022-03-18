package com.example.cryptoviewer;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML // fx:id="price";
    Label price;

    @FXML // fx:id="btnDay";
    Button btnDay;

    @FXML // fx:id="btnHour";
    Button btnHour;

    @FXML // fx:id="btnMin";
    Button btnMin;

    @FXML // fx:id="chart";
    LineChart<String, Float> chart;

    @FXML // fx:id="yAxis";
    NumberAxis yAxis;


    public void loadDay() {
        XYChart.Series<String, Float> series = new XYChart.Series<>();
        CryptoPull cp = new CryptoPull();
        ArrayList<ArrayList<String>> data = cp.getDay();
        ArrayList<String> time = data.get(0);
        ArrayList<String> open = data.get(1);
        ArrayList<String> low = data.get(2);
        ArrayList<String> high = data.get(3);
        ArrayList<String> close = data.get(4);
        String lastPrice = null;

        for (int i = 0; i < time.size(); i++) {
            series.getData().add(new XYChart.Data<String, Float>(time.get(i), Float.parseFloat(open.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " low", Float.parseFloat(low.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " high", Float.parseFloat(high.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " close", Float.parseFloat(close.get(i))));
            lastPrice = close.get(i);
        }

        price.setText(lastPrice);
        Platform.runLater(() -> {
            chart.getData().clear();
            chart.getData().setAll(series);
        });
    }

    public void loadHour() {
        XYChart.Series<String, Float> series = new XYChart.Series<>();
        CryptoPull cp = new CryptoPull();
        ArrayList<ArrayList<String>> data = cp.getHour();
        ArrayList<String> time = data.get(0);
        ArrayList<String> open = data.get(1);
        ArrayList<String> low = data.get(2);
        ArrayList<String> high = data.get(3);
        ArrayList<String> close = data.get(4);
        String lastPrice = null;

        for (int i = 0; i < time.size(); i++) {
            series.getData().add(new XYChart.Data<String, Float>(time.get(i), Float.parseFloat(open.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " low", Float.parseFloat(low.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " high", Float.parseFloat(high.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " close", Float.parseFloat(close.get(i))));
            lastPrice = close.get(i);
        }

        price.setText(lastPrice);
        Platform.runLater(() -> {
            chart.getData().clear();
            chart.getData().setAll(series);
        });
    }

    public void loadMin() {
        XYChart.Series<String, Float> series = new XYChart.Series<>();
        CryptoPull cp = new CryptoPull();
        ArrayList<ArrayList<String>> data = cp.getMin();
        ArrayList<String> time = data.get(0);
        ArrayList<String> open = data.get(1);
        ArrayList<String> low = data.get(2);
        ArrayList<String> high = data.get(3);
        ArrayList<String> close = data.get(4);
        String lastPrice = null;

        for (int i = 0; i < time.size(); i++) {
            series.getData().add(new XYChart.Data<String, Float>(time.get(i), Float.parseFloat(open.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " low", Float.parseFloat(low.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " high", Float.parseFloat(high.get(i))));
            series.getData().add(new XYChart.Data<String, Float>(time.get(i) + " close", Float.parseFloat(close.get(i))));
            lastPrice = close.get(i);
        }

        price.setText(lastPrice);
        Platform.runLater(() -> {
            chart.getData().clear();
            chart.getData().setAll(series);
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        yAxis.setForceZeroInRange(false);
        yAxis.setLowerBound(30000);
    }
}