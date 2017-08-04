package com.supr.consumerwatch.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.supr.consumerwatch.R;

/**
 * Created by ad-machine on 4/8/17.
 */

public class Requests extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.requests, container, false);
        return rootView;
    }
}
