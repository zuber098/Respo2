package com.example.hp.respo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Ordertaking extends Fragment {

TextView tv1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ordertaking, container, false);
        Bundle b = getArguments();
        final String str = b.getString("Key");
        tv1 = v.findViewById(R.id.tv1);
        tv1.setText(str);
        return v;
    }
    public void onBackPressed()
    {

    }
}
