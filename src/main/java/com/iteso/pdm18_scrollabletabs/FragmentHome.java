package com.iteso.pdm18_scrollabletabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iteso.pdm18_scrollabletabs.beans.ItemProduct;

import java.util.ArrayList;


public class FragmentHome extends Fragment {

    // TODO: Rename and change types of parameters

    private static final String ARG_SECTION_NUMBER = "section_number";


    public FragmentHome() {
        // Required empty public constructor
    }

    public static FragmentHome newInstance(int sectionNumber) {
        FragmentHome fragment = new FragmentHome();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_home_recycler_view);
        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("Alienware\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Tlaquepaque, Jalisco");
        itemProduct.setPhone("33 10636929");
        itemProduct.setImage(1);
        itemProduct.setDescription("Llevate esta Alienware para que puedas jugar como los profesionales sin ningún problema.");
        myDataSet.add(itemProduct);
        AdapterProduct mAdapter = new AdapterProduct(getContext(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }


}
