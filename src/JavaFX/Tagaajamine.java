package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        final int[] x = {100};
        final int[] y = {100};
        double r = 20;
        Circle circle = new Circle(x[0], y[0], r,  Color.RED);
        pane.getChildren().add(circle);

        circle.setOnMouseEntered(event -> {
            x[0] = (int)(Math.random()*500);
            y[0] = (int)(Math.random()*500);
            circle.setCenterX(x[0]);
            circle.setCenterY(y[0]);
        });

    }
}
