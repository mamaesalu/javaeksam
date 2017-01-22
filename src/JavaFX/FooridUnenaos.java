package JavaFX;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        for (int i = 0; i < 20; i++) {
            int centerX = (int)(Math.random()*500);
            int centerY = (int)(Math.random()*500);
            Circle circle = new Circle(centerX, centerY, 50);
            pane.getChildren().add(circle);
            circle.setFill(Color.RED);
            circle.setOnMouseEntered(e-> {
                circle.setFill(Color.GREEN);
            });
            circle.setOnMouseExited(e-> {
                circle.setFill(Color.RED);
            });
        }
    }
}
