package hs.mirim;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FooditemsArrayAdater extends ArrayAdapter<Fooditems> {

	public FooditemsArrayAdater(Context context, int textViewResourceId,
			List<Fooditems> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view=convertView;
		
		if(view==null){
			LayoutInflater inflater=((Activity)getContext()).getLayoutInflater();
			view=inflater.inflate(R.layout.fooditem, null);
		}
		
		Fooditems feed=(Fooditems)getItem(position);
		//Fed feed2 = list.get(position);
		ImageView imgview=(ImageView)view.findViewById(R.id.foodimage);
		TextView textCreatAtUser =(TextView)view.findViewById(R.id.foodname);
		
		imgview.setImageResource(feed.getFoodImage());
		textCreatAtUser.setText(feed.getFoodName());
		return view;
	}

}
