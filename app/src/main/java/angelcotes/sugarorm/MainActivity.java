package angelcotes.sugarorm;

import android.provider.Contacts;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();


        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.HolderFragment1, new F1());
        ft.add(R.id.HolderFragment2, new F2());
        ft.add(R.id.HolderFragment3, new F3());
        ft.commit();
    }
}
