# Controles DatePicker y ColorPicker

## Descripción
El proyecto PickerFeijoo es una aplicación JavaFX sencilla que permite a los usuarios seleccionar una fecha y un color. Luego, muestra la fecha y el color seleccionados en la consola. Es una excelente demostración de cómo usar los controles DatePicker y ColorPicker en JavaFX.

## Requisitos
Java 8 o superior
JavaFX

## Instalación
Para ejecutar este proyecto, necesitas tener instalado lo siguiente:

- [Java Development Kit (JDK) 8 o superior](https://www.oracle.com/java/technologies/javase-downloads.html)
- [JavaFX SDK](https://gluonhq.com/products/javafx/)

## Estructura del Código
#### Clase Principal
La clase principal del proyecto es FechaColorPicker, que extiende Application de JavaFX. Contiene el método start, que se encarga de configurar la interfaz de usuario y gestionar los eventos.

#### Método start
Este método se ejecuta cuando la aplicación comienza y se encarga de configurar la ventana principal (Stage), los controles, el layout, y la escena.

#### Configuración del Stage
```java
primaryStage.setTitle("Date and Color Picker");
```
Aquí establezco el título de la ventana principal.

#### Creación de Controles
```java
Label dateLabel = new Label("Selecciona una fecha:");
DatePicker datePicker = new DatePicker();
        
Label colorLabel = new Label("Selecciona un color:");
ColorPicker colorPicker = new ColorPicker();
        
Button confirmButton = new Button("Confirmar Selección");
```
Aquí creo los controles básicos de la interfaz: dos etiquetas (Label), un selector de fechas (DatePicker), un selector de colores (ColorPicker), y un botón (Button).

#### Acción del botón
```java
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
```
Defino lo que sucede cuando se presiona el botón. Verifico si se ha seleccionado una fecha y un color, y luego imprimo las selecciones en la consola.

#### Configuración del Layout
```java
VBox vbox = new VBox(10);
vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton);
```
Configuro un layout vertical (VBox) con un espacio de 10 píxeles entre los elementos. Luego, añado todos los controles al layout.

#### Configuración de la Escena
```java
Scene scene = new Scene(vbox, 300, 200);
primaryStage.setScene(scene);
primaryStage.show();
```
Creo una escena con el layout configurado y la establezco en el Stage principal. Finalmente, muestro la ventana principal.

#### Método main
```
public static void main(String[] args) {
    launch(args);
}
```
El método main lanza la aplicación JavaFX.

## Ejecucción
Para ejecutar esta aplicación, simplemente compila y ejecuta la clase FechaColorPicker. Aparecerá una ventana donde podrás seleccionar una fecha y un color, y al presionar el botón "Confirmar Selección", las selecciones se mostrarán en la consola.
![Captura de pantalla 2024-06-08 224426](https://github.com/DiegoFeijoo55/Controles-DatePicker-y-ColorPicker/assets/169406880/2cb0721c-ed6b-44d6-86eb-3cbddd82ddac)
![Captura de pantalla 2024-06-08 224704](https://github.com/DiegoFeijoo55/Controles-DatePicker-y-ColorPicker/assets/169406880/4f83a96a-0352-48d0-b576-4192adbafd6b)
