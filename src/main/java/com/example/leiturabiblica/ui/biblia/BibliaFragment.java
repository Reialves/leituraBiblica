package com.example.leiturabiblica.ui.biblia;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.leiturabiblica.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BibliaFragment extends Fragment {


    public BibliaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_biblia, container, false);
    }

}
