package Util;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.hp.respo.R;

public class FragmentCall {

    private static int mContainerId;
    public static FragmentTransaction fragmentTransaction;
    public static FragmentManager fragmentManager;
    public final static String TAG = "DashBoardActivity";
    public static void replaceFragment(Fragment fragment, String TAG) {


        try {
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frmid, fragment);
            fragmentTransaction.addToBackStack(TAG);
            fragmentTransaction.commit();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
