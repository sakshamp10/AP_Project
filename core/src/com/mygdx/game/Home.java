package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;

public class Home implements Screen {

    final MyGdxGame game;
    SpriteBatch batch;
    OrthographicCamera camera;
    Sprite img2,img,frost,logo;
    Sprite bg,match,menu,exit;

    final float viewWidth = 1920;
    final float viewHeight = 1080;
    public Home(MyGdxGame game){
        this.game=game;
        batch= new SpriteBatch();
        img= new Sprite(new Texture("MenuBG.png"));
        img2 = new Sprite(new Texture("menuBG2.png"));
        frost = new Sprite(new Texture("frost.png"));
        logo = new Sprite(new Texture("logo.png"));
        match = new Sprite(new Texture("1v1.png"));
        menu = new Sprite(new Texture("MenuSettings.png"));
        exit = new Sprite(new Texture("Exit.png"));
        camera = new OrthographicCamera(viewWidth, viewHeight);
        camera.position.set( viewWidth/2,viewHeight/2,0);
    }

    public void render(float delta){
        ScreenUtils.clear(0,0,0,1);
        camera.update();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(img,0,0,2*viewWidth/3,viewHeight);
        batch.draw(frost,viewWidth/3-290,viewHeight/3-110,viewWidth/4,viewHeight/3);
        batch.draw(logo,viewWidth/3-190,viewHeight/3+400,450,240);
        batch.draw(img2,2*viewWidth/3,0,viewWidth/3,viewHeight);
        batch.draw(match,2*viewWidth/3+100,100+viewHeight/2);
        batch.draw(menu,2*viewWidth/3+100,viewHeight/2-200);
        batch.draw(exit,2*viewWidth/3+100,viewHeight/2-500);
        if(Gdx.input.isTouched()){
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(),Gdx.input.getY(),0);
            System.out.println(touchPos.x+ " "+ touchPos.y);
            if(touchPos.x<=2368 && touchPos.x>=1910 && touchPos.y>=342 && touchPos.y<=490){
                game.setScreen(new inGame(game));
                dispose();
            }
            else if(touchPos.x<=2368 && touchPos.x>=1910 && touchPos.y>=642 && touchPos.y<=793){
                //settings
            }
            else if(touchPos.x<=2368 && touchPos.x>=1910 && touchPos.y>=942 && touchPos.y<=1095){
                //exit
            }

        }


        if(Gdx.input.isTouched()){

        }
        batch.end();
    }

    public void show(){

    }

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
    public void dispose(){
        batch.dispose();
        img.getTexture().dispose();
        img2.getTexture().dispose();
        frost.getTexture().dispose();
        logo.getTexture().dispose();
    }
}
