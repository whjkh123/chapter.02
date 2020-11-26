package com.javaex.ex06;

public class SongApp {

	public static void main(String[] args) {
		
		Song Iu = new Song();
		Song Gd = new Song("거짓말", "빅뱅", "Always", "G-Dragon", 2007, 2);
		Song Bk = new Song("벚꽃엔딩", 4);
		
		Iu.setTitle("좋은날");
		Iu.setArtist("아이유");
		Iu.setAlbum("Real");
		Iu.setComposer("이민수");
		Iu.setYear(2010);
		Iu.setTrack(3);
		
		System.out.println(Iu.toString());
		Iu.showInfo();
		
		
		System.out.println(Gd.toString());		
		Gd.showInfo();
		
		Bk.setAlbum("버스커버스커1집");
		Bk.setComposer("장범준");
		Bk.setYear(2012);		
		Bk.setArtist("버스커버스커");
		
		System.out.println(Bk.toString());
		Bk.showInfo();
		
	}

}
