package com.example.hp.respo;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import Util.FragmentCall;

public class Tab2 extends Fragment {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.tab2, container, false);
        btn1 = v.findViewById(R.id.button15);
        btn2 = v.findViewById(R.id.button16);
        btn3 = v.findViewById(R.id.button17);
        btn4 = v.findViewById(R.id.button18);
        btn5 = v.findViewById(R.id.button19);
        btn6 = v.findViewById(R.id.button20);
        btn7 = v.findViewById(R.id.button21);
        btn8 = v.findViewById(R.id.button22);
        btn9 = v.findViewById(R.id.button23);
        btn10 = v.findViewById(R.id.button24);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 1";
                b.putString("Key", str);
                ordertaking.setArguments(b);
                ft.replace(R.id.frmid, ordertaking);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 2";
                b.putString("Key", str);
                ft.addToBackStack(null);
                ordertaking.setArguments(b);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 3";
                b.putString("Key", str);
                ft.addToBackStack(null);
                ordertaking.setArguments(b);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 4";
                b.putString("Key", str);
                ordertaking.setArguments(b);
                ft.addToBackStack(null);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 5";
                b.putString("Key", str);
                ordertaking.setArguments(b);
                ft.addToBackStack(null);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 6";
                b.putString("Key", str);
                ft.addToBackStack(null);
                ordertaking.setArguments(b);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 7";
                b.putString("Key", str);
                ordertaking.setArguments(b);
                ft.addToBackStack(null);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 8";
                b.putString("Key", str);
                ordertaking.setArguments(b);
                ft.addToBackStack(null);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 9";
                b.putString("Key", str);
                ft.addToBackStack(null);
                ordertaking.setArguments(b);
                ft.replace(R.id.frmid, ordertaking);
                ft.commit();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ordertaking ordertaking = new Ordertaking();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Bundle b = new Bundle();
                String str = "Table 10";
                ft.addToBackStack(null);
                b.putString("Key", str);
                ordertaking.setArguments(b);
                ft.replace(R.id.frmid, ordertaking).addToBackStack(null);
                ft.commit();
            }
        });
        return v;


    }


}
