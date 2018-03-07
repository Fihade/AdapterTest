package com.mila.adaptertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewTest extends AppCompatActivity {
    private GridView gridView;
    private List<Map<String,Object>>dataList;
    private int[]icon = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    private  String[]name = {"icon","icon","icon","icon","icon","icon","icon","icon","icon"};
    private SimpleAdapter adapter;
    //下拉菜单
    private Spinner spinner;
    private SimpleAdapter simAdapter;
    private List<Map<String,Object>>dataList1;
    //private TextView tv;
    //private List<String>list;
    //private String[]palace = {"北京","上海","广州","台北"};
    //  private ArrayAdapter<String>adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_test);
        //控件绑定
        gridView = findViewById(R.id.girdView);
        spinner = findViewById(R.id.spinner);
        //下拉菜单2
        dataList1 = new ArrayList<Map<String,Object>>();
        getData();
        simAdapter = new SimpleAdapter(this,dataList1,R.layout.item,new String[]{"image","text"},new int[]{R.id.imageView,R.id.tv});
        simAdapter.setDropDownViewResource(R.layout.item);
        spinner.setAdapter(simAdapter);
        // tv = findViewById(R.id.tv);
        //构建适配器
//        list = new ArrayList<String>();
//        list.add("北京");
//        list.add("上海");
//        list.add("广州");
//        list.add("深圳");
//        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter1);
//        spinner.setOnItemSelectedListener(this);

//        dataList = new ArrayList<Map<String,Object>>();
//        getData();
//        adapter = new SimpleAdapter(this,getData(),R.layout.itemicon,new String[]{"imageicon","texticon"},new int[] {R.id.imageicon,R.id.texticon});
//        gridView.setAdapter(adapter);
    }

//    private List<Map<String,Object>> getData(){
//
//        for(int i = 0;i<icon.length;i++) {
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("imageicon",icon[i]);
//            map.put("texticon",name[i]);
//            dataList.add(map);
//        }
//            return dataList;
//
//    }

//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//            String cityName = adapter1.getItem(position);
//            tv.setText("所选城市为"+cityName);
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {
//
//    }

    private void getData(){
        Map<String,Object>map = new HashMap<String,Object>();
        map.put("image",R.drawable.ic_launcher_background);
        map.put("text","beijing");
        Map<String,Object>map1 = new HashMap<String,Object>();
        map1.put("image",R.drawable.ic_launcher_background);
        map1.put("text","Xi'an");
        Map<String,Object>map2 = new HashMap<String,Object>();
        map2.put("image",R.drawable.ic_launcher_background);
        map2.put("text","tj");
        Map<String,Object>map3 = new HashMap<String,Object>();
        map3.put("image",R.drawable.ic_launcher_background);
        map3.put("text","gz");
        dataList1.add(map);
        dataList1.add(map1);
        dataList1.add(map2);
        dataList1.add(map3);
    }

}
