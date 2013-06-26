package hs.mirim;

public class Songitems {
	private String singer;
	private String songname;
	private String url;
	public Songitems(String songname,String singer, String url){
		this.songname=songname;
		this.singer=singer;
		this.url = url;
		
	}
	public String getUrl() {
		return url;
	}
	public String getSongname() {
		return songname;
	}
	public void setSongname(String songname) {
		this.songname = songname;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
}
