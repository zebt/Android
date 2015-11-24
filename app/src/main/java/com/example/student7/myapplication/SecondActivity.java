package com.example.student7.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends ActionBarActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_copy);
    Bundle intentExtras = getIntent() .getExtras();
    String username = intentExtras.getString("username");
    TextView helloView  = (TextView)findViewById(R.id.hello);
    helloView.setText("Witaj " + username + "!");
}

}
