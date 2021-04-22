package com.example.calculator;

import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    private static String result = "0";
    private static String number = "0";
    private static String action = "+";

    public static String getJustResult() {
        return result;
    }
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
                return result = Integer.toString(num1 + num2);
            case "-":
                return result = Integer.toString(num1 - num2);
            case "/":
                return result = Integer.toString(num1 / num2);
            case "*":
                return result = Integer.toString(num1 * num2);
            default:
                return result = "0";
        }
    }
}
