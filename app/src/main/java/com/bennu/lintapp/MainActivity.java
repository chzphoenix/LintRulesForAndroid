package com.bennu.lintapp;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends BaseActivity {
    private A a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = new A();
        B b = new B();
        Log.e("ssss", b.count + "");
        Log.e("sss", a.i + "");
        init();
    }

    @Override
    void init() {

    }

    class A{
        private int i = 2;
    }

    class B{
        private int count = a.i;
    }
}
