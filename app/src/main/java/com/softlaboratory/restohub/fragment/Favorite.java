package com.softlaboratory.restohub.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.softlaboratory.restohub.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Favorite} factory method to
 * create an instance of this fragment.
 */
public class Favorite extends Fragment {


    public Favorite() {
        // Required empty public constructor
    }

    //DECLARE VIEW:


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_favorite, container, false);
        //TO DO:

        return rootView;
    }
}