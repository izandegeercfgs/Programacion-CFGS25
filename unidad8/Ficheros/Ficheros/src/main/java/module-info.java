module org.example.ficheros {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ficheros to javafx.fxml;
    exports org.example.ficheros;
}