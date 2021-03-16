package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
//        ColorPicker colorPicker1 = new ColorPicker();
//        colorPicker1.setOnAction(event -> colorPicker1.getValue());
//        HBox hBox = new HBox(colorPicker1);
//        hBox.setStyle("-fx-background-color:#d3d3d3");
        //JavaFX shapes Example:
        //PROBLEM STATEMENT : create a gray rectangle with dimensions 0,0,230,150
        VBox vBox=new VBox();
//        Rectangle rectangle1=new Rectangle(0,0,230,150);
//        rectangle1.setFill(Color.BLUE);
//        vBox.getChildren().add(rectangle1);
        //PROBLEM STATEMENT : create an object named 'sphere' with radius 200. Wrap a 'phongMaterial' onto the sphere and add the sphere to the vBox
        Image image = new Image(Main.class.getResource("image.jpg").toExternalForm());
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.WHITE);
        phongMaterial.setDiffuseMap(image);
        Sphere sphere = new Sphere(200);
        sphere.setMaterial(phongMaterial);
        vBox.getChildren().add(sphere);
        stage.setTitle("JavaFX 3D graphics Example");
        stage.setScene(new Scene(vBox, 400, 400));
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
