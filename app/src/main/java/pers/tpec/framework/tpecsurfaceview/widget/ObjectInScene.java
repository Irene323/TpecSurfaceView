package pers.tpec.framework.tpecsurfaceview.widget;

import android.graphics.Canvas;
import android.view.MotionEvent;

import pers.tpec.framework.tpecsurfaceview.scene.Scene;

/**
 * Created by Tony on 2017/8/28.
 */

public abstract class ObjectInScene {
    public void logic(){

    }

    public void draw(Canvas canvas){

    }

    public boolean onTouch(MotionEvent event) {
        return false;
    }
}
