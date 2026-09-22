package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase Estudiante (Lógica de Negocio / POO)
class Estudiante {
    private String nombre;
    private String matricula;

    // Constructor
    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }
}

// Aplicación Principal de JavaFX (debe llamarse Main para coincidir con Main.java)
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creación de componentes gráficos (Interfaz)
        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField();

        Label lblMatricula = new Label("Matrícula:");
        TextField txtMatricula = new TextField();

        Button btnRegistrar = new Button("Registrar");
        Label lblResultado = new Label();

        // Evento con setOnAction
        btnRegistrar.setOnAction(e -> {
            // Obtención de datos mediante getText()
            String nombre = txtNombre.getText();
            String matricula = txtMatricula.getText();

            // Creación de la instancia del Estudiante usando el Constructor
            Estudiante estudiante = new Estudiante(nombre, matricula);

            // Mostrar el resultado en pantalla usando los Getters
            lblResultado.setText("Registrado: " + estudiante.getNombre() + " | Matrícula: " + estudiante.getMatricula());
        });

        // Contenedor principal VBox
        VBox root = new VBox(10); // Espaciado vertical de 10px
        root.setPadding(new Insets(15));
        root.getChildren().addAll(lblNombre, txtNombre, lblMatricula, txtMatricula, btnRegistrar, lblResultado);

        // Creación de la Escena y Configuración del Escenario
        Scene scene = new Scene(root, 320, 250);
        primaryStage.setTitle("Registro de Estudiante");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}