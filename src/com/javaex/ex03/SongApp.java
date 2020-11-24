package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song Iu = new Song();
		Song Gd = new Song();
		Song Bk = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커 1집", "장범준", 2012, 4);
		
		Iu.setTitle("좋은날");		
		Iu.setArtist("아이유");		
		Iu.setAlbum("Real");		
		Iu.setComposer("이민수");		
		Iu.setYear(2010);		
		Iu.setTrack(3);
	
		Iu.showInfo();
		
		Gd.setTitle("거짓말");		
		Gd.setArtist("빅뱅");		
		Gd.setAlbum("Always");		
		Gd.setComposer("G-Dragon");		
		Gd.setYear(2007);		
		Gd.setTrack(2);
		
		Gd.showInfo();
				
		Bk.showInfo();

	}

}
