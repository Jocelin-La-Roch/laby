package com.example.laby.model;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Piece extends ImageView {

    public void moveLeft(){}
    public void moveRight(){
        this.setX(this.getX() + 50);
    }
    public void moveUp(){}
    public void moveDown(){}
}
