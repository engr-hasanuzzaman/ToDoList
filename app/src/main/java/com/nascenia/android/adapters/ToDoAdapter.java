package com.nascenia.android.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.nascenia.android.activities.R;
import com.nascenia.android.data.ToDo;

import java.util.HashMap;
import java.util.List;

/**
 * Created by sumon on 2/1/16.
 */
public class ToDoAdapter extends ArrayAdapter<ToDo> {

    public ToDoAdapter(Context context, int textViewResourceId,
                       List<ToDo> objects) {
        super(context, textViewResourceId, objects);

    }

    public  ToDoAdapter(Context context, int textViewResourceId){
        super(context, textViewResourceId);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View list_row = convertView;

        if (list_row == null) {
            LayoutInflater inflater;
            inflater = LayoutInflater.from(getContext());
            list_row = inflater.inflate(R.layout.todo_row, null);
        }

        ToDo toDo = getItem(position);

        if (toDo != null) {
            TextView title = (TextView) list_row.findViewById(R.id.title);
            CheckBox status = (CheckBox) list_row.findViewById(R.id.status);
//            TextView tt3 = (TextView) v.findViewById(R.id.description);

            if (title != null) {
                title.setText(toDo.getTitle());
            }

        }

        return list_row;
    }

//    @Override
//    public long getItemId(int position) {
//        String item = getItem(position);
//        return mIdMap.get(item);
//    }
//
//    @Override
//    public boolean hasStableIds() {
//        return true;
//    }

}

