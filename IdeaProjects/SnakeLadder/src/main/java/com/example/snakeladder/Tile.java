package com.example.snakeladder;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Tile extends Rectangle {
  public Tile(int size){
      setWidth(size);
      setHeight(size);
      setFill(Color.RED);
      setStroke(Color.BLACK);

  }
}
