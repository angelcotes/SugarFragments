package angelcotes.sugarorm;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class F3 extends Fragment  {

    Button btn_1;

    public F3() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_f3, container, false);

        btn_1 = (Button) v.findViewById(R.id.button);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageChangeF2("Changing background for Fragment 2"));
            }
        });

        return v;
    }
}
