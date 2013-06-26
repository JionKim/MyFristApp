package hs.mirim;

import android.R.integer;

public class Fooditems {
	private int FoodImage;
	private String FoodName;
	
	public Fooditems(int FoodImage,String FoodName){
	this.FoodImage=FoodImage;
	this.FoodName=FoodName;
	}


	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}


	public int getFoodImage() {
		return FoodImage;
	}


	public void setFoodImage(int foodImage) {
		FoodImage = foodImage;
	}
	
}
