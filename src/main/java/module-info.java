module com.example.cryptoviewer {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.cryptoviewer to javafx.fxml;
    exports com.example.cryptoviewer;
}