module com.example.videostream {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.media;


    opens com.example.videostream to javafx.fxml;
    exports com.example.videostream;
}