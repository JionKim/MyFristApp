package hs.mirim;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SongitemsArrayAdater extends ArrayAdapter<Songitems> {

	
	public SongitemsArrayAdater(Context context, int textViewResourceId,
			List<Songitems> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view=convertView;
		
		if(view==null){
			LayoutInflater inflater=((Activity)getContext()).getLayoutInflater();
			view=inflater.inflate(R.layout.songitem, null);
		}
		
		Songitems feed=(Songitems)getItem(position);
		//Fed feed2 = list.get(position);
		
		TextView textTitle=(TextView)view.findViewById(R.id.songname);
		TextView textCreatAtUser =(TextView)view.findViewById(R.id.singer);
		
		textTitle.setText(feed.getSongname());
		textCreatAtUser.setText(feed.getSinger());
		return view;
	}

	

}
