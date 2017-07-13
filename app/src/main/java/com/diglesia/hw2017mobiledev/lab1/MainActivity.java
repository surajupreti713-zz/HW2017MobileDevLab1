package com.diglesia.hw2017mobiledev.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_examples, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_example1:
                setContentView(R.layout.activity_example1);
                return true;
            case R.id.menu_item_example2:
                setContentView(R.layout.activity_example2);
                return true;
            case R.id.menu_item_example3:
                setContentView(R.layout.activity_example3);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
