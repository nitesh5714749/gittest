package com.app.nitesh.tried;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//adcd
/**
 * Created by NITESH on 21-09-2015.
 */
public class First_Fragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.first_layout,container,false);
        return super.onCreateView(inflater,container,savedInstanceState);
    }
}
