package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;


	Human Lenin;

	 KeyBoardManager inputProcessor = new KeyBoardManager();

	@Override
	public void create () {

		Gdx.input.setInputProcessor(inputProcessor);
		batch = new SpriteBatch();
		Lenin = new Human(100,100);


	}

	@Override
	public void render () {
		if(inputProcessor.getDirection().dir == KeyBoardManager.Directions.LEFT){
			Lenin.texture=new Texture("lenin_left.png");
			System.out.println(Lenin.texture.getTextureData());
			System.out.println(inputProcessor.getDirection().dir);
		}else
		if(inputProcessor.getDirection().dir == KeyBoardManager.Directions.RIGHT){
			Lenin.texture=new Texture("lenin_right.png");
			System.out.println(Lenin.texture.getTextureData());
			System.out.println(inputProcessor.getDirection().dir);
		}else
		if(inputProcessor.getDirection().dir == KeyBoardManager.Directions.UP){
			Lenin.texture=new Texture("lenin_up.png");
			System.out.println(Lenin.texture.getTextureData());
			System.out.println(inputProcessor.getDirection().dir);
		}else
		if(inputProcessor.getDirection().dir == KeyBoardManager.Directions.DOWN){
			Lenin.texture=new Texture("lenin_down.png");
			System.out.println(Lenin.texture.getTextureData());
			System.out.println(inputProcessor.getDirection().dir);
		}
		Lenin.moveTo(inputProcessor.getDirection().pos);
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		Lenin.render(batch);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		Lenin.dispose();
	}
}


