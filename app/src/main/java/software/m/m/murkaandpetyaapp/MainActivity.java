package software.m.m.murkaandpetyaapp;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Relation relation = new Relation();


    @Override
    protected void onResume() {
        super.onResume();


        CatView catView = new CatView(WorldBeforeActivity.instance.murka, findViewById(R.id.murka));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                relation.run();
            }
        }, 2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
