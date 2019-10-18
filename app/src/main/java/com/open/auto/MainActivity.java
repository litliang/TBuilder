package com.open.auto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List list = ListBuilder.build().add("kotlin").add("swift").add("dart").add("python").get();
        Map map = MapBuilder.build().add("java","kotlin").add("object-c","swift").add("react","dart").add("ruby","python").get();
        Toast.makeText(this,list.toString(),Toast.LENGTH_LONG).show();
        Toast.makeText(this,map.toString(),Toast.LENGTH_LONG).show();


    }
}
