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
        testText.setText(Calculator.getJustResult());
    }


    public void onHome(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void onPlus(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        Calculator.setResult(text);
        testText.setText("0");
        Calculator.setAction("+");
    }

    public void onMinus(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        Calculator.setResult(text);
        testText.setText("0");
        Calculator.setAction("-");
    }

    public void onDivision(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        Calculator.setResult(text);
        testText.setText("0");
        Calculator.setAction("/");
    }

    public void onMultiple(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        Calculator.setResult(text);
        testText.setText("0");
        Calculator.setAction("*");
    }

    public void onEqually(View v) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        Calculator.setNumber(text);
        testText.setText(Calculator.getResult());
    }

    public void button1Click(View v) {
        setCalculatorTextView("1");
    }

    public void button2Click(View v) {
        setCalculatorTextView("2");
    }

    public void button3Click(View v) {
        setCalculatorTextView("3");
    }

    public void button4Click(View v) {
        setCalculatorTextView("4");
    }

    public void button5Click(View v) {
        setCalculatorTextView("5");
    }

    public void button6Click(View v) {
        setCalculatorTextView("6");
    }

    public void button7Click(View v) {
        setCalculatorTextView("7");
    }

    public void button8Click(View v) {
        setCalculatorTextView("8");
    }

    public void button9Click(View v) {
        setCalculatorTextView("9");
    }

    public void button0Click(View v) {
        setCalculatorTextView("0");
    }

    public void setCalculatorTextView(String num) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        testText.setText(checkText(text, num));
    }

    public String checkText(String text, String num) {
        if (text.equals("0")) {
            text = num;
        } else {
            text += num;
        }
        return text;
    }



}