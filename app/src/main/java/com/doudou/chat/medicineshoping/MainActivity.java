package com.doudou.chat.medicineshoping;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.util.LogUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class MainActivity extends Activity {

    @ViewInject(R.id.content)
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
        LogUtils.i("androidStudio测试");
        content.setText("androidStudio测试");


       LogUtils.i("huhu");

    }

}
