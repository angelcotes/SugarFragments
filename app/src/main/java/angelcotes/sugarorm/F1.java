package angelcotes.sugarorm;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class F1 extends Fragment {

    ArrayList<String> dataList;
    ArrayAdapter<String> adapter;
    ListView data;
    ArrayList<MessageChangeF3> listData = new ArrayList<>();

    public F1() {
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_f1, container, false);

        data = (ListView)v.findViewById(R.id.listView);
        return v;
    }

    @Subscribe
    public void onMessageEvent(MessageChangeF3 event){
        listData.add(event);
        dataList = new ArrayList<String>();
        for (int i = 0; i < listData.size(); i++){
            dataList.add(listData.get(i).message.name + " " +listData.get(i).message.Last);
        }
        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, dataList);
        data.setAdapter(adapter);
    }

}
