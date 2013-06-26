package hs.mirim;

import java.util.ArrayList;

import android.R.integer;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Photo<E> extends Activity {
	private int currentImageId = 0;
	private ArrayList<Integer> items;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_NoTitleBar);
		setContentView(R.layout.photo);
		items=new ArrayList<Integer>();
		
		for (int i = 1; i < 31; i++) {
			int img = this.getResources().getIdentifier("p"+i, "drawable", this.getPackageName());
			items.add(img);
		}
		
		ImageButton btnPrev  =(ImageButton)findViewById(R.id.button1);
		btnPrev.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				currentImageId--;
				if(currentImageId<0)currentImageId=items.size()-1;
				showImage();
			}
		});
		ImageButton btnafter  =(ImageButton)findViewById(R.id.button2);
		btnafter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				currentImageId++;
				if(currentImageId>items.size()-1)currentImageId=0;
				showImage();
			}
		});
		
	}
	
	private void showImage() {
	 ImageView imgview=(ImageView)findViewById(R.id.imageView1);
	 imgview.setImageResource(items.get(currentImageId));
	}
}
