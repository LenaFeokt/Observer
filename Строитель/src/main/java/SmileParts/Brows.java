package SmileParts;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Brows extends Line {
    public Brows(){
        setStroke(Color.BLACK);
        super.setStrokeWidth(2);
    }
    public void HappyLeftBrow(){
        super.setStartY(30);
        super.setEndY(30);

        super.setStartX(400 / 2 - 65);
        super.setEndX(400 / 2 - 25);
    }

    public void HappyRightBrow(){
        super.setStartY(30);
        super.setEndY(30);

        super.setStartX(400 / 2 + 20);
        super.setEndX(400 / 2 + 60);
    }

    public void AngryLeftBrow(){
        super.setStartY(30);
        super.setEndY(40);

        super.setStartX(400 / 2 - 65);
        super.setEndX(400 / 2 - 25);
    }
    public void AngryRightBrow(){
        super.setStartY(40);
        super.setEndY(30);

        super.setStartX(400 / 2 + 20);
        super.setEndX(400 / 2 + 60);
    }

    public void SadLeftBrow(){
        super.setStartY(40);
        super.setEndY(25);

        super.setStartX(400 / 2 - 65);
        super.setEndX(400 / 2 - 25);
    }

    public void SadRightBrow(){
        super.setStartY(25);
        super.setEndY(30);

        super.setStartX(400 / 2 + 20);
        super.setEndX(400 / 2 + 60);
    }
}