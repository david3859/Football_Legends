package com.example.football_legender;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustumListAdapter extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the  player images
    private final Integer[] imageIdArray;

    //to store the list of names
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;

    //to store the Countries images
    private final Integer[] imageIdArrayCountry;

    public CustumListAdapter(Activity context, Integer[] imageIdArrayP, String[] nameArrayP, String[] infoArrayP, Integer[] imageIdArrayCountrieP) {
        super(context,R.layout.listview_row,nameArrayP);
        this.context=context;
        this.imageIdArray = imageIdArrayP;
        this.nameArray = nameArrayP;
        this.infoArray = infoArrayP;
        this.imageIdArrayCountry = imageIdArrayCountrieP;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview_row, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextViewID);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextViewID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1ID);
        ImageView imageView2 = (ImageView) rowView.findViewById(R.id.imageView2ID);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIdArray[position]);
        imageView2.setImageResource(imageIdArrayCountry[position]);

        return rowView;

    }

}
