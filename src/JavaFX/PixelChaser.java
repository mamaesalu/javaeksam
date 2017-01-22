package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        for (int i = 0; i < 20; i++) {
            final int[] x = {(int) (Math.random() * 500)};
            final int[] y = {(int) (Math.random() * 500)};
            final int[] width = {50};
            final int[] heigth = {20};
            final int[] count = {0};
            Rectangle rect = new Rectangle(width[0], heigth[0]);
            rect.setX(x[0]);
            rect.setY(y[0]);
            pane.getChildren().add(rect);
            rect.setFill(Color.RED);
            rect.setOnMouseClicked(event -> {
                if (count[0] == 0){
                    width[0] = width[0] /2;
                    heigth[0] = heigth[0] /2;
                    rect.setHeight(heigth[0]);
                    rect.setWidth(width[0]);
                    count[0]++;
                }
                else if (count[0] == 1) {
                    pane.getChildren().remove(rect);
                }
            });
        }
    }
}
