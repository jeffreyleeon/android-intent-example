package com.jeffreyleeon.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get intent data
        int a = getIntent().getIntExtra("a", 1002);
        Log.d("TAG", "=========int extra entering detail page " + a);
    }

    public void leaveDetail(View v) {
        Intent intent = new Intent();
        intent.putExtra("b", 1003);
        setResult(RESULT_OK, intent); // Need to specifically set OK
        finish();
    }
}
