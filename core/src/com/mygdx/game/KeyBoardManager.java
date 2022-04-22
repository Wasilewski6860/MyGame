package com.mygdx.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;

import java.util.Vector;

//public class KeyBoardManager extends InputAdapter {
//
//    boolean leftPressed;
//    boolean rightPressed;
//    boolean upPressed;
//    boolean downPressed;
//    Vector2 position;
//
//    @Override
//    public boolean keyDown(int keycode) {
//        if (keycode == Input.Keys.W) upPressed= true;
//        if (keycode == Input.Keys.A) leftPressed= true;
//        if (keycode == Input.Keys.S) downPressed= true;
//        if (keycode == Input.Keys.D) rightPressed= true;
//        return false;
//    }
//
//    @Override
//    public boolean keyUp(int keycode) {
//        if (keycode == Input.Keys.W) upPressed= false;
//        if (keycode == Input.Keys.A) leftPressed= false;
//        if (keycode == Input.Keys.S) downPressed= false;
//        if (keycode == Input.Keys.D) rightPressed= false;
//        return false;
//    }
//
//
//
//    public Vector2 getPosition(){
//        return position;
//    }
//
//
//    public Vector2 getDirection() {
//        position.set(0,0);
//
//        if (leftPressed) position.add(-5, 0);
//        if (rightPressed) position.add(5, 0);
//        if (upPressed) position.add(0, 5);
//        if (downPressed) position.add(0, -5);
//
//        return position;
//    }
//
//}


class Value{

  KeyBoardManager.Directions dir;
  Vector2 pos;

  public Value(KeyBoardManager.Directions dir,Vector2 pos){
      this.dir=dir;
      this.pos=pos;
  }
}

public class KeyBoardManager extends InputAdapter {

    enum Directions{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    Directions side;
    private boolean leftPressed;
    private boolean rightPressed;
    private boolean upPressed;
    private boolean downPressed;

    private final Vector2 mousePos = new Vector2();
    private final Vector2 direction = new Vector2();

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.A) {leftPressed = true; side=Directions.LEFT; }
        if (keycode == Input.Keys.D)  { rightPressed = true; side=Directions.RIGHT; }
        if (keycode == Input.Keys.W)  { upPressed = true; side=Directions.UP; }
        if (keycode == Input.Keys.S) { downPressed = true; side=Directions.DOWN; }

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.A) leftPressed = false;
        if (keycode == Input.Keys.D) rightPressed = false;
        if (keycode == Input.Keys.W) upPressed = false;
        if (keycode == Input.Keys.S) downPressed = false;

        return false;
    }



    public Value getDirection() {
        direction.set(0, 0);

        if (leftPressed) {direction.add(-5, 0); side=Directions.LEFT;}
        if (rightPressed) { direction.add(5, 0); side=Directions.RIGHT;}
        if (upPressed) { direction.add(0, 5);  side=Directions.UP; }
        if (downPressed) { direction.add(0, -5);  side=Directions.DOWN; }

        return new Value(side,direction);
    }

    public Vector2 getMousePos() {
        return mousePos;
    }
}
