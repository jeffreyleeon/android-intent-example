package com.jeffreyleeon.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d("TAG", "=========request Code " + requestCode);
        Log.d("TAG", "=========result Code " + resultCode);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            Log.d("TAG", "============Activity Okay " + data.getIntExtra("b", 1004));
        }
    }

    public void enterDetail(View v) {
        Log.d("TAG", "===============Enter detail");
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("a", 1001);
        startActivityForResult(intent, REQUEST_CODE);
    }
}
