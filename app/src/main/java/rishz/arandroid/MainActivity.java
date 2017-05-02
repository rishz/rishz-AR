package rishz.arandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.easyar.engine.EasyAR;

public class MainActivity extends AppCompatActivity {

    String KEY = "jl9gZUWs83KwbVTg9DQ106MvgHppRiev3trWckmioqxvZxoDU8G5s8eK4el1NTEHgRh7ouKSN0LTY0iwaYoyemgFL0ni5zHawMnTb989da53bfd0a06bdc6b90fa4aea05a05tvzedk2QtAtr2cJ9WFGtSkTrDj7AmCNZkz8X6SoL0sjPQCPZezn8Vv4Fle6JiXHP9o1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyAR.initialize(this,KEY);

    // Example of a call to a native method
//    TextView tv = (TextView) findViewById(R.id.sample_text);
//    tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
//    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}

