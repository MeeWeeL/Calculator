package com.example.calculator;

import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    private static String result;
    private static String number;
    private String action;

    public static void setResult() {

    }

    public void setAction(String num, String action) {
        this.action = action;
        number = num;
    }

    public void setTextView(String num) {
        TextView testText = (TextView)findViewById(R.id.Result);
        String text = (String)testText.getText();
        if (text.equals("0")) {
            testText.setText(num);
        } else {
            text += num;
            testText.setText(text);
        }
    }

    public String getResult(String num, String act) {
        number = num;
        action = act;
        Integer num1 = Integer.parseInt(result);
        Integer num2 = Integer.parseInt(number);
        switch (action) {
            case "+":
                return Integer.toString(num1 + num2);
            case "-":
                return Integer.toString(num1 - num2);
            case "/":
                return Integer.toString(num1 / num2);
            case "*":
                return Integer.toString(num1 * num2);
            default:
                return "0";
        }
    }
}
