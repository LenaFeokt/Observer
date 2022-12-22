package model;

import SmileParts.Brows;
import SmileParts.Eyes;
import SmileParts.Head;
import SmileParts.Mouth;
import javafx.scene.layout.Pane;


public class smileAgrigator extends Pane {

    public void setHead(Head head) {
        getChildren().add(head);
    }

    public void setEyes(Eyes[] eyes) {
        for (Eyes eye : eyes) {
            getChildren().add(eye);
        }
    }

    public void setMouth(Mouth mouth) {
        getChildren().add(mouth);
    }

    public void setBrows(Brows[] brows) {
        for (Brows brow : brows) {
            getChildren().addAll(brow);
        }
    }
}
