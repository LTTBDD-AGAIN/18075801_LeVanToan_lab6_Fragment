package com.example.a18075801_levantoan_lab6_fragment.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a18075801_levantoan_lab6_fragment.R;

public class Fragment_Below extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View belowView = inflater.inflate(R.layout.fragment_below,container,false);

        return belowView;
    }
}
