package SmileParts;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Eyes extends Circle {
    public Eyes(){

        super(15, Color.BLACK);
    }

    public void LeftEye(){

        super.setCenterX(400 / 2 - 40);
        super.setCenterY(200 / 2 - 20);
    }

    public void RightEye(){

        super.setCenterX(400 / 2 + 40);
        super.setCenterY(200 / 2 - 20);
    }
}
