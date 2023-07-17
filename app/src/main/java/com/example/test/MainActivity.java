package com.example.test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!Python.isStarted()){
            Python.start(new AndroidPlatform(this));
        }
        Python python= Python.getInstance();
        PyObject pyObject=python.getModule("pytest");
        pyObject.callAttr("Python_say_Hello");
    }
}