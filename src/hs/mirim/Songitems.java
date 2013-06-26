package hs.mirim;

public class Songitems {
	private String singer;
	private String songname;
	public Songitems(String songname,String singer){
		this.songname=songname;
		this.singer=singer;
		
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
