package hs.mirim;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class Food extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_NoTitleBar);
		setContentView(R.layout.food);
		ImageView foodimg=(ImageView)findViewById(R.id.foodimage);
		final ArrayList<Fooditems> feeds=new ArrayList<Fooditems>();
	    Fooditems sampleFed1=new Fooditems(R.drawable.f1,"ÃÊÄÝ¸´");
	    feeds.add(sampleFed1);
	    
	    ListView listview2=(ListView)this.findViewById(R.id.foodList);

	    FooditemsArrayAdater adapter=new FooditemsArrayAdater(this, R.layout.fooditem, feeds);
	    listview2.setAdapter(adapter);
	}
}
