package com.supr.consumerwatch.activities;

/**
 * Created by ad-machine on 4/8/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.supr.consumerwatch.R;

public class Feed extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.feed, container, false);
        return rootView;
    }
}
