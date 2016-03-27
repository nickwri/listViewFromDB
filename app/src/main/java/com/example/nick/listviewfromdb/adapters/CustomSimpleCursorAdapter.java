package com.example.nick.listviewfromdb.adapters;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.example.nick.listviewfromdb.R;
import com.example.nick.listviewfromdb.db.CountriesDbAdapter;

/**
 * Created by nick on 26/03/2016.
 */
public class CustomSimpleCursorAdapter extends SimpleCursorAdapter {

    private final Activity _context;
    private final Cursor _cursor;
    //private final String[] itemname;
    //private final Integer[] imgid;

    public CustomSimpleCursorAdapter(Activity context, int layout, Cursor c, String[] from, int[] to, int flags) {
        super(context, layout, c, from, to, flags);

        _context = context;
        _cursor = c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=_context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.country_info, null,true);

        _cursor.moveToPosition(position);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.continent);
        txtTitle.setText(_cursor.getString(3));
     return rowView;
    }

}
