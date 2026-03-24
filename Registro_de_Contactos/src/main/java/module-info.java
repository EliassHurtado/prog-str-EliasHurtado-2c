module com.example.registro_de_contactos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.registro_de_contactos to javafx.fxml;
    exports com.example.registro_de_contactos;
}