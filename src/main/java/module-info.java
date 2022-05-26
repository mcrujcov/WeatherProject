module com.example.appshow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appshow to javafx.fxml;
    exports com.example.appshow;
}