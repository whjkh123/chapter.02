package com.javaex.ex06;

public class SongApp {

	public static void main(String[] args) {
		
		Song Iu = new Song();
		Song Gd = new Song("거짓말", "빅뱅", "Always", "G-Dragon", 2007, 2);
		Song Bk = new Song("벚꽃엔딩", "버스커버스커");
		Song Gg = new Song("소원을 말해봐", 2010);
		
		Iu.setTitle("좋은날");
		Iu.setArtist("아이유");
		Iu.setAlbum("Real");
		Iu.setComposer("이민수");
		Iu.setYear(2010);
		Iu.setTrack(3);
		/*
		Iu.toString();
		*/
		Iu.showInfo();
		
		/*
		Gd.toString();
		*/
		Gd.showInfo();
		
		Bk.setAlbum("버스커버스커1집");
		Bk.setComposer("장범준");
		Bk.setYear(2012);
		Bk.setTrack(4);
		/*
		Bk.toString();
		*/
		Bk.showInfo();
		
		Gg.setArtist("소녀시대");
		Gg.setAlbum("'Oh!' The Second Album");
		Gg.setComposer("유한진");
		Gg.setTrack(1);
		/*
		Gg.toString();
		*/
		Gg.showInfo();		
		
	}

}
