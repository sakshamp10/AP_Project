package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class inGame implements Screen {

    final MyGdxGame game;
    SpriteBatch batch;
    Texture terrain,Bg,gamebar;


    public inGame(MyGdxGame game){
        this.game=game;
        batch = new SpriteBatch();
        terrain = new Texture("canyon.png");
        Bg= new Texture("gameBG.png");
        gamebar = new Texture("gamebar.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1,0,0,1);
        batch.begin();
        batch.draw(Bg,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        batch.draw(terrain,0,0, Gdx.graphics.getWidth(),2*Gdx.graphics.getHeight()/5-100);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
