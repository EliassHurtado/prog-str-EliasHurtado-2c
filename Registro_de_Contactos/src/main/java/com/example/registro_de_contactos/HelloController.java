package com.example.registro_de_contactos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML private TextField txtNombre;
    @FXML private TextField txtTelefono;
    @FXML private ComboBox<String> cbParentesco;
    @FXML private ListView<Contacto> listView;

    private ObservableList<Contacto> listaContactos = FXCollections.observableArrayList();
    private final String[] opciones = {"Padre", "Madre", "Hermano", "Hermana", "Abuelo", "Abuela", "Tío", "Tía"};

    @FXML
    public void initialize() {
        cbParentesco.getItems().addAll(opciones);
        listView.setItems(listaContactos);
    }

    @FXML
    protected void onAgregarClick() {
        String nom = txtNombre.getText();
        String tel = txtTelefono.getText();
        String par = cbParentesco.getValue();

        if (validar(nom, tel, par)) {
            if (listaContactos.stream().anyMatch(c -> c.getNombre().equalsIgnoreCase(nom))) {
                mostrarAlerta("Error", "Ese nombre ya existe.");
            } else {
                listaContactos.add(new Contacto(nom, tel, par));
                onLimpiarClick();
            }
        }
    }

    @FXML
    protected void onBuscarClick() {
        for (Contacto c : listaContactos) {
            if (c.getNombre().equalsIgnoreCase(txtNombre.getText())) {
                txtTelefono.setText(c.getTelefono());
                cbParentesco.setValue(c.getParentesco());
                return;
            }
        }
        mostrarAlerta("Info", "No se encontró el contacto.");
    }

    @FXML
    protected void onActualizarClick() {
        for (int i = 0; i < listaContactos.size(); i++) {
            if (listaContactos.get(i).getNombre().equalsIgnoreCase(txtNombre.getText())) {
                if (validar(txtNombre.getText(), txtTelefono.getText(), cbParentesco.getValue())) {
                    listaContactos.set(i, new Contacto(txtNombre.getText(), txtTelefono.getText(), cbParentesco.getValue()));
                    listView.refresh();
                }
                return;
            }
        }
    }

    @FXML
    protected void onEliminarClick() {
        listaContactos.removeIf(c -> c.getNombre().equalsIgnoreCase(txtNombre.getText()));
        onLimpiarClick();
    }

    @FXML
    protected void onLimpiarClick() {
        txtNombre.clear();
        txtTelefono.clear();
        cbParentesco.setValue(null);
    }

    private boolean validar(String n, String t, String p) {
        if (n.isEmpty() || t.isEmpty() || p == null) {
            mostrarAlerta("Error", "Faltan datos.");
            return false;
        }
        if (t.length() != 10 || !t.matches("\\d+")) {
            mostrarAlerta("Error", "Teléfono debe ser de 10 dígitos.");
            return false;
        }
        return true;
    }

    private void mostrarAlerta(String titulo, String msg) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle(titulo); a.setHeaderText(null); a.setContentText(msg); a.show();
    }
}