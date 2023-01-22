module com.example.finaljavfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finaljavfx to javafx.fxml;
    exports com.example.finaljavfx;
}