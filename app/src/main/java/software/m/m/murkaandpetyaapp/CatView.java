package software.m.m.murkaandpetyaapp;

import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by mac on 08.07.17.
 */

public class CatView implements LocationListener{
    private final View image;


    public CatView(Cat cat, View view){
        this.image=view;
        cat.addLocationListener(this);
    }


    @Override
    public void onLocationChange(Object object, String location) {
        ((FrameLayout.LayoutParams)image.getLayoutParams()).gravity = location.equals("forest")?
                Gravity.LEFT | Gravity.BOTTOM :  Gravity.RIGHT| Gravity.BOTTOM;
        image.bringToFront();
    }
}
