package com.ysr;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.ysr.common.base.BaseActivity;
import com.ysr.map.LocationActivity;

public class MainActivity extends BaseActivity {

    private TextView tv;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocationActivity.class);
                startActivity(intent);
            }
        });
    }
}
