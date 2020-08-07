package webservices.rp.edu.mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class IconAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> iconList;
    private int resource;
    private ImageView iv;
    private TextView tv;

    public IconAdapter(Context context, int resource, ArrayList<String> iconList) {
        super(context, resource, iconList);
        this.context = context;
        this.iconList = iconList;
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(resource, parent, false);


        iv = rowView.findViewById(R.id.ivImage);
        tv = rowView.findViewById(R.id.tvNavigation);

        String icon = iconList.get(position);

        if(icon.equals(0)){
            iv.setImageResource(android.R.drawable.ic_menu_info_details);
            tv.setText("Bio");
        }
        if(icon.equals(1)){
            iv.setImageResource(android.R.drawable.ic_menu_info_details);
            tv.setText("Vaccination");
        }
        if(icon.equals(2)){
            iv.setImageResource(android.R.drawable.ic_menu_more);
            tv.setText("Anniversary");
        }
        if(icon.equals(3)){
            iv.setImageResource(android.R.drawable.star_big_on);
            tv.setText("About US");
        }

        return rowView;
    }
}