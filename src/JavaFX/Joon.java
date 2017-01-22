package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox(4);
        Scene input = new Scene(vbox, 500, 500);
        TextField algusx = new TextField("Sisesta alguspunkti x");
        TextField algusy = new TextField("Sisesta alguspunkti y");
        TextField endx = new TextField("Sisesta lõpp-punkti x");
        TextField endy = new TextField("Sisesta lõpp-punkti y");
        Button button = new Button("Submit");

        vbox.getChildren().addAll(algusx, algusy, endx, endy, button);

        primaryStage.setScene(input);
        primaryStage.show();

        button.setOnMouseClicked(event -> {
            int x = Integer.parseInt(algusx.getText());
            int y = Integer.parseInt(algusy.getText());
            int x2 = Integer.parseInt(endx.getText());
            int y2 = Integer.parseInt(endy.getText());

            Pane pane = new Pane();
            Scene joon = new Scene(pane, 500, 500);
            Line line = new Line(x, y, x2, y2);
            line.setFill(Color.RED);
            pane.getChildren().add(line);
            primaryStage.setScene(joon);
        });

    }
}
