package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();

	public int addList(Music music) {
		list.add(music);
		return 1;
	}

	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String inTitle) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(inTitle)) {
				return list.get(i);
			}
		}
		return null;
	}

	public Music removeMusic(String inTitle) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(inTitle)) {
				return list.remove(i);
			}
		}
		return null;
	}

	public Music setMusic(String inTitle, Music music) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(inTitle)) {
				Music result = new Music(list.get(i).getTitle(), list.get(i).getSinger());
				list.get(i).setTitle(music.getTitle());
				list.get(i).setSinger(music.getSinger());
				return result;
			}
		}
		return null;
	}

	public int ascTitle() {
		Collections.sort(list, Comparator.comparing(Music::getTitle));
		return 1;
	}

	public int descSinger() {
		Collections.sort(list, Comparator.comparing(Music::getSinger).reversed());
		return 1;
	}

}