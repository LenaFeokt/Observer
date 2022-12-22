package Builders;

import SmileParts.Brows;
import SmileParts.Eyes;
import SmileParts.Head;
import SmileParts.Mouth;
import javafx.scene.layout.Pane;
import model.Builder;
import model.smileAgrigator;

public class AngrySmileBuilder implements Builder {
    private smileAgrigator agrigator = new smileAgrigator();

    @Override
    public void buildHead() {
        Head head = new Head();
        head.angrySmiley();
        agrigator.setHead(head);
    }

    @Override
    public void buildBrows() {
        Brows[] browns = new Brows[]{
                new Brows(),
                new Brows()
        };

        browns[0].AngryLeftBrow();
        browns[1].AngryRightBrow();

        agrigator.setBrows(browns);
    }

    @Override
    public void buildEyes() {
        Eyes[] eyes = new Eyes[]{
                new Eyes(),
                new Eyes()
        };

        eyes[0].LeftEye();
        eyes[1].RightEye();

        agrigator.setEyes(eyes);
    }

    @Override
    public void buildMouth() {
        Mouth mouth = new Mouth();
        mouth.AngryMouth();
        agrigator.setMouth(mouth);
    }
    @Override
    public smileAgrigator getSmile() {
        return agrigator;
    }
}
