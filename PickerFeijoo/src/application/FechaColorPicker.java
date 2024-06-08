package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class FechaColorPicker extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Date and Color Picker");

        // Crear los controles
        Label dateLabel = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();
        
        Label colorLabel = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();
        
        Button confirmButton = new Button("Confirmar Selección");
        
        // Acción al presionar el botón
        confirmButton.setOnAction(e -> {
            if (datePicker.getValue() != null) {
                System.out.println("Fecha seleccionada: " + datePicker.getValue().toString());
            } else {
                System.out.println("No se ha seleccionado ninguna fecha.");
            }
            Color color = colorPicker.getValue();
            if (color != null) {
                System.out.println("Color seleccionado: " + color.toString());
            } else {
                System.out.println("No se ha seleccionado ningún color.");
            }
        });

        // Configurar el layout
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton);
        
        // Configurar la escena
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

