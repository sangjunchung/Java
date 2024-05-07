package com.kh.practice.list.music.model.vo;

public class Music {
	private String title;
	private String singer;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public Music() {

	}

	public Music(String inTitle, String inSinger) {
		this.title = inTitle;
		this.singer = inSinger;
	}

	@Override
	public String toString() {
		return singer + " - " + title;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.title == obj) {
			return true;
		}
		return false;
	}
}