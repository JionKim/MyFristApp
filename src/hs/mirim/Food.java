package hs.mirim;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Food extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.food);
		
		final ArrayList<Songitems> feeds=new ArrayList<Songitems>();
	    Songitems sampleFed1=new Songitems("Kiss The Rain", "�̷縶", "");
	    feeds.add(sampleFed1);
	    
	    ListView listview2=(ListView)this.findViewById(R.id.foodList);

	    SongitemsArrayAdater adapter=new SongitemsArrayAdater(this, R.layout.fooditem, feeds);
	    listview2.setAdapter(adapter);
	}
}
