package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.utils.ScreenUtils;

public class inGame implements Screen {

    final MyGdxGame game;
    SpriteBatch batch;
    Sprite terrain,Bg,gamebar,Tank1, Tank2;

    final float viewWidth = 1920;
    final float viewHeight = 1080;

    OrthographicCamera camera;


    public inGame(MyGdxGame game){
        this.game=game;
        batch = new SpriteBatch();
        terrain = new Sprite(new Texture("canyon.png"));
        Bg= new Sprite(new Texture("gameBG.png"));
        gamebar = new Sprite(new Texture("gamebar.png"));
        Tank1 = new Sprite(new Texture("frostInGame.png"));
        Tank2 = new Sprite(new Texture("Tank2.png"));
        camera = new OrthographicCamera(viewWidth, viewHeight);
        camera.position.set(viewWidth/2,viewHeight/2,0);
        batch.begin();
        batch.draw(Tank1,viewWidth/4 - 100,viewHeight/2 - 200,200,120);
        Tank1.setX(viewWidth/4 - 100);
        Tank1.setY(viewHeight/2 - 200);
        batch.end();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1,0,0,1);

        camera.update();
        batch.setProjectionMatrix(camera.combined);
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            Tank1.translateX(-1f);
            System.out.println("left");
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            Tank1.translateX(1f);
            System.out.println("right");
        }
        batch.begin();
        batch.draw(Bg,0,0,viewWidth,viewHeight);
        batch.draw(terrain,0,0, viewWidth,viewHeight/2 - 200);
        batch.draw(Tank1,Tank1.getX(),Tank1.getY(),200,120);
        batch.draw(Tank2,3*viewWidth/4 ,viewHeight/2 - 200,200,120);
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
