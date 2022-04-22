package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import java.util.Vector;

//public class Human {
//    Vector2 position = new Vector2();
//    Texture texture;
//
//    public Human(int x, int y, String textureName){
//        texture=new Texture(textureName);
//        position.set(x,y);
//    }
//
//    public Human(int x,int y){
//        this(x,y,"lenin.png");
//    }
//
//    public void render(SpriteBatch batch){
//        batch.draw(texture,position.x,position.y);
//    }
//
//    public void dispose(){
//        texture.dispose();
//    }
//
//    public void move(Vector2 direction){
//        position.add(direction);
//    }
//}


public class Human {
  //  private final float size = 64;
   // private final float halfSize = size / 2;

    private final Vector2 position = new Vector2();


     Texture texture;
    private final TextureRegion textureRegion;

    public Human(float x, float y) {
        this(x, y, "lenin_left.png");
    }

    public Human(float x, float y, String textureName) {
        texture = new Texture(textureName);
        textureRegion = new TextureRegion(texture);
        position.set(x, y);
    }

    public void render(Batch batch) {

        batch.draw(
                textureRegion,
                position.x,
                position.y
        );
    }

    public void dispose() {
        texture.dispose();
    }

    public void moveTo(Vector2 direction) {
        position.add(direction);
    }


    public Vector2 getPosition() {
        return position;
    }
}
