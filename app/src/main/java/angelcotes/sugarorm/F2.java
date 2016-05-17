package angelcotes.sugarorm;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class F2 extends Fragment {

    EditText name, lastName;
    public F2() {
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStart();
        Log.d(General.TAG, "F2 On start");
        EventBus.getDefault().register(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f2, container, false);

        name = (EditText)v.findViewById(R.id.name_person);
        lastName = (EditText)v.findViewById(R.id.last_name);

        return v;
    }

    @Subscribe
    public void onMessageEvent(MessageChangeF2 event){
        Book per = new Book(name.getText().toString(), lastName.getText().toString());
        Toast.makeText(getContext(), "Datos Guardados con exito", Toast.LENGTH_SHORT).show();
        lastName.setText("");
        name.setText("");
        EventBus.getDefault().post(new MessageChangeF3(per));
    }

}
