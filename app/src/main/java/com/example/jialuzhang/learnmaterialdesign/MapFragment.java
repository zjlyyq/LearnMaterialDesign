package com.example.jialuzhang.learnmaterialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by jialuzhang on 2017/4/12.
 */

public class MapFragment extends Fragment {
    RecyclerView recyclerView;
    private List<String> list;
    static MapFragment newInstance(List<String> list){
        MapFragment fragment = new MapFragment();
        fragment.list = list;
        return  fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);

        RecycleAdapter adapter = new RecycleAdapter(getActivity(),this.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        return  view;
    }
}
