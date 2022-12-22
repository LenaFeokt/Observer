package task.v.builder;

import Builders.AngrySmileBuilder;
import Builders.HappySmileBuilder;
import Builders.SadSmileBuilder;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.Director;
import model.smileAgrigator;

public class HelloController {
    @FXML
    Director director = new Director();
    @FXML
    VBox vb;
    smileAgrigator agrigator;

    public void OnButtonSad() {
        vb.getChildren().clear();
        agrigator = director.build(new SadSmileBuilder());

        vb.getChildren().add(agrigator);
    }

    public void OnButtonHappy() {
        vb.getChildren().clear();

        agrigator = director.build(new HappySmileBuilder());
        vb.getChildren().add(agrigator);
    }

    public void OnButtonAngry() {
        vb.getChildren().clear();

        agrigator = director.build(new AngrySmileBuilder());
        vb.getChildren().add(agrigator);
    }
    public void OnButtonClear() {
        vb.getChildren().clear();
    }
}