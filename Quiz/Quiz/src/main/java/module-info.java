module com.example.quiz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.quiz to javafx.fxml;
    exports com.example.quiz;
}