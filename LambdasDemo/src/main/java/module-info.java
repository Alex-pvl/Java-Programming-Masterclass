module com.example.lambdasdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lambdasdemo to javafx.fxml;
    exports com.example.lambdasdemo;
}