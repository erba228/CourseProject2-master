package com.example.courseproject2.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Click {
    private TranslateTransition tt;

    public Click(Node node){
        tt = new TranslateTransition(Duration.millis(150), node);
        tt.setFromY(0f);
        tt.setByY(3f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);
    }

    public void playAnim(){
        tt.playFromStart();
    }
}
