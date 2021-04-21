package com.example.calculator;

import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    private static String result;
    private static String number;
    private static String action;

    public static void setResult(String text) {
        result = text;
    }

    public static void setAction(String act) {
        action = act;
    }

    public static void setNumber(String num) {
        number = num;
    }

    public static String getResult() {
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
