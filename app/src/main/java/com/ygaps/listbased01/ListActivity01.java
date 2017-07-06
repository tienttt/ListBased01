package com.ygaps.listbased01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity01 extends AppCompatActivity {

    TextView txtMsg;
    ListView myListView;
    String[] items = { "Data-0", "Data-1", "Data-2", "Data-3",
            "Data-4", "Data-5", "Data-6", "Data-7" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list01);

        myListView = (ListView) findViewById(R.id.my_list);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                items);

        myListView.setAdapter(aa);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String text = "Position: " + i
                        + "\nData: " + items[i];
                txtMsg.setText(text);
            }
        });

        txtMsg = (TextView) findViewById(R.id.txtMsg);
    }
}
