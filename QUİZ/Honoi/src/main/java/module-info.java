module com.example.honoi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.honoi to javafx.fxml;
    exports com.example.honoi;
}