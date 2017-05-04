package com.github.tifezh.kchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.tifezh.kchart.DataHelper;
import com.github.tifezh.kchart.R;
import com.github.tifezh.kchart.bean.KLine;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.apache.http.util.EncodingUtils;

import java.io.InputStream;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

    }

    private void initData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String fileName = "data.json"; //k线图的数据
                String res = "";
                try {
                    InputStream in = getResources().getAssets().open(fileName);
                    int length = in.available();
                    byte[] buffer = new byte[length];
                    in.read(buffer);
                    res = EncodingUtils.getString(buffer, "UTF-8");
                } catch (Exception e) {
                    e.printStackTrace();
                }

                KLine kline = KLine.objectFromData(res);
                Log.e(TAG, "onCreate: " + kline.getLastOldTime() );
                //final List<KLineEntity> data = new Gson().fromJson(res, new TypeToken<List<KLineEntity>>() {
                //}.getType());

            }
        }).start();
    }
}
