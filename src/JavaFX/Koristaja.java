package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        Label label = new Label("Palju õnne!");
        label.setLayoutX(200);
        label.setLayoutY(250);
        pane.getChildren().add(label);

        for (int i = 0; i < 500; i++) {
            int centerX = (int)(Math.random()*500);
            int centerY = (int)(Math.random()*500);
            Circle circle = new Circle(centerX, centerY, 50);
            pane.getChildren().add(circle);
            circle.setFill(Color.RED);
            circle.setOnMouseEntered(e-> {
                pane.getChildren().remove(circle);
            });

        }
    }
}
