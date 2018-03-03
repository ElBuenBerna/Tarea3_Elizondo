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

public class FragmentTechnology extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";


    public FragmentTechnology() {
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentTechnology newInstance(int sectionNumber) {
        FragmentTechnology fragment = new FragmentTechnology();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.fragment_technology_recycler_view);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<ItemProduct> myDataSet = new ArrayList<>();
        ItemProduct itemProduct = new ItemProduct();
        itemProduct.setTitle("iMac 24\"");
        itemProduct.setStore("BestBuy");
        itemProduct.setLocation("Zapopan, Jalisco");
        itemProduct.setPhone("33 12345678");
        itemProduct.setImage(0);
        itemProduct.setDescription("Llevate esta Mac con un 30% de descuento para que puedas programar para XCode y Android sin tener que batallar tanto como en tu Windows");
        myDataSet.add(itemProduct);

        ItemProduct itemProduct1 = new ItemProduct();
        itemProduct1.setTitle("Alienware\"");
        itemProduct1.setStore("BestBuy");
        itemProduct1.setLocation("Tlaquepaque, Jalisco");
        itemProduct1.setPhone("33 10636929");
        itemProduct1.setImage(1);
        itemProduct1.setDescription("Llevate esta Alienware para que puedas jugar como los profesionales sin ningún problema.");
        myDataSet.add(itemProduct1);

        ItemProduct itemProduct2 = new ItemProduct();
        itemProduct2.setTitle("Lanix\"");
        itemProduct2.setStore("BestBuy");
        itemProduct2.setLocation("Monterrey, Nuevo León");
        itemProduct2.setPhone("81 81259400");
        itemProduct2.setImage(2);
        itemProduct2.setDescription("No será Mac ni Alienware, pero será ¡LANIX!");
        myDataSet.add(itemProduct2);
        AdapterProduct mAdapter = new AdapterProduct(getContext(), myDataSet);
        recyclerView.setAdapter(mAdapter);
        return view;
    }




}
