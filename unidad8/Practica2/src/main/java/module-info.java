module org.example.practica2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires static lombok;

    opens org.example.practica2 to javafx.fxml;
    exports org.example.practica2;
    exports org.example.practica2_javafx;
    opens org.example.practica2_javafx to javafx.fxml;
}