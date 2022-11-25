package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.Timer;

import java.util.TimerTask;

public class MyGdxGame extends Game {

	public SpriteBatch batch;
	public BitmapFont font;
	@Override
	public void create () {
		font = new BitmapFont();
		batch = new SpriteBatch();
		this.setScreen(new Loading(this));
//		this.setScreen(new SelectTankPlayerOne(this,1));
	}

	@Override
	public void render () {
		super.render();
//		ScreenUtils.clear(1, 0, 1, 0);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		if(Gdx.input.isTouched()){
//			game.setS
//		}
////		batch.draw(button, 50+Gdx.graphics.getWidth()/2-sprite.getWidth()/2,Gdx.graphics.getHeight()/3-sprite.getHeight()/2);
//		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}
