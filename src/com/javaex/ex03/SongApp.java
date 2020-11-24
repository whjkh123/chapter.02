package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song Iu = new Song();
		Song Gd = new Song();
		Song Bk = new Song();
		
		Iu.setTitle("좋은날");
		String title01 = Iu.getTitle();
		Iu.setArtist("아이유");
		String artist01 = Iu.getArtist();
		Iu.setAlbum("Real");
		String album01 = Iu.getAlbum();
		Iu.setComposer("이민수");
		String composer01 = Iu.getComposer();
		Iu.setYear(2010);
		int year01 = Iu.getYear();
		Iu.setTrack(3);
		int track01 = Iu.getTrack();
		Iu.showInfo();
		
		Gd.setTitle("거짓말");
		String title02 = Gd.getTitle();
		Gd.setArtist("빅뱅");
		String artist02 = Gd.getArtist();
		Gd.setAlbum("Always");
		String album02 = Gd.getAlbum();
		Gd.setComposer("G-Dragon");
		String composer02 = Gd.getComposer();
		Gd.setYear(2007);
		int year02 = Gd.getYear();
		Gd.setTrack(2);
		int track02 = Gd.getTrack();
		Gd.showInfo();
		
		Bk.setTitle("벚꽃엔딩");
		String title03 = Bk.getTitle();
		Bk.setArtist("버스커버스커");
		String artist03 = Bk.getArtist();
		Bk.setAlbum("버스커버스커 1집");
		String album03 = Bk.getAlbum();
		Bk.setComposer("장범준");
		String composer03 = Bk.getComposer();
		Bk.setYear(2012);
		int year03 = Bk.getYear();
		Bk.setTrack(4);
		int track03 = Bk.getTrack();
		Bk.showInfo();

	}

}
