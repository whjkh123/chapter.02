package com.javaex.ex06;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {

	}

	public Song(String title, int track) {
		this.title = title;
		if (track < 0) {
			this.track = 0;
		} else {
			this.track = track;
		}
		System.out.println("생성자(2)");
	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, track);
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("생성자(6)");
	}

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	/*
	 * public Song(String title, String composer) { this.title = title;
	 * this.composer = composer; }
	 */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void showInfo() {
		System.out.println(artist + ", " + title + "(" + album + ", " + year + "년, " + track + "번 track, " + composer
				+ " 작곡" + ")");
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
