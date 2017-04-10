package com.ysr;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.TextView;

import com.ysr.api.HttpMethods;
import com.ysr.api.Subject;
import com.ysr.api.subscribers.ProgressSubscriber;
import com.ysr.api.subscribers.SubscriberOnNextListener;
import com.ysr.common.base.BaseActivity;
import com.ysr.irecyclerview.IRecyclerView;

import java.util.List;

import butterknife.Bind;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.irc)
    IRecyclerView irc;
    @Bind(R.id.tv)
    TextView tv;
    private SubscriberOnNextListener getTopMovieOnNext;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initView() {
        irc.setLayoutManager(new LinearLayoutManager(mContext));
        fab.setOnClickListener(this);
        getTopMovieOnNext = new SubscriberOnNextListener<List<Subject>>() {
            @Override
            public void onNext(List<Subject> subjects) {
                tv.setText(subjects.toString());
            }
        };
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                HttpMethods.getInstance().getTopMovie(new ProgressSubscriber(getTopMovieOnNext, MainActivity.this), 0, 10);
                break;
        }


    }
}
