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


public class FragmentElectronics extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public FragmentElectronics() {
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentElectronics newInstance(int sectionNumber) {
        FragmentElectronics fragment = new FragmentElectronics();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_electronics, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_electronics_recycler_view);
        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        ArrayList<ItemProduct> myDataSet = new ArrayList<ItemProduct>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("Lanix\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Monterrey, Nuevo León");
        itemProduct.setPhone("81 81259400");
        itemProduct.setImage(2);
        itemProduct.setDescription("No será Mac ni Alienware, pero será ¡LANIX!");
        myDataSet.add(itemProduct);
        AdapterProduct mAdapter = new AdapterProduct(getContext(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }

}
