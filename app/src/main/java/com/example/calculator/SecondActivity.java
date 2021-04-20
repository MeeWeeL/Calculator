package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import static android.content.DialogInterface.*;

public class SecondActivity extends AppCompatActivity {

    Calculator calculator = new Calculator();


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        TextView testText = (TextView)findViewById(R.id.Result);
        testText.setText("0");
    }


    public void onHome(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void button1Click(View v) {
        calculator.setTextView("1");
    }
    public void button2Click(View v) {
        calculator.setTextView("2");
    }
    public void button3Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("3");
    }
    public void button4Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("4");
    }
    public void button5Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("5");
    }
    public void button6Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("6");
    }
    public void button7Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("7");
    }
    public void button8Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("8");
    }
    public void button9Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("9");
    }
    public void button0Click(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        calculator.setTextView("0");
    }

    public void plusButtonClick(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        calculator.setAction((String)testText.getText(), "+");
        testText.setText("0");
    }

}