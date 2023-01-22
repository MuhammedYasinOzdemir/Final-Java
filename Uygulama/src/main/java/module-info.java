module com.example.uygulama {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uygulama to javafx.fxml;
    exports com.example.uygulama;
}