module com.example.demo_chatapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_chatapp to javafx.fxml;
    exports com.example.demo_chatapp;
    exports com.example.demo_chatapp.controller;
    opens com.example.demo_chatapp.controller to javafx.fxml;
}