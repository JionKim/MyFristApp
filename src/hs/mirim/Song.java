package hs.mirim;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Song extends Activity implements OnItemClickListener {
	
	ArrayList<Songitems> feeds;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_NoTitleBar);
		setContentView(R.layout.song);

		feeds=new ArrayList<Songitems>();
		Songitems sampleFed1=new Songitems("Kiss The Rain", "�̷縶", "http://www.youtube.com/watch?v=so6ExplQlaY");
		feeds.add(sampleFed1);
		Songitems sampleFed2=new Songitems("Romance","Yuhki Kuramoto","http://www.youtube.com/watch?v=lYUGkB5w1SE");
		feeds.add(sampleFed2);
		Songitems sampleFed3=new Songitems("A Walk In The Forest","Brian Crain","http://www.youtube.com/watch?v=LHztthKy4RE");
		feeds.add(sampleFed3);
		Songitems sampleFed4=new Songitems("������ ����̶�","��ȭ ���� ġ������ ���Ҹ� ost","http://www.youtube.com/watch?v=61l_Dyhi2ZA");
		feeds.add(sampleFed4);
		Songitems sampleFed5=new Songitems("�δ��� �ǾƳ븦 ���� �ҳ�Ÿ","������Ʈ","http://www.youtube.com/watch?v=v58mf-PB8as");
		feeds.add(sampleFed5);
		Songitems sampleFed6=new Songitems("viva la vida","coldplay","http://www.youtube.com/watch?v=bZ_BoOlAXyk");
		feeds.add(sampleFed6);
		Songitems sampleFed7=new Songitems("First Love","�̷縶","http://www.youtube.com/watch?v=so6ExplQlaY");
		feeds.add(sampleFed7);
		Songitems sampleFed8=new Songitems("���ӿ���","����ƽ �ݶ�","http://www.youtube.com/watch?v=XZwwWSUGhx0");
		feeds.add(sampleFed8);
		Songitems sampleFed9=new Songitems("Last Carnival","����ƽ ī��","http://www.youtube.com/watch?v=hG1gbOjWWdI");
		feeds.add(sampleFed9);
		Songitems sampleFed10=new Songitems("Long Long Ago","����ƽ ī��","http://www.youtube.com/watch?v=w0Eo-TjcPu4");
		feeds.add(sampleFed10);
		Songitems sampleFed11=new Songitems("��������","�ι�° ��","http://www.youtube.com/watch?v=kuPuyfGUI1k");
		feeds.add(sampleFed11);
		Songitems sampleFed12=new Songitems("My Soul","july","http://www.youtube.com/watch?v=8siDb6hw1oY");
		feeds.add(sampleFed12);
		Songitems sampleFed13=new Songitems("Rainbow Bridge","Steve Barakatt","http://www.youtube.com/watch?v=yjV1M08qzn8");
		feeds.add(sampleFed13);  
		Songitems sampleFed14=new Songitems("River Flows In You","�̷縶","http://www.youtube.com/watch?v=F-4wUfZD6oc");
		feeds.add(sampleFed14);
		Songitems sampleFed15=new Songitems("With the wind","�̷縶","http://www.youtube.com/watch?v=L2Ps6g3vETE");
		feeds.add(sampleFed15);
		Songitems sampleFed16=new Songitems("������� �Ϸ�","������","http://www.youtube.com/watch?v=Z8p8NZ0sOXw");
		feeds.add(sampleFed16);
		Songitems sampleFed17=new Songitems("Indigo","�̷縶","http://www.youtube.com/watch?v=acDyYYKxdhE");
		feeds.add(sampleFed17);
		Songitems sampleFed18=new Songitems("Summer","joe hisaishi","http://www.youtube.com/watch?v=qEb4TG10jW8");
		feeds.add(sampleFed18);    
		Songitems sampleFed19=new Songitems("precious","kaori kobayashi","http://www.youtube.com/watch?v=BNXHfANjoec");
		feeds.add(sampleFed19);
		Songitems sampleFed20=new Songitems("Smile Smile Smile","������","http://www.youtube.com/watch?v=fSEEPjfilag");
		feeds.add(sampleFed20);
		Songitems sampleFed21=new Songitems("Yellow room","�̷縶","http://www.youtube.com/watch?v=skko9xxM1AQ");
		feeds.add(sampleFed21);
		Songitems sampleFed22=new Songitems("stay in memory","�̷縶","http://www.youtube.com/watch?v=IazSI5l7h8k");
		feeds.add(sampleFed22);
		Songitems sampleFed23=new Songitems("ĳ���ְ�","george winston","http://www.youtube.com/watch?v=XL1X1ar953A");
		feeds.add(sampleFed23);
		Songitems sampleFed24=new Songitems("Take Five","Dave Brubeck","http://www.youtube.com/watch?v=S-x_f60VSC4");
		feeds.add(sampleFed24);
		Songitems sampleFed25=new Songitems("flying petals","������","http://www.youtube.com/watch?v=0fOKHB_FKkE");
		feeds.add(sampleFed25);
		Songitems sampleFed26=new Songitems("��ȯ�� ��","Ű��ƽ �÷ο�","http://www.youtube.com/watch?v=qp8gfkhG2SU");
		feeds.add(sampleFed26);
		Songitems sampleFed27=new Songitems("Butterfly Waltz","Brian Crain","http://www.youtube.com/watch?v=xqCdKOdX5FQ");
		feeds.add(sampleFed27);
		Songitems sampleFed28=new Songitems("Rain Drop","������","http://www.youtube.com/watch?v=wSToN5GEaqE");
		feeds.add(sampleFed28);
		Songitems sampleFed29=new Songitems("A simple life","Brian Crain","http://www.youtube.com/watch?v=DEVtRYmgAzo");
		feeds.add(sampleFed29);
		Songitems sampleFed30=new Songitems("���̿ø� ���ְ� D����","����������Ű","http://www.youtube.com/watch?v=1afGHWNZvy4");
		feeds.add(sampleFed30);

		ListView listview=(ListView)this.findViewById(R.id.songList);

		SongitemsArrayAdater adapter=new SongitemsArrayAdater(this, R.layout.songitem, feeds);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

		feeds.get(position).getUrl();
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
		Uri uri = Uri.parse(feeds.get(position).getUrl());
		intent.setData(uri);
		
		startActivity(intent);
	}
}
