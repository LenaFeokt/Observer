package SmileParts;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Head extends Circle {

    public Head(){
        super(100);
        setCenterX(400 / 2);
        setCenterY(200 / 2);
    }

    public void sadSmiley(){
        setFill(Color.GREEN);
    }
    public void HappySmiley(){
        setFill(Color.YELLOW);
    }

    public void angrySmiley(){
        setFill(Color.RED);
    }
}