package com.example.laby;

import com.example.laby.model.Piece;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private AnchorPane anchorPane = new AnchorPane();

    @FXML
    private ImageView tileToPlay = new ImageView();

    @FXML
    private ImageView tempTile = new ImageView();

    @FXML
    private GridPane gridPane = new GridPane();

    @FXML
    private ImageView imageView00;
    @FXML
    private ImageView imageView01;
    @FXML
    private ImageView imageView02;
    @FXML
    private ImageView imageView03;
    @FXML
    private ImageView imageView04;
    @FXML
    private ImageView imageView05;
    @FXML
    private ImageView imageView06;

    @FXML
    BorderPane borderPane;

    @FXML
    protected void moveRectangle() {
        for (Node imageView: anchorPane.getChildren()){
            if(imageView.getLayoutY() == 0){
                if(imageView.getLayoutX() + 50 >= 350){
                    Image image = tileToPlay.getImage();
                    var imageName = image.getUrl().split("/");
                    System.out.println("URL : " + imageName[imageName.length -1]);
                    double rotate = imageView.getRotate();
                    tileToPlay.setImage(((ImageView)imageView).getImage());
                    ((ImageView)imageView).setImage(image);
                    imageView.setRotate(tileToPlay.getRotate());
                    imageView.setLayoutX(0);
                    tileToPlay.setRotate(rotate);
                    //anchorPane.getChildren().removeAll(imageView);
                }else{
                    imageView.setLayoutX(imageView.getLayoutX() + 50);
                }
            }
        }

        /*((Piece)piece).moveRight();
        imageView01.setX(imageView01.getX()+50);
        imageView02.setX(imageView02.getX()+50);
        imageView03.setX(imageView03.getX()+50);
        imageView04.setX(imageView04.getX()+50);
        imageView05.setX(imageView05.getX()+50);
        imageView06.setX(imageView06.getX()+50);*/
    }

    @FXML
    protected void roteTile() {
        tileToPlay.setRotate(tileToPlay.getRotate() + 90);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();
        rectangle1.setWidth(10);
        rectangle2.setHeight(10);
        rectangle3.setWidth(10);
        rectangle4.setHeight(10);
        rectangle1.setFill(Color.rgb(32, 32, 32));
        rectangle2.setFill(Color.rgb(32, 32, 32));
        rectangle3.setFill(Color.rgb(32, 32, 32));
        rectangle4.setFill(Color.rgb(32, 32, 32));
        borderPane.setLeft(rectangle1);
        borderPane.setTop(rectangle2);
        borderPane.setRight(rectangle3);
        borderPane.setBottom(rectangle4);
    }
}