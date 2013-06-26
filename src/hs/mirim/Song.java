package hs.mirim;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Song extends Activity {
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setTheme(android.R.style.Theme_NoTitleBar);
	setContentView(R.layout.song);
    
    final ArrayList<Songitems> feeds=new ArrayList<Songitems>();
    Songitems sampleFed1=new Songitems("Kiss The Rain", "이루마");
    feeds.add(sampleFed1);
    Songitems sampleFed2=new Songitems("Romance","Yuhki Kuramoto");
    feeds.add(sampleFed2);
    Songitems sampleFed3=new Songitems("A Walk In The Forest","Brian Crain");
    feeds.add(sampleFed3);
    Songitems sampleFed4=new Songitems("언제나 몇번이라도","영화 센과 치히로의 행방불명 ost");
    feeds.add(sampleFed4);
    Songitems sampleFed5=new Songitems("두대의 피아노를 위한 소나타","모차르트");
    feeds.add(sampleFed5);
    Songitems sampleFed6=new Songitems("viva la vida","coldplay");
    feeds.add(sampleFed6);
    Songitems sampleFed7=new Songitems("First Love","이루마");
    feeds.add(sampleFed7);
    Songitems sampleFed8=new Songitems("빗속에서","어쿠스틱 콜라보");
    feeds.add(sampleFed8);
    Songitems sampleFed9=new Songitems("Last Carnival","어쿠스틱 카페");
    feeds.add(sampleFed9);
    Songitems sampleFed10=new Songitems("Long Long Ago","어쿠스틱 카페");
    feeds.add(sampleFed10);
    Songitems sampleFed11=new Songitems("얼음연못","두번째 달");
    feeds.add(sampleFed11);
    Songitems sampleFed12=new Songitems("My Soul","july");
    feeds.add(sampleFed12);
    Songitems sampleFed13=new Songitems("Rainbow Bridge","Steve Barakatt");
    feeds.add(sampleFed13);  
    Songitems sampleFed14=new Songitems("River Flows In You","이루마");
    feeds.add(sampleFed14);
    Songitems sampleFed15=new Songitems("With the wind","이루마");
    feeds.add(sampleFed15);
    Songitems sampleFed16=new Songitems("고양이의 하루","전수연");
    feeds.add(sampleFed16);
    Songitems sampleFed17=new Songitems("Indigo","이루마");
    feeds.add(sampleFed17);
    Songitems sampleFed18=new Songitems("Summer","joe hisaishi");
    feeds.add(sampleFed18);    
    Songitems sampleFed19=new Songitems("precious","kaori kobayashi");
    feeds.add(sampleFed19);
    Songitems sampleFed20=new Songitems("Smile Smile Smile","전수연");
    feeds.add(sampleFed20);
    Songitems sampleFed21=new Songitems("Yellow room","이루마");
    feeds.add(sampleFed21);
    Songitems sampleFed22=new Songitems("stay in memory","이루마");
    feeds.add(sampleFed22);
    Songitems sampleFed23=new Songitems("캐논변주곡","george winston");
    feeds.add(sampleFed23);
    Songitems sampleFed24=new Songitems("Take Five","Dave Brubeck");
    feeds.add(sampleFed24);
    Songitems sampleFed25=new Songitems("flying petals","이지수");
    feeds.add(sampleFed25);
    Songitems sampleFed26=new Songitems("몽환의 숲","키네틱 플로우");
    feeds.add(sampleFed26);
    Songitems sampleFed27=new Songitems("Butterfly Waltz","Brian Crain");
    feeds.add(sampleFed27);
    Songitems sampleFed28=new Songitems("Rain Drop","아이유");
    feeds.add(sampleFed28);
    Songitems sampleFed29=new Songitems("A simple life","Brian Crain");
    feeds.add(sampleFed29);
    Songitems sampleFed30=new Songitems("바이올린 협주곡 D장조","차이코프스키");
    feeds.add(sampleFed30);
    
    ListView listview=(ListView)this.findViewById(R.id.songList);

    SongitemsArrayAdater adapter=new SongitemsArrayAdater(this, R.layout.songitem, feeds);
    listview.setAdapter(adapter);
 }
}
