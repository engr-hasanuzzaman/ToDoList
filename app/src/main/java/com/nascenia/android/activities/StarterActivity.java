package com.nascenia.android.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.nascenia.android.adapters.ToDoAdapter;
import com.nascenia.android.data.ToDo;

import java.util.ArrayList;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        final ListView listview = (ListView) findViewById(R.id.todo_list);
        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };

        final ArrayList<ToDo> list = new ArrayList<ToDo>();
        for (int i = 0; i < values.length; ++i) {
            ToDo toDo = new ToDo(values[i]);
            list.add(toDo);
        }
        final ToDoAdapter adapter = new ToDoAdapter(getApplicationContext(),
                R.layout.todo_row, list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final ToDo toDo = (ToDo) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "You select item " + toDo.getTitle(),
                        Toast.LENGTH_LONG).show();
            }

        });

    }
}
