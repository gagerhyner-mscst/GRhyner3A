package edu.southeastmn.gagerhyner.grhyner3a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

// Imports for button and EditText controls
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Ex3AMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_amain);
        // ---------- whileButton event handler ----------
        Button whileButton = (Button) findViewById(R.id.whileButton);

        whileButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                do_whileButton_onClick(v);
            }
        });

    // ---------- doWhileButton event handler ----------
    Button doWhileButton = (Button) findViewById(R.id.doWhileButton);

        doWhileButton.setOnClickListener(new OnClickListener()
    {
        public void onClick(View v)
        {
            do_dowhileButton_onClick(v);
        }
    });

        // ---------- forButton event handler ----------
        Button forButton = (Button) findViewById(R.id.forButton);

        doWhileButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                forButton_onClick(v);
            }
        });
}



    protected void do_whileButton_onClick(View v) {
        // Get references to EditText boxes
        EditText loopMaxEditText = (EditText) findViewById(R.id.loopMaxEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.loopResultEditText);
        // User Input
        int max = Integer.parseInt(loopMaxEditText.getText().toString());

        //Display Result
        Loops loops = new Loops(max);
        loopResultEditText.setText(loops.whileLoop());
    }

    protected void do_dowhileButton_onClick(View v) {
        // Get references to EditText boxes
        EditText loopMaxEditText = (EditText) findViewById(R.id.loopMaxEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.loopResultEditText);
        // User Input
        int max = Integer.parseInt(loopMaxEditText.getText().toString());

        //Display Result
        Loops loops = new Loops(max);
        loopResultEditText.setText(loops.doWhileLoop());
    }

    protected void forButton_onClick(View v) {
        // Get references to EditText boxes
        EditText loopMaxEditText = (EditText) findViewById(R.id.loopMaxEditText);
        EditText loopResultEditText = (EditText) findViewById(R.id.loopResultEditText);
        // User Input
        int max = Integer.parseInt(loopMaxEditText.getText().toString());

        //Display Result
        Loops loops = new Loops(max);
        loopResultEditText.setText(loops.forLoop());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ex3_amain, menu);
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
