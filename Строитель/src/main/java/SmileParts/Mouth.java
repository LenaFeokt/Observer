package SmileParts;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Mouth extends Arc {
    public Mouth(){

    }

    public void SadMouth(){
        setCenterX(400 / 2);
        setCenterY(200 / 2 + 65);
        setRadiusX(40.0f);
        setRadiusY(40.0f);

        setStartAngle(0f);
        setLength(180.0f);

        setFill(null);
        setStroke(Color.BLACK);
        setStrokeWidth(5);
        setType(ArcType.OPEN);
    }

    public void AngryMouth(){
        setCenterX(400 / 2);
        setCenterY(200 / 2 + 20);
        setRadiusX(40.0f);
        setRadiusY(40.0f);

        setStartAngle(-180f);
        setLength(180.0f);

        setStroke(Color.BLACK);
        setStrokeWidth(5);
        setType(ArcType.CHORD);
    }

    public void HappyMouth(){
        setCenterX(400 / 2);
        setCenterY(200 / 2 + 20);
        setRadiusX(40.0f);
        setRadiusY(40.0f);

        setStartAngle(-180f);
        setLength(180.0f);

        setFill(null);
        setStroke(Color.BLACK);
        setStrokeWidth(5);
        setType(ArcType.OPEN);
    }
}