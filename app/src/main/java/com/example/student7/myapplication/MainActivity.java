package com.example.student7.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText usernameView;
    private EditText passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameView = (EditText) findViewById(R.id.username);
        passwordView = (EditText) findViewById(R.id.password);
    }

    public void loginClicked(View view){
        // makeText - metoda statyczna
        String username = usernameView.getText().toString();
        String password = passwordView.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class); // ma prowadzić do drugiej aktywności,
                                                                // ponieważ jest to obiekt typu klasa należy dodać .class
        intent.putExtra("username", username);
        intent.putExtra("password", password);
        startActivity(intent);
        // Toast.makeText(this, "Zalogowano, użytkownik :" + username + ", hasło: " + password, Toast.LENGTH_SHORT).show();
        // komunikat ktory pojawi sie przez kilka sekund na ekranie w reakcji na jakas czynnosc
    }
// alt + enter powoduje dodanie metody do import�w

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
