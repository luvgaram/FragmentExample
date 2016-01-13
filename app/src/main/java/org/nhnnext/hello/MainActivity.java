package org.nhnnext.hello;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements SubFragment.FragmentChangeCallback{

    SubFragment fragment;
    SubFragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new SubFragment();
        fragment2 = new SubFragment2();

        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();

//        FrameLayout container = (FrameLayout) findViewById(R.id.container);
//        SubLayout layout = new SubLayout(this);
//        container.addView(layout);
    }

    @Override
    public void OnFragmentChanged(int position) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
    }
}
