package com.example.uiwidgettest;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class ChooseAreaFragment extends Fragment {
    public static final int LEVEL_PROVINCE = 0;  // 省
    public static final int LEVEL_CITY = 1;// 城市
    public static final int LEVEL_COUNTY = 2; // 县

    private ProgressDialog progressDialog;

    private TextView titleText;
    private Button backButton;
    private ListView listView;
    private ArrayAdapter<String> adapter;

    private List<String> dataList = new ArrayList<>();

    /*
     省列表
     */
    private List<Province> provinceList;

    /*
     市列表
     */
    private List<City> cityList;

    /*
    县列表
     */
    private List<County> countyList;

    /*
    选中的省份
     */
    private Province selectedProvince;
    /*
    选中的县
     */
    private County selectedCounty;
    /*
    选中的城市
     */
    private City selecetedCity;
    /*

    /*
     当前选中的级别
     */
    private int currentLevel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.choose_area, container, false);

        titleText = view.findViewById(R.id.title_text);
        backButton = view.findViewById(R.id.back_button);
        listView = view.findViewById(R.id.list_view);
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, dataList);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (currentLevel == LEVEL_PROVINCE) {
                    selectedProvince = provinceList.get(position);
                    queryCities();
                } else {
                    if (currentLevel == LEVEL_CITY) {
//                    queryCities();
                        selecetedCity = cityList.get(position);
                    }

                }
            }
        });

    }
    /*
     查询选中的省内所有城市，优先从数据库中查询，如果没有查询到再去服务器上查询
     */
    private void queryCities(){
//        titleText.setText(selectedProvince.get);   从这里开始  创建省份类的  特征
    }
}
