package ro.pub.cs.systems.eim.practicaltest01var05;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Objects;

public class PracticalTest01Var05SecondaryActivity extends AppCompatActivity {
    public String buttonList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var05_secondary);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey(Constants.BUTTON_LIST))
            buttonList = Objects.requireNonNull(intent.getStringExtra(Constants.BUTTON_LIST));

        setResult(0);
        finish();
    }
}